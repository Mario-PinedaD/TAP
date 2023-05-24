/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circuloradioaleatorio;

import vistas.PanelCirculo;
import controladores.OyenteCirculos;
import javax.swing.JFrame;
import modelos.CalculosCirculos;

/**
 *
 * @author Mario Pineda
 */
public class CirculoRadioAleatorio {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    JFrame f = new JFrame("Ventana Circulo Radio Aleatorio");
    CalculosCirculos modelo = new CalculosCirculos();//Modelo
    PanelCirculo panel = new PanelCirculo();//Vista
    OyenteCirculos oyente = new OyenteCirculos(modelo, panel); //Controlador
    
    panel.addEventos(oyente);//Registro
    f.add(panel);
    f.setSize(800, 800);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}
