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
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    
    private String iz;
    private int alkoholTartalom;

    public AlkoholosItal(String iz, int alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }
    
    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }

    
    
    
    
    
}
