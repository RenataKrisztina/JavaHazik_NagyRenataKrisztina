/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngolMagyarSzotar2;

/**
 *
 * @author Reni
 */
public class Szavak implements Comparable<Szavak>{
    
    String angol;
    String magyar;

    public Szavak(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    @Override
    public int compareTo(Szavak o) {
        if( this.angol.compareTo(o.angol) == 0){
            return this.magyar.compareTo(o.magyar);
        }
        else{
            return this.angol.compareTo(o.angol);
        }
            
    }
    
    @Override
    public String toString() {
        return angol + ":" + magyar;
    }
    
    
    
}
