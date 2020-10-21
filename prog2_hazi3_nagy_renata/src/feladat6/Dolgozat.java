/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6;

/**
 *
 * @author Reni
 */
public class Dolgozat implements Pontozhato{
    
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }

    @Override
    public boolean megfelelt() {
        if( this.pontszam > 15){
            return true;
        }
        else if( this.pontszam == -1){
            System.out.println("Nem irt");
            return false;
        }
        else{
            return false;
        }
    }
    
    
}
