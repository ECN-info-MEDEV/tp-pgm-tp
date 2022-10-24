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
public class ZAU extends Parcelle implements Constructible {
    
     /**
     * Pourcentage constructible de la parcelle.
     */
    private int pConstructible;

    public ZAU(int numero, String proprietaire, Polygone forme, int pConstructible) {
        super(numero, proprietaire, forme);
        this.pConstructible = pConstructible;
    }

    public ZAU(Parcelle p, int pConstructible) {
        super(p);
        this.pConstructible = pConstructible;
    }

    public ZAU(int pConstructible) {
        this.pConstructible = pConstructible;
    }
    
    public ZAU(){
        super();
        this.pConstructible = 0;
    }

    public int getpConstructible() {
        return pConstructible;
    }

    public void setpConstructible(int pConstructible) {
        this.pConstructible = pConstructible;
    }
    
    public float surfaceConstructible(){
        return this.pConstructible*this.getSurface();
    }
    
    public String toString(){
        String str = super.toString();
        str = str + "\n\t % constructible : " + this.getpConstructible()+" %";
        return str;
    }
    
}

