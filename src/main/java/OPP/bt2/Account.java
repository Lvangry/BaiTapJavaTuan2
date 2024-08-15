/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP.bt2;

/**
 *
 * @author ASUS
 */
public class Account {
    //khai bao du lieu
    private String id;
    public String name;
    public double balance;
    //dinh nghia
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name=name;
        this.balance = balance;
    }
     // Nạp tiền vào tài khoản
    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nap tien thanh cong.So du hien tai: " + balance);
        } else {
            System.out.println("So tien nap phai lon hon khong.");
        }
     
    }
     // Thanh toán tiền
    public void debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Thanh toan thanh cong .So du hien tai: " + balance);
        } else {
            System.out.println("So du khong du de thuc hien thanh toan.");
        }
    }
     // Chuyển tiền từ tài khoản này cho tài khoản khác
    public void transferTo(Account account, int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            account.credit(amount);
            System.out.println("Chuyen tien thanh cong .So du hien tai: " + balance);
        } else {
            System.out.println("So du khong du de thuc hien ggiao dich.");
        }
    }
}
