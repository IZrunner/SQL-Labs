/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoJosDatabaseApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER_PC
 */
public class JoJoMainClass 
{
    public Connection connect() {
        String url = "jdbc:sqlite:JoJosCharacters.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection success");
        } catch (SQLException e) {
            System.out.println("Connection failure");
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException 
    {
        // TODO code application logic here
        JoJoMainClass obj = new JoJoMainClass();
        obj.connect();
        MainMenuForm mainMenuFormObj = new MainMenuForm();
        mainMenuFormObj.setVisible(true);
        
    }
    
}
