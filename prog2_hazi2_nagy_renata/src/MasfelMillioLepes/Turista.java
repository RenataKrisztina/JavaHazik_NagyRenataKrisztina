/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasfelMillioLepes;

/**
 *
 * @author Reni
 */
public class Turista implements Comparable<Turista>{
    
    String nev;
    int k;  //kek
    int p_s_z;  //piros,sarga,zold

    public Turista(String nev, int k, int p_s_z) {
        this.nev = nev;
        this.k = k;
        this.p_s_z = p_s_z;
    }

    @Override
    public String toString() {
        return nev;
    }

    @Override
    public int compareTo(Turista o) {
        
        if( this.k == o.k){
            if( this.p_s_z == o.p_s_z){
                return this.nev.compareTo(o.nev);
            }
            return o.p_s_z - this.p_s_z;
        }
        return o.k - this.k;
    }
    
    
    
    
    
    
    
}
