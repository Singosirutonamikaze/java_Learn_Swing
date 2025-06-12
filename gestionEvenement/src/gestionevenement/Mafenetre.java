/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionevenement;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.security.auth.x500.X500Principal;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.View;

/**
 *
 * @author yaod
 */
public class Mafenetre extends JFrame{
    private JButton button = new JButton("Button 1");
    private JPanel panel =  new JPanel();
    
    public  Mafenetre(){
        
        Container c = this.getContentPane();
        BoxLayout boxLayout =  new BoxLayout(c, View.X_AXIS);
        c.setLayout(boxLayout);
        c.add(button);
        c.add(panel);
        
        panel.setBackground(Color.BLACK);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               panel.setBackground(Color.red);
            }
        });
        
        this.setSize(500, 250);
    }
    
    
    
    
}
