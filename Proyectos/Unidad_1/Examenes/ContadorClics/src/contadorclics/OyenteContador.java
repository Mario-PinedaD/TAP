/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contadorclics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author Mario Pineda
 */
public class OyenteContador extends MouseAdapter {

  private int contar;
  private final PanelContador contador;

  public OyenteContador(PanelContador contador) {
    this.contador = contador;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    contar++;
    contador.setEtiqueta(contar);
    contador.repaint();
  }

  @Override
  public void mouseWheelMoved(MouseWheelEvent e) {
    if (e.getUnitsToScroll() < 0) {
      contar++;
      contador.setEtiqueta(contar);
      contador.repaint();
    } else {
      contar--;
      contador.setEtiqueta(contar);
    }
  contador.repaint();
  }

}
