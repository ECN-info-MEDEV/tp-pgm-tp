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
public class ZU extends ZAU {
    
     
    private float surfaceConstruite;

    public ZU(int numero, String proprietaire, Polygone forme, int pConstructible, float surfaceConstruite) {
        super(numero, proprietaire, forme, pConstructible);
        this.surfaceConstruite = surfaceConstruite;
    }

    public ZU(float surfaceConstruite, int pConstructible, Parcelle p) {
        super(p, pConstructible);
        this.surfaceConstruite = surfaceConstruite;
    }

    public ZU(int pConstructible, float surfaceConstruite) {
        super(pConstructible);
        this.surfaceConstruite = surfaceConstruite;
    }

    public ZU(float surfaceConstruite) {
        this.surfaceConstruite = surfaceConstruite;
    }

    

    public float getSurfaceConstruite() {
        return surfaceConstruite;
    }

    public void setSurfaceConstruite(float surfaceConstruite) {
        this.surfaceConstruite = surfaceConstruite;
    }
    
    
    
    /**
     * Surcharge de surfaceConstructible car on supprime ce qui a déjà été construit
     * @return 
     */
    public float surfaceConstructible(){
        return this.getpConstructible()*this.getSurface()/(float)100.0-this.surfaceConstruite;
    }
    
    
    public String toString(){
        String str = super.toString();
        str = str + 
                "\n\t surface construite : "+ this.getSurfaceConstruite()+
                "\n\t surface à construire restante : "+this.surfaceConstructible();
        return str;
    }
}
