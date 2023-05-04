/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controljugadores;

import modelos.Jugadores;

/**
 *
 * @author Mario Pineda
 */
public class ControlJugadores {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Jugadores modelo = new Jugadores();          //Modelo
    VentanaJugadores f = new VentanaJugadores(modelo); //Vista
    OyenteJugadores oyente = new OyenteJugadores(modelo, f); //Controlador
    f.addEventos(oyente);                       //Registro
    f.setSize(800, 600);
    f.setLocation(100, 100);

    f.setVisible(true);
  }

}
