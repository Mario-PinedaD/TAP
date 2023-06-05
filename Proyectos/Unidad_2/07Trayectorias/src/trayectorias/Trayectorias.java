/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectorias;

import javax.swing.JFrame;
import modelos.Planetas;

/**
 *
 * @author Mario Pineda
 */
public class Trayectorias {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Planetas modelo = new Planetas();

    PanelTrayectorias vista = new PanelTrayectorias(modelo);

    OyenteTrayectorias oyente = new OyenteTrayectorias(modelo, vista);

    vista.addEventos(oyente);
    JFrame f = new JFrame("Trayectorias");
    f.add(vista);
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
