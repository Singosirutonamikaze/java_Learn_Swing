/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import metier.Partie;

/**
 *
 * @author yaod
 */
public class PlateauUi extends JFrame{
    
    private Partie partie;
    private ZoneControle zoneControle;
    private Grille grille;
    
    public PlateauUi(Partie partie){
        this.partie =  partie;
        this.setSize(800, 600);
        
        this.setTitle("Jeu Démineur");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        
        grille =  new Grille(partie);
        pane.add(grille,BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
    
}
