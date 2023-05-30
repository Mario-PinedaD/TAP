package tarea;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class TareaGrid {

  public static void main(String[] args) {
    
    JFrame f = new JFrame("Ventana con GridLayaout");
    PanelContenedor panel = new PanelContenedor();
    
    f.add(panel);
    f.setSize(500, 200);
    f.setLocation(100,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setVisible(true);
  }
  
}
