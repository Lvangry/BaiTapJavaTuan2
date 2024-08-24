/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_03;

/**
 *
 * @author ASUS
 */
public  class SinhVienIT extends SinhVien{
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoten) {
        super(hoten,"IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem(){
    return(diemJava*2 +diemHtml+diemCss)/4;
    }
    
    
   
}
