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

  private Proyectil proyectil;

  public PanelParabolic(Proyectil proyectil) {
    this.proyectil = proyectil;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);

    int ancho = getWidth();
    int alto = getHeight();

    double tiempoInicial = 0.1;
    double tiempoFinal = 400.0;

    double x, y, t;
    for (t = 0.0; t <= tiempoFinal; t += tiempoInicial) {
      x = proyectil.calcularX(t);
      y = proyectil.calcularY(t);

      int xPos = (int) Math.round(x);
      int yPos = alto - (int) Math.round(y);

      g.fillOval(xPos, yPos, 10, 10);
    }
  }
}
