/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yaod
 */
public abstract class Etat {
    
    protected Montre montre;
    private static List<Etat> etats = new ArrayList<>();

    
    public abstract void appui2xBouton1();

    public abstract void appui1xBouton1();

    public abstract void appui1xBouton2();
    
    public static void  initEtat(Montre montre){
        Etat affichage = new Affichage();
        Etat modificationHeure = new ModificationHeure();
        Etat modificationMinute =  new ModificationMinute();
        Etat modificationseconde =  new ModificationSeconde();
        
        affichage.setMontre(montre);
        modificationHeure.setMontre(montre);
        modificationMinute.setMontre(montre);
        modificationseconde.setMontre(montre);
        
        etats.add(affichage);
        etats.add(modificationHeure);
        etats.add(modificationMinute);
        etats.add(modificationseconde);
        
        montre.setEtat(affichage);
    }
    
    
    public void suivant(){
        int position = etats.indexOf(this);
        
        if(position < etats.size()){
            this.montre.setEtat(etats.get(position + 1));
        }else{
            this.montre.setEtat(etats.getFirst());
        }
        
    }
    
    
    public Montre getMontre() {
        return montre;
    }

    public void setMontre(Montre montre) {
        this.montre = montre;
    }
    
    
}
