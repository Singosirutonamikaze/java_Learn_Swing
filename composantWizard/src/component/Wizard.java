/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class Wizard  extends JPanel implements IWizard{
    
    private JPanel topPanel = new JPanel();
    private JPanel contentPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();
    private JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    ArrayList<IStep> steps =  new ArrayList<>();
    
    private JButton firstPage = new NouveauButton("Premier");
    private JButton precedentPage = new NouveauButton("Précédent");
    private JButton nextPage = new NouveauButton("Suivant");
    private JButton lastPage = new NouveauButton("Dernier");
  
    
    public Wizard(){
        
        BorderLayout borderLayout = new BorderLayout();
        
        buttonPanel.add(firstPage);
        buttonPanel.add(precedentPage);
        buttonPanel.add(nextPage);
        buttonPanel.add(lastPage);
        
        this.setLayout(borderLayout);
        this.contentPanel.setLayout(cardLayout);
        this.add(topPanel, BorderLayout.NORTH);
        this.add(contentPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
               
        this.topPanel.setLayout(new GridLayout(1,0));
        
        firstPage.addActionListener(e -> {
            cardLayout.first(contentPanel);
            this.validate();
        });
        
        precedentPage.addActionListener(e -> {
            cardLayout.previous(contentPanel);
            this.validate();
        });
        
        nextPage.addActionListener(e -> {
            cardLayout.next(contentPanel);
            this.validate();
        });
        
        lastPage.addActionListener(e -> {
            cardLayout.last(contentPanel);
            this.validate();
        });
        
    }
    
    
    @Override
    public void addStep(IStep step) {
        topPanel.add(step.getStepButton());
        //steps.add(step);
        this.contentPanel.add((Component) step);
    }

    /*@Override
    public void setSize(int width, int height) {
        this.setSize(width, height);
    }*/    
}
