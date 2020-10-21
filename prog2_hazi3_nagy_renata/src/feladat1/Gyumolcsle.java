/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

/**
 *
 * @author Reni
 */
public class Gyumolcsle extends Ital{

    private Gyumolcs alapanyag;

    public Gyumolcsle(Gyumolcs alapanyag) {
        this.alapanyag = alapanyag;
    }

    public String mibolFacsartak(){
        return this.mibolKeszult();
    }
    
    @Override
    public String mibolKeszult() {
        return this.alapanyag.milyenFajtaju();
    }

    @Override
    public String milyenIzu() {
        return this.alapanyag.milyenIzu();
    }
    
}
