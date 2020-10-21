/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6;

/**
 *
 * @author Reni
 */
public class Hallgato {
    
    private int mennyitKeszult;
    private boolean sokatTanult;

    public Hallgato(int mennyitKeszult, boolean sokatTanult) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanult = sokatTanult;
    }
    
    
    //random szam generalas
    // (int)(Math.random() * intervallum_mérete) + alsó;
    
    public Dolgozat dolgozatotIr(){
        
        if( this.sokatTanult == true){
            return new Dolgozat( ((int)(Math.random() * 4 + 4)) * this.mennyitKeszult);
        }
        else if( this.sokatTanult == false){
            return new Dolgozat( ((int)(Math.random() * 6)) * this.mennyitKeszult);
        }else{
            System.out.println("Nem irt");
            return new Dolgozat(-1);
        }
    }
    
}
