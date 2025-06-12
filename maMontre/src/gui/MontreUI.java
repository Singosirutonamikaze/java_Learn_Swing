/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import metier.Montre;

/**
 *
 * @author yaod
 */
public class MontreUI extends JFrame {

    private Montre montre = new Montre();
    private JPanel paneauBouton = new JPanel();
    private JPanel paneauCadrant = new JPanel();

    private JLabel cadrant = new JLabel();
    private JButton bouton1 = new JButton("Bouton 1");
    private JButton bouton2 = new JButton("Bouton 2");

    public MontreUI() {

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());

        this.add(paneauBouton, BorderLayout.NORTH);
        this.add(paneauCadrant, BorderLayout.CENTER);

        paneauBouton.setLayout(new GridLayout(1, 0));
        paneauCadrant.setLayout(new GridLayout(1, 0));

        this.paneauBouton.add(bouton1);
        this.paneauBouton.add(bouton2);

        this.cadrant.setText(montre.toString());
        paneauCadrant.add(cadrant);

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);

        bouton1.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                if (SwingUtilities.isLeftMouseButton(event)) {
                    montre.appui1xBouton1();
                    cadrant.setText(montre.toString());
                }

                if (SwingUtilities.isRightMouseButton(event)) {
                    montre.appui2xBouton1();
                    cadrant.setText(montre.toString());
                }
            }
        }
        );

        bouton2.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                if (SwingUtilities.isLeftMouseButton(event)) {
                    montre.appui1xBouton2();
                    cadrant.setText(montre.toString());
                }
            }
        }
        );
    }

}
