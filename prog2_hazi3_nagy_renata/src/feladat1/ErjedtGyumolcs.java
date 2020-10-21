/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author Reni
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    
    private double alkoholtartalom;


    public ErjedtGyumolcs(String fajta, String iz, double alkoholtartalom) {
        super(fajta, iz);
        this.alkoholtartalom = alkoholtartalom;
    }
    

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholtartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "fajta=" + super.milyenFajtaju() + ", iz=" + super.milyenIzu() + "alkoholtartalom=" + alkoholtartalom + '}';
    }

    
    
    
    
    
    
}
