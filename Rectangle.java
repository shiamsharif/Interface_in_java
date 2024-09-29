/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author shiam
 */
public class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area(){
        return length * width;
    }
    
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}
