/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n202histograma;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class N202Histograma {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    DatosHistograma modelo = new DatosHistograma();
    PanelGrafica panel = new PanelGrafica();
    OyenteGrafica oyente = new OyenteGrafica(modelo, panel);
    panel.addEventos(oyente);
    
    JFrame f = new JFrame("Ventana Diagolo");
    f.add(panel);
    f.setSize(500, 500);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setLocation(100, 100);
    
    f.setVisible(true);
  }
  
}
