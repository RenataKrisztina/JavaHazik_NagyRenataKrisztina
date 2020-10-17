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
public class Katona {
    
    private int tamadoero;
    private int vedoero;

    public Katona() {
        this.tamadoero = 5;
        this.vedoero = 5;
    }

    public Katona(int tamadoero, int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    @Override
    public String toString() {
        return "TE: " + tamadoero + ", VE: " + vedoero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return this.tamadoero == k.tamadoero && this.vedoero == k.vedoero;
    }
    
    
    
}
