/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat4;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Reni
 */
public class Auto {
    
    private String rendszam;
    private int motorteljesitmeny;
    private Date gyartasiDatum;

    public Auto(String rendszam, int motorteljesitmeny) {
        this.rendszam = rendszam;
        this.motorteljesitmeny = motorteljesitmeny;
        this.gyartasiDatum = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorteljesitmeny() {
        return motorteljesitmeny;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return rendszam + ", " + motorteljesitmeny + ", " + gyartasiDatum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Auto))
            return false;
        
        Auto a = (Auto)obj;
        
        return this.rendszam.equals(a.getRendszam()) && this.gyartasiDatum == a.getGyartasiDatum() && this.motorteljesitmeny == a.getMotorteljesitmeny();
    }
    
    
    
    
    
    
    
}
