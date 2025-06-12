/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.Date;

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

    public Partie() {
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






