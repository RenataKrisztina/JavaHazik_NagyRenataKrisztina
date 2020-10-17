/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat8;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Nyilas nyilas1 = new Nyilas(2,3,2);
        Nyilas nyilas2 = new Nyilas(3,4,2);
        Landzsas landzsas = new Landzsas(4,3);
        
        //System.out.println(nyilas1.getTamadoero());
        //System.out.println(nyilas1);
        System.out.println("végső nyertes: " + megkuzd(megkuzd(nyilas1,nyilas2),landzsas));
        
        
        
    }
    
    public static Katona megkuzd( Katona k1, Katona k2){
        
        System.out.println("Megküzd: " + k1 + " és " + k2);
        //System.out.println("-------");
        
        if( k1.getTamadoero() - k2.getVedoero() > k2.getTamadoero() - k1.getVedoero()){
            System.out.println("nyertes: " + k1);
            return k1;
        }
        else if(  k1.getTamadoero() - k2.getVedoero() < k2.getTamadoero() - k1.getVedoero()){
            System.out.println("nyertes: " + k2);
            return k2; 
        }   
        else{
            System.out.println("nyertes: " + k1);
            return k1;
        }
        
    }
    
}
