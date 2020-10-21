/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author Reni
 */
public interface Rendezheto<T> {
    
    public boolean egyenlo(T o);
    public boolean nagyobbMint(T o);
    public boolean kisebbMint(T o);
    
}
