/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenproblema1;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class ExamenProblema1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f01 = new JFrame("Examen");
    PanelFigu1 f1 = new PanelFigu1();

    f01.setLocation(100, 100);
    f01.setSize(350, 350);
    f01.add(f1);
    f01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f01.setVisible(true);

  }
}
