package br.estacio.prii.copa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.estacio.prii.copa.entidade.Selecao;

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
    
}
