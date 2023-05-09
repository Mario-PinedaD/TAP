package controljugadores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.Jugador;
import modelos.Jugadores;

/**
 *
 * @author Mario Pineda
 */
public class OyenteJugadores extends WindowAdapter implements ActionListener {

  private Jugadores jugadores;    //Modelo
  private VentanaJugadores vista; //Vista
  private DefaultTableModel datosTabla;   //Modelo de la tabla

  public OyenteJugadores(Jugadores jugadores, VentanaJugadores vista) {
    this.jugadores = jugadores;
    this.vista = vista;
    datosTabla = vista.getDatosTabla();
    
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component origen = (Component) e.getSource();

    switch (origen.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }
      case "guardar": {
        grabarArchivo();
        break;
      }
      case "salir": {
        salirPrograma();
        break;
      }

    }
  }

  public void grabarArchivo() {
    JFileChooser seleccion = new JFileChooser();
    int opcion = seleccion.showSaveDialog(vista); //Preguntar si quiere guardar

    if (opcion == JFileChooser.APPROVE_OPTION) { //Si dice que si
      File archivo = seleccion.getSelectedFile(); //Tomamos el nombre del archivo
      jugadores.grabarJugadores(archivo); //Lo guardamos en el modelo
    }
    vista.actualizarEtiquetas();//Actualizamos la etiqueda
  }

  public void abrirArchivo() {
    JFileChooser seleccion = new JFileChooser();
    //filtramos los archvivos dependiendo de la "terminñación"
    FileNameExtensionFilter filtro
      = new FileNameExtensionFilter("Archivo CSV", "csv");
    seleccion.setFileFilter(filtro);
    int opcion = seleccion.showOpenDialog(vista);

    if (opcion == JFileChooser.APPROVE_OPTION) {
      /*
      Volvemos al archivo como nuestro modelo
      Actualizxar el modelo
       */
      jugadores.leerJugadores(seleccion.getSelectedFile());
      datosTabla.setNumRows(0); //Limpiamos la tabla
      for (Jugador jugador : jugadores.values()) {
        //Cada que leamos un dato necesitamos una fila
        datosTabla.addRow(jugador.getJugador());
        vista.actualizarEtiquetas();
      }
    }
  }

  public int mostrarMensajeSeleccion(String titulo, String mensaje) {
    return JOptionPane.showConfirmDialog(vista, mensaje,
      titulo, JOptionPane.YES_NO_OPTION);
  }

  private void salirPrograma() {
    int seleccion = mostrarMensajeSeleccion("Salir del programa", "¿Desea salir del programa?");

    if (seleccion == JOptionPane.YES_OPTION) {
      System.exit(0);
    } else {
    }
  }

  @Override
  public void windowClosing(WindowEvent e) {
    salirPrograma();
  }

}
