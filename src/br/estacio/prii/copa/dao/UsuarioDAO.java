package br.estacio.prii.copa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.estacio.prii.copa.entidade.Usuario;
import javax.swing.JOptionPane;

public class UsuarioDAO 
{
    private static final Connection connection = ConnectionFactory.getConnection();
 
    
    public static void cadastrar(Usuario usuarioSalvar) 
    {
        String sql = "INSERT INTO usuario(nome, celular, login, email, senha, admin, obs) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, usuarioSalvar.getNome());
            stmt.setString(2, usuarioSalvar.getCelular());
            stmt.setString(3, usuarioSalvar.getLogin());
            stmt.setString(4, usuarioSalvar.getEmail());
            stmt.setString(5, usuarioSalvar.getSenha());
            stmt.setBoolean(6, usuarioSalvar.isAdmin());
            stmt.setString(7, usuarioSalvar.getObs());
            
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            e.getMessage();
        }
    }
    
    public static Usuario autenticar(Usuario usuarioConsulta)
    {
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, usuarioConsulta.getLogin());
            stmt.setString(2, usuarioConsulta.getSenha());
            
            ResultSet resultado = stmt.executeQuery();
            
            if(resultado.next()) {  
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso.", "SEJA BEM-VINDO", JOptionPane.QUESTION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha inválido.", "USUÁRIO NÃO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            e.getMessage();
        }
        
        return null;
    }
}
