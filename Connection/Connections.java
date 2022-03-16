/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author davit
 */
public class Connections {
   
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://200.18.128.54/aula";
    private static final String USER = "aula";
    private static final String PASS = "aula";

    public static java.sql.Connection getConnection() {

        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("errror na conexao :", ex);

        }
    }

    public static void closeConnection(java.sql.Connection con) {
         if (con != null) {
                 try {
                con.close();
            
        } catch (SQLException ex) {
                System.err.println("O erro foi:" +ex);
        }
            }
         
         
    }



    public static void closeConnection(java.sql.Connection con, PreparedStatement stmt) {

        if (stmt!= null) {
                 try {
                stmt.close();
            
        } catch (SQLException ex) {
                System.err.println("O erro foi:" +ex);
        }
            }
          closeConnection(con);
    }

    public static void closeConnection(java.sql.Connection con, PreparedStatement stmt, ResultSet rs) {

            if (rs != null) {
                 try {
                rs.close();
            
        } catch (SQLException ex) {
                System.err.println("O erro foi:" +ex);
        }
            }
            closeConnection(con, stmt);
    }

}


