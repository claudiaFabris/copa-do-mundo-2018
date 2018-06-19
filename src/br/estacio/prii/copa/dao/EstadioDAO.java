package br.estacio.prii.copa.dao;

import br.estacio.prii.copa.entidade.Estadio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstadioDAO
{
    
    private static final Connection connection = ConnectionFactory.getConnection();
    
    public static boolean cadastrar(Estadio estadioSalvar)
    {
        
        String sql = "INSERT INTO estadio(nome, cidade, capacidade) VALUES (?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, estadioSalvar.getNome());
            stmt.setString(2, estadioSalvar.getCidade());
            stmt.setInt(3, estadioSalvar.getCapacidade());
            
            stmt.execute();
            stmt.close();
            
            return true;
            
        } catch(SQLException e) {
            e.getMessage();
            return false;
        }
        
    }
    
    public static ArrayList fillComboBox()
    {
        
        String sql = "SELECT * FROM estadio";
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
    
}
