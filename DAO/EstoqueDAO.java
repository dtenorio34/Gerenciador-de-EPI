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
import Entity.Estoque;

/**
 *
 * @author davit
 */
public class EstoqueDAO {
   
    
    public EstoqueDAO(){
    
    }
    
  public void adcionarEPI(Estoque epi) {
    
    Connection con = Connections.getConnection();

    PreparedStatement stmt = null;
    
    try{ 
        stmt = con.prepareStatement(" INSERT INTO davi_teno.epi ( idepi , nomeepi , marca , tamanho,  ca , fabricacao , validade ) VALUES (?,?,?,?,?,?,?)  " , Statement.RETURN_GENERATED_KEYS );
    
    stmt.setInt(1, epi.getIdEPI()); 
    stmt.setString(2, epi.getNomeEPI());
    stmt.setString(3, epi.getMarca());
    stmt.setString(4, epi.getTamanho());
    stmt.setInt(5, epi.getCA());   
    stmt.setDate(6, epi.getFabricacao());  
    stmt.setDate(7, epi.getValidade());

    
    stmt.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "EPI cadastrado");
    
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir" + ex.getMessage());
    }  finally {
        Connections.closeConnection(con, stmt);
    }
    
  } 


  
   public void removerEPI(Estoque epi) {
    
   Connection con = Connections.getConnection();
   
    PreparedStatement stmt = null;
    
    try{ 
        stmt = con.prepareStatement(" DELETE FROM davi_teno.epi  WHERE idepi =  ? " , Statement.RETURN_GENERATED_KEYS );
   
    stmt.setInt(1, epi.getIdEPI());
    
      
    stmt.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "EPI Excluido");
    
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluido" + ex.getMessage());
    }  finally {
        Connections.closeConnection(con, stmt);
    }
   
   
   
   }
  
   
   
   
   /*
   
    public void editarEPI(Estoque epi) {
    
    Connection con =Connections.getConnection();
   
    PreparedStatement stmt = null;
    
    try{ 
        stmt = con.prepareStatement(" UPDATE cliente SET nome = ?, endereco = ? , cnpj = ? WHERE cod_cliente =  ?; " , Statement.RETURN_GENERATED_KEYS );
   
    stmt.setString(1, cli.getNome());
    stmt.setString(2, cli.getEnd());
    stmt.setInt(3, cli.getCnpj());
    stmt.setInt(4, cli.getId());
    
      
    int d = stmt.executeUpdate();
     
    if (d>0){
        JOptionPane.showMessageDialog(null, "Cliente Editado");
             
    }         
    
    
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar" + ex.getMessage());
    }  finally {
        Connections.closeConnection(con, stmt);
    }
   
   
   
   }  
   */
 public void ConsultarEstoqueEPI(Estoque epi) {
    
   Connection con = Connections.getConnection();
   
    PreparedStatement stmt = null;
    
    try{ 
        stmt = con.prepareStatement(" Select FROM davi_teno.epi  WHERE idepi =  ? " , Statement.RETURN_GENERATED_KEYS );
   
    stmt.setInt(1, epi.getIdEPI());
    
      
    stmt.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "EPI Excluido");
    
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluido" + ex.getMessage());
    }  finally {
        Connections.closeConnection(con, stmt);
    }
   
   
   
   }  
   
}
