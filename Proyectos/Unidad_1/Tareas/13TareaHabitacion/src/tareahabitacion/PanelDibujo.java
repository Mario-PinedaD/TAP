/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareahabitacion;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujo extends JPanel {

  public Color color;

  public PanelDibujo() {
    setBackground(Color.WHITE);
  }

  /*
  Orden que yo creo correcto:
  Dibujar paredes y suelo
  Puerta (que comparte la esquina inferior derecha con la pared)
    Picaporte (En el extremo izquierdo en el centro del dibujo)
  Ventana(que realmente es un cuadro negro unicamente)
    Ventanillas (Un cuadro café y 4 lineas, 3 verticales y 1 horizontal)
  MESA:
    Circulo inferior
    Cuerpo
    Circulo inferior superior
    Circulo superior
  Laptop
  Lineas(que serán igual que el piso)
    Unicamente un cuadro del tamaño del panel y lineas que separen las paredes, mas no el techo
   */
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    //Ancho y alto del panel;
    int anchoPanel = this.getWidth();
    int altoPanel = this.getHeight();

    //Dibujar Pared Izquierda
    //Color de las paredes
    color = new Color(17, 155, 239);
    g.setColor(color);
    //Pared Izquierda
    int[] xP = {0, 60, 60, 0};
    int[] yP = {0, 50, 260, 310};
    g.fillPolygon(xP, yP, xP.length);

  }
}
