package paneles;

import javax.swing.*;
import util.Ambiente;

/**
 *
 * @author Mario Pineda
 */

public class Paneles {
  
  public static void main(String[] args) {
    Ambiente.setAmbiente("Nimbus");
    JFrame f = new JFrame("Ventana con paneles");
    BarraConImagenes barra = new BarraConImagenes(); //Barra de menús
    PanelMezclado panel = new PanelMezclado();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.setJMenuBar(barra);
    f.setContentPane(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setVisible(true);
  }
  
  
  
}
