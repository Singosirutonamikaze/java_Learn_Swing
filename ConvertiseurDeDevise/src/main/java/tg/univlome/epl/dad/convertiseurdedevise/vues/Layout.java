/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.convertiseurdedevise.vues;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author siruto
 */
public class Layout extends JFrame {

    public Layout() {
        this.initialiser();
    }

    public Layout(String title) throws HeadlessException {
        super(title);
        this.initialiser();
    }

    public void initialiser() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(dimension);
        this.setLocationRelativeTo(null); 
        this.setResizable(true);
    }
    
    
}
