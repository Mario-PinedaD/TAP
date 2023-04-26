package modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mario Pineda
 */
//Para triangulos equiláteros
public class Triangulo extends Figura {

  private int lado;

  public Triangulo(int x, int y, int lado, Color color) {
    super(x, y, color);
    this.lado = lado;

  }

  public Triangulo() {
    this(0, 0, 0, Color.BLACK);
  }

  @Override
  public double getArea() {//Con esto convertimos 60 grados a radianes pq es un triangulo rectángulo
    double h = lado * Math.sin(Math.toRadians(60));
    return (lado * h) / 2;
  }

  @Override
  public void dibujar(Graphics g) {
    double h = lado * Math.sin(Math.toRadians(60));
    double h1 = (lado * Math.tan(Math.toRadians(30))) / 2;
    double h2 = h - h1;

    int cX0 = x - lado / 2;
    int cY0 = (int) (y + h1);
    int cX1 = x + lado / 2;
    int cY1 = cY0;
    int cX2 = x;
    int cY2 = (int) (y - h2);

    int[] cX = {cX0, cX1, cX2};
    int[] cY = {cY0, cY1, cY2};

    g.setColor(color);
    g.fillPolygon(cX, cY, cX.length);
    g.setColor(Color.BLACK);
    g.drawPolygon(cX, cY, cX.length);
  }

  /**
   * @return the color
   */
  public Color getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public double getPerimetro() {
    return lado*3;
  }
}
