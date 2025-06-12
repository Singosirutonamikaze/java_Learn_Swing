/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionevenement;

/**
 *
 * @author yaod
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mafenetre f1 = new Mafenetre();
       f1.setVisible(true);
       
    }
    
    public static void text() {
        IVehicule v1 = new Voiture();
        v1.accelerer();
        
        IVehicule v2 = new Moto();
        v2.accelerer();
        
        
        IVehicule v3 =  new IVehicule() {
            @Override
            public void accelerer() {
                System.out.println("Battre les ailes");  
            }
        };
        
        v3.accelerer();
    }
    
    
}
