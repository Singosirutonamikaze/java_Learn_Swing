package swing3;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yaod
 */
public class MaFenetre1 extends MaFenetre{

    
    public MaFenetre1(){
        super();
        Container c = this.getContentPane();
        BorderLayout borderLayout = new BorderLayout();
        
        c.setLayout(borderLayout);
        c.add(regionCentrale);
        c.add(regionOccidentale, BorderLayout.WEST);
        c.add(regionAustrale, BorderLayout.EAST);
        c.add(regionOrientale, BorderLayout.SOUTH);
        c.add(regionSeptentrionale, BorderLayout.NORTH);
        
    }
    
}
