package menus;

import javax.swing.*;

/**
 *
 * @author Mario Pineda
 */
public class Menus {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame ("Ventaja con barras de menús");
    BarraMenu barra = new BarraMenu();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setJMenuBar(barra);
    
    f.setVisible(true);
  }
  
  
  
}
