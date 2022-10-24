/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.centrale.projet.objet.MapSansListe;



/**
 *
 * @author mservier
 */
public class PLU {
    public static void main(String args[]){
        /**MapSansListe Brill = new MapSansListe();
        Brill.creeMapAlea();
        System.out.println(Brill.toString());
        System.out.println("Surface totale : "+Brill.calculSurface());*/
       Map lecture = new Map("Parcelles_short.txt");
        System.out.println(lecture.toString());
        //Ecriture("test.txt");
    }
    
//     public static void Ecriture(String fileName) {
//        //ligne de texte définissant un personnage
//        String texte="";
//        try {
//            BufferedWriter ecriture = new BufferedWriter(new FileWriter(fileName));
//            ecriture.write("Joueur ");
//            ecriture.close();
//        } catch (IOException ex) {
//            Logger.getLogger(PLU.class.getName()).log(Level.SEVERE, null, ex);
//        }
//     }
}
