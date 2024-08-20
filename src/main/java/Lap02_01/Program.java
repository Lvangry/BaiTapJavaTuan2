/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_01;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Nhap thong tin hinh chu nhat");
        System.out.print("Cho biet chieu dai:");
        double dai =sc.nextDouble();
        System.out.print("Cho biet chieu rong:");
        double rong=sc.nextDouble();
        
        ChuNhat cn=new ChuNhat (dai,rong);
        System.out.println("Ket qua:");
        cn.xuat();
                System.out.println("Nhap thong tin hinh vuong");
        System.out.print("Cho biet canh:");
        double canh =sc.nextDouble();
        
        ChuNhat hv=new Vuong(canh);
        System.out.println("Ket qua:");
        hv.xuat();
                
    }
}
