/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_02;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Program {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Nhap thong tin hinh tron");
        System.out.print("Cho biet ban kinh:");
        double bankinh =sc.nextDouble();
       
        
     Hinhtron htro=new Hinhtron (bankinh);
        System.out.println("Ket qua:");
        htro.xuat();
                System.out.println("Nhap thong tin hinh tru");
        System.out.print("Cho biet chieu cao:");
        double chieucao=sc.nextDouble();
        
        Hinhtron htru=new Hinhtru(chieucao);
        System.out.println("Ket qua:");
        htru.xuat();
    }
}
