/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_02;

/**
 *
 * @author ASUS
 */
public class Hinhtron {
    public double bankinh;

    public Hinhtron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double tinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * bankinh;
    }
    public void xuat(){
        System.out.println("HinhTron[bankinh="+bankinh+"Chuvi:"+tinhChuVi()+",dien tich:"+tinhDienTich());
    }
}
