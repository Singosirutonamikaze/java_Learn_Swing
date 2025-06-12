package listederoulante;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;



public class ListeDeroulante extends JFrame {
    private JComboBox<String> comboNiveaux;
    private JLabel labelSelection;

    public ListeDeroulante() {
        super("Exemple de Liste déroulante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 150);
        setLocationRelativeTo(null);

        // 1. Créer le JComboBox avec les éléments à afficher
        String[] niveaux = { "Débutant", "Intermédiaire", "Avancé", "Supérieur" };
        comboNiveaux = new JComboBox<>(niveaux);
        comboNiveaux.setSelectedIndex(0); // position par défaut

        // Option : rendre la liste modifiable par l'utilisateur
        // comboNiveaux.setEditable(true);

        // 2. Ajouter un listener pour réagir au changement de sélection
        comboNiveaux.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selection = (String) comboNiveaux.getSelectedItem();
                labelSelection.setText("Niveau sélectionné : " + selection);
            }
        });

        // 3. Un label pour afficher la sélection en temps réel
        labelSelection = new JLabel("Niveau sélectionné : " + comboNiveaux.getSelectedItem());

        // 4. Ajouter les composants à la fenêtre
        add(new JLabel("Choisissez un niveau :"));
        add(comboNiveaux);
        add(labelSelection);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Toujours lancer l’interface Swing dans l’EDT
        SwingUtilities.invokeLater(() -> new ListeDeroulante());
    }
}
