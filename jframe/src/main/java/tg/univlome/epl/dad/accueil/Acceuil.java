/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tg.univlome.epl.dad.accueil;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author siruto
 */
public class Acceuil extends JFrame { // Correction: "acceuil" -> "Acceuil" (nom de classe)

    private JPanel contentPane;
    private JTextField txtReservation; // Correction orthographique
    private JTextField txtClients;
    private JTextField txtDisponibilite; // Correction orthographique
    private JTextField txtVersements;
    private JTextField txtCharges;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Acceuil frame = new Acceuil(); // Correction: "Ajout" -> "Acceuil"
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Acceuil() { // Correction: "acceuil" -> "Acceuil" (constructeur)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1450, 900);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setToolTipText("");
        panel.setBackground(new Color(255, 255, 255));
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(10, 11, 1340, 669);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton = new JButton("");
        // Note: Vous devrez ajuster le chemin de l'image selon votre structure
        btnNewButton.setIcon(new ImageIcon(Acceuil.class.getResource("/images/reservation-en-ligne-1.png")));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Acceuil.this.setVisible(false);
                // Ajout a; - Commenté car la classe Ajout n'est pas définie ici
                // Implémentez votre logique pour ouvrir le formulaire de réservation
                try {
                    // a = new Ajout();
                    // a.setVisible(true);
                    // a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    JOptionPane.showMessageDialog(Acceuil.this, "Ouvrir formulaire réservation");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnNewButton.setBackground(Color.CYAN);
        btnNewButton.setBorder(new LineBorder(Color.CYAN));
        btnNewButton.setBounds(376, 129, 258, 153);
        panel_1.add(btnNewButton);

        JButton btnListeDesReservation = new JButton("");
        btnListeDesReservation.setIcon(new ImageIcon(Acceuil.class.getResource("/images/service-client.png")));
        btnListeDesReservation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Liste a; - Commenté car la classe Liste n'est pas définie ici
                // a = new Liste();
                // a.setVisible(true);
                // a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Acceuil.this.setVisible(false);
                JOptionPane.showMessageDialog(Acceuil.this, "Ouvrir liste des locataires");
            }
        });
        btnListeDesReservation.setBounds(668, 129, 258, 153);
        btnListeDesReservation.setBackground(new Color(188, 162, 191));
        btnListeDesReservation.setBorder(new LineBorder(new Color(188, 162, 191)));
        panel_1.add(btnListeDesReservation);

        JButton btnCharge = new JButton("");
        btnCharge.setIcon(new ImageIcon(Acceuil.class.getResource("/images/charge.png")));
        btnCharge.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // charge a; - Commenté car la classe charge n'est pas définie ici
                // a = new charge();
                // a.setVisible(true);
                // a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Acceuil.this.setVisible(false);
                JOptionPane.showMessageDialog(Acceuil.this, "Ouvrir gestion des charges");
            }
        });
        btnCharge.setBounds(265, 357, 258, 153);
        btnCharge.setBackground(new Color(249, 133, 35));
        btnCharge.setBorder(new LineBorder(new Color(205, 92, 92)));
        panel_1.add(btnCharge);

        JButton btnDisponibilite = new JButton(""); // Correction: "btnDisponiilite" -> "btnDisponibilite"
        btnDisponibilite.setIcon(new ImageIcon(Acceuil.class.getResource("/images/disponible96.png")));
        btnDisponibilite.setBounds(870, 357, 258, 153);
        btnDisponibilite.setBackground(new Color(50, 184, 73));
        btnDisponibilite.setBorder(new LineBorder(new Color(50, 184, 73)));
        btnDisponibilite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // caltest a; - Commenté car la classe caltest n'est pas définie ici
                try {
                    // a = new caltest();
                    // a.setVisible(true);
                    // a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    Acceuil.this.setVisible(false);
                    JOptionPane.showMessageDialog(Acceuil.this, "Ouvrir calendrier de disponibilité");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel_1.add(btnDisponibilite);

        JButton btnVersement = new JButton("");
        btnVersement.setIcon(new ImageIcon(Acceuil.class.getResource("/images/jour-de-paiement (1)-1.png")));
        btnVersement.setBackground(new Color(255, 255, 51));
        btnVersement.setBorder(new LineBorder(new Color(255, 255, 51)));
        btnVersement.setBounds(566, 357, 258, 153);
        btnVersement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // listeVersement ls = new listeVersement(); - Commenté
                Acceuil.this.setVisible(false);
                // ls.setVisible(true);
                // ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
                JOptionPane.showMessageDialog(Acceuil.this, "Ouvrir gestion des versements");
            }
        });
        panel_1.add(btnVersement);

        txtReservation = new JTextField(); // Correction: "txtRservation" -> "txtReservation"
        txtReservation.setHorizontalAlignment(SwingConstants.CENTER);
        txtReservation.setBackground(Color.WHITE);
        txtReservation.setEditable(false);
        txtReservation.setBorder(new LineBorder(Color.CYAN));
        txtReservation.setForeground(Color.CYAN);
        txtReservation.setFont(new Font("Tahoma", Font.PLAIN, 21));
        txtReservation.setText("Réservation");
        txtReservation.setBounds(376, 282, 258, 36);
        panel_1.add(txtReservation);
        txtReservation.setColumns(10);

        txtClients = new JTextField();
        txtClients.setHorizontalAlignment(SwingConstants.CENTER);
        txtClients.setBackground(Color.WHITE);
        txtClients.setEditable(false);
        txtClients.setText("Locataires");
        txtClients.setForeground(new Color(188, 162, 191));
        txtClients.setFont(new Font("Tahoma", Font.PLAIN, 21));
        txtClients.setColumns(10);
        txtClients.setBorder(new LineBorder(new Color(188, 162, 191)));
        txtClients.setBounds(668, 282, 258, 36);
        panel_1.add(txtClients);

        txtDisponibilite = new JTextField(); // Correction: "txtDisponibilit" -> "txtDisponibilite"
        txtDisponibilite.setHorizontalAlignment(SwingConstants.CENTER); // Ajouté pour centrer le texte
        txtDisponibilite.setBackground(Color.WHITE);
        txtDisponibilite.setEditable(false);
        txtDisponibilite.setText("Disponibilité"); // Correction: texte simplifié
        txtDisponibilite.setForeground(new Color(50, 184, 73));
        txtDisponibilite.setFont(new Font("Tahoma", Font.PLAIN, 21));
        txtDisponibilite.setColumns(10);
        txtDisponibilite.setBorder(new LineBorder(new Color(50, 184, 73)));
        txtDisponibilite.setBounds(870, 508, 258, 36);
        panel_1.add(txtDisponibilite);

        txtVersements = new JTextField();
        txtVersements.setHorizontalAlignment(SwingConstants.CENTER);
        txtVersements.setBackground(Color.WHITE);
        txtVersements.setEditable(false);
        txtVersements.setText("Versements");
        txtVersements.setForeground((new Color(255, 255, 51)));
        txtVersements.setFont(new Font("Tahoma", Font.PLAIN, 21));
        txtVersements.setColumns(10);
        txtVersements.setBorder(new LineBorder((new Color(255, 255, 51))));
        txtVersements.setBounds(566, 508, 258, 36);
        panel_1.add(txtVersements);

        txtCharges = new JTextField();
        txtCharges.setHorizontalAlignment(SwingConstants.CENTER);
        txtCharges.setBackground(Color.WHITE);
        txtCharges.setEditable(false);
        txtCharges.setText("Charges");
        txtCharges.setForeground(new Color(249, 133, 35));
        txtCharges.setFont(new Font("Tahoma", Font.PLAIN, 21));
        txtCharges.setColumns(10);
        txtCharges.setBorder(new LineBorder(new Color(249, 133, 35)));
        txtCharges.setBounds(265, 508, 258, 36);
        panel_1.add(txtCharges);

        JLabel heure = new JLabel("");
        heure.setHorizontalAlignment(SwingConstants.CENTER); // Ajouté pour centrer
        heure.setForeground(new Color(52, 102, 0));
        heure.setFont(new Font("Tahoma", Font.PLAIN, 33));
        heure.setBounds(265, 11, 206, 67);
        panel_1.add(heure);

        JLabel date = new JLabel("");
        date.setHorizontalAlignment(SwingConstants.CENTER); // Ajouté pour centrer
        date.setForeground(new Color(52, 102, 0));
        date.setFont(new Font("Tahoma", Font.PLAIN, 33));
        date.setBounds(49, 11, 206, 67);
        panel_1.add(date);

        // Thread pour l'horloge
        Thread clock = new Thread() {
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    date.setText(day + "/" + (month + 1) + "/" + year);

                    int m = cal.get(Calendar.MINUTE);
                    int h = cal.get(Calendar.HOUR_OF_DAY);
                    heure.setText(h + "h" + (m < 10 ? "0" : "") + m); // Format amélioré

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, e);
                        e.printStackTrace();
                    }
                }
            }
        };
        clock.start();
    }
}