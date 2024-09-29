/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author shiam
 */
public class Circle implements Shape {
    
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
