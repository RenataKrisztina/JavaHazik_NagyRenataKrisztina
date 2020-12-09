/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vizgyujtok;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    static Map<String, ArrayList<String>> vizgyujtok = new HashMap<>();
    
    public static void main(String[] args) {
        
        //String[] args2 = {"Duna", "Amazonas", "Fekete-tenger", "Zala"};
        String[] args2 = args;
        Scanner sc = new Scanner(System.in);
        
        String sor;
        String[] tomb;
        
        
        ArrayList<String> folyok =  new ArrayList<>();
        
        
        while( !(sor = sc.nextLine()).equals("")){
           
          
            tomb = sor.split(";");
            
            if(tomb.length == 1){
                folyok = new ArrayList();
                vizgyujtok.put(tomb[0], folyok);
            }
            else if( vizgyujtok.containsKey(tomb[1])){
                folyok = vizgyujtok.get(tomb[1]);
                folyok.add(tomb[0]);
                vizgyujtok.put(tomb[1], folyok);
            }
            else{
                folyok = new ArrayList();
                folyok.add(tomb[0]);
                vizgyujtok.put(tomb[1], folyok);
            }
        }
       /* for( String vizgyujto : vizgyujtok.keySet()){
            System.out.println("#"+vizgyujto);
            for(int i = 0; i< vizgyujtok.get(vizgyujto).size(); i++){
                System.out.println(vizgyujtok.get(vizgyujto).get(i));
            }
        }*/
        
        int db;
        for( int i = 0; i < args2.length; i++){
            db = szamol(args2[i]);
            System.out.println(args2[i] + ": " + db);
        }
    }
    
    static public int szamol(String kulcs){
      
        if( vizgyujtok.containsKey(kulcs) == false){
            
            return 0;
        }
            
        
        int db = vizgyujtok.get(kulcs).size();
        if( db != 0 ){
            for( int i = 0; i <vizgyujtok.get(kulcs).size(); i++){
                db += szamol(vizgyujtok.get(kulcs).get(i));
            }
        }
        return db;
    }
    
}
