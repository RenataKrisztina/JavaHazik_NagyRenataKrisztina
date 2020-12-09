/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Fagyi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        
        File bemenet = new File(args[0]); 
        
        Scanner sc = new Scanner(bemenet);
        
        
        String sor;
        String[] tomb;
        String[] tomb2;
        
        List<String> izek = new ArrayList<String>();
        Map<String,List<String>> rendelesek = new HashMap<String,List<String>>();
        
        while(sc.hasNextLine()){
            sor = sc.nextLine();
            tomb = sor.split(";");
            
            tomb2 = tomb[1].split(",");
            
            izek = new ArrayList<String>();
            for( int i = 0; i < tomb2.length; i++){
                izek.add(tomb2[i]);
            }
            
            rendelesek.put(tomb[0], izek);
        }
        
        sc = new Scanner(System.in);
        
        Map<String,Integer> arak = new HashMap<String,Integer>();
        
        while( (sor = sc.nextLine()).equals("") == false){
            
            tomb = sor.split(";");
            arak.put(tomb[0], Integer.parseInt(tomb[1]));
        }
        
        int reszosszeg = 0;
        int osszeg = 0;
        int db = 0;
        int szamlalo;
        
        for( String kulcs:rendelesek.keySet()){
            izek = rendelesek.get(kulcs);   //izekbe beletesszuk a kulcshoz tartozo ertekeket
    
            reszosszeg = 0;
            szamlalo = 0;
            for( String iz : izek){
                if( arak.containsKey(iz)){
                    reszosszeg += arak.get(iz);
                    szamlalo++;
                }
                
            }
            if (szamlalo == izek.size()){
                db ++;
                osszeg += reszosszeg;
            }
        }
        System.out.println(db + " rendeles");
        System.out.println(osszeg + " Ft");
        
    }
}
