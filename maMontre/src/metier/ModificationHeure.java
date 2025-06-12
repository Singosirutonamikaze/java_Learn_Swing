/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

/**
 *
 * @author yaod
 */
public class ModificationHeure extends Etat{
    
    public ModificationHeure(Montre _montre){
        super(_montre);
    }
    
    @Override
    public void appui2xBouton1() {
    }

    @Override
    public void appui1xBouton1() {
        this.montre.setEtat(new ModificationMinute(this.montre));
    }

    @Override
    public void appui1xBouton2() {
        this.montre.incrementerHeure();
    }
    
}
