/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenproblema2;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class ExamenProblema2 {

  /**
   * @param args the command line arguments
   */
    public static void main(String[] args) {
    JFrame f = new JFrame("Snake");
    BarraProblema barra = new BarraProblema(); 
    ContenidoProblema panel = new ContenidoProblema(); 

    f.setSize(350, 400);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setJMenuBar(barra);
    f.add(panel);

    f.setVisible(true);

  }
  
}
