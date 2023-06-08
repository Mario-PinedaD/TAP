/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n103tiroparabolico;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class N103TiroParabolico {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    JFrame f = new JFrame("Tiro parabólico");
    //PanelMoneda panel = new PanelMoneda();
    Proyectil proye = new Proyectil(88.0,40);
    PanelParabolic panel = new PanelParabolic(proye);
    f.add(panel);
    f.setSize(800, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocation(100, 100);
    f.setVisible(true);
  }

}
