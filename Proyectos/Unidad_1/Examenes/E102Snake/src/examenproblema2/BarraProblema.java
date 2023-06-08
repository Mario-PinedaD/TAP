/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenproblema2;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Mario Pineda
 */
public class BarraProblema extends JMenuBar {

  public BarraProblema() {
    addMenu();
  }
  
  private void addMenu() {
    JMenu game = new JMenu("Game");
    JMenuItem wea = new JMenuItem("JAJAEKISDE");
    game.add(wea);
    add(game);
    
    JMenu help = new JMenu("Help");
    add(help);
  }
  
}
