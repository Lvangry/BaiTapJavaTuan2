/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02_02;

/**
 *
 * @author ASUS
 */
class Hinhtru extends Hinhtron {
    private double chieucao;

    public Hinhtru() {
        super(1.0); // Gọi constructor của lớp cha
        chieucao=1.0;
        
    }

    public Hinhtru(double bankinh, double chieucao) {
        super(bankinh); // Gọi constructor của lớp cha với tham số bankinh
        this.chieucao = chieucao;
    }

    public void setChieuCao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getChieuCao() {
        return chieucao;
    }

    @Override
    public double tinhDienTich() {
        // Ghi đè phương thức tinhDienTich() để tính diện tích hình trụ
        double dienTichDay = super.tinhDienTich();
        double dienTichXungQuanh = super.tinhChuVi() * chieucao;
        return 2 * dienTichDay + dienTichXungQuanh;
    }

    public double tinhTheTich() {
        return super.tinhDienTich() * chieucao;
    }
    
  
    public void xuat(){
    System.out.println("Hinhtru[bankinh="+super.getBankinh()+",chieucao:"+chieucao+",The tich:"+tinhTheTich()+",dientich:"+tinhDienTich());
    }
}
