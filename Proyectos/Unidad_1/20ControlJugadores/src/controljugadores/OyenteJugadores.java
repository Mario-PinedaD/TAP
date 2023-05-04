package controljugadores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import modelos.Jugadores;

/**
 *
 * @author Mario Pineda
 */
public class OyenteJugadores implements ActionListener {

  private Jugadores jugadores;    //Modelo
  private VentanaJugadores vista; //Vista

  public OyenteJugadores(Jugadores jugadores, VentanaJugadores vista) {
    this.jugadores = jugadores;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component origen = (Component) e.getSource();

    switch (origen.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }

    }
  }

  public void abrirArchivo() {
    JFileChooser seleccion = new JFileChooser();
    int opcion = seleccion.showOpenDialog(vista);

    if (opcion == JFileChooser.APPROVE_OPTION) {
      System.out.println(seleccion.getSelectedFile().getName());
    }
  }

}
