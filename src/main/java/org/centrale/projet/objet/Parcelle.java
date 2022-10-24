/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.List;

/**
 *
 * @author mservier
 */
public abstract class Parcelle {
    
    /**
     * Numéro de la parcelle dans le cadastre.
     */
    private int numero;
    
    /**
     * Nom du propriétaire.
     */
    private String proprietaire;
    
    /**
     * Surface totale de la parcelle en m^2.
     */
    private float surface;
    
    /**
     * Polygones définissant la forme de la parcelle.
     */
    private Polygone forme;

    /**
     * Constructeur d'une parcelle.
     * @param numero
     * @param proprietaire
     * @param surface
     * @param pConstructible 
     */
    public Parcelle(int numero, String proprietaire, Polygone poly) throws NullAreaException {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.forme = new Polygone(poly);
        if(forme.getSurface()==0){
            throw new NullAreaException();
        }else{
            this.surface = forme.getSurface();
        }
    }
    
    /**
     * Constructeur d'une parcelle par recopie.
     * @param p 
     */
    public Parcelle(Parcelle p){
        this.numero = p.numero;
        this.proprietaire = p.proprietaire;
        this.forme = new Polygone(p.forme);
        this.surface = this.forme.getSurface();
    }

    /**
     * Constructeur par défaut.
     */
    public Parcelle(){
        this.numero = 0;
        this.proprietaire = new String();
        this.surface = 0;
        this.forme = new Polygone();
    }
    
    public int getNumero() {
        return numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public float getSurface() {
        return surface;
    }

    public Polygone getForme() {
        return forme;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setForme(Polygone forme) throws NullAreaException{
        this.forme = new Polygone(forme);
        if(this.forme.getSurface() == 0){
            throw new NullAreaException("La forme d'une Parcelle ne peut pas être d'aire nulle.");
        }else if(this.forme.getSurface()<0){
            throw new RuntimeException("Une surface ne peut être négative");
        }else{
            this.surface = this.forme.getSurface();
        }
    }

    
    
    public String toString(){
        return "Parcelle n°"+this.numero+" : \n"+
                "\t Type : "+this.getType() +"\n"+
                "\t Polygone : "+ this.forme.toString()+"\n"+
                "\t Propriétaire : " + this.proprietaire+"\n"+
                "\t Surface : " + this.getSurface();
    }
    
    public String getType(){
        String str = new String();
        str = this.getClass().getSimpleName();
        return str;
    }
}
