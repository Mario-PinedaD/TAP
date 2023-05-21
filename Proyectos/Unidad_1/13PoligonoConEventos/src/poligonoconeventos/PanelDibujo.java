package poligonoconeventos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujo extends JPanel {

  private int lados; //Nueva variable para poder decirle cuants lados tiene

  public PanelDibujo() {
    setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int ancho = this.getWidth();
    int alto = this.getHeight();
    int radio = Math.min(ancho, alto) / 2 - 30;

    g.translate(ancho / 2, alto / 2);//Colocamos el origen en el centro del panel
    g.drawOval(-radio, -radio, 2 * radio, 2 * radio); //Dibujamos el circulo

    if (lados > 2) {
      double angulo = 2 * Math.PI / lados;

      int[] x = new int[lados];
      int[] y = new int[lados];

      //Guardamos los puntos del polígono dentro de los arreglos
      for (int i = 0; i < lados; i++) {
        x[i] = (int) (radio * Math.cos(angulo * i));
        y[i] = (int) (radio * Math.sin(angulo * i));
      }
      g.fillPolygon(x, y, lados);
    }

  }

//Devolver lados
  public int getLados() {
    return lados;
  }

//Poner lados
  public void setLados(int lados) {
    this.lados = lados;
  }
}
