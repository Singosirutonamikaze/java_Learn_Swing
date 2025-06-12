/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author yaod
 */
public class Page4 extends Page{
     public Page4(){
        super();
        ajouterTitre("Etape 4");
        
        JLabel content = new JLabel("Quatrième étape !");
        content.setFont(new Font("Roboto", Font.BOLD, 16));
        getPageContent().add(content, BorderLayout.CENTER);
        getPageContent().setBackground(new Color( 250, 219, 216 ));
     }
}
