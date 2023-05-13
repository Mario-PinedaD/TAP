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
    //Ancho de 600
    int xPanel = this.getWidth();
    //Alto de 550
    int yPanel = this.getHeight();

    //Contorno
    Color colorContorno = new Color(163, 162, 198);

    //Dibujar paredes
    //Color de las paredes
    g.setColor(new Color(17, 155, 239));
    //Pared Izquierda
    int[] xIzq = {0, 100, 100, 0};
    int[] yIzq = {0, 50, yPanel - 150, yPanel - 100};
    g.fillPolygon(xIzq, yIzq, xIzq.length);
    //Pared Centro
    int[] xCen = {100, xPanel - 100, xPanel - 100, 100};
    int[] yCen = {50, 50, yPanel - 150, yPanel - 150};
    g.fillPolygon(xCen, yCen, xCen.length);
    g.setColor(colorContorno);
    //Marco pared Centro
    g.drawPolygon(xCen, yCen, xCen.length);
    g.setColor(new Color(17, 155, 239));
    //Pared Derecha
    int[] xDer = {xPanel - 100, xPanel, xPanel, xPanel - 100};
    int[] yDer = {50, 0, yPanel - 100, yPanel - 150};
    g.fillPolygon(xDer, yDer, xDer.length);

    //Suelo
    g.setColor(new Color(255, 103, 100));
    int[] xSuelo = {0, 0, 100, xPanel - 100, xPanel, xPanel};
    int[] ySuelo = {yPanel, yPanel - 100, yPanel - 150, yPanel - 150, yPanel - 100, yPanel};
    g.fillPolygon(xSuelo, ySuelo, xSuelo.length);

    //Puerta
    g.setColor(new Color(199, 243, 179));
    int[] xPuerta = {50, 90, 90, 50};
    int[] yPuerta = {150, 170, yPanel - 145, yPanel - 125};
    g.fillPolygon(xPuerta, yPuerta, xPuerta.length);
    //Picaporte
    g.setColor(new Color(109, 53, 48));
    g.fillOval(50, 280, 10, 10);

    //Ventana
    g.setColor(Color.BLACK); //600-110=490
    int[] xVen = {340, xPanel - 110, xPanel - 110, 340};//175 la mitad
    int[] yVen = {100, 100, yPanel - 300, yPanel - 300};//550-300=250
    g.fillPolygon(xVen, yVen, xVen.length);
    g.setColor(new Color(140, 66, 34));
    g.drawPolygon(xVen, yVen, xVen.length);
    //Barras verticales
    g.fillRect(415 - 5, 100, 10, yPanel - 400); // BarraCentral
    g.fillRect(376 - 1, 100, 2, yPanel - 400); //Barra Izquierda
    g.fillRect(448 - 1, 100, 2, yPanel - 400); //Barra Derecha
    //Barra horizontal
    g.fillRect(340, 155 - 1, 490 - 355, 2);

    //Mesa
    int xMitad = xPanel / 2;
    int yMitad = yPanel / 2;
    g.setColor(new Color(251, 123, 221));
    //Circulo inferior
    g.fillOval(xMitad, yPanel - 125, 60, 20);
    //BastonInferior
    g.setColor(new Color(104, 94, 246));
    g.fillRect(xMitad + 20, yMitad + 40, 20, 100);
    //CirculoMesa inferior
    g.setColor(new Color(189, 89, 159));
    g.fillOval(xMitad - 72, yMitad + 5, 215, 55);
    //CirculoMesa Superior
    g.setColor(new Color(162, 48, 145));
    g.fillOval(xMitad - 64, yMitad + 5, 200, 50);
    //LaptopInferior
    g.setColor(Color.WHITE);
    int[] xLap1 = {xMitad - 20, xMitad + 40, xMitad + 50, xMitad + -10};
    int[] yLap1 = {yMitad - 20, yMitad - 15, yMitad + 20, yMitad + 15};
    g.fillPolygon(xLap1, yLap1, xLap1.length);
    //LaptopSuperior
    int[] xLap2 = {xMitad - 10, xMitad + 50, xMitad + 40, xMitad - 20};
    int[] yLap2 = {yMitad + 15, yMitad + 20, yMitad + 50, yMitad + 45};
    g.fillPolygon(xLap2, yLap2, xLap2.length);

    //Contornos
    g.setColor(colorContorno);//Color de Marcos
    //Contorno de ventana
    //g.drawRect(0, 0, xPanel, yPanel);
    g.drawLine(0, 0, xPanel, 0);
    //Marco pared Izquierda
    g.drawPolygon(xIzq, yIzq, xIzq.length);
    //Marco Pared Derecha
    g.drawPolygon(xDer, yDer, xDer.length);
    g.setColor(Color.BLACK);
    g.drawPolygon(xLap1, yLap1, xLap1.length);
    g.drawPolygon(xLap2, yLap2, xLap2.length);
    g.drawPolygon(xPuerta, yPuerta, xPuerta.length);
  }
}
