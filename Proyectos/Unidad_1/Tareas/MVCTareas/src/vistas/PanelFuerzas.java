/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelos.Fuerzas;

/**
 *
 * @author Mario Pineda
 */
public class PanelFuerzas extends JPanel {

  private Fuerzas fuerzas;

  public PanelFuerzas() {
    this.fuerzas = new Fuerzas();
    this.setBackground(Color.CYAN);
  }

  public PanelFuerzas(Fuerzas fuerzas) {
    this.fuerzas = fuerzas;
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int ancho = getWidth();
    int alto = getHeight();
    int xCentro = ancho / 2;
    int yCentro = alto / 2;

    g.translate(xCentro, yCentro);

    g.setColor(Color.YELLOW);
    g.drawLine(0, -yCentro, 0, yCentro);
    g.drawLine(-xCentro, 0, xCentro, 0);
    
    fuerzas.dibujar(g);
  }

}
