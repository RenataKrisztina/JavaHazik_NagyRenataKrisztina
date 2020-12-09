/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngolMagyarSzotar;

import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N;
        
    }
    
}

class Szopar implements Comparable<Szopar>{
    
    private String angol;
    private String magyar;

    public Szopar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }

    @Override
    public String toString() {
        return angol + ":" + magyar;
    }

    @Override
    public int compareTo(Szopar o) {
        
        if( this.angol.equals(o.angol)){
            return this.magyar.compareTo(o.magyar);
        }
        return this.angol.compareTo(o.angol);
                
    }
}