/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api;

import java.util.List;

/**
 *
 * @author yaod
 */
public interface WizardInterface {
    
    public void addStep(StepInterface step);
    public void removeStep(StepInterface step);
    public void removeStep(int index);
    public void first();
    public void last();
    public void next();
    public void previous();
    public StepInterface getCurrentStep();
    public List<StepInterface> getAllSteps();
}
