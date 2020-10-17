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
public class Main {
    
    public static void main(String[] args) {
        
        int[] tomb1 = {1,2,3,3,3,3,5,6};  
        int[] tomb2 = {};
        int[] tomb3 = {1,1,2};
        int[] tomb4 = {1,2,3,3,5,5,5,6};
        int[] tomb5 = {1,2,3,3,4,4,4,4,4,6};
        
        System.out.println(isConsecutiveFour(tomb1));
        System.out.println(isConsecutiveFour(tomb2));
        System.out.println(isConsecutiveFour(tomb3));
        System.out.println(isConsecutiveFour(tomb4));
        System.out.println(isConsecutiveFour(tomb5));
    }
    
    public static  boolean isConsecutiveFour(int[] values){
        
        if( values.length < 4 ){
            return false;
        }
        
        int aktualis = values[0];
        int db = 1;
        
        for( int i = 1; i < values.length; i++){
            if( values[i] == aktualis){
                db++;
                if( db == 4){
                    break;
                }
            }else{
                aktualis = values[i];
                db = 1;
            }
        }
        
       if( db == 4)
           return true;
       else
           return false;
            
    }
    
}
