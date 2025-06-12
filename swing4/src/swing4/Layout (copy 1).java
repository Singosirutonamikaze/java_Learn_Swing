/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing4;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author yaod
 */
public class Layout extends JFrame {

    private JPanel header = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private JPanel aside = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JPanel mainContent = new JPanel();
    private JButton button1 = new NouveauButton("Page 1");
    private JButton button2 = new NouveauButton("Page 2");
    private JButton button3 = new NouveauButton("Page 3");
    private JButton button4 = new NouveauButton("Page 4");
    private JButton button5 = new NouveauButton("Page 5");
    private JLabel label = new JLabel("Menu");
    private JLabel headerLabel = new JLabel("Connecté : username");
    private JLabel bottomLabel = new JLabel("@ copyright");
    private Page1 page1 = new Page1();
    private Page2 page2 = new Page2();
    private Page3 page3 = new Page3();
    private Page4 page4 = new Page4();
    private Page5 page5 = new Page5();
    private CardLayout cardLayout = new CardLayout();

    public Layout() {
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        header.setPreferredSize(new Dimension(1000, 50));
        header.setBackground(new Color(27, 79, 114));

        footer.setPreferredSize(new Dimension(1000, 50));
        footer.setBackground(new Color(174, 214, 241));

        aside.setPreferredSize(new Dimension(300, 400));
        aside.setBackground(new Color(213, 219, 219));
        BoxLayout asideLayout = new BoxLayout(aside, BoxLayout.Y_AXIS);
        aside.setLayout(asideLayout);

        mainContent.setBackground(Color.white);

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());

        c.add(header, BorderLayout.NORTH);
        c.add(footer, BorderLayout.SOUTH);
        c.add(aside, BorderLayout.WEST);
        c.add(mainContent, BorderLayout.CENTER);

        aside.add(Box.createRigidArea(new Dimension(20, 10)));
        aside.add(label);
        aside.add(Box.createRigidArea(new Dimension(0, 10)));
        aside.add(button1);
        aside.add(Box.createRigidArea(new Dimension(0, 5)));
        aside.add(button2);
        aside.add(Box.createRigidArea(new Dimension(0, 5)));
        aside.add(button3);
        aside.add(Box.createRigidArea(new Dimension(0, 5)));
        aside.add(button4);
        aside.add(Box.createRigidArea(new Dimension(0, 5)));
        aside.add(button5);
        aside.add(Box.createVerticalGlue());

        label.setFont(new Font("Roboto", Font.BOLD, 30));
        label.setForeground(new Color(33, 47, 60));

        bottomLabel.setFont(new Font("Roboto", Font.BOLD, 25));
        bottomLabel.setForeground(new Color(255, 255, 255));

        headerLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        headerLabel.setForeground(new Color(255, 255, 255));

        header.add(headerLabel);
        footer.add(bottomLabel);

        mainContent.setLayout(cardLayout);
        mainContent.setBackground(Color.white);

        mainContent.add(page1, "page1");
        mainContent.add(page2, "page2");
        mainContent.add(page3, "page3");
        mainContent.add(page4, "page4");
        mainContent.add(page5, "page5");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page1");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page2");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page3");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page4");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(mainContent, "page5");
            }
        });

    }
}
