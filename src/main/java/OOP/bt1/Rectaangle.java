/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.bt1;

/**
 *
 * @author ASUS
 */
public class Rectaangle {
    //khai bao du lieu
    private double length;
    private double width;
    //dinh nghia cac phuong thuc

    public Rectaangle() {
        this(1,1);//tham chieu  toinphuong thuc khoi tao
    }

    public Rectaangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double findArea(){     
       return length * width;
    }
    public double findPerimeter(){
      return 2 * (length + width);
    }
}
