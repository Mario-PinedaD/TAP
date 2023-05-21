package circulojslider;

import controladores.OyenteJSlider;
import javax.swing.JFrame;
import modelos.CalculosCirculos;
import vistas.PanelCirculoSlider;

/**
 *
 * @author Mario Pineda
 */
public class CirculoJSlider {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    CalculosCirculos modelo = new CalculosCirculos();//Modelo
    PanelCirculoSlider panel = new PanelCirculoSlider();//Vista
    OyenteJSlider oyente = new OyenteJSlider(modelo, panel);//Controlador
    
    JFrame f = new JFrame("Ventana Circulo Slider");
    panel.addEventos(oyente);
    f.add(panel);
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  
}
