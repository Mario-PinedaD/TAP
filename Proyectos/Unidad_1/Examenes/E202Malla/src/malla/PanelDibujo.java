/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malla;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelos.Dibujable;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujo extends JPanel implements Dibujable{

  private int verticales;
  private int horizontales;

  public PanelDibujo() {
    this.verticales = 1;
    this.horizontales = 1;
    this.setBackground(Color.CYAN);
  }

  public void setVerticales(int verticales) {
    this.verticales = verticales + 1;
  }

  public void setHorizontales(int horizontales) {
    this.horizontales = horizontales + 1;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    dibujar(g);
  }

  @Override
  public void dibujar(Graphics g) {
    int alto = this.getHeight();
    int ancho = this.getWidth();

    int difX = ancho / horizontales;
    int difY = alto / verticales;
    //Lineas horizontales
    for (int i = 0; i <= verticales; i++) {
      g.drawLine(0, i * difY, ancho, i * difY);
    }
    //Lineas verticales
    for (int i = 0; i <= horizontales; i++) {
      g.drawLine(i * difX, 0, i * difX, alto);
    }
    this.repaint();
  }
}
