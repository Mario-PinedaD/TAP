/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulocirculo;

import controladores.OyenteTriangulo;
import java.awt.Color;
import javax.swing.JFrame;
import modelos.TrianguloCirculo;
import vistas.PanelTrianguloCirculo;

/**
 *
 * @author Mario Pineda
 */
public class TrianguloOnCirculo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    TrianguloCirculo modelo = new TrianguloCirculo(0, 0, 200, Color.GREEN, Color.RED); //Modelo

    PanelTrianguloCirculo vista = new PanelTrianguloCirculo(modelo); //Vista

    OyenteTriangulo oyente = new OyenteTriangulo(modelo, vista);//Controlador
    vista.addEventos(oyente);

    JFrame f = new JFrame("Triangulo Inscrito en un circulo");

    f.add(vista);
    f.setSize(800, 600);
    f.setLocation(100, 100);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}
