/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoarchivos;

import controladores.OyenteEditorArchivo;
import javax.swing.JFrame;
import vistas.VentanaEditorArchivo;

/**
 *
 * @author Mario Pineda
 */
public class TrabajoArchivos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    VentanaEditorArchivo f = new VentanaEditorArchivo();
    OyenteEditorArchivo oyente = new OyenteEditorArchivo(f);
    f.addEventos(oyente);
    f.setLocation(100, 100);
    f.setSize(600, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}
