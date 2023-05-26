/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mario Pineda
 */
public class Fuerza implements Dibujable {

  //Una fuerza teiene magnitud, un angulo y ya un color coquetón
  private double magnitud;
  private double angulo;
  private Color color;
  private Fuerza fResultante;

  public Fuerza(double magnitud, double angulo, Color color) {
    this.magnitud = magnitud;
    this.angulo = angulo;
    this.color = color;
  }

  //Calculo de la Posicion en X
  // = FR * cos(angulo)
  public double getFuerzaX() {
    return magnitud * Math.cos(Math.toRadians(angulo));
  }

  //Calculo de la Posicion en Y
  // = FR * Sen(Angulo)
  public double getFuerzaY() {
    return magnitud * Math.sin(Math.toRadians(angulo));
  }

  public Fuerza sumatoria(Fuerza fuerza) {
    double sumatoriaX = this.getFuerzaY() + fuerza.getFuerzaY();
    double sumatoriaY = this.getFuerzaX() + fuerza.getFuerzaX();
    //Es la raiz de las sumatorias al cuadrado 
    double magnitudResultante = Math.sqrt((sumatoriaX * sumatoriaX) + (sumatoriaY * sumatoriaY));
    double anguloResultante = Math.toDegrees(Math.atan2(sumatoriaX, sumatoriaY));
    fResultante = new Fuerza(magnitudResultante, anguloResultante, Color.RED);
    return fResultante;
  }

  @Override
  public void dibujar(Graphics g) {
    g.setColor(color);
    g.drawLine(0, 0, (int) getFuerzaX(), (int) getFuerzaY());
  }

}
