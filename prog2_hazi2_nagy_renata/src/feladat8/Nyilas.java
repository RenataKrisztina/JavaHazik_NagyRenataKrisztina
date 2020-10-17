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
public class Nyilas extends Katona{
    
    private int lötav;

     public Nyilas(int lötav, int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        this.lötav = lötav;
    }

    public int getLötav() {
        return lötav;
    }

    public void setLötav(int lötav) {
        this.lötav = lötav;
    }

    @Override
    public int getTamadoero() {
        return super.getTamadoero() + this.lötav;
    }

    @Override
    public String toString() {
        return "Nyilas TE:" + this.getTamadoero() + ", VE: " + super.getVedoero();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Nyilas))
            return false;
        
        Nyilas ny= (Nyilas) obj;
        
        return super.getTamadoero() == ny.getTamadoero() && super.getVedoero() == ny.getVedoero() && this.lötav == ny.getLötav();
    }
    
    

    

    
    
    
}
