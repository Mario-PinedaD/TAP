/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rebotes;

import javax.swing.JFrame;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class Rebotes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Circulos circulos = new Circulos();//MOODELO

    PanelDibujable vista = new PanelDibujable(circulos);
    
    OyenteRebotes oyente = new OyenteRebotes(circulos,vista);
    
    vista.addEventos(oyente);

    JFrame f = new JFrame("Ventana Rebotes");
    f.add(vista);
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
