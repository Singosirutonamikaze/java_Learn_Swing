/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementation;

import api.StepInterface;
import api.WizardInterface;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class Wizard extends JPanel implements WizardInterface {

    private List<StepInterface> steps = new ArrayList<>();
    private StepInterface currentStep;
    private JPanel topPanel;
    private JPanel contentPanel;
    private JPanel controlPanel;
    private CardLayout card;
    private JButton nextButton;
    private JButton previousButton;
    private JButton firstButton;
    private JButton lastButton;

    public Wizard() {

        this.setLayout(new BorderLayout());
        this.builTopPanel();
        this.buildContentPanel();
        this.buildControlPanel();
        this.add(topPanel, BorderLayout.NORTH);
        this.add(contentPanel, BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.SOUTH);
        
        
    }

    private void buildControlPanel() {
        controlPanel = new JPanel();
        nextButton = new JButton("Suivant");
        firstButton = new JButton("Premier");
        previousButton = new JButton("Précédent");
        lastButton = new JButton("Dernier");

        controlPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        controlPanel.add(firstButton);
        controlPanel.add(previousButton);
        controlPanel.add(nextButton);
        controlPanel.add(lastButton);
    }

    private void buildContentPanel() {
        contentPanel = new JPanel();
        contentPanel.setLayout(card);
    }

    private void builTopPanel() {
        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 0));
    }

    @Override
    public void addStep(StepInterface step) {
        this.topPanel.add(step.getTopButton());
        this.contentPanel.add(step.getContent());
        this.steps.add(step);
    }

    @Override
    public void removeStep(StepInterface step) {

    }

    @Override
    public void removeStep(int index) {

    }

    @Override
    public void first() {
        card.first(contentPanel);
        this.currentStep = steps.getFirst();
    }

    @Override
    public void last() {
        card.last(contentPanel);
        this.currentStep = steps.getLast();
    }

    @Override
    public void next() {
        card.next(contentPanel);
        //this.currentStep = steps.getNext();
    }

    @Override
    public void previous() {
        card.previous(contentPanel);
        //this.currentStep = steps.getPrevious();
    }

    @Override
    public StepInterface getCurrentStep() {
        return this.currentStep;
    }

    @Override
    public List<StepInterface> getAllSteps() {
       return this.steps;
    }

}
