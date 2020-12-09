/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URL;

/**
 *
 * @author Reni
 */
public class Main {
    
    public static void main(String[] args) /*throws URLCimException*/{
        try{
            URLCim u = new URLCim("inf.unideb.hu");
        }
        catch(URLCimException e){
            System.out.println(e);
        }
        
    }
    
}
