/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equilibriofuerzaarchivo;

import controladores.OyenteFuerzasArchivo;
import modelos.Fuerzas;
import vistas.FrameEquilibrio;
import vistas.PanelFuerzas;

/**
 *
 * @author Mario Pineda
 */
public class EquilibrioFuerzaArchivo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    Fuerzas fuerzas = new Fuerzas();//Modelo
    FrameEquilibrio vista = new FrameEquilibrio(fuerzas); //Vista
    OyenteFuerzasArchivo oyente = new OyenteFuerzasArchivo(fuerzas, vista);//Controlador
    vista.setTitle("Vectores de fuerzas con archivos");
    vista.addEventos(oyente);
    vista.setLocation(100, 100);
    vista.setSize(800, 800);
    vista.setDefaultCloseOperation(FrameEquilibrio.EXIT_ON_CLOSE);
    vista.setVisible(true);
  }

}
