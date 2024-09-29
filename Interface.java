/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author shiam
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a Circle object with radius 5
        System.out.println("----------------------------------------------------");
        
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        
        System.out.println("----------------------------------------------------");
        
        // Create a Rectangle object with length 4 and width 3
        Shape rectangle = new Rectangle(4, 3);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        
        System.out.println("----------------------------------------------------");
    }
    
}
