/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author siruto
 */
public class Eleve {
    
    private int id;
    private String nom; 
    private String prenom; 
    private int age; 
    //private int x =this.id;

    public Eleve() {
    }

    public Eleve(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//Comparaison de la reférence des deux objets
            return true;
        }
        
        if (obj == null) {//Eviter NullPointerException
            return false;
        }
        
        if (getClass() != obj.getClass()) {//Eviter ClassCastException
            return false;
        }
        
        final Eleve other = (Eleve) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Eleve : " + "id = " + id + ", nom = " + nom + ", prenom = " + prenom + ", age = " + age + '\n';
    }
    
}
