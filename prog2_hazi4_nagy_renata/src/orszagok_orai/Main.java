/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orszagok_orai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) throws HianyosSor {
        
        Set<Orszag> orszagok = new HashSet();   //nem engedi meg az elemek ismétlődését
        List<Orszag> orszagok2 = new ArrayList();
        
        try{
            
            FileReader fr = new FileReader(new File("orszagok.txt"));
            BufferedReader br = new BufferedReader(fr);
            
            String sor;
            String[] komponensek;
            
            while ((sor = br.readLine()) != null) { //amíg van beolvasható sor addig fut a ciklus
                komponensek = sor.split(" ");
                
                try{
                    if( komponensek.length < 3){

                        throw new HianyosSor("Hianyos adatok: " + komponensek[0]);

                    }else{
                        orszagok.add(new Orszag(komponensek[0], Integer.parseInt(komponensek[1]), Integer.parseInt(komponensek[2])));
                    }
                }
                catch(HianyosSor e){
                        System.out.println(e.getMessage());
                }

            }
            br.close();
            
            for( Orszag i : orszagok){
                orszagok2.add(i);
            }
            
            Collections.sort(orszagok2);
            
            File kimenet = new File("nepsurusegSzerint.txt");
            
            PrintWriter pw = new PrintWriter(kimenet);
            
            for( int i = 0; i < orszagok2.size(); i++){
                pw.println(orszagok2.get(i));
            }
            pw.close();
                
            nepsuruseg(0.0, 600.6);
            
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static void nepsuruseg(double min, double max) throws FileNotFoundException{
        
        File bemenet  = new File("nepsurusegSzerint.txt");
        
        List<Orszag> orszagok = new ArrayList();
        
        Scanner sc = new Scanner(bemenet);
        
        String sor;
        String[] tomb;
        
        int lakossag;
        int terulet;
        double nepsuruseg;
        
        while(sc.hasNextLine()){
            sor = sc.nextLine();
            tomb = sor.split(" ");
            
            lakossag = Integer.parseInt(tomb[1]);
            terulet = Integer.parseInt(tomb[2]);
            
            nepsuruseg = (double)lakossag / (double)terulet;
            
            if( nepsuruseg > min && nepsuruseg < max){
                
                orszagok.add(new Orszag(tomb[0], lakossag, terulet));
            }
        }
        
        for( Orszag i: orszagok)
            System.out.println(i);
    }
        
}
