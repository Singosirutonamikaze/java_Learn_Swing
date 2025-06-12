/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;

/**
 *
 * @author yaod
 */
public class NewLabel extends JButton {

    public NewLabel(String text) {
        super(text);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setOpaque(false);
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setForeground(new Color(33, 47, 60));
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setFont(new Font("Roboto", Font.PLAIN, 20));
        this.setMargin(new Insets(5, 15, 5, 15));
    }
}
