/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        String sor;
        String[] tomb;

        
        ArrayList<Osztalypenz> befizetesek = new ArrayList();
        
        //int index;

        Scanner sc = new Scanner(System.in);

        while(true){
            
            sor = sc.nextLine();
            
            if( sor.equals(""))
                break;
            
            tomb = sor.split(";");
            
            Osztalypenz befizetes;
            befizetes = new Osztalypenz(tomb[0], Integer.parseInt(tomb[1]));
            
            if( befizetesek.contains(befizetes)){
                int index = befizetesek.indexOf(befizetes);
                
                befizetesek.get(index).setPenz( befizetesek.get(index).getPenz() + Integer.parseInt(tomb[1]));
            }else
                befizetesek.add(befizetes);
            
            }
        
            Collections.sort(befizetesek);
            
            for( Osztalypenz i: befizetesek){
                System.out.println(i);
        }   
    }
    
    
}

class Osztalypenz implements Comparable<Osztalypenz>{
    
    private String nev;
    private int penz;

    public Osztalypenz(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    @Override
    public String toString() {
        return nev + ";" + penz;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Osztalypenz))
            return false;
        
        Osztalypenz o = (Osztalypenz)obj;
        return this.nev.equals(o.getNev());
    }

    @Override
    public int compareTo(Osztalypenz o) {
        
        if( this.penz == o.getPenz()){
            return this.nev.compareTo(o.getNev());
        }
        else
            return o.getPenz() - this.penz;
    }
    
    
    
    
    
    
    
    
    
    
}
