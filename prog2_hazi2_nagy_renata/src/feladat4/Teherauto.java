/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat4;

/**
 *
 * @author Reni
 */
public class Teherauto extends Auto{
    
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorteljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorteljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ maxSzallithatoTeher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if( obj == null || !(obj instanceof Teherauto))
            return false;
        
        Teherauto a = (Teherauto)obj;
        
        return this.getRendszam().equals(a.getRendszam()) && this.getGyartasiDatum() == a.getGyartasiDatum()
               && this.getMotorteljesitmeny() == a.getMotorteljesitmeny() && this.maxSzallithatoTeher == a.getMaxSzallithatoTeher();
    }
    
    
}
