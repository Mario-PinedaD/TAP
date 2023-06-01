/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animacion;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Imagenes;

/**
 *
 * @author Mario Pineda
 */
public class OyenteAnimacion extends MouseAdapter {

  private Imagenes modelo;
  private PanelAnimacion vista;
  private int tiempo;

  public OyenteAnimacion(Imagenes modelo, PanelAnimacion vista) {
    this.modelo = modelo;
    this.vista = vista;
    this.tiempo = 100;
    vista.getEtiqueta().setText(Integer.toString(tiempo));
    new HiloAnimacion().start();
  }

  public class HiloAnimacion extends Thread {

    @Override
    public void run() {
      int i = 0;
      while (true) {

        i = i++ % modelo.size();
        if (i >= modelo.size()) {
          i = 0;
        } else {
          modelo.setActiva(i++);
          try {
            Thread.sleep(tiempo);
          } catch (InterruptedException ex) {
            System.out.println("Ijole, no se va a poder. " + ex);
            System.exit(-1);
          }
        }
        vista.repaint();
        Toolkit.getDefaultToolkit().sync();

      }
    }
  }

  @Override
  public void mouseWheelMoved(MouseWheelEvent e) {
    System.out.println("Rotación= " + e.getWheelRotation());
    if (e.getWheelRotation() > 0) {
      //tiempo += 5;
      tiempo = Math.min(250, tiempo + 5);
    } else {
      tiempo = Math.max(0, tiempo - 5);
    }
    vista.getEtiqueta().setText(Integer.toString(tiempo));
  }
}
