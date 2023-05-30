/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malla;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujo extends JPanel {

  private int verticales;
  private int horizontales;

  public PanelDibujo() {
    this.verticales = 1;
    this.horizontales = 1;
    this.setBackground(Color.CYAN);
  }

  public PanelDibujo(int horizontales, int verticales) {
    this.verticales = verticales;
    this.horizontales = horizontales;
    this.setBackground(Color.CYAN);
    this.repaint();
  }

  public void setVerticales(int verticales) {
    this.verticales = verticales;
  }

  public void setHorizontales(int horizontales) {
    this.horizontales = horizontales;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int alto = this.getHeight();
    int ancho = this.getHeight();

    int posX = ancho / (horizontales + 1);
    int separacionX = posX / 2;
    int posY = alto / (verticales + 1);
    int separacionY = posY / 2;
    //Lineas horizontales
    for (int i = 0; i < verticales; i++) {
      g.drawLine(0, posY, ancho, posY);
      posY += posY;
    }
    //Lineas verticales
    for (int i = 0; i < horizontales; i++) {
      g.drawLine(posX, 0, posX, alto);
      posX += posX;
    }
    this.repaint();
  }
}
