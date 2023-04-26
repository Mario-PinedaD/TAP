package manejocirculos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class OyenteCirculos extends MouseAdapter {

  private final Circulos circulos; //Modelo
  private final PanelDibujable panel; //Vista
  private boolean seleccionado;
  private Circulo circuloSeleccionado;

  public OyenteCirculos(Circulos circulos, PanelDibujable panel) {
    this.circulos = circulos;
    this.panel = panel;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    int radio = 5 + (int) (Math.random() * 56); //Con esto generamos valores en donde el radio despues pueda ser de un minimo de 5 hasta un maximo de 60
    int rojo = (int) (Math.random() * 256);
    int verde = (int) (Math.random() * 256);
    int azul = (int) (Math.random() * 256);

    Color miColor = new Color(rojo, verde, azul);
    Circulo circulo = new Circulo(e.getX(), e.getY(), radio, miColor);

    circulos.add(circulo);

    panel.repaint();
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    panel.repaint();
  }

}
