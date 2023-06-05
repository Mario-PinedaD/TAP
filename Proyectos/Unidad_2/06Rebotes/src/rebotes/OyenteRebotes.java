/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rebotes;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class OyenteRebotes extends MouseAdapter {

  private Circulos modelo;
  private PanelDibujable vista;

  public OyenteRebotes(Circulos modelo, PanelDibujable vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    int radio = 5 + (int) (Math.random() * 26);

    int rojo = (int) (Math.random() * 256);
    int verde = (int) (Math.random() * 256);
    int azul = (int) (Math.random() * 256);

    Circulo circulo = new Circulo(e.getX(), e.getY(), radio, new Color(rojo, verde, azul));
    new HiloMovimiento(circulo).start();
    modelo.add(circulo);
    vista.repaint();
  }

  public class HiloMovimiento extends Thread {

    private Circulo circulo;

    public HiloMovimiento(Circulo circulo) {
      this.circulo = circulo;
    }

    @Override
    public void run() {
      int signoX = Math.random() > .5 ? 1 : -1; //Si es mayor a .5 se va pa derecha si no, a la iz
      int signoY = Math.random() > .5 ? 1 : -1; //Si es mayor a .5 se va pa derecha si no, a la iz
      int incX = 5 + (int) (Math.random() * 11);
      int incY = 5 + (int) (Math.random() * 11);
      int tiempo = 50;

      int radio = circulo.getRadio();
      for (;;) {
        int ancho = vista.getWidth();
        int alto = vista.getHeight();
        circulo.x += incX * signoX;
        circulo.y += incY * signoY;
        if (circulo.x + radio > ancho || circulo.x - radio < 0) {
          signoX *= -1;
        }
        if (circulo.y + radio > alto || circulo.y - radio < 0) {
          signoY *= -1;
        }

        try {
          Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
          System.out.println("Ijole joben " + ex);
          System.exit(-1);
        }
        vista.repaint();
        Toolkit.getDefaultToolkit().sync();
      }
    }
  }

}
