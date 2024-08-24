/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_03;

/**
 *
 * @author ASUS
 */
public abstract class SinhVien{
    public String hoten;
    public String nganh;

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    
    //phuong thuc tinh diem trung binh
    abstract public double getDiem();
    //phuong thuc xep loai;
    public String getHocLuc(){
    String kq="";
    double dtb=getDiem();
    if (dtb<5){
    kq="Yeu";
    }else if (dtb<6.5){
    kq="Trung binh";
    }else if(dtb<7.5){
    kq="Kha";
    }else if(dtb<9){
    kq="Gioi";
    }else{
    kq="Xuat sac";
    }
    return kq;
    }
    ///phuong thuc xuat thong tin sinh vien
    public void xuat(){
    System.out.println("SinhVien[Hoten:"+hoten+", nganh:"+nganh+", DTB:"+getDiem()+", Hoc luc:"+getHocLuc());
    }

    
    
    
}
