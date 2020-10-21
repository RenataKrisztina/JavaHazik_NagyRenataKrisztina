/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

import java.util.Arrays;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Ital[] italok = new Ital[] {
            new Ital("Coca-Cola","5 dl", 300),
            new Ital("Nestea","5 dl", 290),
            new Ital("Szentkirályi ásványvíz","1.5 l", 120),
            new SzeszesItal(13,"Savignon Blanc","0.75 l", 1800),
            new Ital("Zöld tea","2 dl", 600),
            new SzeszesItal(4.5,"Soproni ipa","4 dl", 230),
            new SzeszesItal(52,"Tátratea","7 dl", 6900),
            new SzeszesItal(40,"Jim Beam","7 dl", 5800),
            new SzeszesItal(13,"Cserszegi fűszeres","0.75 l", 1250)
        };
        
        //System.out.println(Arrays.toString(maxAlkohol(italok)));
        
        SzeszesItal[] eredmeny = maxAlkohol(italok);
        
        Arrays.sort(eredmeny);
        
        for( int i = 0; i < 3; i++){
            System.out.println(eredmeny[i]);
        }
        
    }
    
    public static SzeszesItal[] maxAlkohol(Ital[] italok){
        
        int db = 0;
        
        for( int i = 0; i < italok.length; i++){
            if( italok[i] instanceof SzeszesItal){
                db++;
            }
        }
        
        if( db < 3){
            return null;
        }else{
            SzeszesItal[] szeszes = new SzeszesItal[db];
            int index = 0;
            for( int i = 0; i < italok.length; i++){
                if( italok[i] instanceof SzeszesItal){
                    szeszes[index] = (SzeszesItal) italok[i];
                    index++;
                }
            }
            
            //szeszesitalok rendezése
            SzeszesItal csere;
            for(int j =0; j < szeszes.length -1; j++){
                for(int k = j+1; k < szeszes.length; k++){
                    if( szeszes[j].getAlkoholTartalom() < szeszes[k].getAlkoholTartalom()){
                       csere = szeszes[j];
                       szeszes[j] = szeszes[k];
                       szeszes[k] = csere;
                    }
                }
            }
            
            SzeszesItal[] szeszesMax3 = new SzeszesItal[] {
                szeszes[0], szeszes[1], szeszes[2]
            };
            
            return szeszesMax3;
        }
        
    }
}