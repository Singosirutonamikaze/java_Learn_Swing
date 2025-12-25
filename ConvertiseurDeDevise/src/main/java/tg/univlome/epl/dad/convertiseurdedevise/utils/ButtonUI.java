/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.convertiseurdedevise.utils;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author siruto
 */
public class ButtonUI extends JButton{

    public ButtonUI() {
    }

    public ButtonUI(Icon icon) {
        super(icon);
    }

    public ButtonUI(String text) {
        super(text);
    }

    public ButtonUI(Action a) {
        super(a);
    }

    public ButtonUI(String text, Icon icon) {
        super(text, icon);
    }
    
}
