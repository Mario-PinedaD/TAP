/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.CalculosCirculos;
import vistas.PanelCirculo;

/**
 *
 * @author Mario Pineda
 */
public class OyenteCirculos extends MouseAdapter {

  private CalculosCirculos modelo;
  private PanelCirculo vista;
  private int radio;

  public OyenteCirculos(CalculosCirculos modelo, PanelCirculo vista) {
    this.modelo = modelo;
    this.vista = vista;
    radio = 50;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    int rMin = 20;
    int min = Math.min(this.vista.getHeight(), this.vista.getWidth());
    radio = (int) (Math.random() * (min / 2));
    if (radio <= vista.getWidth() / 2 && radio <= vista.getHeight() / 2) {
      //System.out.println("Raido: " + radio);
      vista.setRadio(radio);
      this.calculosEtiquetas();
      this.actualizarEtiquetas();
      vista.repaint();
    }

  }

  public void calculosEtiquetas() {
    modelo.setRadio(radio);
    modelo.calcularDiametro(radio);
    modelo.calcularArea(radio);
    modelo.calcularCircunferencia();
  }

  public void actualizarEtiquetas() {
    vista.setEtiquetaRadio("Radio: " + modelo.getRadio());
    vista.setEtiquetaDiametro("Diametro: " + modelo.getDiametro());
    vista.setEtiquetaCircunferencia("Circunferencia " + String.format("%.2f", modelo.getCircunferencia()));
    vista.setEtiquetaArea("Area: " + String.format("%.2f", modelo.getArea()));
  }
}
