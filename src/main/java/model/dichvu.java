/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fiat4
 */
public class dichvu {
    
    private String madv;
    private String tendvString;
    private int gia;

    public dichvu(String madv) {
        this.madv = madv;
    }

    public dichvu() {
    }

    public dichvu(String madv, String tendvString, int gia) {
        this.madv = madv;
        this.tendvString = tendvString;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "dichvu{" + "madv=" + madv + ", tendvString=" + tendvString + ", gia=" + gia + '}';
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public void setTendvString(String tendvString) {
        this.tendvString = tendvString;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMadv() {
        return madv;
    }

    public String getTendvString() {
        return tendvString;
    }

    public int getGia() {
        return gia;
    }
    
    
}
