package component;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author yaod
 */
public class Step extends JPanel implements IStep{
    
    
    private JPanel contentArea = new JPanel();
    private JLabel titleLabel = new JLabel();
    private String buttonTitle;
    private JButton stepButton = new  JButton();
    
    public Step(){
        
        this.setLayout(new BorderLayout());
        JPanel titleArea =  new JPanel();
        this.add(titleArea, BorderLayout.NORTH);
        this.add(contentArea, BorderLayout.CENTER);
        titleArea.add(titleLabel);
    }
          
    
    @Override
    public void setTitle(String title) {
         titleLabel.setText(title);
    }

    @Override
    public void setComponent(JPanel jpanel) {
        this.contentArea = jpanel;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public JPanel getComponent() {
        return null;
    }

    @Override
    public void setButtonTitle(String _buttonTitle) {
       this.stepButton.setText(_buttonTitle);
    }

    @Override
    public String getButtonTitle() {
        return stepButton.getText();
    }

    @Override
    public JButton getStepButton() {
        return stepButton;
    }
    
}
