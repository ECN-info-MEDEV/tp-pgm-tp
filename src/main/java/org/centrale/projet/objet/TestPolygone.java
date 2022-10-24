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
public class TestPolygone {
    
    public static void main(String args[]){
        Point2D P0 = new Point2D(0,0);
        Point2D P1 = new Point2D(20,0);
        Point2D P2 = new Point2D(20,10);
        Point2D P3 = new Point2D(0,10);
        
        Polygone polyT = new Polygone();
        polyT.addPoint(P0);
        polyT.addPoint(P1);
        polyT.addPoint(P2);
        polyT.addPoint(P3);
        
        Polygone polyAT = new Polygone();
        polyAT.addPoint(P0);
        polyAT.addPoint(P3);
        polyAT.addPoint(P2);
        polyAT.addPoint(P1);
        
        Polygone triangle = new Polygone();
        triangle.addPoint(P0);
        triangle.addPoint(P1);
        triangle.addPoint(P2);
        
        Polygone NonC = new Polygone();
        NonC.addPoint(new Point2D(0,1));
        NonC.addPoint(new Point2D(3,1));
        NonC.addPoint(new Point2D(1,2));
        NonC.addPoint(new Point2D(3,3));
        NonC.addPoint(new Point2D(0,3));
        
        Polygone recop = new Polygone(polyT);
        
        System.out.println(polyT.toString());
        recop.translate(20, 30);
        System.out.println(recop.toString());
      
        System.out.println(polyT.getSurface());
        System.out.println(polyAT.getSurface());
        System.out.println(triangle.getSurface());
        System.out.println(NonC.getSurface());
        
        Polygone zau5 = new Polygone();
        zau5.addPoint(new Point2D(-100,-5));
        zau5.addPoint(new Point2D(-50,5));
        zau5.addPoint(new Point2D(0,50));
        zau5.addPoint(new Point2D(-50,50));
        zau5.addPoint(new Point2D(-100,0));
        System.out.println("zau5 : "+zau5.getSurface());
        
        Polygone zu1 = new Polygone();
        zu1.addPoint(new Point2D(-50,-5));
        zu1.addPoint(new Point2D(-19,-50));
        zu1.addPoint(new Point2D(-6,-5));
        System.out.println("zu1 : "+zu1.getSurface());
	
        Polygone zu2 = new Polygone();
        zu2.addPoint(new Point2D(-4,-5));
        zu2.addPoint(new Point2D(-10,-47));
        zu2.addPoint(new Point2D(0,-47));
        zu2.addPoint(new Point2D(50,-30));
        zu2.addPoint(new Point2D(50,-5));
        System.out.println("zu2 : "+zu2.getSurface());

        Polygone zu3 = new Polygone();
        zu3.addPoint(new Point2D(5,5));
        zu3.addPoint(new Point2D(50,5));
        zu3.addPoint(new Point2D(50,20));
        zu3.addPoint(new Point2D(30,50));    
        System.out.println("zu3 : "+zu3.getSurface());
        
        Polygone zu4 = new Polygone();
        zu4.addPoint(new Point2D(-4,5));
        zu4.addPoint(new Point2D(20,50));
        zu4.addPoint(new Point2D(0,50));
        zu4.addPoint(new Point2D(-50,5));    
        System.out.println("zu4 : "+zu4.getSurface());
	
        Polygone zn6 = new Polygone();
        zn6.addPoint(new Point2D(300,-200));
        zn6.addPoint(new Point2D(195,-60));
        zn6.addPoint(new Point2D(150,-100));
        zn6.addPoint(new Point2D(150,-200));
        zn6.addPoint(new Point2D(150,-261));
        System.out.println("zn6 : "+zn6.getSurface());

        
    }
}
