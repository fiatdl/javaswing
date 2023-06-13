/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author fiat4
 */
public class userdao {
     Connection conn = null;
    PreparedStatement stmm = null;
    
    public int add(user st) {

        try {

            String sSQL = "insert users(username,password,role) values(?,?,?);";
            conn = helper.connectdb();
            stmm = conn.prepareStatement(sSQL);
            stmm.setString(1, st.getUsername());
            stmm.setString(2, st.getPassword());
            stmm.setBoolean( 3,false);
           
            if (stmm.executeUpdate() > 0) {
                System.out.println("them 1 st thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        }
        return -1;
    }

    public List<user> getall() {
        List<user> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from users";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                user us = new user();
                us.setUsername(rs.getString(1));
                us.setPassword(rs.getString(2));
                us.setRole(rs.getBoolean(3));
       
                ls.add(us);
            }
        } catch (Exception e) {
            System.out.println("err"+e.toString());
        }
        finally{
            try {
                rs.close();sttm.close();conn.close();
            } catch (Exception e) {
                System.out.println("close err"+e.toString());
            }
        }
   return ls;
    }
}
