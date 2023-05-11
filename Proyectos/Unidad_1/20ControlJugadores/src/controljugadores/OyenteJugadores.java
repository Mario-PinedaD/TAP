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

  public static final boolean NOMBRE_ON = true;
  public static final boolean NOMBRE_OFF = false;
  public static final boolean COMBOS_ON = true;
  public static final boolean COMBOS_OFF = false;

  private Jugadores jugadores;    //Modelo
  private VentanaJugadores vista; //Vista
  private DefaultTableModel datosTabla;   //Modelo de la tabla
  private DialogoRegistroJugador dialogo; //Creamos la ventana vacía

  public OyenteJugadores(Jugadores jugadores, VentanaJugadores vista) {
    this.jugadores = jugadores;
    this.vista = vista;
    datosTabla = vista.getDatosTabla();
    dialogo = new DialogoRegistroJugador(vista, true);
    //Este es el generador de eventos
    dialogo.addEventos(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component origen = (Component) e.getSource();
    switch (origen.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }
      case "editar": {
        dialogo.show("Modificar Jugador", "Modificar", NOMBRE_OFF, COMBOS_ON);
        break;
      }
      case "eliminar": {
        dialogo.show("Elimnar Jugador", "Eliminar", NOMBRE_OFF, COMBOS_OFF);
        break;
      }
      case "inicializar": {

        break;
      }
      case "registrar": {
        dialogo.show("Registrar Jugador", "Adicionar", NOMBRE_ON, COMBOS_ON);
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
      case "aceptar": { //Boton
        break;
      }
      case "cancelar": { //Boton
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
    //Identificamos el oyente
    Component origen =(Component) e.getSource();
    switch(origen.getName()){
      case "ventana":{
        salirPrograma();
      }
      case "dialogo":{
        dialogo.setVisible(false);
      }
    }
  }

}
