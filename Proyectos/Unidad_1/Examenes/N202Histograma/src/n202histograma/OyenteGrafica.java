/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n202histograma;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Mario Pineda
 */
public class OyenteGrafica extends MouseAdapter {

  private DatosHistograma modelo;
  private PanelGrafica vista;

  public OyenteGrafica(DatosHistograma datos, PanelGrafica panel) {
    this.modelo = datos;
    this.vista = panel;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    vista.setDatos(modelo.generarDatos());
    System.out.println("Se añaden los datos en el oyente");
    vista.setColores(modelo.getColorines());
    System.out.println("Se añaden los colores en el oyente");
    System.out.println("Se pinta");
    this.vista.repaint();
  }

}
