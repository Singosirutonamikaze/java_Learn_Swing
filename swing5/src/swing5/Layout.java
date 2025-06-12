/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing5;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author yaod
 */
public class Layout extends JFrame {
    
    private JPanel footer = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private JPanel mainContent = new JPanel();
    private CardLayout cardLayout = new CardLayout();
    
    private JButton buttonFirst = new NouveauButton("Premier");
    private JButton buttonPrecedent = new NouveauButton("Précédent");
    private JButton buttonNext = new NouveauButton("Suivant");
    private JButton buttonLast = new NouveauButton("Dernier");
  
    private Page1 page1 = new Page1();
    private Page2 page2 = new Page2();
    private Page3 page3 = new Page3();
    private Page4 page4 = new Page4();
    
    //private ArrayList() allpages = ArrayList>;

    public Layout() {
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        footer.setPreferredSize(new Dimension(1000, 50));
        footer.setBackground(new Color( 93, 109, 126 ));


        mainContent.setBackground(Color.white);

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());

        c.add(footer, BorderLayout.SOUTH);
        c.add(mainContent, BorderLayout.CENTER);

        footer.add(Box.createRigidArea(new Dimension(0, 10)));
        footer.add(buttonFirst);
        footer.add(Box.createRigidArea(new Dimension(0, 5)));
        footer.add(buttonPrecedent);
        footer.add(Box.createRigidArea(new Dimension(0, 5)));
        footer.add(buttonNext);
        footer.add(Box.createRigidArea(new Dimension(0, 5)));
        footer.add(buttonLast);
        footer.add(Box.createVerticalGlue());

        mainContent.setLayout(cardLayout);
        mainContent.setBackground(Color.white);

        mainContent.add(page1, "page1");
        mainContent.add(page2, "page2");
        mainContent.add(page3, "page3");
        mainContent.add(page4, "page4");
        
        buttonFirst.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page1");
            }
        });
        
        buttonLast.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page4");
            }
        });
        
        buttonPrecedent.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.previous(mainContent);
            }
        });
        
        buttonNext.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.next(mainContent);
            }
        });
    }
}
