/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e201separadorbilletes;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class E201SeparadorBilletes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    VentanaMonedas ventana = new VentanaMonedas();
    
    OyenteVentana oyente = new OyenteVentana(ventana);
    
    ventana.addEventos(oyente);
    ventana.setSize(600,600);
    ventana.setLocation(100,100);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ventana.setVisible(true);
  }
  
}
