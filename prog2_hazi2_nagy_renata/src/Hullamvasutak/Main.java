/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullamvasutak;

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
        
        Hullamvasut[] hullamvasutak = new Hullamvasut[N];
        
        String[] tomb;
        
        for( int i = 0; i < N; i++){
            
            tomb = sc.nextLine().split(";");
            
            hullamvasutak[i] = new Hullamvasut( tomb[0], tomb[1], Integer.parseInt(tomb[2]), Integer.parseInt(tomb[3]));
        }
        
        //System.out.println("-----------------");
        Arrays.sort(hullamvasutak);
        
        for( int i = 0; i < hullamvasutak.length; i++){
            System.out.println(hullamvasutak[i]);
        }
        
        
    }
}
