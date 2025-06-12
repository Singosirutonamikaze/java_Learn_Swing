/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package metier;

/**
 *
 * @author yaod
 */
public abstract class Etat {
    
    protected Montre montre;
    
    public abstract void appui2xBouton1();

    public abstract void appui1xBouton1();

    public abstract void appui1xBouton2();
    
    
    public Etat(Montre _montre){
        this.montre = _montre;
    }
    
    public Montre getMontre() {
        return montre;
    }

    public void setMontre(Montre montre) {
        this.montre = montre;
    }
    
    
}
