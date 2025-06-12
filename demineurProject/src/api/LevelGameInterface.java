/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api;

/**
 *
 * @author yaod
 */
public interface LevelGameInterface {

    public boolean isLoser();

    public boolean isWinner();
    
    public void addLevel();
    
    public GridInterface getCurrentGrid();
}
