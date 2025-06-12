/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composantwizard;

import component.Step;
import component.Wizard;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class ComponentWizard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container container = frame.getContentPane();
        frame.setSize(1024, 600);
        
        Wizard wizard =  new Wizard();
       
        Step stepOne =  new Step();
        stepOne.setButtonTitle("Buttton 1");
        stepOne.setTitle("Etape 1");
        stepOne.setComponent(new JPanel());

        
        Step stepTwo =  new Step();
        stepTwo.setButtonTitle("Buttton 2");
        stepTwo.setTitle("Etape 2");
        stepTwo.setComponent(new JPanel());
        
        Step stepThree =  new Step();
        stepThree.setButtonTitle("Buttton 3");
        stepThree.setTitle("Etape 3");
        stepThree.setComponent(new JPanel());
        
        wizard.add(stepOne);
        wizard.add(stepTwo);
        wizard.add(stepThree);
        container.add(wizard);
     
        frame.setVisible(true);
        
    }
    
}
