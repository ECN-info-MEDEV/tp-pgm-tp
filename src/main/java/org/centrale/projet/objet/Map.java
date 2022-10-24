/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mservier
 */
public class Map {
    /**
     * listes des Parcelles du PLU.
     */
    private LinkedList<Parcelle> listeParcelles;

    public Map(LinkedList<Parcelle> listeParcelles) {
        this.listeParcelles = listeParcelles;
    }
    
    public Map(String fileName){
        this.listeParcelles = new LinkedList<Parcelle>();
        try{
            BufferedReader fichier = new BufferedReader(new FileReader(fileName));
            String line = fichier.readLine();
            String lineForme = fichier.readLine();
            
            String delimiteur = " [];";
            StringTokenizer tokenizer;
            while (line != null) {
                ArrayList<String> chaine = new ArrayList<>();
                ArrayList<String> sommets = new ArrayList<>();
                
                tokenizer = new StringTokenizer(line, delimiteur);
                while (tokenizer.hasMoreTokens()) {
                    chaine.add(tokenizer.nextToken());
                }
                tokenizer = new StringTokenizer(lineForme, delimiteur);
                while (tokenizer.hasMoreTokens()) {
                    sommets.add(tokenizer.nextToken());
                }
                if (!chaine.isEmpty()){
                    creerParcelle(chaine, sommets);
                    //System.out.println(chaine);
                    //System.out.println(sommets);
                }
                line = fichier.readLine();
                lineForme = fichier.readLine();
            }
        } catch(FileNotFoundException e){
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
          
    public float calculSurface(){
        float s = 0;
        for(Parcelle p : listeParcelles){
            s = s + p.getSurface();
        }
        return s;
    }


    private void creerParcelle(ArrayList<String> chaine, ArrayList<String> sommets) throws RuntimeException{
        String classe = chaine.get(0);
        Polygone forme = new Polygone();
        if(sommets.size()%2 != 0) throw new RuntimeException("Erreur dans la liste des sommets");
        for(int i=0; i<sommets.size()-1; i=i+2){
            forme.addPoint(new Point2D((new Integer(sommets.get(i))).intValue(), (new Integer(sommets.get(i+1))).intValue()));
        }
        
        switch(classe){
            case "ZU":
                ZU zu = new ZU(Integer.parseInt(chaine.get(1)), 
                        chaine.get(2), 
                        forme, 
                        Integer.parseInt(chaine.get(3)),
                        Float.parseFloat(chaine.get(4))
                );
                this.listeParcelles.add(zu);    
                break;
                
            case "ZAU":
                ZAU zau = new ZAU(Integer.parseInt(chaine.get(1)), 
                        chaine.get(2), 
                        forme, 
                        Integer.parseInt(chaine.get(3))
                );
                this.listeParcelles.add(zau);
                break;
                
            case "ZA":
                ZA za = new ZA(Integer.parseInt(chaine.get(1)), 
                        chaine.get(2), 
                        forme, 
                        chaine.get(3)
                );
                this.listeParcelles.add(za);
                break;
                
            case "ZN":
                ZN zn = new ZN(Integer.parseInt(chaine.get(1)), 
                        chaine.get(2), 
                        forme);
                this.listeParcelles.add(zn);
                break;
            default:
                    System.err.println("Classe ne définissant pas une Parcelle");
                    break;    
        }
    }
    
    public String toString(){
        String parcellesInfo = new String();
        for(Parcelle p : this.listeParcelles){
            parcellesInfo = parcellesInfo + p.toString()+"\n";
        }
        
        return parcellesInfo;
    }
}
