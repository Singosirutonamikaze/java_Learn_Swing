/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import javax.swing.JButton;
import javax.swing.JPanel;
import api.GridInterface;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

/**
 *
 * @author yaod
 */

public class Grid extends JPanel implements GridInterface {

    private JPanel gridPanel;
    private int rows;
    private int cols;

    public Grid() {
        this(new Dimension(500, 400)); 
    }

    public Grid(Dimension size) {
        setLayout(new BorderLayout());
        gridPanel = new JPanel();
        add(gridPanel, BorderLayout.CENTER);
        setPreferredSize(size);
    }

    @Override
    public void createButtons(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        
        gridPanel.removeAll();
        gridPanel.setLayout(new GridLayout(rows, cols, 5, 5));

        for (int i = 0; i < rows * cols; i++) {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(30, 30)); 
            gridPanel.add(button);
        }

        revalidate();
        repaint();
    }

    @Override
    public JPanel getGridPanel() {
        return gridPanel;
    }

    public Dimension getGridDimension() {
        return new Dimension(cols, rows);
    }

}