/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek1;

/**
 *
 * @author Reni
 */
public class Csapat implements Comparable<Csapat>{
    
    String nev;
    int összgol;
    int szabadrugas;
    int bunteto;

    public Csapat(String nev, int összgol, int szabadrugas, int bunteto) {
        this.nev = nev;
        this.összgol = összgol;
        this.szabadrugas = szabadrugas;
        this.bunteto = bunteto;
    }
    
    public int getAkciogol(){
        return this.összgol - (this.szabadrugas + this.bunteto);
    }
    
    public double getFejesek(){
        return this.getAkciogol()*0.2 + this.szabadrugas*0.4;
    }

    @Override
    public String toString() {
        return nev + ": " + this.getFejesek();
    }

    @Override
    public int compareTo(Csapat o) {
        
        if( this.getFejesek() == o.getFejesek()){
            if(this.összgol == o.összgol){
                if( this.bunteto == o.bunteto){
                    return this.nev.compareTo(o.nev);
                }
                return this.bunteto - o.bunteto;
            }
            return o.összgol - this.összgol;
        }
        return (int)o.getFejesek() - (int)this.getFejesek();
    }
    
    
}
