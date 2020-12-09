/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZarthelyiEredmenyek;

import java.util.Objects;

/**
 *
 * @author Reni
 */
public class Hallgato implements Comparable<Hallgato>{
    
    String nev;
    int pont;

    public Hallgato(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    @Override
    public String toString() {
        return nev + ": " + pont + " pont";
    }

    @Override
    public int compareTo(Hallgato o) {
        if( this.pont == o.pont){
            return this.nev.compareTo(o.nev);
        }
        return o.pont - this.pont;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !( obj instanceof Hallgato))
            return false;
        
        Hallgato o = (Hallgato) obj;
        
        return this.nev.equals(o.nev);
    }
    
    
    
    
    
    
}
