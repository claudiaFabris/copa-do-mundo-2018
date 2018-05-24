package br.estacio.prii.copa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private Connection connection = null;
    private final String database = "copa2018";
    private final String usuario = "homestead";
    private final String senha = "secret";
    private String url;
    
    public Connection getMysqlConnection()
    {
        url = "jdbc:mysql://localhost:33060/"+database;
        if (connection == null)
        {
            return createConnection();
        }
        else
            return connection;
    }
    
    private Connection createConnection()
    {
        try
        {
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
}
