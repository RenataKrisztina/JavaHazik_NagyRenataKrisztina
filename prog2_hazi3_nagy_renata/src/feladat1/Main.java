/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

import java.util.Arrays;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Bor[] borok = new Bor[] {
            new Bor("Irsai Olivér","Kunsági borvidék","száraz",12),
            new Bor("Kéknyelű","Badacsony","száraz",13),
            new Bor("Cabernet Frank","Szekszárd","száraz",14),
            new Aszu(6, "Tokaj",10),
            new Aszu(5, "Tokaj",11),
            new Aszu(5, "Tokaj",10),
            new Aszu(3, "Tokaj",12),
            new Aszu(5, "Tokaj",12)     
        };
        
        System.out.println(Arrays.toString(ötPuttonyos(borok)));
        
    }
    
    public static Aszu[] ötPuttonyos( Bor[] borok){
        
        int db = 0;
        for( int i = 0; i < borok.length; i++){
            if(borok[i] instanceof Aszu){
                Aszu a = (Aszu) borok[i];
                if( a.hanyPuttonyos() == 5){
                    db++;
                }
            }
        }
        
        Aszu[] ötPuttonyos = new Aszu[db];
        int index = 0;
        
        for( int i = 0; i < borok.length; i++){
            if(borok[i] instanceof Aszu){
                Aszu a = (Aszu) borok[i];
                if( a.hanyPuttonyos() == 5){
                    ötPuttonyos[index] = a;
                    index++;
                }
            }
        }
        return ötPuttonyos;
    }
    
}
