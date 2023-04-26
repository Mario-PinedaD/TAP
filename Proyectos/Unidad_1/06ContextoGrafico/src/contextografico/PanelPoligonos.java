package contextografico;

import javax.swing.JPanel;
import java.awt.Graphics;
import static java.awt.Color.*;

/**
 *
 * @author Mario Pineda
 */
public class PanelPoligonos extends JPanel {

  public PanelPoligonos() {
    setBackground(WHITE);

  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int[] x1 = {50, 140, 160, 120, 100, 45};
    int[] y1 = {50, 100, 120, 190, 190, 60};
    g.drawPolygon(x1, y1, 4); // El ultimo parámetro podrá la cantidad de puntos que se trazarán
    //En caso de que sea mayor  a la cantidad de puntos no funciona

    int[] x3 = new int[x1.length];
    int[] y3 = new int[y1.length];
    int incX = 200;
    int incY = 100;
    for (int i = 0; i < x3.length; i++) {
      x3[i] = x1[i] + incX;
      y3[i] = y1[i] + incY;
    }
    g.setColor(BLUE);
    g.fillPolygon(x3, y3, x3.length);

    incX = 200;
    incY = 300;

    int[] x2 = {incX + 50, incX + 140, incX + 160, incX + 120, incX + 100, incX + 45};
    int[] y2 = {incY + 50, incY + 100, incY + 120, incY + 190, incY + 190, incY + 60};
    g.setColor(RED);
    g.drawPolyline(x2, y2, x2.length);//El polyline no une las lineas del polígono
  }

}
