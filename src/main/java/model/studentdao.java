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
public class studentdao {

    Connection conn = null;
    PreparedStatement stmm = null;

        public int getProfit(String manvString,int Month) {
      int rsut=0;
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from suachua where Manv='"+manvString+"'and MONTH(ngay)='"+Month+"'";
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

    
    public int add(student st) {

        try {

            String sSQL = "insert students(MANV,HOTEN,EMAIL,DIACHI,GIOITINH) values(?,?,?,?,?);";
            conn = helper.connectdb();
            stmm = conn.prepareStatement(sSQL);
            stmm.setString(1, st.getMasv());
            stmm.setString(2, st.getHoten());
            stmm.setString(3, st.getEmailString());
            stmm.setString(4, st.getDiachi());
            stmm.setBoolean(5, st.isGioitinh());
            if (stmm.executeUpdate() > 0) {
                System.out.println("them 1 st thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        }
        return -1;
    }

    public int update(student st) {

        try {

            String sSQL = "update students set HOTEN=? ,EMAIL=?,DIACHI=?,GIOITINH=? where MANV=?";
            conn = helper.connectdb();
            stmm = conn.prepareStatement(sSQL);
            stmm.setString(1, st.getHoten());
            stmm.setString(2, st.getEmailString());
            stmm.setString(3, st.getDiachi());
            stmm.setString(5, st.getMasv());
             stmm.setBoolean(4, st.isGioitinh() );

            if (stmm.executeUpdate() > 0) {
                System.out.println("update thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        }
        return -1;
    }

    public int delete(String st) {

        try {

            String sSQL = "delete students where MANV='"+st+"'";
                    
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

    public List<student> getall() {
        List<student> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from students";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                student st = new student();
                st.setMasv(rs.getString(1));
                st.setHoten(rs.getString(2));
                st.setEmailString(rs.getString(3));
                st.setDiachi(rs.getString(4));
                st.setGioitinh(rs.getBoolean(5));
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
     public student getstbyId(String masv) {
      
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from students where MANV='"+masv+"'";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                student st = new student();
                st.setMasv(rs.getString(1));
                st.setHoten(rs.getString(2));
                st.setEmailString(rs.getString(3));
                st.setDiachi(rs.getString(4));
                st.setGioitinh(rs.getBoolean(5));
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
