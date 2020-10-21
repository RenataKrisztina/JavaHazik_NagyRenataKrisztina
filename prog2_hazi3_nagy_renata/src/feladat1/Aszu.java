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
public class Aszu extends Bor{
    
    private int puttonySzam;

    public Aszu(String szoloFajta, String termoTerulet, String iz, int alkoholTartalom) {
        super(szoloFajta, termoTerulet, iz, alkoholTartalom);
    }

    public Aszu(int puttonySzam, String termoTerulet, int alkoholTartalom) {
        super("Furmint", termoTerulet, "édes", alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }

  
    
    
    
}
