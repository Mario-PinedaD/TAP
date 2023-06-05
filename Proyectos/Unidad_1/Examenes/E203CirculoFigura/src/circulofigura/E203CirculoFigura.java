/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulofigura;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class E203CirculoFigura {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    PanelFigura panel = new PanelFigura();
    
    JFrame f = new JFrame("Ventana Poligono");
    f.add(panel);
    f.setLocation(100, 100);
    f.setSize(600, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setVisible(true);
  }
  
}
