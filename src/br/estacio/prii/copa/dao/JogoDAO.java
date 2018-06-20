package br.estacio.prii.copa.dao;

import br.estacio.prii.copa.entidade.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JogoDAO {
    
    private static final Connection connection = ConnectionFactory.getConnection();
    
    public static boolean cadastrar(Jogo jogoSalvar){
        
        String sql = "INSERT INTO jogo(selecaoa, selecaob, placara, placarb, grupo, data, hora, fase) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, jogoSalvar.getSelecaoA());
            stmt.setString(2, jogoSalvar.getSelecaoB());
            stmt.setInt(3, jogoSalvar.getPlacarA());
            stmt.setInt(4, jogoSalvar.getPlacarB());
            stmt.setString(5, jogoSalvar.getGrupo());
            stmt.setString(6, jogoSalvar.getData());
            stmt.setString(7, jogoSalvar.getHora());
            stmt.setString(8, jogoSalvar.getFase());
            
            stmt.execute();
            stmt.close();
            
            return true;
            
        } catch(SQLException e) {
            e.getMessage();
            return false;
        }
       
        
    }
    
    public static ArrayList<String> getJogos(){
        
        String sql = "SELECT * FROM jogo";
        ArrayList<String> jogos = new ArrayList();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                String str = resultado.getString("selecaoa") + " " + resultado.getInt("placara") + " X " +
                             resultado.getInt("placarb")     + " " + resultado.getString("selecaob")     +
                             " Data e Hora "                 + resultado.getString("data")           +
                             " " + resultado.getString("hora") +
                             " Fase "                        + resultado.getString("fase");
                if(resultado.getString("fase").equals("GRUPOS")){
                    str += " Grupo " + resultado.getString("grupo");
                }
                jogos.add(str);
            }
            
        } catch(SQLException e) {
            e.getMessage();            
        }
        
        return jogos;
        
    }
    
    public static ArrayList<String> getJogosFase(String fase){
        
        String sql = "SELECT * FROM jogo WHERE fase = ?";
        ArrayList<String> jogos = new ArrayList();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, fase);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                String str = resultado.getString("selecaoa") + " " + resultado.getInt("placara") + " X " +
                             resultado.getInt("placarb")     + " " + resultado.getString("selecaob")     +
                             " Data e Hora "                 + resultado.getString("data")           +
                             " " + resultado.getString("hora") +
                             " Fase "                        + resultado.getString("fase");
                if(resultado.getString("fase").equals("GRUPOS")){
                    str += " Grupo " + resultado.getString("grupo");
                }
                jogos.add(str);
            }
            
        } catch(SQLException e) {
            e.getMessage();            
        }
        
        return jogos;
        
    }
    
    public static ArrayList<String> getJogosData(String data){
        
        String sql = "SELECT * FROM jogo WHERE data = ?";
        ArrayList<String> jogos = new ArrayList();
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, data);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                String str = resultado.getString("selecaoa") + " " + resultado.getInt("placara") + " X " +
                             resultado.getInt("placarb")     + " " + resultado.getString("selecaob")     +
                             " Data e Hora "                 + resultado.getString("data")               +
                             " " + resultado.getString("hora") +
                             " Fase "                        + resultado.getString("fase");
                System.out.println(str);
                if(resultado.getString("fase").equals("GRUPOS")){
                    str += " Grupo " + resultado.getString("grupo");
                }
                jogos.add(str);
            }
            
        } catch(SQLException e) {
            e.getMessage();            
        }
        
        return jogos;
        
    }
    
}
