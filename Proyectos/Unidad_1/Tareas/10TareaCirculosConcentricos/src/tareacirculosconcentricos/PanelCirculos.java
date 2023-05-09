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
  }
}
