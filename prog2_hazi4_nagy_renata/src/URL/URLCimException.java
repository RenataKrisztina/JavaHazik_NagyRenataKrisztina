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
public class URLCimException extends Exception{
    
    private int hibakod;

    public int getHibakod() {
        return hibakod;
    }

    public URLCimException(int hibakod, String message) {
        super(message);
        this.hibakod = hibakod;
    }

    
    
    
}
