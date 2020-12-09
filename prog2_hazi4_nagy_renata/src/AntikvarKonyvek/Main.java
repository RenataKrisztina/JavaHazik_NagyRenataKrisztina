/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntikvarKonyvek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File bemenet = new File("konyvek.txt");  //bemásolja a memóriába az adott állományt, visszadja a memóriaterület első rekeszének címét
        
       // File bemenet = new File(args[0]);
        Scanner sc = new Scanner(bemenet);
        
        String sor;
        String[] tomb;
        
        ArrayList<Konyv> konyvek = new ArrayList<Konyv>();
        
        ArrayList<String> szerzok;
        String cim;
        int evszam;
        
        
        Konyv aktualisKonyv;
        int aktualisMeret;
        
        while(sc.hasNextLine()){
            
            sor = sc.nextLine();
            tomb = sor.split(";");
            
            evszam = Integer.parseInt(tomb[tomb.length - 1]);
            cim = tomb[tomb.length - 2];
            
            szerzok = new ArrayList<String>();
            for( int i = 0; i < tomb.length-2; i++){
                szerzok.add(tomb[i]);
            }
            
            aktualisKonyv = new Konyv(szerzok, cim, evszam);
            //System.out.println(aktualisKonyv);
            
            aktualisMeret = konyvek.size();
            
            int i;
            for( i = 0; i < aktualisMeret; i++){
                
                
                if( konyvek.get(i).equals(aktualisKonyv)){
                    
                    if(konyvek.get(i).evszam > aktualisKonyv.evszam){
                        konyvek.get(i).evszam = aktualisKonyv.evszam;
                    }
                    break;
                }
            }
            if( i == konyvek.size() ){
                konyvek.add(aktualisKonyv);
            }
            
            /*
            if(konyvek.isEmpty() == true){
                konyvek.add(aktualisKonyv);
            }
            */
        }
        
        Collections.sort(konyvek);
        
        for( int i = 0; i < konyvek.size(); i++){
            System.out.println(konyvek.get(i));
        }

    }
}

class Konyv implements Comparable <Konyv>{
    
    ArrayList<String> szerzok;
    String cim;
    int evszam;

    public Konyv(ArrayList<String> szerzok, String cim, int evszam) {
        this.szerzok = szerzok;
        this.cim = cim;
        this.evszam = evszam;
    }

    public void setEvszam(int evszam) {
        this.evszam = evszam;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !( obj instanceof Konyv))
            return false;
        
        Konyv other = (Konyv) obj;
        
        return this.szerzok.equals(other.szerzok) && this.cim.equals(other.cim);
        
        
    }

    @Override
    public int compareTo(Konyv o) {
        
        if( this.evszam == o.evszam){
            if(this.szerzok.size() == o.szerzok.size()){
                return this.cim.compareTo(o.cim);
            }
            return o.szerzok.size() - this.szerzok.size();
        }
        return this.evszam - o.evszam;
    }

    @Override
    public String toString() {
        
        String sor ="";
        
        if( szerzok.size() > 0){
            for( int i =0 ; i < szerzok.size(); i++){
                if( i != 0){
                    sor += ", ";
                    
                }
                sor += szerzok.get(i);
                
            }
            sor += ": ";
        }
        sor += cim;
        sor += " (";
        sor += evszam;
        sor += ")";
        
        return sor;
    }
}
