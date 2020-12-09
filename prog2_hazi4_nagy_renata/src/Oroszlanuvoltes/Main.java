/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlanuvoltes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        //File bemenet = new File("oroszlan.txt");
        File bemenet = new File(args[0]);
        
        Scanner sc = new Scanner(bemenet);
        String line;
        String[] tomb;
        ArrayList<String> hangok = new ArrayList<String>();
        
        int oszlopban;
        int osszesen;
        
        while(sc.hasNextLine()){
            
            line = sc.nextLine();
            
            
            if(line.equals("END")){
                osszesen = 0;
                for(int oszlop = 0; oszlop < hangok.get(0).length(); oszlop++){
                    if( hangok.get(0).charAt(oszlop) == 'O'){
                        oszlopban = 1;
                        for( int sor = 1; sor< hangok.size(); sor++){
                            if( hangok.get(sor).charAt(oszlop) == 'O'){
                                oszlopban++;
                            }
                        }
                        if( oszlopban == hangok.size()){
                            osszesen ++;
                        }
                    }
                }
                System.out.println(osszesen);
                hangok = new ArrayList<String>();
                
            }else{
                tomb = line.split(":");
                hangok.add(tomb[1]);
                
                
            }
        }
        
    }
    
}
