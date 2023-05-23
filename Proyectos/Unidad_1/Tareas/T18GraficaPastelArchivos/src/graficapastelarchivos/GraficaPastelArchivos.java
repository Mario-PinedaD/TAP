/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficapastelarchivos;

import controladores.OyenteGrafica;
import javax.swing.JFrame;
import modelos.GraficaCalculos;
import vistas.PanelGrafica;

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

    GraficaCalculos modelo = new GraficaCalculos();//Modelo
    PanelGrafica panel = new PanelGrafica();//Vista
    OyenteGrafica oyente = new OyenteGrafica(modelo, panel);//Controlador
    JFrame f = new JFrame("Tarea 18 Grafica de Pastel");
    
    f.add(panel);
    f.setSize(600, 600);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  
}
