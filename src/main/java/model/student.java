/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fiat4
 */
public class student {
    private  String masv;
    private String hoten,emailString,diachi;
    private boolean gioitinh;

    public student(String masv, String hoten, String emailString, String diachi, boolean gioitinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.emailString = emailString;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public student() {
    }

    public student(String masv) {
        this.masv = masv;
    }

    @Override
    public String toString() {
        return "student{" + "masv=" + masv + ", hoten=" + hoten + ", emailString=" + emailString + ", diachi=" + diachi + ", gioitinh=" + gioitinh + '}';
    }
    
}
