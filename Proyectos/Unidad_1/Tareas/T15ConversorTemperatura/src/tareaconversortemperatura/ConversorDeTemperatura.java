package tareaconversortemperatura;

import controladores.OyenteConversor;
import javax.swing.JFrame;
import modelos.ConversionesTemperatura;
import vistas.PanelConversor;
import vistas.VistaGeneral;

/**
 *
 * @author Mario Pineda
 */
public class ConversorDeTemperatura {

  /*
  TAREA 15.- Escriba las clases necesarias para diseñar una programa conversor de
  temperaturas que maneje eventos de botón. El usuario debe capturar en un campo
  de texto el valor de los grados y seleccionar con botones la conversión deseada.
   */
  public static void main(String[] args) {

    //Modelo
    ConversionesTemperatura conver = new ConversionesTemperatura();
    //Vista
    PanelConversor panel = new PanelConversor();  //Vista
    //Controlador
    OyenteConversor oyente = new OyenteConversor(conver, panel);
    panel.addEventos(oyente);

    JFrame f = new JFrame("Programa Conversor");
    f.add(panel);
    f.setSize(400, 300);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);

  }

}
