package vistas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class CirculoTarea extends JPanel {

  private int radio;

  public CirculoTarea() {
    this.radio = 0;
    this.setBackground(Color.CYAN);
  }

  public void setRadio(int radio) {
    this.radio = radio;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int ancho = this.getWidth();
    int alto = this.getHeight();

    g.translate(ancho / 2, alto / 2);
    g.setColor(Color.BLACK);

    g.drawOval(-radio, -radio, radio * 2, radio * 2);
    this.repaint();
  }

}
