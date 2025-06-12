/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package component;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author yaod
 */
public interface IStep {
    
    public void setTitle(String title);
    
    public void setButtonTitle(String buttonTitle);
    
    public void setComponent(JPanel jpanel);
    
    public String getTitle();
    
    public JPanel getComponent();
    
    public String getButtonTitle();
    
    public JButton getStepButton();
    
    
}
