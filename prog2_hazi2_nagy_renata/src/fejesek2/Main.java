/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fejesek2;

import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String[] elsosor = sc.nextLine().split(";");

        int N = Integer.parseInt(elsosor[0]);

        Gyerek[] tornasor = new Gyerek[N];

        tornasor[0] = new Gyerek( elsosor[1], null);
        
        String X = elsosor[2];
        
        String[] tomb;
        
        for( int i = 1; i < N; i++){
            
            tomb = sc.nextLine().split(";");
            
            tornasor[i] = new Gyerek(tomb[0], tomb[1]);   
        }
        
        //rendezes
        
        Gyerek csere;
        for( int i = 0; i < tornasor.length -1; i++){
            for( int j = i + 1; j < tornasor.length; j++){
                if( tornasor[i].nev.equals(tornasor[j].elotte)){
                    csere = tornasor[i+1];
                    tornasor[i+1] = tornasor[j];
                    tornasor[j] = csere;  
                }
            }
            
        }
        
        /*
        System.out.println("-----------------");
        for( int i = 0; i < tornasor.length; i++){
            System.out.println(tornasor[i]);
        }*/
        
        int kek = 0;
        int piros = 0;
        
        for(int i = 0; i < tornasor.length; i++){
            if( tornasor[i].nev.equals(X)){
                System.out.println(piros + " " + kek);
                break;
            }
            else if( i % 2 == 0 ){
                piros++;
            }
            else{
                kek++;
            }
        }
    }
    
    
}
