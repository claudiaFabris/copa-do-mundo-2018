package br.estacio.prii.copa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
    
    public static Connection getConnection()
    {   
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:33060/copa2018", "homestead", "secret");
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
