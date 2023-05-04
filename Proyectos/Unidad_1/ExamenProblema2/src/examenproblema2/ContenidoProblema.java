/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenproblema2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class ContenidoProblema extends JPanel{  
  public ContenidoProblema() {
    setBackground(Color.DARK_GRAY);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int ancho = this.getWidth();
    int alto = this.getHeight();

    //Cuadrado verde
    g.setColor(Color.GREEN);
    g.fillRect(10, 10, ancho - 20, alto - 20);

    //Cuadro gris
    g.setColor(Color.DARK_GRAY);
    g.fillRect(110, 0, 10, 100);

    //Cuadrados azules izquierda
    g.setColor(Color.BLUE);
    g.fillRect(50, 40, 10, 10);
    g.fillRect(50, 60, 10, 10);

    //Cuadrados azules derecha
    int y = 0;
    for (int i = 0; i < 4; i++) {
      g.fillRect(180, 110 + y, 10, 10);
      y += 20;
    }

    //Cuadrados amarillos
    g.setColor(Color.YELLOW);
    g.fillRect(170, 30, 10, 20);

    //Cuadrados rojos
    g.setColor(Color.RED);
    int x = 0;
    y = 0;
    for (int i = 0; i < 3; i++) {
      g.fillRect(100 + x, 240 + y, 10, 10);
      x += 35;
      y += 20;
    }

  }
  
}
