/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animacion;

import javax.swing.JFrame;
import modelos.Imagenes;

/**
 *
 * @author Mario Pineda
 */
public class Animacion {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Imagenes modelo = new Imagenes("dancing");
    PanelAnimacion vista = new PanelAnimacion(modelo);
    
    JFrame f = new JFrame("Ventana Animacion");
    f.add(vista);
    f.setSize(600, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
  }
  
}
