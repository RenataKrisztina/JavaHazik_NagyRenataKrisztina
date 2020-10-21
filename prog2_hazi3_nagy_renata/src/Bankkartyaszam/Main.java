/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankkartyaszam;

import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String sor;
        String[] tomb;
        int szamjegy;
        
        int[] szamjegyek = new int[16];
        
        int osszeg = 0;
        
        while(true){
            
            sor = sc.nextLine();
            
            if( sor.equals(""))
                break;
            
            tomb = sor.split("");
            
            
            for( int i = 0; i < tomb.length; i++){
                szamjegyek[i] = Integer.parseInt(tomb[i]);
                
            }
            
            for( int i = 0; i < szamjegyek.length; i += 2){
                
                szamjegy = szamjegyek[i];
                szamjegy *= 2;
                
                if( szamjegy > 9){
                    szamjegy -= 9;
                }
                
                szamjegyek[i] = szamjegy;
            }
            
            osszeg = 0;
            for( int i = 0; i < szamjegyek.length; i++){
                osszeg += szamjegyek[i];
            }
            
            if( osszeg % 10 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
        }
    }
}
