/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;

/**
 *
 * @author siruto
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Eleve eleve1 = new Eleve(0, "SIRUTO", "Yao Dieu Donné", 15);
        Eleve eleve2 = new Eleve(2, "SIRUTO", "Yao Dieu Donné", 15);
        Eleve eleve3 = new Eleve(0, "SIRUTO", "Yao Dieu Donné", 15);
        
        System.out.println(eleve1==eleve2);
        System.out.println(eleve1==eleve3);
        System.out.println(eleve2==eleve3);
        
        System.out.println("e1 :" + eleve1.equals(eleve2));
        System.out.println("e2 :" + eleve1.equals(eleve3));
        System.out.println("e3 :" + eleve2.equals(eleve3));
        
        System.out.println(eleve1.hashCode());
        System.out.println(eleve2.hashCode());
        System.out.println(eleve3.hashCode());
        
        System.out.println(" e1 " + System.identityHashCode(eleve1));
        System.out.println(" e2 " + System.identityHashCode(eleve2));
        System.out.println(" e3 " + System.identityHashCode(eleve3));
        //System.out.println(this);
    }

}
