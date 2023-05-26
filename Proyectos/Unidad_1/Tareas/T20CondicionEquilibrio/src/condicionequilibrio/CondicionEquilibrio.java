/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionequilibrio;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Fuerza;
import modelos.Fuerzas;
import vistas.PanelFuerzas;

/**
 *
 * @author Mario Pineda
 */
public class CondicionEquilibrio {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    //Creacion de fuerza
    Fuerza fuerza1 = new Fuerza(200, 45, Color.BLACK);
    Fuerza fuerza2 = new Fuerza(200, -45, Color.BLACK);
    Fuerza fuerzaResultante = fuerza1.sumatoria(fuerza2);

    //Modelo
    Fuerzas fuerzas = new Fuerzas();
    fuerzas.add(fuerza1);
    fuerzas.add(fuerza2);
    fuerzas.add(fuerzaResultante);
    
    PanelFuerzas vista = new PanelFuerzas(fuerzas);//Vista
    
    JFrame f = new JFrame("Primera Condición de Equilibrio");
    f.add(vista);
    f.setLocation(100, 100);
    f.setSize(600, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  
}
