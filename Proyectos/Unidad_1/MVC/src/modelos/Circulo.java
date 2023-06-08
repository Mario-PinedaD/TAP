package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * Esta clase modela un Círculo
 *
 * @author Mario Pineda
 */
public class Circulo extends Figura {

  private int radio;
  private int alto;
  private int ancho;

  public Circulo(int x, int y, int radio, Color color) {
    super(x, y, color);
    this.radio = radio;
  }

  public Circulo() {
    this(0, 0, 0, Color.BLACK);
  }

  @Override
  public void dibujar(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;//Cast de una nueva brocha
    //LE decimos que no queremos antialiasin
    g2.setColor(Color.BLACK);
    g2.drawLine(0, 0, x, y);
    g2.drawLine(0, alto, x, y);
    g2.drawLine(x, y, ancho, 0);
    g2.drawLine(x, y, ancho, alto);
    
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setColor(color);
    g2.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);

    g2.setColor(Color.BLACK);
    g2.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
  }

  public void setAlto(int alto) {
    this.alto = alto;
  }

  public void setAncho(int ancho) {
    this.ancho = ancho;
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
