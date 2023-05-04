/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmenproblema3;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class ExmenProblema3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    JFrame f = new JFrame();
    Figura3 f3 = new Figura3();

    f.setSize(700, 600);
    f.add(f3);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}
