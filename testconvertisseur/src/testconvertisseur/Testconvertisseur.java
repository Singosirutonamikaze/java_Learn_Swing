/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testconvertisseur;

import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat;
import java.util.Random;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Testconvertisseur extends JFrame {
    
    // Composants UI
    private JComboBox<String> comboFrom, comboTo;
    private JTextField txtMontant, txtResultat;
    private JButton btnConvertir, btnInverser;
    private JLabel lblMeteo, lblTemp, lblHumidite, lblVent;
    private JPanel panelMeteo;
    
    // Données statiques - Taux de change (base: 1 USD)
    private Map<String, Double> taux;
    private final String[] devises = {"USD", "EUR", "GBP", "JPY", "CAD", "AUD", "CHF", "CNY", "XOF", "GHS"};
    private final DecimalFormat df = new DecimalFormat("#,##0.00");
    private Random random = new Random();
    
    // Couleurs modernes
    private final Color COLOR_PRIMARY = new Color(30, 144, 255);
    private final Color COLOR_SECONDARY = new Color(41, 128, 185);
    private final Color COLOR_BACKGROUND = new Color(236, 240, 245);
    private final Color COLOR_CARD = Color.WHITE;
    private final Color COLOR_TEXT = new Color(44, 62, 80);
    private final Color COLOR_SUCCESS = new Color(46, 204, 113);
    
    public Testconvertisseur() {
        initialiserTaux();
        
        setTitle("💱 Convertisseur de Devises & Météo");
        setSize(900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Panel principal avec gradient
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(67, 198, 252),
                    0, getHeight(), new Color(28, 181, 224)
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(null);
        
        // Titre principal
        JLabel titre = new JLabel("💱 Convertisseur de Devises");
        titre.setFont(new Font("Segoe UI", Font.BOLD, 32));
        titre.setForeground(Color.WHITE);
        titre.setBounds(50, 30, 800, 40);
        mainPanel.add(titre);
        
        // Panel de conversion (carte arrondie)
        JPanel cardConversion = creerCardArrondie();
        cardConversion.setBounds(50, 100, 800, 320);
        cardConversion.setLayout(null);
        
        // Montant
        JLabel lblMontant = new JLabel("Montant:");
        lblMontant.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblMontant.setForeground(COLOR_TEXT);
        lblMontant.setBounds(30, 30, 100, 30);
        cardConversion.add(lblMontant);
        
        txtMontant = new JTextField("100");
        txtMontant.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        txtMontant.setBounds(30, 65, 200, 45);
        txtMontant.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));
        cardConversion.add(txtMontant);
        
        // De (From)
        JLabel lblFrom = new JLabel("De:");
        lblFrom.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblFrom.setForeground(COLOR_TEXT);
        lblFrom.setBounds(280, 30, 100, 30);
        cardConversion.add(lblFrom);
        
        comboFrom = creerComboBoxStylee();
        comboFrom.setBounds(280, 65, 150, 45);
        cardConversion.add(comboFrom);
        
        // Bouton inverser
        btnInverser = creerBoutonCirculaire("⇄");
        btnInverser.setBounds(460, 70, 50, 50);
        btnInverser.addActionListener(e -> inverserDevises());
        cardConversion.add(btnInverser);
        
        // Vers (To)
        JLabel lblTo = new JLabel("Vers:");
        lblTo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTo.setForeground(COLOR_TEXT);
        lblTo.setBounds(540, 30, 100, 30);
        cardConversion.add(lblTo);
        
        comboTo = creerComboBoxStylee();
        comboTo.setSelectedIndex(1);
        comboTo.setBounds(540, 65, 150, 45);
        cardConversion.add(comboTo);
        
        // Bouton convertir
        btnConvertir = creerBoutonPrimaire("💰 Convertir");
        btnConvertir.setBounds(280, 140, 200, 50);
        btnConvertir.addActionListener(e -> convertir());
        cardConversion.add(btnConvertir);
        
        // Résultat
        JLabel lblRes = new JLabel("Résultat:");
        lblRes.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblRes.setForeground(COLOR_TEXT);
        lblRes.setBounds(30, 220, 100, 30);
        cardConversion.add(lblRes);
        
        txtResultat = new JTextField();
        txtResultat.setFont(new Font("Segoe UI", Font.BOLD, 24));
        txtResultat.setForeground(COLOR_SUCCESS);
        txtResultat.setEditable(false);
        txtResultat.setBackground(new Color(245, 251, 255));
        txtResultat.setBounds(30, 255, 730, 50);
        txtResultat.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COLOR_SUCCESS, 2, true),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));
        txtResultat.setHorizontalAlignment(JTextField.CENTER);
        cardConversion.add(txtResultat);
        
        mainPanel.add(cardConversion);
        
        // Panel météo (carte arrondie)
        panelMeteo = creerCardArrondie();
        panelMeteo.setBounds(50, 440, 800, 200);
        panelMeteo.setLayout(null);
        
        JLabel titreMeteo = new JLabel("🌤️ Météo en Temps Réel");
        titreMeteo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titreMeteo.setForeground(COLOR_TEXT);
        titreMeteo.setBounds(30, 20, 400, 30);
        panelMeteo.add(titreMeteo);
        
        lblMeteo = new JLabel("Lomé, Togo");
        lblMeteo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblMeteo.setForeground(new Color(127, 140, 141));
        lblMeteo.setBounds(30, 50, 300, 25);
        panelMeteo.add(lblMeteo);
        
        // Icônes météo avec valeurs réalistes
        lblTemp = creerLabelMeteo(
            String.format("<html><b>🌡️ Température</b><br><font size='5'>%.1f°C</font></html>", 
            28.0 + random.nextDouble() * 6), 30, 90);
        
        lblHumidite = creerLabelMeteo(
            String.format("<html><b>💧 Humidité</b><br><font size='5'>%.0f%%</font></html>", 
            65.0 + random.nextDouble() * 20), 280, 90);
        
        lblVent = creerLabelMeteo(
            String.format("<html><b>💨 Vent</b><br><font size='5'>%.1f km/h</font></html>", 
            10.0 + random.nextDouble() * 15), 530, 90);
        
        panelMeteo.add(lblTemp);
        panelMeteo.add(lblHumidite);
        panelMeteo.add(lblVent);
        
        mainPanel.add(panelMeteo);
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void initialiserTaux() {
        taux = new HashMap<>();
        taux.put("USD", 1.0);
        taux.put("EUR", 0.92);
        taux.put("GBP", 0.79);
        taux.put("JPY", 149.50);
        taux.put("CAD", 1.36);
        taux.put("AUD", 1.53);
        taux.put("CHF", 0.88);
        taux.put("CNY", 7.24);
        taux.put("XOF", 607.50);  // Franc CFA
        taux.put("GHS", 12.05);    // Cedi ghanéen
    }
    
    private JPanel creerCardArrondie() {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Ombre
                g2.setColor(new Color(0, 0, 0, 20));
                g2.fillRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 20, 20);
                
                // Carte blanche
                g2.setColor(COLOR_CARD);
                g2.fillRoundRect(0, 0, getWidth() - 10, getHeight() - 10, 20, 20);
                
                g2.dispose();
            }
        };
    }
    
    private JComboBox<String> creerComboBoxStylee() {
        JComboBox<String> combo = new JComboBox<>(devises);
        combo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        combo.setBackground(Color.WHITE);
        combo.setForeground(COLOR_TEXT);
        combo.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true));
        combo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return combo;
    }
    
    private JButton creerBoutonPrimaire(String texte) {
        JButton btn = new JButton(texte);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btn.setBackground(COLOR_PRIMARY);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(COLOR_SECONDARY);
            }
            public void mouseExited(MouseEvent e) {
                btn.setBackground(COLOR_PRIMARY);
            }
        });
        
        return btn;
    }
    
    private JButton creerBoutonCirculaire(String texte) {
        JButton btn = new JButton(texte) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                if (getModel().isPressed()) {
                    g2.setColor(COLOR_SECONDARY);
                } else if (getModel().isRollover()) {
                    g2.setColor(COLOR_PRIMARY.brighter());
                } else {
                    g2.setColor(COLOR_PRIMARY);
                }
                
                g2.fillOval(0, 0, getWidth(), getHeight());
                g2.setColor(Color.WHITE);
                g2.setFont(new Font("Segoe UI", Font.BOLD, 20));
                FontMetrics fm = g2.getFontMetrics();
                int x = (getWidth() - fm.stringWidth(getText())) / 2;
                int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
                g2.drawString(getText(), x, y);
                
                g2.dispose();
            }
        };
        
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        return btn;
    }
    
    private JLabel creerLabelMeteo(String texte, int x, int y) {
        JLabel lbl = new JLabel(texte);
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lbl.setForeground(COLOR_TEXT);
        lbl.setBounds(x, y, 220, 80);
        lbl.setVerticalAlignment(SwingConstants.TOP);
        return lbl;
    }
    
    private void convertir() {
        try {
            double montant = Double.parseDouble(txtMontant.getText());
            String from = (String) comboFrom.getSelectedItem();
            String to = (String) comboTo.getSelectedItem();
            
            // Conversion via USD comme base
            double montantEnUSD = montant / taux.get(from);
            double resultat = montantEnUSD * taux.get(to);
            
            txtResultat.setText(String.format("%s %s = %s %s", 
                df.format(montant), from, 
                df.format(resultat), to));
            
            // Animation du bouton
            btnConvertir.setBackground(COLOR_SUCCESS);
            Timer timer = new Timer(300, e -> btnConvertir.setBackground(COLOR_PRIMARY));
            timer.setRepeats(false);
            timer.start();
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Veuillez entrer un montant valide!",
                "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void inverserDevises() {
        int tempIndex = comboFrom.getSelectedIndex();
        comboFrom.setSelectedIndex(comboTo.getSelectedIndex());
        comboTo.setSelectedIndex(tempIndex);
        
        // Animation du bouton
        btnInverser.setEnabled(false);
        Timer timer = new Timer(400, e -> btnInverser.setEnabled(true));
        timer.setRepeats(false);
        timer.start();
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> new Testconvertisseur());
    }
}