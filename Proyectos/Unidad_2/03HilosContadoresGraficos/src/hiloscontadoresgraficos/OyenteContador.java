/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hiloscontadoresgraficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread.State;
import javax.swing.JSlider;

/**
 *
 * @author Mario Pineda
 */
public class OyenteContador implements ActionListener {

  private PanelContador panel;
  private Hilo hilo1;
  private Hilo hilo2;

  public OyenteContador(PanelContador panel) {
    this.panel = panel;

    hilo1 = new Hilo(panel.getSliders()[0]);
    hilo2 = new Hilo(panel.getSliders()[1]);
    System.out.println("Hilo1: " + hilo1.getState());
    System.out.println("Hilo2: " + hilo2.getState());
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (hilo1.getState() != State.TERMINATED) {
      hilo1.start();
    }
    if (hilo2.getState() != State.TERMINATED) {
      hilo2.start();
    }
    System.out.println("Hilo1: " + hilo1.getState());
    System.out.println("Hilo2: " + hilo2.getState());
    System.out.println("Hilo 1 = " + hilo1.isAlive());
    System.out.println("Hilo 2 = " + hilo2.isAlive());
  }

  public class Hilo extends Thread {

    private JSlider barra;

    public Hilo(JSlider barra) {
      this.barra = barra;
    }

    @Override
    public void run() {
      for (int i = barra.getMinimum(); i <= barra.getMaximum(); i++) {
        barra.setValue(i);
        try {
          Thread.sleep(50);
        } catch (InterruptedException ex) {
          System.out.println("Fijese que no se pudo porque: " + ex);
          System.exit(-1);
        }
      }
    }

  }
}
