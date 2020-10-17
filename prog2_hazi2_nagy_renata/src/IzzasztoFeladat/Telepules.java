/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IzzasztoFeladat;

/**
 *
 * @author Reni
 */
public class Telepules implements Comparable<Telepules>{
    
    String telepules;
    int homerseklet;

    public Telepules(String telepules, int homerseklet) {
        this.telepules = telepules;
        this.homerseklet = homerseklet;
    }

    @Override
    public String toString() {
        return telepules + " (" + homerseklet + ')';
    }

    @Override
    public int compareTo(Telepules o) {
        if( this.homerseklet == o.homerseklet){
            return this.telepules.compareTo(o.telepules);
        }else{
            return  o.homerseklet- this.homerseklet;
        }
    }
    
    
}
