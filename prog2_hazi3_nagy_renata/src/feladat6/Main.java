/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6;

import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        Hallgato[] hallgatok = new Hallgato[n];
        
        String[] tomb;
        
        for( int i = 0; i < n; i++){
            
            tomb = sc.nextLine().split(" ");
            
            int mennyitKeszult = Integer.parseInt(tomb[0]);
            
            boolean sokatTanult;
            if( tomb[1].equals("igaz")){
                sokatTanult = true;
            }else{
                sokatTanult = false;
            }
            
            hallgatok[i] = new Hallgato(mennyitKeszult, sokatTanult);
        }
        
        for ( int i = 0; i < hallgatok.length; i++){
            Dolgozat dolgozat1 = hallgatok[i].dolgozatotIr();
            Dolgozat dolgozat2 =hallgatok[i].dolgozatotIr();
            dolgozat2.megfelelt();
            if( dolgozat2.megfelelt() == true && dolgozat1.getPontszam() > 15){
                System.out.println("megfelelt");
            }else if( (dolgozat2.megfelelt() == false && dolgozat2.getPontszam() == -1) ||  dolgozat1.getPontszam() == -1){
                System.out.println("Nem irt");
            }else{
                System.out.println("Nem felelt meg");
            }
        }
    }
    
}
