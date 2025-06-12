/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

/**
 *
 * @author yaod
 */
public class Montre {

    private Etat etat;
    private int heure;
    private int minute;
    private int seconde;

    public Montre() {
        this.etat = new Affichage(this);
        this.etat.setMontre(this);
    }

    public void appui2xBouton1() {
        this.etat.appui2xBouton1();
    }

    public void appui1xBouton1() {
        //System.out.println("bouton 1 : classe Montre");
        this.etat.appui1xBouton1();
    }

    public void appui1xBouton2() {
        this.etat.appui1xBouton2();
    }

    public void incrementerHeure() {
        this.heure = this.heure + 1;
        System.out.println("Heure ++");
    }

    public void incrementerMinute() {
        this.minute = this.minute + 1;
        System.out.println("Minute ++");
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconde() {
        return seconde;
    }

    public void setSeconde(int seconde) {
        this.seconde = seconde;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return heure + " : " + minute + " : " + seconde;
    }

}
