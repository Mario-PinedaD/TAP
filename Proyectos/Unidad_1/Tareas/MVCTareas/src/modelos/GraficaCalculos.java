package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import util.Archivo;

/**
 *
 * @author Mario Pineda
 */
public class GraficaCalculos  {

  private int segmentos;
  private double[] datos;
  private double suma;

  public GraficaCalculos() {
    this.segmentos = 0;
    datos = new double[0];
  }

  public GraficaCalculos(int segmentos) {
    this.segmentos = segmentos;
    datos = new double[segmentos - 1];
  }

  public void llenarDatos(int[] datos) {
    for (int i = 0; i < datos.length; i++) {
      this.datos[i] = datos[i];
      suma += this.datos[i];
    }
  }

  public void llenarDatos(ArrayList<String> datos) {
    for (int i = 0; i < datos.size() - 1; i++) {
      this.datos[i] = Double.parseDouble(datos.get(i));
    }
  }

}
