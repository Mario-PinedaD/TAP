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
public class Pentagono extends Figura {

  private int lados;

  public Pentagono(int x, int y, int lados, Color color) {
    super(x, y, color);
    this.lados = lados;
  }

  @Override
  public double getArea() {
    return -1;
  }

  @Override
  public double getPerimetro() {
    return -1;
  }

  @Override
  public void dibujar(Graphics g) {
  }

  /**
   * @return the lados
   */
  public int getLados() {
    return lados;
  }

  /**
   * @param lados the lados to set
   */
  public void setLados(int lados) {
    this.lados = lados;
  }

}
