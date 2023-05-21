/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacirculosconcentricos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelCirculos extends JPanel {

  private int circulos;

  public PanelCirculos(int circulos) {
    this.circulos = circulos;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int ancho = this.getWidth();
    int alto = this.getHeight();
    int radio = 50;
    int xCentro = ancho / 2;
    int yCentro = alto / 2;

    this.locate(xCentro, yCentro);

    for (int i = 0; i < circulos; i++) {
      g.drawOval(xCentro-radio, yCentro-radio, (radio * 2)-10, radio * 2);
      radio += 10;
    }
  }
}
