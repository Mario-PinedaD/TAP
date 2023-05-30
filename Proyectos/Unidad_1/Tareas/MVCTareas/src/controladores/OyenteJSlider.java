/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import modelos.CalculosCirculos;
import vistas.PanelCirculoSlider;

/**
 *
 * @author Mario Pineda
 */
public final class OyenteJSlider implements ChangeListener {

  private CalculosCirculos modelo;
  private PanelCirculoSlider vista;
  private int radio;

  public OyenteJSlider(CalculosCirculos modelo, PanelCirculoSlider vista) {
    this.modelo = modelo;
    this.vista = vista;
    radioInicial();
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    radio = vista.getValorSlider();
    vista.setRadio(radio);
    calculosEtiquetas();
    actualizarEtiquetas();
    vista.repaint();
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

  public void radioInicial() {
    radio = 150;
    vista.setRadio(radio);
    calculosEtiquetas();
    actualizarEtiquetas();
    vista.repaint();
  }

}
