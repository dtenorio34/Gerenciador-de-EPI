/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Connections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Entity.Funcionario;
import java.sql.ResultSet;

/**
 *
 * @author davit
 */
public class AcessoDAO {

    public Boolean login(String x, String y) throws SQLException {
        Connection con = Connections.getConnection();

        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = con.prepareStatement("select * from davi_teno.colaboradores where senha = ? and idcolaborador = ? ");
            st.setString(1, y);
            st.setInt(2, Integer.parseInt(x));

            rs = st.executeQuery();

            if (rs.next()) {

                return true;
            }else {
                
            }
            return false;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            Connections.closeConnection(con, st, rs);
        }

    }

}
