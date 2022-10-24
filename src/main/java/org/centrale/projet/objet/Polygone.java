/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mservier
 */
public class Polygone {
    
    /**
     * listes des Points 2D sommets du polygone.
     */
    private List<Point2D> sommets;
    
    public Polygone(){
        this.sommets = new LinkedList<Point2D>();
    }
    
    public Polygone(List<Point2D> sommets){
        this.sommets = sommets;
    }
    
    public Polygone(Polygone poly){
        this.sommets = new LinkedList<Point2D>();
        for(Point2D p : poly.getSommets()){
            this.sommets.add(new Point2D(p));
        }
    }

    public List<Point2D> getSommets() {
        return sommets;
    }

    public void setSommets(List<Point2D> sommets) {
        this.sommets = sommets;
    }
     
    
    public void addPoint(Point2D P){
        this.sommets.add(P);
    }
    
    public void translate(int a, int b){
        for(Point2D p : sommets){
            p.translate(a, b);
        }
    }
    
    /**
     * Calcul de l'aire d'un polygone (simple ie. sans intersection) avec la formule 
     * {\displaystyle A={\frac {1}{2}}\sum _{i=0}^{n-1}(x_{i}y_{i+1}-x_{i+1}y_{i}),\,where{\displaystyle {\bigl (}x_{n},y_{n}{\bigr )}={\bigl (}x_{0},y_{0}{\bigr )}},}
     * https://en.wikipedia.org/wiki/Polygon#Properties
     * @return 
     */
    public float getSurface(){
        float A = 0;
        // Si il y a plus de 3 points définissants un polygone
        int nbP = sommets.size();
        if(nbP >= 3){
            //Calcul de l'aire du polygone
            for(int i=0; i<nbP-1; i++){
                A = A + (sommets.get(i).getX()*sommets.get(i+1).getY() - sommets.get(i+1).getX()*sommets.get(i).getY());
            }
            A = A + (sommets.get(nbP-1).getX()*sommets.get(0).getY() - sommets.get(0).getX()*sommets.get(nbP-1).getY());
            A = A/2;
        }
        return A;
    }
    
    public String toString(){
        String str = new String();
        for(Point2D p : this.sommets){
            str = str + p.toString()+" ";
        }
        return str;
    }
    
}
