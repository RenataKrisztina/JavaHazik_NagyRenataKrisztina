/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztarok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Reni
 */
public class Mozisztarok implements Comparable<Mozisztarok>{
    
    String nev;
    List <Film> filmek;

    public Mozisztarok(String nev) {
        this.nev = nev;
        this.filmek = new ArrayList<Film>();
    }

    @Override
    public int compareTo(Mozisztarok o) {
        if( this.filmek.size() == o.filmek.size()){
            return this.nev.compareTo(o.nev);
        }
        return Integer.compare(o.filmek.size(), this.filmek.size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nev).append("\n");
        Collections.sort(filmek);
        for( Film i: filmek)
            sb.append(i).append("\n");
        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !( obj instanceof Mozisztarok))
            return false;
        
        Mozisztarok m = (Mozisztarok) obj;
        
        return this.nev.equals(m.nev);
    }
    
    
    
}

class Film implements Comparable<Film>{
    
    String cim;
    int ev;

    public Film(String cim, int ev) {
        this.cim = cim;
        this.ev = ev;
    }
    
    // a filmek oszt rendezheto oszt, cim szerint, ev szerint

    @Override
    public int compareTo(Film o) {
        if( this.ev == o.ev){
            return this.cim.compareTo(o.cim);
        }
        return Integer.compare(this.ev, o.ev);
    }

    @Override
    public String toString() {
        return ev + ": " + cim;
    }
    
    
}

class Test{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String sor = null;
        
        List<Mozisztarok> li = new ArrayList<>();
        
        String[] tomb;
        
        while( !(sor = sc.nextLine()).equals("vege") ){
            
            tomb = sor.split("[,():]");
            
            Mozisztarok m;
            for(int i = 3; i < tomb.length; i++){
                m = new Mozisztarok(tomb[i]);
                if( li.contains(m)){
                    int index;
                    index = li.indexOf(m); //a szinesz melyik indexen van bnne a listaban
                    li.get(index).filmek.add(new Film(tomb[0], Integer.parseInt(tomb[1])));
                }
                else{
                    m.filmek.add(new Film(tomb[0], Integer.parseInt(tomb[1])));
                    li.add(m);
                }
            }
            
            
            
        }
        
        Collections.sort(li);
        
        for(Mozisztarok i:li)
            System.out.print(i);
            
    }
}

/*
A tegla (2006):Leonardo DiCaprio,Matt Damon,Jack Nicholson,Mark Wahlberg,Martin Sheen
Eredet (2010):Leonardo DiCaprio,Ken Watanabe,Joseph Gordon-Levitt,Marion Cotillard
Ted (2012):Mark Wahlberg,Mila Kunis,Seth MacFarlane
Kapj el ha tudsz (2002):Leonardo DiCaprio,Tom Hanks,Christopher Walken
Angyalok es demonok (2009):Tom Hanks,Ewan McGregor,Ayelet Zurer
vege
*/
