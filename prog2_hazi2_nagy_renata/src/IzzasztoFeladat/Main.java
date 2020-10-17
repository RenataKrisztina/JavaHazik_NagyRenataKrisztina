/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IzzasztoFeladat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N;
        String varos;
        
        String[] elsosor = sc.nextLine().split(" ");
        N = Integer.parseInt(elsosor[0]);
        varos = elsosor[1];
        
        String[] tomb;
        Telepules[] telepulesek = new Telepules[N];
        
        for( int i = 0; i < N; i++){
            tomb = sc.nextLine().split(":");
            telepulesek[i] = new Telepules(tomb[0], Integer.parseInt(tomb[1]));
            
        }
        
        //rendezzem a telepulesek tombot
        Arrays.sort(telepulesek);
        
        
        int index = -1;
        
        // vegigmegyek a rendezett tömbbön es megnezem benne van-e a megadott varos
        //elmentem a hanyadik indexen van a telepules
        for( int i = 0; i < telepulesek.length; i++){
            if( telepulesek[i].telepules.equals(varos)){
                index = i;
                break;  
            }
        }
        
        if( index == -1){
            System.out.println("Missing data");
        }else{
            for( int i = 0; i < index; i++){
                System.out.println(telepulesek[i]); 
            }
        }         
    }   
}

/*
peldabemenet:
6 Debrecen
Budapest:19
Debrecen:24
Esztergom:25
Miskolc:26
Szeged:20
Szolnok:25

kimenet:
Miskolc (26)
Esztergom (25)
Szolnok (25)

írja a standard kimenetre mindazoknak a településeknek az adatait
(nevét és hőmérsékletét) a példa kimenetben látható formában, amelyeknél a hőmérséklet
értéke meghaladja az első sorból beolvasott településen mért hőmérsékletet!
A kimeneten a hőmérsékleti értékek szerint csökkenő sorrendben jelenjenek meg a települések adatai!
Amennyiben több településen is azonos hőmérsékletet mértek volna,
akkor ezeket a településnevek lexikografikusan növekvő sorrendjében
(ábécérendben) írja a standard kimenetre!*/
