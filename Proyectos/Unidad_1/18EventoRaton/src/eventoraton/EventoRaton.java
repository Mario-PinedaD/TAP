package eventoraton;

import controladores.OyenteRaton;
import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class EventoRaton {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Circulo modelo = new Circulo(300, 350, 200, Color.BLUE);    //Modelo
    PanelDibujable panel = new PanelDibujable(modelo);                  //Vista
    JFrame f = new JFrame("Eventos de teclado");
    OyenteRaton oyente = new OyenteRaton(modelo,panel);//Controlador

    panel.addEventos(oyente);                                                  //Registro
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);

  }

}
