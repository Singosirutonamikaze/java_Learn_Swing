import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;

public class Wizard extends JPanel {
    private final List<WizardStep> steps = new ArrayList<>();
    private final JButton btnBack = new JButton("Retour");
    private final JButton btnNext = new JButton("Suivant");
    private final JButton btnCancel = new JButton("Annuler");
    private final JButton btnFinish = new JButton("Terminer");
    private final JPanel contentPanel = new JPanel(new CardLayout());
    private final Map<String, Object> data = new HashMap<>();
    
    private int currentStep = 0;
    private WizardListener listener;

    public Wizard(List<WizardStep> steps) {
        this.steps.addAll(steps);
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());
        
        // Configuration des boutons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(btnCancel);
        buttonPanel.add(btnBack);
        buttonPanel.add(btnNext);
        buttonPanel.add(btnFinish);

        // Ajout des étapes
        for (WizardStep step : steps) {
            contentPanel.add(step, step.getTitle());
        }

        add(contentPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Gestion des événements
        btnBack.addActionListener(this::handleBack);
        btnNext.addActionListener(this::handleNext);
        btnCancel.addActionListener(e -> fireWizardCancelled());
        btnFinish.addActionListener(e -> fireWizardCompleted());

        updateButtons();
        showStep(0);
    }

    private void handleBack(ActionEvent e) {
        if (currentStep > 0) {
            showStep(currentStep - 1);
        }
    }

    private void handleNext(ActionEvent e) {
        if (steps.get(currentStep).validateStep()) {
            steps.get(currentStep).commit(data);
            if (currentStep < steps.size() - 1) {
                showStep(currentStep + 1);
            }
        }
    }

    private void showStep(int stepIndex) {
        currentStep = stepIndex;
        CardLayout cl = (CardLayout)(contentPanel.getLayout());
        cl.show(contentPanel, steps.get(stepIndex).getTitle());
        updateButtons();
    }

    private void updateButtons() {
        btnBack.setEnabled(currentStep > 0);
        btnNext.setEnabled(currentStep < steps.size() - 1);
        btnFinish.setEnabled(currentStep == steps.size() - 1);
    }

    private void fireWizardCancelled() {
        if (listener != null) {
            listener.onWizardCancelled();
        }
    }

    private void fireWizardCompleted() {
        if (listener != null && steps.get(currentStep).validateStep()) {
            steps.get(currentStep).commit(data);
            listener.onWizardCompleted(data);
        }
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    // Interface pour les écouteurs
    public interface WizardListener {
        void onWizardCompleted(Map<String, Object> data);
        void onWizardCancelled();
    }

    public void setWizardListener(WizardListener listener) {
        this.listener = listener;
    }

    // Classe abstraite pour les étapes du wizard
    public static abstract class WizardStep extends JPanel {
        public abstract String getTitle();
        public abstract boolean validateStep();
        public abstract void commit(Map<String, Object> data);
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wizard Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        List<WizardStep> steps = new ArrayList<>();
        steps.add(new Step1());
        steps.add(new Step2());
        steps.add(new Step3());

        Wizard wizard = new Wizard(steps);
        wizard.setWizardListener(new Wizard.WizardListener() {
            @Override
            public void onWizardCompleted(Map<String, Object> data) {
                JOptionPane.showMessageDialog(frame, "Wizard terminé!\n" + data);
                frame.dispose();
            }

            @Override
            public void onWizardCancelled() {
                JOptionPane.showMessageDialog(frame, "Wizard annulé!");
                frame.dispose();
            }
        });

        frame.add(wizard);
        frame.setVisible(true);
    }

    // Exemple d'étape
    static class Step1 extends WizardStep {
        private final JTextField nameField = new JTextField(20);

        @Override
        public String getTitle() { return "Étape 1 - Information"; }

        @Override
        public boolean validateStep() { 
            return !nameField.getText().trim().isEmpty(); 
        }

        @Override
        public void commit(Map<String, Object> data) { 
            data.put("name", nameField.getText());
        }

        public Step1() {
            setLayout(new BorderLayout());
            add(new JLabel("Entrez votre nom:"), BorderLayout.NORTH);
            add(nameField, BorderLayout.CENTER);
        }
    }

    static class Step2 extends WizardStep {
        private final JTextField emailField = new JTextField(20);

        @Override
        public String getTitle() { return "Étape 2 - Email"; }

        @Override
        public boolean validateStep() { 
            return emailField.getText().contains("@"); 
        }

        @Override
        public void commit(Map<String, Object> data) { 
            data.put("email", emailField.getText());
        }

        public Step2() {
            setLayout(new BorderLayout());
            add(new JLabel("Entrez votre email:"), BorderLayout.NORTH);
            add(emailField, BorderLayout.CENTER);
        }
    }

    static class Step3 extends WizardStep {
        private final JTextField phoneField = new JTextField(20);

        @Override
        public String getTitle() { return "Étape 3 - Téléphone"; }

        @Override
        public boolean validateStep() { 
            return phoneField.getText().matches("\\d{10}"); 
        }

        @Override
        public void commit(Map<String, Object> data) { 
            data.put("phone", phoneField.getText());
        }

        public Step3() {
            setLayout(new BorderLayout());
            add(new JLabel("Entrez votre numéro de téléphone:"), BorderLayout.NORTH);
            add(phoneField, BorderLayout.CENTER);
        }
    }

    
}