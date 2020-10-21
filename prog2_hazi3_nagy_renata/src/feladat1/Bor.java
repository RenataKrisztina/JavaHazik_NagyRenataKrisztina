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
public class Bor extends AlkoholosItal{

    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String iz, int alkoholTartalom) {
        super(iz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    public String milyenSzolobolKeszult() {
        return szoloFajta;
    }

    public String holTermett() {
        return termoTerulet;
    }
    
    
     
    @Override
    public String mibolKeszult() {
        return szoloFajta;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }
    
    
}
