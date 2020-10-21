/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek1;

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
        
        Csapat[] csapatok = new Csapat[n];
        
        String[] tomb;
        
        for( int i = 0; i < n; i++){
            
            tomb = sc.nextLine().split(";");
            
            csapatok[i] = new Csapat(tomb[0], Integer.parseInt(tomb[1]), Integer.parseInt(tomb[2]), Integer.parseInt(tomb[3]));
        }
        
        
        Arrays.sort(csapatok);
        
        for( int i = 0; i < csapatok.length; i++){
            System.out.println(csapatok[i]);
        }
    }
    
    
}
