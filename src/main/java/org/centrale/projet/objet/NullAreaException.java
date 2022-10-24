/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author mservier
 */
public class NullAreaException extends RuntimeException{

    public NullAreaException() {
        
    }

    public NullAreaException(String message) {
        super(message);
    }
    
}
