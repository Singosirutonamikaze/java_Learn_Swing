/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.List;
import java.util.ArrayList;
import api.GridInterface;
import api.LevelGameInterface;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public class Level extends JPanel implements LevelGameInterface {

    private CardLayout card;
    private JPanel topPanel;
    private GamePage contentPanel;
    private JPanel levelPanel;
    private JComboBox<String> comboCategory;

    private JButton level1;
    private JButton level2;
    private JButton level3;
    private JButton level4;
    private JButton level5;
    private JButton level6;
    private JButton level7;
    private JButton level8;

    private List<String> categories = new ArrayList<>();
    private List<List<JButton>> levelsByCat = new ArrayList<>();

    public Level() {
        card = new CardLayout();
        this.setLayout(new BorderLayout());
        this.generateTopPanel();
        this.generateContentPanel();
        this.generateLevelPanel();
        this.add(topPanel, BorderLayout.NORTH);
        this.add(contentPanel, BorderLayout.CENTER);
        this.add(levelPanel, BorderLayout.WEST);
        this.buildEventAction();
    }

    private void generateTopPanel() {
        topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        this.topPanel.setBackground(new Color(17, 24, 102));
        JLabel title = new JLabel("Jeu de Démineur");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Roboto", Font.BOLD, 20));
        this.topPanel.setPreferredSize(new Dimension(1240, 50));
        this.topPanel.add(title);
    }

    private void generateContentPanel() {
        this.contentPanel = new GamePage();
        this.contentPanel.setLayout(card);
    }

    private void generateLevelPanel() {
        levelPanel = new JPanel();
        this.levelPanel.setPreferredSize(new Dimension(300, 500));
        this.levelPanel.setBackground(Color.WHITE);
        this.levelPanel.setLayout(new BoxLayout(levelPanel, BoxLayout.Y_AXIS));

        this.categories.add("Débutant");
        this.categories.add("Intermédiaire");
        this.categories.add("Avancé");
        this.categories.add("Expert");

        level1 = new NewLabel("8 × 8   (10 mines)");
        level2 = new NewLabel("9 × 9   (10 mines)");
        level3 = new NewLabel("10 × 10   (20 mines)");
        level4 = new NewLabel("12 × 12   (30 mines)");
        level5 = new NewLabel("16 × 16   (40 mines)");
        level6 = new NewLabel("20 × 30   (90 mines)");
        level7 = new NewLabel("24 × 30   (115 mines)");
        level8 = new NewLabel("30 × 16   (99 mines)");

        List<JButton> debutant = new ArrayList<>();
        debutant.add(level1);
        debutant.add(level2);
        this.levelsByCat.add(debutant);

        List<JButton> inter = new ArrayList<>();
        inter.add(level3);
        inter.add(level4);
        inter.add(level5);
        this.levelsByCat.add(inter);

        List<JButton> avance = new ArrayList<>();
        avance.add(level6);
        avance.add(level7);
        this.levelsByCat.add(avance);

        List<JButton> expert = new ArrayList<>();
        expert.add(level8);
        this.levelsByCat.add(expert);

        comboCategory = new JComboBox<>(categories.toArray(new String[0]));
        this.comboCategory.setMaximumSize(new Dimension(250, 30));
        //comboCategory.setLayout(new FlowLayout(FlowLayout.CENTER));

        comboCategory.addActionListener(e -> {
            int index = comboCategory.getSelectedIndex();
            this.levelPanel.removeAll();
            this.levelPanel.add(comboCategory);
            for (JButton btn : this.levelsByCat.get(index)) {
                this.levelPanel.add(btn);
            }
            this.levelPanel.revalidate();
            this.levelPanel.repaint();
        });

        this.levelPanel.add(comboCategory);
        for (JButton btn : this.levelsByCat.get(0)) {
            this.levelPanel.add(btn);
        }
    }

    private void buildEventAction() {
        this.level1.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(8, 8);
        });
        this.level2.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(9, 9);
        });
        this.level3.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(10, 10);
        });
        this.level4.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(12, 12);
        });
        this.level5.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(16, 16);
        });
        this.level6.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(20, 30);
        });
        this.level7.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(24, 30);
        });
        this.level8.addActionListener(e -> {
            this.contentPanel.getGridDemineur().createButtons(30, 16);
        });
    }

    @Override
    public boolean isLoser() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isWinner() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public GridInterface getCurrentGrid() {
        throw new UnsupportedOperationException();
    }
}
