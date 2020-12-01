/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String rendszam = sc.nextLine();
        
        Auto a1 = new Auto(rendszam, 100, true);
        
        System.out.println(a1);
        
        Auto[] autok = new Auto[4];
        
        String[] tomb;
        
        for(int i = 0; i < 4; i++){
            
            tomb = sc.nextLine().split(" ");
            autok[i] = new Auto(tomb[0], Integer.parseInt(tomb[1]), Boolean.parseBoolean(tomb[2]));
        }
    }
}
