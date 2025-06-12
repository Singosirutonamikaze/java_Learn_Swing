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
public class Niveau {
    
    private int  nombreColonnes;
    private int  nombreLignes;
    private int nombreMines;
    private List<Partie> parties;

    public Niveau() {
    }
    
    
 
    public int getNombreColonnes() {
        return nombreColonnes;
    }

    public int getNombreLignes() {
        return nombreLignes;
    }

    public int getNombreMines() {
        return nombreMines;
    }

    public List<Partie> getParties() {
        return parties;
    }

    public void setNombreColonnes(int nombreColonnes) {
        this.nombreColonnes = nombreColonnes;
    }

    public void setNombreLignes(int nombreLignes) {
        this.nombreLignes = nombreLignes;
    }

    public void setNombreMines(int nombreMines) {
        this.nombreMines = nombreMines;
    }

    public void setParties(List<Partie> parties) {
        this.parties = parties;
    }
   
    
    
}















