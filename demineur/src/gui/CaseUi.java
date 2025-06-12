/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import exception.CaseMarqueeException;
import exception.CaseMineeException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import metier.Case;
import metier.CaseUiInterface;

/**
 *
 * @author yaod
 */
public class CaseUi extends JButton  implements CaseUiInterface{

    private Case caseMetier;

    public CaseUi(Case _caseMetier) {
        super();
        this.caseMetier = _caseMetier;

        /*this.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(caseMetier);
                caseMetier.marquer();
            }
        });*/
        
        this.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent event){
                    if(SwingUtilities.isLeftMouseButton(event)){
                        try {
                            caseMetier.devoiler();
                        } catch (CaseMineeException ex) {
                           //Fin au jeu
                        } catch (CaseMarqueeException ex) {
                            //Rien
                        }
                    }
                    
                    if(SwingUtilities.isRightMouseButton(event)){
                        caseMetier.marquer();
                    }
                }
            }
        );
    }

    @Override
    public void afficher() {
        if(this.caseMetier.isMarquee()){
            this.setText("M");
        }
        
        if(this.caseMetier.isDecouverte()){
            String text =  String.valueOf(this.caseMetier.getContenu());
            this.setText(text);
        }
        
         if(!this.caseMetier.isMarquee() && !this.caseMetier.isDecouverte()){
            this.setText("");
        }
    }

}
