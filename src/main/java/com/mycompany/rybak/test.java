/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rybak;

import database.helper;
import java.sql.Connection;
import model.student;
import model.studentdao;

/**
 *
 * @author fiat4
 */
public class test {
    public static void main(String[] args) {
        
        Connection conn=helper.connectdb();
        studentdao dao=new studentdao();
        if(conn!=null)
        {
            System.out.println("success");
            student st1=new student("st1","dang thai tri","tri@gmail.com","danang",true);
   student love= dao.getstbyId("ST001");
            System.out.println(love.toString());
        
        }
        else{
            System.out.println("that bai");}
            
    }
}
