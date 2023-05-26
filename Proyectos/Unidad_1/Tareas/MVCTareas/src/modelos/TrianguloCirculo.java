/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Mario Pineda
 */
public class TrianguloCirculo extends Point implements Dibujable {

  private int radio;
  private Color colorCirculo;
  private Color colorTriangul;

  //Constructor
  public TrianguloCirculo(int x, int y, int radio, Color colorCirculo, Color colorTriangulo) {
    super(x, y);
    this.radio = radio;
    this.colorCirculo = colorCirculo;
    this.colorTriangul = colorTriangulo;
  }

  public TrianguloCirculo() {
    this(0, 0, 0, Color.BLACK, Color.WHITE);
  }

  public int getRadio() {
    return radio;
  }

  public void setRadio(int radio) {
    this.radio = radio;
  }

  public Color getColorCirculo() {
    return colorCirculo;
  }

  public void setColorCirculo(Color colorC) {
    this.colorCirculo = colorC;
  }

  public Color getColorTriangulo() {
    return colorTriangul;
  }

  public void setColorTriangulo(Color colorT) {
    this.colorTriangul = colorT;
  }

  @Override
  public void dibujar(Graphics g) {
    g.setColor(colorCirculo);
    g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
    g.setColor(Color.BLACK);
    g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);

    //Triangulo
    int x[] = new int[3];
    int y[] = new int[3];
    double angulo = Math.toRadians(360.0 / 3);
    for (int i = 0; i < 3; i++) {
      x[i] = (int) (radio * Math.cos(-Math.PI / 2 + angulo * i));
      y[i] = (int) (radio * Math.sin(-Math.PI / 2 + angulo * i));
    }

    g.setColor(colorTriangul);
    g.fillPolygon(x, y, x.length);
    g.setColor(Color.BLACK);
    g.drawPolygon(x, y, x.length);
  }

}
