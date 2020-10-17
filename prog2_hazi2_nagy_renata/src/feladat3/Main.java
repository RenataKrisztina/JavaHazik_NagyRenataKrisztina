/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

import java.util.Arrays;

/**
 *
 * @author Reni
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        VendeglatoipariEgyseg[] ve = new VendeglatoipariEgyseg[] {
           new Etterem( new String[] {"hamburger", "hotdog", "pizza", "tortilla"}, "Food factory", 42),
           new Etterem( new String[] {"halászlé","harcsapaprikás","túróscsusza"}, "Csege Csárda", 110),
           new Etterem( new String[]{"gulyásleves","kenyérlángos","palacsinta"}, "Paripa Csárda", 126),
           new Etterem( new String[] {"carbonara", "tiramisu", "hawaii pizza", "négysajtos pizza", "panna cotta"}, "Mauro Pizzéria", 68),
           new Etterem( new String[] {"tikka masala", "tandori csirke", "epres lassi", "korma"}, "Kashmir", 20),
           new Kocsma( new String[]{"Kőbányai","Soproni","Arany Fácán"}, "Krajcaros", 35),
           new Kocsma( new String[]{"Kőbányai","Soproni","Dreher"}, "CactusPub", 100),
           new Kocsma( new String[]{"Eidelweiss","Dreher","Heineken"}, "Pince", 80),
           new Kocsma( new String[]{"Kőbányai","Borsodi","Csíki"}, "Furedi", 85),
           new Kocsma( new String[]{"Borsodi","Krusovice","Staropramen"}, "Obsitos", 40),
        };
        
        System.out.println(Arrays.toString(AdottItaltKinaloKocsmak(ve,"Krusovice")));
        
        
    }
    
    public static Kocsma[] AdottItaltKinaloKocsmak( VendeglatoipariEgyseg[] ve, String sör){
        
        int db = 0;
        for( int i = 0; i < ve.length; i++){
            if( ve[i] instanceof Kocsma){
                
                Kocsma k = (Kocsma)ve[i];
                
                for( int j = 0; j < k.getSorlap().length; j++){
                    if( k.getSorlap()[j].equals(sör)){
                        db++;
                        break;
                        
                    }
                }
            }           
        }
        
        Kocsma[] jokocsmak = new Kocsma[db];
        int index = 0;
        
        for( int i = 0; i < ve.length; i++){
            if( ve[i] instanceof Kocsma){
                
                Kocsma k = (Kocsma)ve[i];
               
                for( int j = 0; j < k.getSorlap().length; j++){
                    if( k.getSorlap()[j].equals(sör)){
                        jokocsmak[index] = k;
                        index++;
                        break;
                    }
                }
            } 
        }
        return jokocsmak;
    }
}
