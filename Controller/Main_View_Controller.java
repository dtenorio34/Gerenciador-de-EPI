/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AcessoDAO;
import View.Main;
import View.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author davit
 */
public class Main_View_Controller {

    private AcessoDAO DAO = new AcessoDAO();
    Usuario user;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void entrar(String x, String y) {
        user = new Usuario();
        try {

            if (DAO.login(x, y) == true) {
                user.setVisible(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Main_View_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
