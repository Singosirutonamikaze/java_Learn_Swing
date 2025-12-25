/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.univlome.epl.dad.javaetsesclassesswing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author siruto
 */
public class Javaetsesclassesswing {

    public static void main(String[] args) {
        JFrame frame =  new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        
        frame.setSize(dimension);
        ImageIcon icon =  new ImageIcon("image.jpg");
        JLabel label = new JLabel(icon);
        
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
