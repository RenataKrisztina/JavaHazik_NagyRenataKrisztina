/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostaiKuldemeny;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File bemenet = new File("sample.txt");  //bemásolja a memóriába az adott állományt, visszadja a memóriaterület első rekeszének címét
        
        //File bemenet = new File(args[0]);
        Scanner sc = new Scanner(bemenet);
        
        String sor;
        String[] tomb;
        
        String nev;
        int iranyitoszam;
        String telepules;
        String utca;
        int hazszam;
        int ertek;
        
        Kuldemeny kuldemeny;
        
        List<Kuldemeny> kuldemenyek = new ArrayList();
        
        
        while(sc.hasNextLine()){
            
            sor = sc.nextLine();
            tomb = sor.split(":");
            
            nev = tomb[0];
            iranyitoszam = Integer.parseInt(tomb[1]);
            telepules = tomb[2];
            utca = tomb[3];
            hazszam = Integer.parseInt(tomb[4]);
            ertek = Integer.parseInt(tomb[5]);
            
            kuldemeny = new Kuldemeny(nev, iranyitoszam, telepules, utca, hazszam, ertek);
            
            kuldemenyek.add(kuldemeny);
             
        }
        
        Collections.sort(kuldemenyek);
        
        
        Map<Integer, Integer> osszegzes = new HashMap();    // <kulcs, ertek>
        
        int key;
        int value;
        
        int osszeg;
        
        for( Kuldemeny i : kuldemenyek){
            
            key = i.getIranyitoszam();
            value = i.getErtek();
            
            if( osszegzes.containsKey(key)){
                
                osszeg = osszegzes.get(key);    //get: visszaadja a kulcshoz tartozó értéket
                osszegzes.put( key, osszeg + value);
            }
            else{
                osszegzes.put(key, value);
            }
            
        }
        
        int irsz = -1;   //iranyitoszam
        
        for(Kuldemeny i : kuldemenyek){
            
            if( irsz == i.getIranyitoszam()){
                
                System.out.println(i);
            }
            else{
                irsz = i.getIranyitoszam();
                System.out.println( irsz + ": " + osszegzes.get(irsz) + " Ft");
                System.out.println(i);
            }
        }
        
    }
    
    
    
}

class Kuldemeny implements Comparable<Kuldemeny>{
    
    String nev;
    int iranyitoszam;
    String telepules;
    String utca;
    int hazszam;
    int ertek;

    public Kuldemeny(String nev, int iranyitoszam, String telepules, String utca, int hazszam, int ertek) {
        this.nev = nev;
        this.iranyitoszam = iranyitoszam;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.ertek = ertek;
    }

    public String getNev() {
        return nev;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public String getTelepules() {
        return telepules;
    }

    public String getUtca() {
        return utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public int getErtek() {
        return ertek;
    }
    
    

    @Override
    public String toString() {
        return telepules + ", " + utca + " " + hazszam + "., " + nev + ", " + ertek + " Ft";
    }

    @Override
    public int compareTo(Kuldemeny o) {
        
        if( this.iranyitoszam == o.getIranyitoszam()){
            if( this.telepules.equals(o.getTelepules())){
                if( this.utca.equals(o.getUtca())){
                    if( this.hazszam == o.getHazszam()){
                        if(this.nev.equals(o.getNev())){
                            return o.getErtek() - this.ertek;
                        }
                        return this.nev.compareTo(o.getNev());
                    }
                    return this.hazszam - o.getHazszam();
                }
                 return this.utca.compareTo(o.getUtca());
            }
            return this.telepules.compareTo(o.getTelepules());
        }
        return this.iranyitoszam - o.getIranyitoszam();
    }
    
    
    
    
    
}