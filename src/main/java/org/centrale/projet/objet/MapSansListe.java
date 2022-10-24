/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;
/**
 *
 * @author mservier
 */
public class MapSansListe {
    public ZU P1;
    public ZAU P2;
    public ZA P3;
    public ZN P4;
    public ZN P5;
    
    public MapSansListe(){
        P1 = new ZU(10);
        P2 = new ZAU();
        P3 = new ZA();
        P4 = new ZN();
        P5 = new ZN();      
    }
    

    
    public void creeMapAlea(){
        Random num = new Random();
        Random surface = new Random();
        
        Point2D p0 = new Point2D(0,0);
        Point2D p1 = new Point2D(80,0);
        Point2D p2 = new Point2D(100,0);
        Point2D p3 = new Point2D(0,30);
        Point2D p4 = new Point2D(80,30);
        Point2D p5 = new Point2D(0,100);
        Point2D p6 = new Point2D(60,100);
        Point2D p7 = new Point2D(80,100);
        Point2D p8 = new Point2D(100,100);
        
        //ZU
        P1.setNumero(num.nextInt(100));
        P1.setProprietaire(generateString(6));
        P1.setpConstructible(num.nextInt(100));
        Polygone P1poly = new Polygone();
        P1poly.addPoint(p3);
        P1poly.addPoint(p6);
        P1poly.addPoint(p5);
        P1.setForme(P1poly); 
        float sc = surface.nextFloat()*P1.getSurface()*P1.getpConstructible()/(float)100.0;
        P1.setSurfaceConstruite(sc);
        
        
        //ZAU
        P2.setNumero(num.nextInt(100));
        P2.setProprietaire(generateString(6));
        P2.setpConstructible(num.nextInt(100));
        Polygone P2poly = new Polygone();
        P2poly.addPoint(p3);
        P2poly.addPoint(p4);
        P2poly.addPoint(p7);
        P2poly.addPoint(p6);
        P2.setForme(P2poly);
        
        //ZA
        P3.setNumero(num.nextInt(100));
        P3.setProprietaire(generateString(6));
        P3.setTypeCulture(generateString(4));
        Polygone P3poly = new Polygone();
        P3poly.addPoint(p0);
        P3poly.addPoint(p1);
        P3poly.addPoint(p4);
        P3poly.addPoint(p3);
        P3.setForme(P3poly);         
        
        //ZN
        P4.setNumero(num.nextInt(100));
        P4.setProprietaire(generateString(6));
        Polygone P4poly = new Polygone();
        P4poly.addPoint(p1);
        P4poly.addPoint(p2);
        P4poly.addPoint(p8);
        P4poly.addPoint(p7);
        P4.setForme(P4poly);
        
        Polygone P5poly = new Polygone();
        P5poly.addPoint(p1);
        P5poly.addPoint(p2);
        try{
            P4.setForme(P5poly);
        }catch(NullAreaException e){
            System.err.println("Erreur d'aire.");
        }
        
    }
    
    private String generateString(int taille){
        Random rand = new Random();
         // Génération d'une chaîne de 6 caractères aléatoire
        String str= new String();
        for(int i = 0 ; i < taille ; i++){
            char c = (char)(rand.nextInt(26) + 97);
            str += c;
        }
        return str;
    }
    
    public String toString(){
        String parcellesInfo = new String();
        parcellesInfo = P1.toString()+"\n"+
                P2.toString()+"\n"+
                P3.toString()+"\n"+
                P4.toString();
        
        return parcellesInfo;
    }
    
    
    public float calculSurface(){
        float s = P1.getSurface()+ P2.getSurface()+P3.getSurface()+P4.getSurface();
        return s;
    }
    

}
