/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngolMagyarSzotar2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N;  //ennyi sort olvasunk majd be
        N = Integer.parseInt(sc.nextLine());
        
        String[] tomb;
        Szavak szopar;
        Szavak[] szotar = new Szavak[N];
        
        for( int i = 0; i < N; i++){
            tomb = sc.nextLine().split(":");
            szopar = new Szavak(tomb[0], tomb[1]);
            szotar[i] = szopar;
        }
        
        //tömb rendezése
        Arrays.sort(szotar);
        
        System.out.println("------------------");
        
        //kiíratás
        for( int i = 0; i < szotar.length; i++){
            System.out.println(szotar[i]);
        }
        
    }
    
}
