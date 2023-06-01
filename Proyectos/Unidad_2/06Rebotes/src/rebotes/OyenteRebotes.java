/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rebotes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class OyenteRebotes extends MouseAdapter {

  private Circulos modelo;
  private PanelDibujable vista;

  public OyenteRebotes(Circulos modelo, PanelDibujable vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    int radio = 5 + (int) (Math.random() * 26);

    int rojo = (int) (Math.random() * 256);
    int verde = (int) (Math.random() * 256);
    int azul = (int) (Math.random() * 256);

    Circulo circulo = new Circulo(e.getX(), e.getY(), radio, new Color(rojo, verde, azul));
    modelo.add(circulo);
    vista.repaint();
  }
}
