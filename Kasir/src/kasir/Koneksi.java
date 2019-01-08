/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Koneksi {
    String db = "kasir";
    String username =  "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/"+db;
    
    java.sql.Connection conn;
    java.sql.Connection st;
    java.sql.Connection rs;
    private Statement stat;
    
    public java.sql.Connection connect(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(
                url,username,password
        );
         stat = conn.createStatement();
            System.out.println("Koneksi Berhasil");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class Tidak Ditemukan() : "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Gagal Connect() : "+ex.getMessage());
        }
        return conn;
    }
}
