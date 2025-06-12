/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing5;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;

/**
 *
 * @author yaod
 */
public class NouveauButton extends JButton {
  
    public NouveauButton(String text) {
        super(text);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setForeground(new Color( 0, 0, 128 ));
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setFont(new Font("Roboto", Font.BOLD, 20));
        this.setMargin(new Insets(5, 15, 5, 15));
        this.setBackground(new Color(  240, 243, 244 ));
    }
}