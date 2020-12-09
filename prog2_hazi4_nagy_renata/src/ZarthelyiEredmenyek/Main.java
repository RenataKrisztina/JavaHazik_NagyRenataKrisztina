/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZarthelyiEredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Hallgato> li = new ArrayList();
        
        String sor;
        String[] tomb;
        
        while( true){
            
            sor = sc.nextLine();
            
            if(sor.equals("vege"))
                break;
            
            tomb = sor.split(";");
            
            Hallgato h = new Hallgato(tomb[0], Integer.parseInt(tomb[1]));
            
            if(li.contains(h)){
                int index = li.indexOf(h);
                li.get(index).pont += h.pont;
            }
            else{
                li.add(h);
            }
        }
        
        Collections.sort(li);
        
        for( Hallgato i: li)
            System.out.println(i);
    }
    
}
