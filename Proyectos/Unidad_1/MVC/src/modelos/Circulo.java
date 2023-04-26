package modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Esta clase modela un Círculo
 *
 * @author Mario Pineda
 */
public class Circulo extends Figura {

  private int radio;

  public Circulo(int x, int y, int radio, Color color) {
    super(x, y, color);
    this.radio = radio;
  }

  public Circulo() {
    this(0, 0, 0, Color.BLACK);
  }

  @Override
  public void dibujar(Graphics g) {

    g.setColor(color);
    g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);

    g.setColor(Color.BLACK);
    g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radio, 2);
  }

  @Override
  public double getPerimetro() {
    return Math.PI * (2 * radio);
  }

  /**
   * @return the radio
   */
  public int getRadio() {
    return radio;
  }

  /**
   * @param radio the radio to set
   */
  public void setRadio(int radio) {
    this.radio = radio;
  }

  //En caso de que el punto esté dentro del circulo es un true, en otro caso es un false
  public boolean contiene(int pX, int pY) {
//    double d = this.distance(pX, pY);

    return distance(pX, pY) <= radio;
//    if (d <= radio) {
//      return true;
//    } else {
//      return false;
//    }
  }
}
