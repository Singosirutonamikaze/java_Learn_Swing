/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tg.univlome.epl.dad.main;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author siruto
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(4, 2));

        JLabel labels[] = {
            new JLabel("Nom"), new JLabel("Téléphone"),
            new JLabel("Alice"), new JLabel("555556566"),
            new JLabel("Paul"), new JLabel("555556566"),
            new JLabel("Carole"), new JLabel("555556566")};

        frame.add(labels[0]);
        frame.add(labels[1]);
        
        JLabel boldLabel = new JLabel("Nom");
        Font boldFont  = boldLabel.getFont();
        Font plainFont  = new Font(boldFont.getName(), Font.PLAIN, boldFont.getSize());
        
        for (int i = 2; i < 8; i++) {
            labels[i].setFont(plainFont);
            frame.add(labels[i]);
        }
        
        frame.pack();
        frame.setVisible(true);
    }
}
