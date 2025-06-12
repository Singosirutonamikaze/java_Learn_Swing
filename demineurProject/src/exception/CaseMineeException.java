/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author yaod
 */
public class CaseMineeException extends Exception{

    public CaseMineeException(String message) {
        super(message);
    }
    
    
    public CaseMineeException() {
        this("Case minée dévoilée.");
    }
    
}
