/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        
        String cim;
        double terulet;
        int kapacitas;
        
        Parkolo aktualisparkolo;
        List<Parkolo> parkolok = new ArrayList();
        
        while((sor = sc.nextLine()).equals("") == false){
            
            tomb = sor.split(";");
            
            cim = tomb[0];
            terulet = Double.parseDouble(tomb[1]);
            kapacitas = Integer.parseInt(tomb[2]);
            
            if(tomb.length > 3){
               kapacitas -= tomb.length - 3;
            }
            
            if( kapacitas >= 3){
                aktualisparkolo = new Parkolo(cim, terulet, kapacitas);
                parkolok.add(aktualisparkolo);
            }
        }
        
        Collections.sort(parkolok);
        
        for( int i = 0; i < parkolok.size(); i++){
            System.out.println(parkolok.get(i));
        }

    }
    
}

class Parkolo implements Comparable <Parkolo>{
    
    String cim;
    double terulet;
    int kapacitas;

    public Parkolo(String cim, double terulet, int kapacitas) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
    }

    @Override
    public String toString() {
        return cim + ": " + kapacitas + " szabad hely";
    }

    @Override
    public int compareTo(Parkolo o) {
        
        if( this.kapacitas == o.kapacitas){
            return this.cim.compareTo(o.cim);
        }
        return o.kapacitas - this.kapacitas;
    }
 
}
