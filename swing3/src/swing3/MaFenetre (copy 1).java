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
public class MaFenetre extends JFrame{
    protected JPanel regionCentrale = new JPanel();
    protected JPanel regionOrientale = new JPanel();
    protected JPanel regionOccidentale = new JPanel();
    protected JPanel regionAustrale = new JPanel();
    protected JPanel regionSeptentrionale = new JPanel();
    
    
    public MaFenetre(){
        
        this.setSize(500, 250);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        regionCentrale.setBackground(Color.red);
        regionAustrale.setBackground(Color.BLUE);
        regionOrientale.setBackground(Color.ORANGE);
        regionSeptentrionale.setBackground(Color.green);
        regionOccidentale.setBackground(Color.magenta);
 
    }
    
}
