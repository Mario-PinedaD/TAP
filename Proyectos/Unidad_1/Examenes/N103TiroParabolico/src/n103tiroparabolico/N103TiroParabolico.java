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
    PanelParabolic panel = new PanelParabolic();
    f.add(panel);
    f.setSize(400, 400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocation(100, 100);
    f.setVisible(true);
  }

}
