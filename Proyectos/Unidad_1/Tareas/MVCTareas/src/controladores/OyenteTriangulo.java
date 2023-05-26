/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelos.TrianguloCirculo;
import vistas.PanelTrianguloCirculo;

/**
 *
 * @author Mario Pineda
 */
public class OyenteTriangulo implements ActionListener {

  private TrianguloCirculo modelo;
  private PanelTrianguloCirculo vista;

  public OyenteTriangulo(TrianguloCirculo modelo, PanelTrianguloCirculo vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton boton = (JButton) e.getSource();
    int radio = modelo.getRadio();

    switch (boton.getName()) {
      case "aumentar": {
        if (radio * 2 < vista.getAnchoCentro() && radio * 2 < vista.getAltoCentro()) {
          modelo.setRadio(radio + 5);
          vista.repaint();
        }
        break;
      }
      case "disminuir": {
        if (radio > 0) {
          modelo.setRadio(radio - 5);
          vista.repaint();
        }
        break;
      }
    }
  }

}
