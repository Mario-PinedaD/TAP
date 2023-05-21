package tareahabitacion;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class TareaHabitacion {
  
  public static void main(String[] args) {
    JFrame f = new JFrame("Dibujo Habitación");
    PanelDibujo panel = new PanelDibujo();
    
    f.add(panel);
    f.setLocation(100, 100);
    f.setSize(600, 550);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setVisible(true);
  }
  
}
