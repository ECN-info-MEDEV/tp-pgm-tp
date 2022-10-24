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
public class ZA extends ZN implements Constructible{
    
    /**
     * Type de culture dans la ZA.
     */
    private String typeCulture;

    public ZA(int numero, String proprietaire, Polygone forme, String typeCulture) {
        super(numero, proprietaire, forme);
        this.typeCulture = typeCulture;
    }

    public ZA(Parcelle p, String typeCulture) {
        super(p);
        this.typeCulture = typeCulture;
    }

    public ZA(String typeCulture) {
        super();
        this.typeCulture = typeCulture;
    }
    
    public ZA(){
        super();
        this.typeCulture = "Jachère";
    }

    public String getTypeCulture() {
        return typeCulture;
    }

    public void setTypeCulture(String typeCulture) {
        this.typeCulture = typeCulture;
    }
    
    public String toString(){
        String str = super.toString();
        str = str + "\n\t Type culture : " + this.getTypeCulture()+"\n"+
                "\t Surface constructible : "+this.surfaceConstructible();
        return str;
    }

    @Override
    public float surfaceConstructible() {
        // 10% de la surface de la ZA et 200m2 max 
        //
        if(this.getSurface()*0.1>200){
            return 200;
        }else{
            return (float)(this.getSurface()*0.1);
        }
    }
            
    
}
