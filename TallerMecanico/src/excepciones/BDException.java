/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author itsistemas
 */
public class BDException extends Exception {
    
    /**
     * Operacion para personalizar excepciones.
     * @param string 
     */
    public BDException(String string){
        super(string);
    }
    
}
