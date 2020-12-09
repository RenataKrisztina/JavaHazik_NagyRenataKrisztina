/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JegkorongMerkozes;

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
        
        Scanner sc = new Scanner(System.in);
    
        String sor;
        String[] tomb1, tomb2, tomb3;

        String nevA, nevB;
        int golA, golB, pontA, pontB;
        Csapat csapatA, csapatB;

        ArrayList<Csapat> csapatok = new ArrayList<Csapat>();
        //csapatok.add(new Csapat("blabla", 3,2));

        while((sor = sc.nextLine()).equals("") == false){
            //System.out.println(">" + sor + "<");
            
            
            
            tomb1 = sor.split(":");
            
            tomb2 = tomb1[0].split("-");
            nevA = tomb2[0];
            nevB = tomb2[1];
            
            golA = 0;
            golB = 0;
            tomb2 = tomb1[1].split(",");
            for(int i = 0; i < tomb2.length; i++){
                tomb3 = tomb2[i].split("-");
                golA += Integer.parseInt(tomb3[0]);
                golB += Integer.parseInt(tomb3[1]);
            }
            
            if( tomb2.length == 3){
                
                if( golA > golB){
                    pontA = 3;
                    pontB = 0;
                }else{
                    pontA = 0;
                    pontB = 3;
                }
            }else{
                
                if( golA > golB){
                    pontA = 2;
                    pontB = 1;
                }else{
                    pontA = 1;
                    pontB = 2;
                }
                
            }
            csapatA = new Csapat( nevA, golA, pontA);
            csapatB = new Csapat( nevB, golB, pontB);
            
           if( csapatok.size() == 0){
               csapatok.add(csapatA);
               csapatok.add(csapatB);
           }
           else{
               int aktualisMeret = csapatok.size();
               int i;
               for( i = 0; i < csapatok.size(); i++){
                   
                   if( csapatok.get(i).equals(csapatA)){
                       csapatok.get(i).gol += csapatA.gol;
                       csapatok.get(i).pont += csapatA.pont;
                       break;
                   }
               }
               if (i == csapatok.size())
               {
                   csapatok.add(csapatA);
               }
               
               for( i = 0; i < csapatok.size(); i++){
                   
                   if( csapatok.get(i).equals(csapatB)){
                       csapatok.get(i).gol += csapatB.gol;
                       csapatok.get(i).pont += csapatB.pont;
                       break;
                   }
               }
               if (i == csapatok.size())
               {
                   csapatok.add(csapatB);
               }
           }
           
        }
        
        Collections.sort(csapatok);
        for( Csapat csapat: csapatok){
            System.out.println(csapat);
        }
    }       
}
    
    
    

class Csapat implements Comparable<Csapat>{
    
    public String nev;
    public int gol;
    public int pont;

    public Csapat(String nev, int gol, int pont) {
        this.nev = nev;
        this.gol = gol;
        this.pont = pont;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Csapat))
            return false;
        
        Csapat o = (Csapat) obj;
        
        return this.nev.equals(o.nev);
    }

    @Override
    public int compareTo(Csapat o) {
        
        if( this.pont == o.pont){
            if(this.gol == o.gol){
                return this.nev.compareTo(o.nev);
            }
            return o.gol - this.gol;
        }
        return o.pont - this.pont;
    }

    @Override
    public String toString() {
        return nev + ": " + pont + " points (" + gol + " scored goals)";
    }
    
    
    
    
    
    
    
    
}