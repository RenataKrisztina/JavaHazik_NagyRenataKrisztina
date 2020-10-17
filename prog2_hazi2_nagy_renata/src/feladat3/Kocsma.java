/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

import java.util.Arrays;

/**
 *
 * @author Reni
 */
public class Kocsma extends VendeglatoipariEgyseg{
    
    private String[] sorlap;

    public Kocsma(String[] sorlap, String nev, int ferohelyekSzama) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.getNev() + " sorlap: " + Arrays.toString(sorlap) + "\n";
    }
    
    
   
    
    
    
}
