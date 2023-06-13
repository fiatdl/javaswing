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
import java.util.Vector;

/**
 *
 * @author fiat4
 */
public class dichvudao {
    
    
    Connection conn = null;
    PreparedStatement stmm = null;

    
        public int getProfit(String madv,int Month) {
      int rsut=0;
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from suachua where madv='"+madv+"'and MONTH(ngay)='"+Month+"'";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
             
                int chiphi=rs.getInt(6);
                int gia =rs.getInt(7);
                rsut+=gia;
                rsut+=chiphi;
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
   return rsut;
    }
    
    public int add(dichvu dv) {

        try {

            String sSQL = "insert dichvu(MADV,TENDV,GIA) values(?,?,?);";
            conn = helper.connectdb();
            stmm = conn.prepareStatement(sSQL);
            stmm.setString(1, dv.getMadv());
            stmm.setString(2, dv.getTendvString());
            stmm.setInt(3, dv.getGia());
           
            if (stmm.executeUpdate() > 0) {
                System.out.println("Đã thêm dịch vụ");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        }
        return -1;
    }
    
    public int delete(String madv) {

        try {

            String sSQL = "delete dichvu where MASV='"+madv+"'";
                    
            conn = helper.connectdb();
            stmm = conn.prepareStatement(sSQL);

            

            if (stmm.executeUpdate() > 0) {
                System.out.println("xoa thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        }
        return -1;
    }
     public List<dichvu> getall() {
         Vector ls= new Vector();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from dichvu";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                dichvu st = new dichvu();
                st.setMadv(rs.getString(1));
                st.setTendvString(rs.getString(2));
                st.setGia(rs.getInt(3));
                
                ls.add(st);
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
      public dichvu getstbyId(String madv) {
      
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from dichvu where MADV='"+madv+"'";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                dichvu st = new dichvu();
                st.setMadv(rs.getString(1));
                st.setTendvString(rs.getString(2));
                st.setGia(rs.getInt(3));
             
                return st;
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
   return null;
    }

}
