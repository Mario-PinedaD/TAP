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

  private DatosHistograma datos;
  private PanelGrafica panel;

  public OyenteGrafica(DatosHistograma datos, PanelGrafica panel) {
    this.datos = datos;
    this.panel = panel;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    panel.setDatos(datos.generarDatos());
    panel.setColores(datos.getColorines());
    System.out.println("Se pinta");
    panel.repaint();
  }

}
