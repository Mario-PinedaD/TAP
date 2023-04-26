package manejocirculos;

import java.awt.Color;
import java.util.Locale;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class ManejoCirculos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Circulos circulos = new Circulos();                            //Modelo
    circulos.add(new Circulo(300, 400, 50, Color.BLUE)); //Creamos Nuevos Eventos
    
    PanelDibujable panel = new PanelDibujable(circulos);     //Vista
    
    OyenteCirculos oyente = new OyenteCirculos(circulos,panel);    //Controlador
    panel.addEventos(oyente);
    
    JFrame f = new JFrame("Manejo De Circulos");
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.add(panel);                                             //añadimos el panel
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }
  


}
