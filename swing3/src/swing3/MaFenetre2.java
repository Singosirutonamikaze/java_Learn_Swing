/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing3;

import java.awt.CardLayout;
import java.awt.Container;

/**
 *
 * @author yaod
 */
public class MaFenetre2 extends MaFenetre{
    
    
    public MaFenetre2(){
        super();
        Container container = this.getContentPane();
        CardLayout card = new CardLayout();
        container.setLayout(card);
        container.add(regionCentrale);
        container.add(regionAustrale);
        container.add(regionOccidentale);
        container.add(regionOrientale);
        container.add(regionSeptentrionale);
        
        card.next(container);
        card.next(container);
        card.next(container);
        card.previous(container);
        
        
    }
           
}
