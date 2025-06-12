/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.List;

/**
 *
 * @author yaod
 */
public class Plateau {
    
    private List<Case> cases;
    private Partie partie;
    

    public Plateau() {
        
    }
    
    
    public Case getCase(int index){
        return cases.get(index);
    }
    
    public Case getCase(int i, int j){
        int index = i * partie.getNiveau().getNombreColonnes() + j;
        return this.getCase(index);
    }
    

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }
    
    
    
    
    
}
