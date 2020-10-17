/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BudapestKupa1;

/**
 *
 * @author Reni
 */
public class Tura implements Comparable<Tura>{
    
    int ev;
    int honap;
    int nap;
    String nev;
    int osszestav;

    public Tura(int ev, int honap, int nap, String nev, int osszestav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.osszestav = osszestav;
    }

    @Override
    public String toString() {
        return ev + ";" + honap + ";" + nap + ";" + nev;
    }

    @Override
    public int compareTo(Tura o) {
        
        if( this.ev == o.ev){
            if( this.honap == o.honap){
                if( this.nap == o.nap){
                    return this.nev.compareTo(o.nev);
                }
                return this.nap - o.nap;
            }
            return this.honap - o.honap;
        }
        return this.ev - o.ev;
    }
    
    
    
    
}
