/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demineurproject;

import api.LevelGameInterface;
import components.Level;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author yaod
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame fenetre =  new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fenetre.setSize(1240, 600);
        
        Container container =  fenetre.getContentPane();
        LevelGameInterface level = new Level();
        
        container.add((Component) level);
        
        fenetre.setVisible(true);
    }
    
}
