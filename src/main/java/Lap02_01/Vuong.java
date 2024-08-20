/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_01;

/**
 *
 * @author ASUS
 */
public class Vuong {
    public  double canh;

    public Vuong(double canh) {
        this.canh = canh;
    }
      public double getchuvi(){
        return canh*4
;    }
    public double getdientich(){
    return canh*canh;
    }
    public void xuat(){
        System.out.println("HC[canh="+canh+",Chuvi:"+getchuvi()+",dien tich:"+getdientich());
    }
    
}
