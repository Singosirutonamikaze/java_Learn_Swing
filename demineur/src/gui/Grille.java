/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.GridLayout;
import javax.swing.JPanel;
import metier.Partie;
import metier.Case;

/**
 *
 * @author yaod
 */
public class Grille  extends JPanel{
    
    public Grille(Partie partie){
        
        int x = partie.getNiveau().getNombreLignes();
        int y = partie.getNiveau().getNombreColonnes();
        
        this.setLayout(new GridLayout(x, y));
        
        int longueur = x * y;
        for(int i = 0; i < longueur; i++){
            Case c = partie.getPlateau().getCase(i);
            CaseUi caseUi =  new CaseUi(c);
            c.setCaseUi(caseUi);
            this.add(caseUi);
        }
        
        
    }
    
}
