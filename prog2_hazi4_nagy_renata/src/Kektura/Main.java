/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kektura;

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
        
        File bemenet = new File(args[0]);
        Scanner sc = new Scanner(bemenet);
        
        String sor;
        String[] tomb;
        String[] tomb2;
        
        ArrayList<String> vegpontok;


        Map<String, ArrayList<String>> turazok = new HashMap();
        
        while(sc.hasNextLine()){
            
            sor = sc.nextLine();
            tomb = sor.split(":");
            tomb2 = tomb[1].split("-");
            
            if( turazok.containsKey(tomb[0])){  //tomb[0] = kulcs
                vegpontok = turazok.get(tomb[0]);
                vegpontok.add(tomb2[0]);
                vegpontok.add(tomb2[1]);
                turazok.put(tomb[0], vegpontok);
            }
            else{
                vegpontok = new ArrayList();
                vegpontok.add(tomb2[0]);
                vegpontok.add(tomb2[1]);
                turazok.put(tomb[0], vegpontok);
            }
 
        }
        
        List<String> nevek = new ArrayList();
        int db;
        for( String turazo: turazok.keySet()){
            
            vegpontok = turazok.get(turazo);
            Collections.sort(vegpontok);
            
            db = 0;
            for( int i = 0; i < vegpontok.size()-1; i++){
                
                if( vegpontok.get(i).equals(vegpontok.get(i+1))){
                    db++;
                }
            }
            
            if( db*2 == vegpontok.size()-2){
                nevek.add(turazo);
            }
        }
        
        Collections.sort(nevek);
        for( int i = 0; i < nevek.size(); i++){
            System.out.println(nevek.get(i));
        }
        
        
        
    }
}


