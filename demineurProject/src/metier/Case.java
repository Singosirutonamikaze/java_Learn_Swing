/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import exception.CaseMarqueeException;
import exception.CaseMineeException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yaod
 */
public class Case {

    private boolean mine;
    private Plateau plateau;
    private boolean marquee;
    private boolean decouverte;

    public Case(Plateau plateau) {
        this.plateau = plateau;
    }

    public List<Case> getVoisines() {
        List<Case> voisines = new ArrayList<>();
        int position = this.plateau.getCases().indexOf(this);
        //int nombreLignes = plateau.getPartie().getNiveau().getNombreLignes();
        int nombreColonnes = plateau.getPartie().getNiveau().getNombreColonnes();

        int i = position / nombreColonnes;
        int j = position % nombreColonnes;

        this.addVoisine(voisines, i - 1, j - 1);
        this.addVoisine(voisines, i - 1, j);
        this.addVoisine(voisines, i - 1, j + 1);

        this.addVoisine(voisines, i, j - 1);
        this.addVoisine(voisines, i, j + 1);

        this.addVoisine(voisines, i + 1, j - 1);
        this.addVoisine(voisines, i + 1, j);
        this.addVoisine(voisines, i + 1, j + 1);

        return voisines;

    }

    public void addVoisine(List<Case> voisines, int x, int y) {

        if (this.verifierCase(x, y)) {
            voisines.add(plateau.getCase(x, y));
        }
    }

    private boolean verifierCase(int i, int j) {
        int nombreLignes = plateau.getPartie().getNiveau().getNombreLignes();
        int nombreColonnes = plateau.getPartie().getNiveau().getNombreColonnes();

        return i >= 0 && i <= nombreLignes && j >= 0 && j <= nombreColonnes;
    }

    public int getContenu() {
        int nombreMines = 0;

        for (Case c : this.getVoisines()) {
            if (c.isMine()) {
                nombreMines++;
            }
        }

        return nombreMines;
    }

    public void devoiler() throws CaseMineeException, CaseMarqueeException {
        //decouverte de case
        if (isMine()) {
            throw new CaseMineeException();
        }

        if (isMarquee()) {
            throw new CaseMarqueeException();
        }

        if (!decouverte) {
            this.decouverte = true;
            this.devoilerVoisines();
        }

    }

    private void devoilerVoisines() throws CaseMineeException, CaseMarqueeException {
        if (this.getContenu() == 0) {
            for (Case c : this.getVoisines()) {
                c.devoiler();
            }
        }
    }
    
    public void marquer(){
        
        /*if(marquee){
            this.marquee = false;
        }else{
            this.marquee = true;
        }*/
        
        marquee = !marquee;
        
        int increment = marquee ? 1 : -1;
        
        this.getPlateau().getPartie().getCompteurMine().incrementer(increment);
        
    }
    
    public boolean isMine() {
        return mine;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public boolean isMarquee() {
        return marquee;
    }

    public void setMarquee(boolean marquee) {
        this.marquee = marquee;
    }

}
