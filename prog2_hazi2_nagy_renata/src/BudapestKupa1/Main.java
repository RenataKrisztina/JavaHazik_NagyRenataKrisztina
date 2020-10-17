/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BudapestKupa1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        
        String[] tomb;
        
        int ev;
        int honap;
        int nap;
        String nev;
        int osszestav;
        
        Tura[] turak = new Tura[N];
        
        for( int i = 0; i < N; i++){
            
            tomb = sc.nextLine().split(";");
            
            ev = Integer.parseInt(tomb[0]);
            honap = Integer.parseInt(tomb[1]);
            nap = Integer.parseInt(tomb[2]);
            nev = tomb[3];
            
            osszestav = 0;
            for( int j = 4; j < tomb.length; j++){
                osszestav += Integer.parseInt(tomb[j]);
            }
            
            turak[i] = new Tura(ev, honap, nap, nev, osszestav);
        }
        
        int max = 0;
        
        for( int i = 0; i < turak.length; i++){
            if( turak[i].osszestav > max){
                max = turak[i].osszestav;  
            }
        }
        
        Arrays.sort(turak);
        
        for( int i = 0; i < turak.length; i++){
            if( turak[i].osszestav == max){
                System.out.println(turak[i]);
            }
        }
        
        
        
        
    }
}
