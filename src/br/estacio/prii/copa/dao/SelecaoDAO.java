package br.estacio.prii.copa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.estacio.prii.copa.entidade.Selecao;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelecaoDAO
{
    
    private static final Connection connection = ConnectionFactory.getConnection();
    
    public static boolean cadastrar(Selecao selecaoSalvar)
    {
        
        String sql = "INSERT INTO selecao(nome, tecnico, grupo, descricao, imagem) VALUES (?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, selecaoSalvar.getNome());
            stmt.setString(2, selecaoSalvar.getTecnico());
            stmt.setString(3, selecaoSalvar.getGrupo());
            stmt.setString(4, selecaoSalvar.getDescricao());
            stmt.setString(5, selecaoSalvar.getImagem());
            
            stmt.execute();
            stmt.close();
            
            return true;
            
        } catch(SQLException e) {
            e.getMessage();
            return false;
        }
        
    }
    
    public static ArrayList<String> fillComboBox()
    {
        
        String sql = "SELECT * FROM selecao";
        ArrayList<String> itens = new ArrayList();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                itens.add(resultado.getString("nome"));
            }
            
        }catch(SQLException e){
            e.getMessage();
        }
        
        return itens;
       
    }
    
    public static ArrayList<String> getSelecoesGrupo(String grupo){
        
        String sql = "SELECT * FROM selecao WHERE grupo = ?";
        ArrayList<String> selecoes = new ArrayList();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, grupo);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                String str = resultado.getString("nome") + " " + resultado.getString("tecnico") + 
                             " Grupo " + resultado.getString("grupo");
                selecoes.add(str);
            }
            
        } catch(SQLException e) {
            e.getMessage();            
        }
        
        return selecoes;
        
    }
    
}
