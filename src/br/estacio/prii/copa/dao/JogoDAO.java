package br.estacio.prii.copa.dao;

import br.estacio.prii.copa.entidade.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JogoDAO {
    
    private static final Connection connection = ConnectionFactory.getConnection();
    
    public static boolean cadastrar(Jogo jogoSalvar){
        
        
        String sql = "INSERT INTO jogo(selecaoa, selecaob, placara, placarb, grupo, datahora, fase) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, jogoSalvar.getSelecaoA());
            stmt.setString(2, jogoSalvar.getSelecaoB());
            stmt.setInt(3, jogoSalvar.getPlacarA());
            stmt.setInt(4, jogoSalvar.getPlacarB());
            stmt.setString(5, jogoSalvar.getGrupo());
            stmt.setString(6, jogoSalvar.getDatahora());
            stmt.setString(7, jogoSalvar.getFase());
            
            stmt.execute();
            stmt.close();
            
            return true;
            
        } catch(SQLException e) {
            e.getMessage();
            return false;
        }
       
        
    }
    
}
