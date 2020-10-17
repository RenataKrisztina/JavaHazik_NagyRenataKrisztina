/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullamvasutak;

/**
 *
 * @author Reni
 */
public class Hullamvasut implements Comparable<Hullamvasut>{
    
    String nev;
    String vilag;
    int magassag;
    int varakozas;

    public Hullamvasut(String nev, String vilag, int magassag, int varakozas) {
        this.nev = nev;
        this.vilag = vilag;
        this.magassag = magassag;
        this.varakozas = varakozas;
    }

    @Override
    public String toString() {
        return nev + " (" + vilag + "): " + varakozas;
    }

    @Override
    public int compareTo(Hullamvasut o) {
        
        if( this.varakozas == o.varakozas){
            if( this.varakozas == o.varakozas){
                return this.nev.compareTo(o.nev);
            }
            return o.magassag - this.magassag;
        }
        return this.varakozas - o.varakozas;
    }
    
    
}
