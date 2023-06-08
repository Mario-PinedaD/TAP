package controladores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
//Clase Controlador
public class OyenteRaton extends MouseAdapter { //Hereda de la clase que utiliza los métodos del mouse

  private Circulo modelo;
  private PanelDibujable vista;
  private boolean seleccionado;
  private int deltX;
  private int deltY;

  public OyenteRaton(Circulo modelo, PanelDibujable vista) { //Le pasamos los parámetros para que se puedan hacer as cosas
    this.modelo = modelo;
    this.vista = vista;
  }

  //Para cuando movemos el puntero simplemente mover
  @Override
  public void mouseMoved(MouseEvent e) {
    //System.out.println("("+e.getX()+","+e.getY()+")");
    modelo.x = e.getX();
    modelo.y = e.getY();
    vista.repaint();
  }

  //Boton Presionado
  @Override
  public void mousePressed(MouseEvent e) {

    if (modelo.contiene(e.getX(), e.getY())) {
      seleccionado = true;
      deltX = modelo.x - e.getX();
      deltY = modelo.y - e.getY();

//      System.out.println("Seleccionó el circulo");
//      //mouseDragged();
//      vista.repaint();
//    } else {
//      System.out.println("No seleccionó el circulo");
    }

  }

  //El ratón se arrastra clic y mover vaya
  @Override
  public void mouseDragged(MouseEvent e) {
    if (seleccionado) { //Si es verdadero
      modelo.x = e.getX() + deltX;
      modelo.y = e.getY() + deltY;
      System.out.println("Muevo el circulo"); //Se mueve el circulo
      vista.repaint();
    }
  }

  //El boton se deja de presionar
  @Override
  public void mouseReleased(MouseEvent e) {
    seleccionado = false;
  }

}
