/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author yaod
 */
public class Partie {

    private Date heureDebut;
    private Date heureFin;
    private Boolean succes;
    private CompteurMine compteurMine;
    private Plateau plateau;
    private Niveau niveau;
    private Chronometre chronometre;
    private boolean enCours = false;

    public Partie() {
    }

    public void repartirMines(Case caseMetier) {
        List<Case> nonVoisines = caseMetier.getNonVoisines();
        int nombreMine = this.getNiveau().getNombreMines();
        int nombreMinesReparties = 0;
       
        Random r = new Random();

        while (nombreMine < nombreMinesReparties) {
             int index = r.nextInt(nonVoisines.size());
             System.out.println(index);
             Case c = nonVoisines.get(index);
             if(!c.isMine()){
                 c.setMine(true);
                 nombreMinesReparties++;
             }
        }

    }
    
    public void demarer(Case c){
        if(!enCours){
            this.repartirMines(c);
        }
        enCours = true;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public Boolean getSucces() {
        return succes;
    }

    public CompteurMine getCompteurMine() {
        return compteurMine;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public Chronometre getChronometre() {
        return chronometre;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public void setCompteurMine(CompteurMine compteurMine) {
        this.compteurMine = compteurMine;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public void setChronometre(Chronometre chronometre) {
        this.chronometre = chronometre;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

}
