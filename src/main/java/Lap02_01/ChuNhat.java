/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_01;

/**
 *
 * @author ASUS
 */
public class ChuNhat {
    public double dai;
    public double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public double getchuvi(){
        return (dai+rong)*2
;    }
    public double getdientich(){
    return dai*rong;
    }
    public void xuat(){
        System.out.println("HC[dai="+dai+",rong:"+rong+",Chuvi:"+getchuvi()+",dien tich:"+getdientich());
    }
    }

