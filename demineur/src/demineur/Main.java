/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demineur;

import gui.PlateauUi;
import metier.Plateau;
import metier.Niveau;
import metier.Partie;

/**
 *
 * @author yaod
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Niveau niveau = new Niveau(16, 16, 40);
        Partie partie = new Partie();
        
        partie.setNiveau(niveau);
        Plateau plateau = new Plateau(partie);
        partie.setPlateau(plateau);
        PlateauUi plateauUi = new PlateauUi(partie);
    }
    
}
