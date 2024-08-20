/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_02;
import java.util.Scanner;
/**2
 * 2
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
         System.out.print("Cho biet ban kinh:");
        bankinh =sc.nextDouble();
         
        
        Hinhtron htru=new Hinhtru(bankinh,chieucao);
        System.out.println("Ket qua:");
        htru.xuat();
    }
}
