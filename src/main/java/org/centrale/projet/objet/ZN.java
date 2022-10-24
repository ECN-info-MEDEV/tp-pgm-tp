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
public class ZN extends Parcelle{

    public ZN(int numero, String proprietaire, Polygone forme) {
        super(numero, proprietaire, forme);
    }

    public ZN(Parcelle p) {
        super(p);
    }

    public ZN() {
    }
    
}
