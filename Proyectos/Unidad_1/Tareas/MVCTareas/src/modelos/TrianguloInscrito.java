/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mario
 */
public class TrianguloInscrito extends JPanel {

  private final TrianguloCirculo triangulo;

  public TrianguloInscrito() {
    triangulo = new TrianguloCirculo();
  }

  public TrianguloInscrito(TrianguloCirculo triangulo) {
    this.triangulo = triangulo;
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();

    g.translate(ancho / 2, alto / 2);
    triangulo.dibujar(g);
  }
}
