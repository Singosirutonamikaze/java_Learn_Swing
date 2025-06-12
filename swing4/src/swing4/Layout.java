/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author yaod
 */
public class Layout extends JFrame{
    private JPanel header = new  JPanel();
    private JPanel aside = new  JPanel();
    private JPanel footer = new  JPanel();
    private JPanel mainContent = new  JPanel();
    
    public Layout(){
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        header.setSize(1000, 100);
        header.setBackground(Color.blue);
        
        footer.setSize(1000, 100);
        footer.setBackground(Color.cyan);
        
        aside.setSize(300, 400);
        aside.setBackground(Color.DARK_GRAY);
        
        mainContent.setSize(300, 400);
        mainContent.setBackground(Color.white);
        
        Container c = this.getContentPane();
        BorderLayout borderLayout = new BorderLayout();
        
        c.setLayout(borderLayout);
        
        c.add(mainContent);
        c.add(header, BorderLayout.NORTH);
        c.add(footer, BorderLayout.SOUTH);
        c.add(aside, BorderLayout.WEST); 
    }
}
