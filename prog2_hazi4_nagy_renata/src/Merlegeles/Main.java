/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Merlegeles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        //File bemenet = new File("cegek.txt");
        File bemenet = new File(args[0]);
        Scanner sc = new Scanner(bemenet);
        
        String sor;
        String[] tomb;
        
        Ceg aktualisceg;
        List<Ceg> cegek = new ArrayList();
        
        
        while( sc.hasNextLine()){
            
            sor = sc.nextLine();
            tomb = sor.split(":");
            
            aktualisceg = new Ceg(tomb[0], tomb[1], 1, Integer.parseInt(tomb[3]));
            
            int i;
            for( i = 0; i < cegek.size(); i++){
                
                if( aktualisceg.equals(cegek.get(i))){
                    cegek.get(i).evekszama += 1;
                    cegek.get(i).osszbevetel += aktualisceg.osszbevetel;
                    break;
                }
            }
            if( i == cegek.size()){
                cegek.add(aktualisceg);
            }
        }
        
        Collections.sort(cegek);
        for( int i = 0; i < cegek.size(); i++){
            System.out.println(cegek.get(i));
        }
    }
}

class Ceg implements Comparable<Ceg>{
    
    String nev;
    String telephely;
    int osszbevetel;
    int evekszama;

    public Ceg(String nev, String telephely, int evekszama, int osszbevetel) {
        this.nev = nev;
        this.telephely = telephely;
        this.osszbevetel = osszbevetel;
        this.evekszama = evekszama;
    }

    @Override
    public String toString() {
        return nev + " (" + telephely + "): " + osszbevetel;
    }

    @Override
    public int compareTo(Ceg o) {
        
        if( this.osszbevetel == o.osszbevetel){
            if( this.evekszama == o.evekszama){
                return this.nev.compareTo(o.nev);
            }
            return this.evekszama - o.evekszama;
        }
        return o.osszbevetel - this.osszbevetel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !( obj instanceof Ceg))
            return false;
        
        Ceg o = (Ceg)obj;
        return this.nev.equals(o.nev) && this.telephely.equals(o.telephely);
    }    
}
