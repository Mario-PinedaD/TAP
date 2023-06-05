/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trayectorias;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Planeta;
import modelos.Planetas;

/**
 *
 * @author Mario Pineda
 */
public class OyenteTrayectorias extends MouseAdapter {

  private Planetas modelo;
  private PanelTrayectorias vista;

  public OyenteTrayectorias(Planetas modelo, PanelTrayectorias vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    for (Planeta planeta : modelo) {
      new HiloPlaneta(planeta).start();

    }
    vista.removeMouseListener(this);
  }

  public class HiloPlaneta extends Thread {

    private Planeta planeta;

    public HiloPlaneta(Planeta planeta) {
      this.planeta = planeta;
    }

    @Override
    public void run() {

      int tiempo = 25 + (int) (Math.random() * 51);
      int rMayor = planeta.getAnchoOrbita() / 2;
      int rMenor = planeta.getAltoOrbita() / 2;

      for (int angulo = 0;; angulo += 5) {
        double rad = Math.toRadians(angulo);
        planeta.x = (int) (rMayor * Math.cos(rad));
        planeta.y = (int) (rMenor * Math.sin(rad));

        try {
          Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
          System.out.println("Error" + ex);
          System.exit(-1);
        }
        vista.repaint();
        Toolkit.getDefaultToolkit().sync();
      }
    }
  }
}
