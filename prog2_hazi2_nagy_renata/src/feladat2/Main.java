/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Triangle t = new Triangle(1.0,1.5,1.0);
        t.setColor("yellow");
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
        System.out.println(t.getColor());
        System.out.println(t.isFilled());
        
    }
    
}
