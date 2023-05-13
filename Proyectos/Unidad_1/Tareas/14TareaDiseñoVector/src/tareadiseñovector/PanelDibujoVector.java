package tareadiseñovector;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujoVector extends JPanel {

  public PanelDibujoVector() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xPanel = getWidth();
    int yPanel = getHeight();
    int xMitad = xPanel / 2;
    int yMitad = yPanel / 2;

    g.setColor(Color.BLACK);
    //Recta Pa arriba
    g.fillRect(80, 40, 2, yPanel - 90);
    //Recta pa la derecha
    g.fillRect(20, yPanel - 120, xPanel - 250, 2);
    //Recta diagonal
    g.drawLine(80, yPanel - 120, xMitad, yMitad - 110);

    //Lineas punteadas
    int xLin = xMitad;
    int yLin = yMitad - 110;

    //Horizontales
    for (int x1 = 80; x1 < xLin; x1 += 20) {
      g.drawLine(x1, yLin, x1 + 10, yLin);
    }
    //Verticales
    for (int y1 = yPanel - 120; y1 > yLin; y1 -= 20) {
      g.drawLine(xLin, y1, xLin, y1 - 10);
    }

    //Flechitas
    //Flecha superior
    int[] xFle1 = {80, 90, 70};
    int[] yFle1 = {35, 60, 60};
    g.fillPolygon(xFle1, yFle1, xFle1.length);
    //Flecha inferior
    int[] xFle2 = {xPanel - 230, xPanel - 210, xPanel - 230};
    int[] yFle2 = {yPanel - 110, yPanel - 120, yPanel - 130};
    g.fillPolygon(xFle2, yFle2, xFle2.length);
    //Flecha negra
    int[] xFle5 = {xMitad - 30, xMitad, xMitad - 15};
    int[] yFle5 = {yMitad - 100, yMitad - 110, yMitad - 80};
    g.fillPolygon(xFle5, yFle5, xFle5.length);

    //Texto
    Font f1 = new Font("Times New Roman", Font.BOLD, 50);
    g.setFont(f1);
    g.drawString("F", 150, yPanel - 230);
    g.drawString("θ", 190, yPanel - 150);
    g.drawString("Fy = F sen θ", xMitad + 10, yMitad + 50);

    g.drawString("Fx = F cos θ", xMitad / 4, yPanel - 50);

    //Arco
    g.drawArc(90, yPanel - 170, 100, 100, 0, 90);

    //Color rojo
    g.setColor(Color.RED);
    //Recta pa arriba
    g.fillRect(80, yMitad - 100, 2, yPanel - 120 - (yMitad - 100));
    //Recta pa la derecha
    g.fillRect(80, yPanel - 120, xMitad - 80, 2);

    //Flechitas
    //Flecha superior
    int[] xFle3 = {80, 90, 70};//Se quedan iguales
    int[] yFle3 = {yMitad - 110, yMitad - 80, yMitad - 80};
    g.fillPolygon(xFle3, yFle3, xFle3.length);
    //Flecha inferior
    int[] xFle4 = {xMitad - 30, xMitad, xMitad - 30};
    int[] yFle4 = {yPanel - 110, yPanel - 120, yPanel - 130};//Se quedan iguales
    g.fillPolygon(xFle4, yFle4, xFle4.length);

  }
}
