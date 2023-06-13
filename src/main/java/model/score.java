/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fiat4
 */
public class score {
    private float math,enlish;
    private String masv,id;

    public score() {
    }

    public score(float math, float enlish, String masv, String id) {
        this.math = math;
        this.enlish = enlish;
        this.masv = masv;
        this.id = id;
    }

    @Override
    public String toString() {
        return "score{" + "math=" + math + ", enlish=" + enlish + ", masv=" + masv + ", id=" + id + '}';
    }

    public void setMath(float math) {
        this.math = math;
    }

    public void setEnlish(float enlish) {
        this.enlish = enlish;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getMath() {
        return math;
    }

    public float getEnlish() {
        return enlish;
    }

    public String getMasv() {
        return masv;
    }

    public String getId() {
        return id;
    }

    
    
}
