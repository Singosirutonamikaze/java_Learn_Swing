/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author yaod
 */
public class CaseMarqueeException extends Exception{
        
    public CaseMarqueeException(String message) {
        super(message);
    }
    
    
    public CaseMarqueeException() {
        this("Impossible de dévoiler une case marquée.");
    }
    
}
