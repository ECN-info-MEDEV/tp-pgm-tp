/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;


/**
 * Classe permettant de stocker et manipuler un point sur une surface à partir
 * de ses coordonnées (x,y).
 *
 * @author mservier
 */
public class Point2D {

    /**
     * abscisse du point.
     */
    private int x;
    /**
     * ordonnée du point.
     */
    private int y;

    /**
     * Constructeur générant un point 2D au coordonnées choisies.
     * @param x : abs du point 2D
     * @param y : ord du point 2D
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructeur par défaut générant un point 2D à l'origine du repère.
     */
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Constructeur par recopie.
     * @param p 
     */
    public Point2D(Point2D p){
        this.x = p.getX();
        this.y = p.getY();
    }

    /**
     * Accesseur de x. 
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * Accesseur de y.
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * Mutateur de x.
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Mutateur de y.
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Modificateur de la position d'un point 2D
     * @param x
     * @param y
     */
    public void setPosition(int x, int y){
        setX(x);
        setY(y);
    }
    
    /**
     * Translate un Point2D de a en abscisse et de b en ordonnée.
     * @param a
     * @param b
     */
    public void translate(int a, int b){
        this.x = this.x + a;
        this.y = this.y + b;
    }
    
    /**
     * Méthode toString renvoyant une chaîne de caractères représentant un Point2D.
     * @return 
     */
    public String toString(){
        return "["+this.x+";"+this.y+"]";
    }
    
    /**
     * Méthode affichant à l'écran une chaîne de caractères représentant un Point2D.
     */
    public void affiche(){
        System.out.println(this.toString());      
    }
}
