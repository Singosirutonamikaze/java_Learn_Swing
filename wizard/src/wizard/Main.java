/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wizard;

import api.WizardInterface;
import implementation.Step;
import implementation.Wizard;
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
        
        WizardInterface wizard = new Wizard();
        wizard.addStep(new Step("Étape 1"));
        wizard.addStep(new Step("Étape 2"));
        wizard.addStep(new Step("Étape 3"));
        wizard.addStep(new Step("Étape 4"));
        
        container.add((Component) wizard);
        
        fenetre.setVisible(true);
    }
    
}
