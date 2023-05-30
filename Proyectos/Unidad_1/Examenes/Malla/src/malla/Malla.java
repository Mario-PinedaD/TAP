/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package malla;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class Malla {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    
    VentanaMalla vent = new VentanaMalla();
    OyenteVentana oyente = new OyenteVentana(vent);
    
    vent.addEventos(oyente);
    vent.setSize(800, 600);
    vent.setLocation(100, 100);

    vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    vent.setVisible(true);
  }

}
