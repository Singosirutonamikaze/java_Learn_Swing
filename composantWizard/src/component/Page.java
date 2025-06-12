/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class Page extends JPanel {

    private JPanel pageHead = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel pageContent = new JPanel();

    public Page() {
        this.setLayout(new BorderLayout());

        pageHead.setPreferredSize(new Dimension(700, 70));
        pageHead.setBackground(new Color( 28, 40, 51 ));

        pageContent.setLayout(new BorderLayout());

        this.add(pageHead, BorderLayout.NORTH);
        this.add(pageContent, BorderLayout.CENTER);
    }

    public void ajouterTitre(String titrePage) {
        JLabel titleLabel = new JLabel(titrePage);
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        pageHead.add(titleLabel);
    }

    public JPanel getPageContent() {
        return pageContent;
    }

}
