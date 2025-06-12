/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing4;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author yaod
 */
public class Page3 extends Page{
     public Page3(){
        super();
        ajouterTitre("Page 3");
        
        JLabel content = new JLabel("Contenu de la page 3");
        content.setFont(new Font("Roboto", Font.PLAIN, 16));
        getPageContent().add(content, BorderLayout.CENTER);
        
        NouveauButton nouveauButton = new NouveauButton("Exemple 3");
        getPageContent().add(nouveauButton);
     }
}
