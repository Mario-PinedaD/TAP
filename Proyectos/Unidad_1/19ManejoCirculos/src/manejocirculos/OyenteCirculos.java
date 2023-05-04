package manejocirculos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
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
  private int deltaX;
  private int deltaY;

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

  /*
    Método para seleccionar el circulo
  El for con Int se utilizó para poder seleccionar correctamente el método
  El anterior seleccionaba los anteriores primero, por lo que no se podía ver "natural"
  
  Delta X y Y los obtenemos para qu eno haya ningun problema a la hora de mover el circulo
  haciendo que se mantenga en la posicion Deseada y no haya saltos
  
   */
  @Override
  public void mousePressed(MouseEvent e) {
    for (int i = circulos.size() - 1; i >= 0; i--) {
      Circulo circulo = circulos.get(i);

      if (circulo.contiene(e.getX(), e.getY())) { //Si el mouse está dentro de un circulo
        seleccionado = true;
        circuloSeleccionado = circulo; //Decimos que el seleccionado es ese
        deltaX = circulo.x - e.getX();
        deltaY = circulo.y - e.getY();

        //Si pulsamos el BOTON DERECHO del mouse
        if (SwingUtilities.isRightMouseButton(e)) {
          //Cremos nuestro propio panel
          JOptionPane panelConfirmacion = new JOptionPane("Eliminar Este Circulo",
            JOptionPane.QUESTION_MESSAGE,
            JOptionPane.YES_NO_OPTION);

          //Creamos nuestro propia ventana de dialogo
          JDialog dialogo = panelConfirmacion.createDialog(panel,
            "Confirmacion");
          dialogo.setSize(250, 120);
          dialogo.setLocation(e.getXOnScreen(), e.getYOnScreen()); //La colocamos justo en la posicion del clic
          dialogo.setVisible(true);

          //Preguntamos cual fue la seleccion utilizada
          Integer seleccion = (Integer) panelConfirmacion.getValue();

          if (seleccion == JOptionPane.YES_OPTION) { //si dijo que si
            circulos.remove(circuloSeleccionado); //eliminamos el circulo seleccionado
          }
        }
        break;
      }
    }
//      for (Circulo circulo : circulos) { //Checamos cada componente del arrayList
//        if (circulo.contiene(e.getX(), e.getY())) { //Si el mouse está dentro de un circulo
//          seleccionado = true;
//          circuloSeleccionado = circulo; //Decimos que el seleccionado es ese
//          break;
//        }
//      }
  }

  /*
    Eliminamos la seleccion una vez se elimna el click
   */
  @Override
  public void mouseReleased(MouseEvent e) {
    seleccionado = false;
  }

  /*
  * Método Para mover el circulo
  Por otrolado a l ahora de mover el circulo necesitamos cambiar el punto en X y Y
  utilizando los valores tanto del raton como de la "distancia" que debe de haber entre el centro
  y el mouse
   */
  @Override
  public void mouseDragged(MouseEvent e) {
    if (seleccionado) { //En el caso de que esté activdo el circulo se puede mover
      circuloSeleccionado.x = e.getX() + deltaX;
      circuloSeleccionado.y = e.getY() + deltaY;
      panel.repaint();
    }
  }
}
