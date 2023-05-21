/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacirculosconcentricos;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class TareaCirculosConcentricos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    JFrame f = new JFrame("Circulos Concentricos");
    PanelCirculos panel = new PanelCirculos(8);
    f.add(panel);
    f.setSize(400, 300);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
