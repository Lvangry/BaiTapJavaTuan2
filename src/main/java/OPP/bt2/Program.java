/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP.bt2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Program{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        // Tạo 2 tài khoản
        Account mA = new Account("1", "Viet", 100.0);
        Account fA = new Account("2", "Le", 50.0);

        // Gửi tiền và rút tiền
        mA.credit(20);
        mA.debit(30);

        // Chuyển khoản
       mA.transferTo(fA, 10);

        // Xuất thông tin tài khoản
        System.out.println("Thong tin tai lhoan cua toi: " + mA.name + ",So du: " + mA.balance);
        System.out.println("Thong tin tai khoan cua ban toi: " + fA.name + ",So du: " + fA.balance);
        
    }
}
