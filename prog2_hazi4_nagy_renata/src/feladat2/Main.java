/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Hatizsak> hatizsakok = new ArrayList<>();
        
        hatizsakok.add(new Hatizsak("Adidas",12,3,false));
        hatizsakok.add(new Hatizsak("Nike",10,2,false));
        hatizsakok.add(new Hatizsak("Douchebags",15,5,true));
        hatizsakok.add(new Hatizsak("Tamaris",6,3,false));
        hatizsakok.add(new Hatizsak("Dorko",12,2,false));
        hatizsakok.add(new Hatizsak("Adidas",8,4,false));
        hatizsakok.add(new Hatizsak("Salomon",14,6,true));
        hatizsakok.add(new Hatizsak("Vans",10,2,false));
        hatizsakok.add(new Hatizsak("Puma",9,4,false));
        hatizsakok.add(new Hatizsak("New Balance",12,4,false));
        
        rendezes(hatizsakok);
        
    }
    
    public static List<Hatizsak> rendezes(List<Hatizsak> hatizsakok){
        
        Collections.sort(hatizsakok);
        
        for( Hatizsak i: hatizsakok)
           System.out.println(i);
        
        return hatizsakok;
    }
}
