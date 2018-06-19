package br.estacio.prii.copa.dao;

import br.estacio.prii.copa.entidade.SessaoUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.estacio.prii.copa.entidade.Usuario;
import javax.swing.JOptionPane;

public class UsuarioDAO 
{
    private static final Connection connection = ConnectionFactory.getConnection();
 
    
    public static boolean cadastrar(Usuario usuarioSalvar) 
    {
        String sql = "INSERT INTO usuario(nome, celular, login, email, senha, admin, obs) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, usuarioSalvar.getNome());
            stmt.setString(2, usuarioSalvar.getCelular());
            stmt.setString(3, usuarioSalvar.getLogin());
            stmt.setString(4, usuarioSalvar.getEmail());
            stmt.setString(5, usuarioSalvar.getSenha());
            stmt.setString(6, usuarioSalvar.getAdmin());
            stmt.setString(7, usuarioSalvar.getObs());
            
            stmt.execute();
            stmt.close();
            
            return true;
            
        } catch(SQLException e) {
            e.getMessage();
            return false;
        }
    }
    
    public static boolean autenticar(Usuario usuarioConsulta)
    {
        
        String  sql     = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Usuario usuario = new Usuario();        
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            
            stmt.setString(1, usuarioConsulta.getLogin());
            stmt.setString(2, usuarioConsulta.getSenha());
            
            ResultSet resultado = stmt.executeQuery();
            
            if(resultado.next()) {
                usuario.setNome(resultado. getString("nome"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setEmail(resultado.getString("email"));
                usuario.setCelular(resultado.getString("celular"));
                if(resultado.getInt("admin") == 1){
                    usuario.setAdmin(true);
                }else{
                    usuario.setAdmin(false);
                }
                usuario.setObs(resultado.getString("obs"));
                SessaoUsuario.setUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso.", "SEJA BEM-VINDO", JOptionPane.QUESTION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha inválido.", "USUÁRIO NÃO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch(SQLException e) {
            e.getMessage();
        }
        
        return false;
    }
}
