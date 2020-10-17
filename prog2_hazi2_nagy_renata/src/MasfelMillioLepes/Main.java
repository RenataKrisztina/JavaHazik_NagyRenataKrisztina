/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasfelMillioLepes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String[] tomb;
        
        String nev;
        String utvonal;
        
        int k;
        int p_s_z;
        
        Turista[] turistak = new Turista[n];
        
        for( int i = 0; i < n; i++){
            tomb = sc.nextLine().split(";");
            
            nev = tomb[0];
            utvonal = tomb[1];
            
            k = 0;
            p_s_z = 0;
            
            for(int j = 0; j < utvonal.length(); j++){
                if( utvonal.charAt(j) == 'K'){
                    k++;
                }
                else if( utvonal.charAt(j) == 'P' || utvonal.charAt(j) == 'S' || utvonal.charAt(j) == 'Z'){
                    p_s_z++;
                }
            }
            
            turistak[i] = new Turista(nev,k,p_s_z);
        }
        
        Arrays.sort(turistak);
        
        for( int i = 0; i < turistak.length; i++){
            System.out.println(turistak[i].nev);
        }
    }
    
}
