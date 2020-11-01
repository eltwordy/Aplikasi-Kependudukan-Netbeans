/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kependudukan;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author Dell
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/pendudukan", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    
    public Connection getConnection(){
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost/pendudukan","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n"+e);
        }
        return con;
    }
}
