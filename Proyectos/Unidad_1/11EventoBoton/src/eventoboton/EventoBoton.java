package eventoboton;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class EventoBoton {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame("Botones");
    PanelEventoBoton panel = new PanelEventoBoton();    //Panel
    OyenteEventoBoton oyente = new OyenteEventoBoton(panel); //Oyente
    panel.addEventos(oyente);                           //Registro
    
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
