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
public class GraficaCalculos extends JPanel {

  private int segmentos;
  private double[] datos;
  private double suma;

  public GraficaCalculos() {
    this.segmentos = 0;
    datos = new double[0];
    setBackground(Color.CYAN);
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

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    int radio = Math.min(ancho / 2, alto / 2);
    g.translate(ancho / 2, alto / 2);
    int anguloInicial = 0;

    for (int i = 0; i < datos.length; i++) {
      int rojo = (int) (Math.random() * 256);
      int verde = (int) (Math.random() * 256);
      int azul = (int) (Math.random() * 256);
      Color colorRandom = new Color(rojo, verde, azul);//Nuevo color
      g.setColor(colorRandom);
      int angulos = (int) ((360 * datos[i]) / suma); //Obtenemos los segmentos en los q vamos a dividir la grafica
      g.fillArc(0, 0, radio * 2, radio * 2, anguloInicial, angulos * i);
      anguloInicial = angulos * i;
    }
    g.setColor(Color.red);
  }

}
