/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rybak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fiat4
 */
public class Rybak {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;;databaseName=student;user=sa;password=123456";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 *  FROM [student].[dbo].[students]";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MASV") + " " + rs.getString("HOTEN"));
            }
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
e.printStackTrace();
        }
    }
}
