/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class GamePage extends JPanel {

    private JPanel contentMainPanel;
    private Grid gridDemineur;

    public GamePage() {
        this.initComponents();
        this.layoutComponents();
    }

    private void initComponents() {
        gridDemineur = new Grid();
        contentMainPanel = createContentMainPanel();
    }


    private JPanel createContentMainPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(28, 40, 51));
        panel.add(gridDemineur, BorderLayout.CENTER);
        return panel;
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(940, 550));
        setBackground(new Color(28, 40, 51));

        add(contentMainPanel, BorderLayout.CENTER);
    }

    public void addGrid(Grid newGrid) {
        this.contentMainPanel.removeAll();
        this.contentMainPanel.add(newGrid, BorderLayout.CENTER);
        this.contentMainPanel.revalidate();
        this.contentMainPanel.repaint();
        this.gridDemineur = newGrid;
    }

    public Grid getGridDemineur() {
        return this.gridDemineur;
    }

    public void setGridDemineur(Grid gridDemineur) {
        this.gridDemineur = gridDemineur;
    }
}
