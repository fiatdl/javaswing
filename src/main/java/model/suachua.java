/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fiat4
 */
public class suachua {
    private String MascString;
    private String Manv;
    private String Madv;
    private String TenXe;
    private String ghichu;
    private int Gias;
    private int Chiphisuaxe;

    public suachua() {
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getGhichu() {
        return ghichu;
    }

    public suachua(String MascString, String Manv, String Madv, String TenXe, String ghichu, int Gias, int Chiphisuaxe) {
        this.MascString = MascString;
        this.Manv = Manv;
        this.Madv = Madv;
        this.TenXe = TenXe;
        this.ghichu = ghichu;
        this.Gias = Gias;
        this.Chiphisuaxe = Chiphisuaxe;
    }

    public suachua(String MascString, String Manv, String Madv, String TenXe) {
        this.MascString = MascString;
        this.Manv = Manv;
        this.Madv = Madv;
        this.TenXe = TenXe;
    }

    public String getMascString() {
        return MascString;
    }

    public String getManv() {
        return Manv;
    }

    public String getMadv() {
        return Madv;
    }

    public void setMascString(String MascString) {
        this.MascString = MascString;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public void setMadv(String Madv) {
        this.Madv = Madv;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public void setGias(int Gias) {
        this.Gias = Gias;
    }

    public void setChiphisuaxe(int Chiphisuaxe) {
        this.Chiphisuaxe = Chiphisuaxe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public int getGias() {
        return Gias;
    }

    public int getChiphisuaxe() {
        return Chiphisuaxe;
    }
    
    
    
    
    
}
