package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelos.ConversionesTemperatura;
import vistas.PanelConversor;

/**
 *
 * @author Mario Pineda
 */
public class OyenteConversor implements ActionListener {

  public ConversionesTemperatura conv;
  public PanelConversor vista;          //Vista

  public OyenteConversor(ConversionesTemperatura temp, PanelConversor vista) {
    this.conv = temp;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton boton = (JButton) e.getSource();
    double grados = getGrados();

    switch (boton.getName()) {
      case "cf": {
        conv.convertirCF(grados);
        this.actualizarEtiquetas(grados, "Celcius", "Fahrenheit");
        break;
      }
      case "fc": {
        conv.convertirFC(grados);
        this.actualizarEtiquetas(grados, "Fahrenheit", "Celcius");
        break;
      }
      case "ck": {
        conv.convertirCK(grados);
        this.actualizarEtiquetas(grados, "Celcius", "Kelvin");
        break;
      }
      case "kc": {
        conv.convertirKC(grados);
        this.actualizarEtiquetas(grados, "Kelvin", "Celcius");
        break;
      }

    }
  }

  /*    botonCelcius.setName("cf");
    botonFarenjei.setName("fc");
    botonKelvin.setName("ck");
    botonKelvinCelcius.setName("kc");*/
  public void actualizarEtiquetas(double campoGrados, String entradaT, String salidaT) {
    if (Double.isNaN(campoGrados)) {
      vista.setGradosEntrada("");
      vista.setGradosEquivale("");
      vista.setGradosConversion("");
    } else {
      vista.setGradosEntrada(vista.getAreaGrados() + " grados " + entradaT);
      vista.setGradosEquivale("equivale");
      vista.setGradosConversion(String.format("%.2f grados " + salidaT, conv.getRespuesta()));
    }
  }

  public double getGrados() {
    try {
      return Double.parseDouble(vista.getAreaGrados());
    } catch (NumberFormatException e) {
      if ("".equals(vista.getAreaGrados())) {
        JOptionPane.showMessageDialog(vista, "Ingrese valores", "Error", JOptionPane.ERROR_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(vista, "Ingrese numeros", "Error", JOptionPane.ERROR_MESSAGE);
      }
      vista.setAreaGrados("");
      vista.setGradosEntrada("");
      vista.setGradosEquivale("");
      vista.setGradosConversion("");
    }
    return Double.NaN;
  }
}
