/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.helper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fiat4
 */
public class suachuadao {

    Connection conn = null;
    PreparedStatement stmm = null;

     public int add(suachua st,Date love) {

        try {

            String sSQL = "insert suachua(masc,manv,madv,tenxe,ghichu,gia,chiphi,ngay) values(?,?,?,?,?,?,?,?);";
            conn = helper.connectdb();
            stmm = conn.prepareStatement(sSQL);
            stmm.setString(1, st.getMascString());
            stmm.setString(2, st.getManv());
            stmm.setString(3, st.getMadv());
            stmm.setString(4, st.getTenXe());
            stmm.setString(5, st.getGhichu());
             stmm.setInt(6, st.getGias());
              stmm.setInt(7, st.getChiphisuaxe());
                 stmm.setDate(8,love );
            if (stmm.executeUpdate() > 0) {
                System.out.println("them 1 st thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        }
        return -1;
    }

    
    public List<suachua> getall() {
        List<suachua> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from suachua";
            conn = helper.connectdb();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                suachua st = new suachua();
                st.setMascString(rs.getString(1));
                st.setManv(rs.getString(2));
                st.setMadv(rs.getString(3));
                st.setTenXe(rs.getString(4));
                st.setGhichu(rs.getString(5));
                st.setGias(rs.getInt(6));

                st.setChiphisuaxe(rs.getInt(7));
                ls.add(st);
            }
        } catch (Exception e) {
            System.out.println("err" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("close err" + e.toString());
            }
        }
        return ls;
    }
}
