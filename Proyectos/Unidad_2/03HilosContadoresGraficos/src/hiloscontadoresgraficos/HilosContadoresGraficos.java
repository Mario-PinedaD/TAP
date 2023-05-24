/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hiloscontadoresgraficos;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class HilosContadoresGraficos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    JFrame f = new JFrame();
    PanelContador panel = new PanelContador();
    OyenteContador oyente = new OyenteContador(panel);
    panel.addEventos(oyente);
    f.add(panel);
    f.setSize(400, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
