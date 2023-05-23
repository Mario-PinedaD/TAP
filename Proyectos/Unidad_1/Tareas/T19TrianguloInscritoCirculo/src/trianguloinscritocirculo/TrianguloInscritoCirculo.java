/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianguloinscritocirculo;

import controladores.OyenteTriangulo;
import javax.swing.JFrame;
import modelos.TrianguloInscrito;
import vistas.PanelTrianguloInscrito;

/**
 *
 * @author mario
 */
public class TrianguloInscritoCirculo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    TrianguloInscrito modelo = new TrianguloInscrito();//Modelo
    PanelTrianguloInscrito panel = new PanelTrianguloInscrito();//Vista
    OyenteTriangulo oyente = new OyenteTriangulo(modelo, panel);//Controlador
    panel.addEventos(oyente);
    
    JFrame f = new JFrame("Ventana Triangulo Con Circulo");
    f.add(panel);
    f.setLocation(100, 100);
    f.setSize(800, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
