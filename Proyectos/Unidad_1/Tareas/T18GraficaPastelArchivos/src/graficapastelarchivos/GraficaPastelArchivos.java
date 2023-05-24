/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficapastelarchivos;

import controladores.OyenteGrafica;
import javax.swing.JFrame;
import modelos.GraficaPastel;
import vistas.VentanaGraficaPastel;

/**
 *
 * @author Mario Pineda
 */
public class GraficaPastelArchivos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    GraficaPastel modelo = new GraficaPastel();//Modelo
    VentanaGraficaPastel vista = new VentanaGraficaPastel(modelo); //Vista
    OyenteGrafica oyente = new OyenteGrafica(modelo, vista);//Controlador
    
    vista.addEventos(oyente);
    vista.setSize(600, 600);
    vista.setLocation(100, 100);
    vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vista.setVisible(true);
  }

}
