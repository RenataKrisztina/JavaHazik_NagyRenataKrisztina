/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

import java.util.Objects;

/**
 *
 * @author Reni
 */
public class Auto implements Comparable<Auto>{
    
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return rendszam + ", " + teljesitmeny + ", " + automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Auto))
            return false;
        
        Auto a = (Auto)obj;
        
        return this.rendszam.equals(a.getRendszam());
    }

    @Override
    public int compareTo(Auto o) {
        
        if( this.teljesitmeny == o.getTeljesitmeny()){
            return this.rendszam.compareTo(o.getRendszam());
        }
        return o.getTeljesitmeny() - this.teljesitmeny;
    }
    
    public boolean isSzabalyosRendszam(){
        
        if( this.rendszam.length() != 6)
            return false;
        
        char[] betuk = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] szamok ={0,1,2,3,4,5,6,7,8,9};
        
        boolean szabalyos = false;
    }
    
    
    
    
}
