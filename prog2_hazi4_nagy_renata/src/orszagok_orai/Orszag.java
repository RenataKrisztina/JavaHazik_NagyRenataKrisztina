/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orszagok_orai;

import java.util.Objects;

/**
 *
 * @author Reni
 */
public class Orszag implements Comparable <Orszag> {
    
    private String nev;
    private int lakossag;
    private int terulet;

    public Orszag(String nev, int lakossag, int terulet) {
        this.nev = nev;
        this.lakossag = lakossag;
        this.terulet = terulet;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getLakossag() {
        return lakossag;
    }

    public void setLakossag(int lakossag) {
        this.lakossag = lakossag;
    }

    public int getTerulet() {
        return terulet;
    }

    public void setTerulet(int terulet) {
        this.terulet = terulet;
    }

    @Override
    public String toString() {
        return nev + ", " + lakossag + ", " + terulet;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Orszag))
            return false;
        
        Orszag o = (Orszag)obj;
        
        return this.nev.equals(o.getNev()) && this.lakossag == o.getLakossag() && this.terulet == o.getTerulet();
    }

    @Override
    public int compareTo(Orszag o) {
        
        if( this.lakossag/(double)this.terulet == o.getLakossag()/(double)o.getTerulet())
            return this.nev.compareTo(o.getNev());
        else if (this.lakossag/(double)this.terulet > o.getLakossag()/(double)o.getTerulet())
            return -1;
        else
            return 1;
            
    }
    
    
    
    
    
}
