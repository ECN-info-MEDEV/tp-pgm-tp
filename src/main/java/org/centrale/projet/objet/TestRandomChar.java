/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 * Classe de test de la génération d'un caractère et d'une chaîne de caractères aléatoires.
 * @author mservier
 */
public class TestRandomChar {
    public static void main(String args[]){
        // Création du générateur aléatoire
        Random rand = new Random();
        
        // Génération d'un caractère aléatoire
        char c1 = (char)(rand.nextInt(26) + 97);
        System.out.println(c1);
        
        // Génération d'une chaîne de 6 caractères aléatoire
        String str= new String();
        for(int i = 0 ; i < 6 ; i++){
            char c = (char)(rand.nextInt(26) + 97);
            str += c;
        }
        System.out.println(str);
    }
}
