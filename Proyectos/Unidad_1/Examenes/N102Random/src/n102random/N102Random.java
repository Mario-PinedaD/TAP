/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n102random;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class N102Random {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    JFrame f = new JFrame("Calculadora cambio moneda");
    PanelRandom panel = new PanelRandom();
    f.add(panel);
    f.setSize(400, 400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocation(100, 100);
    f.setVisible(true);
  }

}
