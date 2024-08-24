/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_03;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Program {
    //khai bao ds kieu ArrayList<SinhVien> de lu tru
    static ArrayList<SinhVien> da= new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
   private static void menu(){
   int chon=5;
    Scanner sc=new Scanner (System.in);
    do{
        //In thu don
    System.out.println("=====CHUONG TRINH QUAN LY SINH VIEN====");
     System.out.println("1.Nhap danh sach sinh vien");
      System.out.println("2.Xuat danh sach sinh vien");
       System.out.println("3.Xuat danh sach sinh vien hoc luc gioi");
        System.out.println("4.Sap xep danh sach sinh vien theo diem");
         System.out.println("5.Ket thuc");
          System.out.println("------------------------------------------");
           System.out.print("Ban chon (1->5):");
           chon=sc.nextInt();
           switch (chon){
               case 1:
                   nhapDS();
                   break;
               case 2:
                   xuatDS();
                   break;
               case 3:
                   xuatSVGioi();
                   break;
               case 5:
                   System.out.println("Goodbye!!");
                   break;
           }
           
    }while (chon !=5);
   }
   private static void nhapDS(){
   }
   private static void xuatDS(){
       System.out.println("Thuc hien xuat danh sach");
       for(SinhVien sv:ds){
       sv.xuat();
       }
   }
   private static void xuatSVGioi(){
       System.out.println("Danh sach sinh vien gioi");
       for (SinhVien sv :ds){
       if(sv.getDiem()<9&& sv.getDiem()>=7.5){
       sv.xuat();
       }
       }
   }
}
