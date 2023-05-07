/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacolor;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class TareaColor {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    JFrame f = new JFrame("ColorSelect");
    PanelSeleccion panel = new PanelSeleccion();

    f.add(panel);
    f.setSize(300, 130);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
