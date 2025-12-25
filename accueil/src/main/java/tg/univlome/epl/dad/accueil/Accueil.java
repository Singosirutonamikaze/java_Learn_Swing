/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tg.univlome.epl.dad.accueil;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
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
public class Accueil extends JFrame {

    private JPanel contentPane;
    private JTextField txtReservation;
    private JTextField txtClients;
    private JTextField txtDisponibilite;
    private JTextField txtVersements;
    private JTextField txtCharges;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        // Suppression du LookAndFeel JTattoo qui cause l'erreur
        // Utilisation du LookAndFeel par défaut du système
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Accueil frame = new Accueil();
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
    public Accueil() {
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

        // Bouton Réservation sans image
        JButton btnReservation = new JButton("RÉSERVATION");
        btnReservation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Accueil.this.setVisible(false);
                JOptionPane.showMessageDialog(Accueil.this, "Ouvrir formulaire réservation");
            }
        });
        btnReservation.setBackground(Color.CYAN);
        btnReservation.setForeground(Color.WHITE);
        btnReservation.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnReservation.setBorder(new LineBorder(Color.CYAN));
        btnReservation.setBounds(376, 129, 258, 153);
        panel_1.add(btnReservation);

        // Bouton Locataires sans image
        JButton btnLocataires = new JButton("LOCATAIRES");
        btnLocataires.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Accueil.this.setVisible(false);
                JOptionPane.showMessageDialog(Accueil.this, "Ouvrir liste des locataires");
            }
        });
        btnLocataires.setBounds(668, 129, 258, 153);
        btnLocataires.setBackground(new Color(188, 162, 191));
        btnLocataires.setForeground(Color.WHITE);
        btnLocataires.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnLocataires.setBorder(new LineBorder(new Color(188, 162, 191)));
        panel_1.add(btnLocataires);

        // Bouton Charges sans image
        JButton btnCharge = new JButton("CHARGES");
        btnCharge.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Accueil.this.setVisible(false);
                JOptionPane.showMessageDialog(Accueil.this, "Ouvrir gestion des charges");
            }
        });
        btnCharge.setBounds(265, 357, 258, 153);
        btnCharge.setBackground(new Color(249, 133, 35));
        btnCharge.setForeground(Color.WHITE);
        btnCharge.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnCharge.setBorder(new LineBorder(new Color(205, 92, 92)));
        panel_1.add(btnCharge);

        // Bouton Disponibilité sans image
        JButton btnDisponibilite = new JButton("DISPONIBILITÉ");
        btnDisponibilite.setBounds(870, 357, 258, 153);
        btnDisponibilite.setBackground(new Color(50, 184, 73));
        btnDisponibilite.setForeground(Color.WHITE);
        btnDisponibilite.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnDisponibilite.setBorder(new LineBorder(new Color(50, 184, 73)));
        btnDisponibilite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Accueil.this.setVisible(false);
                    JOptionPane.showMessageDialog(Accueil.this, "Ouvrir calendrier de disponibilité");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel_1.add(btnDisponibilite);

        // Bouton Versements sans image
        JButton btnVersement = new JButton("VERSEMENTS");
        btnVersement.setBackground(new Color(255, 255, 51));
        btnVersement.setForeground(Color.BLACK);
        btnVersement.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnVersement.setBorder(new LineBorder(new Color(255, 255, 51)));
        btnVersement.setBounds(566, 357, 258, 153);
        btnVersement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Accueil.this.setVisible(false);
                JOptionPane.showMessageDialog(Accueil.this, "Ouvrir gestion des versements");
            }
        });
        panel_1.add(btnVersement);

        // Labels textuels pour chaque section
        txtReservation = new JTextField();
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

        txtDisponibilite = new JTextField();
        txtDisponibilite.setHorizontalAlignment(SwingConstants.CENTER);
        txtDisponibilite.setBackground(Color.WHITE);
        txtDisponibilite.setEditable(false);
        txtDisponibilite.setText("Disponibilité");
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

        // Affichage de l'heure
        JLabel heure = new JLabel("");
        heure.setHorizontalAlignment(SwingConstants.CENTER);
        heure.setForeground(new Color(52, 102, 0));
        heure.setFont(new Font("Tahoma", Font.PLAIN, 33));
        heure.setBounds(265, 11, 206, 67);
        panel_1.add(heure);

        // Affichage de la date
        JLabel date = new JLabel("");
        date.setHorizontalAlignment(SwingConstants.CENTER);
        date.setForeground(new Color(52, 102, 0));
        date.setFont(new Font("Tahoma", Font.PLAIN, 33));
        date.setBounds(49, 11, 206, 67);
        panel_1.add(date);

        // Thread pour l'horloge en temps réel
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
                    heure.setText(h + "h" + (m < 10 ? "0" : "") + m);

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, e);
                        e.printStackTrace();
                    }
                }
            }
        };
        clock.start();
    }
}