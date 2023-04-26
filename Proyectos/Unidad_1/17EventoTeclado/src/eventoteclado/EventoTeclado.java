/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventoteclado;

import controladores.OyenteTeclado;
import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Figura;
import modelos.Pentagono;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class EventoTeclado {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    Figura circulo = new Circulo(300, 350, 200, Color.BLUE);    //Modelo
    PanelDibujable panel = new PanelDibujable(circulo);                  //Vista
    JFrame f = new JFrame("Eventos de teclado");
    OyenteTeclado oyente = new OyenteTeclado(circulo, panel);       //Controlador

    panel.addEventos(oyente);                                                  //Registro
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
