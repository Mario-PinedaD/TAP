/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malla;

import java.awt.Graphics;
import modelos.Dibujable;

/**
 *
 * @author Mario Pineda
 */
public class DibujarLineas implements Dibujable {

  int verticales;
  int horizontales;

  public DibujarLineas(int horizontales, int verticales) {
    this.verticales = verticales;
    this.horizontales = horizontales;
  }

  @Override
  public void dibujar(Graphics g) {

  }

}
