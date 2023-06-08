/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n103tiroparabolico;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelParabolic extends JPanel {

  public PanelParabolic() {
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    double grave = -9.81;
    ArrayList<Integer> tiempo = new ArrayList<>();
    int velocidad = 100;
    double angulo = 45;
    for (int i = 0; i < ancho; i++) {
      tiempo.add(i);
    }
    g.translate(100,400);
    for (int i = 1; i < tiempo.size(); i++) {
      int x1 = (int) (velocidad * Math.cos(Math.toRadians(angulo)) * tiempo.get(i - 1));
      int x2 = (int) (velocidad * Math.cos(Math.toRadians(angulo)) * tiempo.get(i - 1));
      int y1 = (int) (velocidad * Math.sin(Math.toRadians(angulo)) * grave * Math.pow(tiempo.get(i), 2));
      int y2 = (int) (velocidad * Math.sin(Math.toRadians(angulo)) * grave * Math.pow(tiempo.get(i), 2));

      g.drawLine(x1, y1, x2, y2);
    }
  }
}
