/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementation;

import api.StepInterface;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class Step implements StepInterface {

    private JButton topButton;
    private JPanel content;

    //constructeur par defaut ou vide
    public Step() {
        topButton = new JButton();
        content = new JPanel();
    }

    public Step(String buttonText) {
        this();
        this.topButton.setText(buttonText);
    }

    @Override
    public JButton getTopButton() {
        return this.topButton;
    }

    @Override
    public JPanel getContent() {
        return this.content;
    }

    @Override
    public void setTopButtonText(String text) {
        this.topButton.setText(text);
    }

}
