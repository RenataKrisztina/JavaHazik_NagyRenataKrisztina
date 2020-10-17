/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat4;

import java.util.Arrays;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) {
        
        Auto[] autok = new Auto[] {
            new Auto( "JKL673", 140 ),
            new Auto( "GHR543", 87 ),
            new Auto( "MIU453", 105 ),
            new Auto( "PAG233", 95 ),
            new Auto( "SAL673", 135 ),
            new Teherauto("LHM115", 210, 3),
            new Teherauto("PRD445", 205, 5),
            new Teherauto("MKV435", 230, 11),
            new Teherauto("KJG876", 190, 2),
            new Teherauto("RDF333", 200, 4)    
        };
        
        Teherauto[] teher = new Teherauto[]{
            new Teherauto("GHJ234", 230, 3),
            new Teherauto("IKJ788", 229, 4),
            new Teherauto("LKL987", 230, 5),
            new Teherauto("POU554", 238, 6),
            new Teherauto("MGB765", 260, 10),
            new Teherauto("JWE765", 270, 15),
            new Teherauto("KLX109", 290, 20),
            new Teherauto("JDF334", 235, 7),
            new Teherauto("RRA156", 252, 8),
            new Teherauto("PSW432", 255, 9)
        };
        
        //rendezMaxSzallithatoTeherCsokkenoleg(teher);
        System.out.println(keresMaxMotorTeljesitmeny(autok));
        
        
    }
    
    public static void rendezMaxSzallithatoTeherCsokkenoleg( Teherauto[] teher){
        
        Teherauto csere;
        for( int i = 0; i < teher.length - 1; i++){
            for( int j = i+1; j < teher.length; j++){
                if( teher[i].getMaxSzallithatoTeher() < teher[j].getMaxSzallithatoTeher()){
                    csere = teher[i];
                    teher[i] = teher[j];
                    teher[j] = csere;
                    
                }
            }
        }
        
        //kiiratas
        for( int i = 0; i < teher.length; i++){
            System.out.println(teher[i]);
        }
        
    }
    
    public static Auto keresMaxMotorTeljesitmeny(Auto[] autok){
        
        Auto max = autok[0];
        for( int i = 1; i < autok.length; i++){
            if( autok[i].getMotorteljesitmeny() > max.getMotorteljesitmeny()){
                max = autok[i];
            }
        }
        return max;
    }
    
    
}
