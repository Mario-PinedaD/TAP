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
        editarJugador();

        break;
      }
      case "eliminar": {
        eliminarJugador();
        break;
      }
      case "inicializar": {
        inicializarValores();
        break;
      }
      case "registrar": {
        registrarJugador();
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
        actualizarJugador();
        break;
      }
      case "cancelar": { //Boton
        dialogo.setVisible(false);
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
        System.out.println(jugador);
        
      }
      vista.actualizarEtiquetas();
    }
  }
  
  //Método para el boton Aceptar
  public void actualizarJugador(){
    
  }

  //Método para inicializar valores
  public void inicializarValores() {
    int seleccion = this.mostrarMensajeSeleccion("Eliminar jugadores", "¿Muerte al infiel?");

    if (seleccion == JOptionPane.YES_OPTION) {
      //Limpiamos el modelo
      jugadores.inicializarJugadores(); //MODELO
      //Limpiamos la tabla
      datosTabla.setNumRows(0);
      //Recargamos la etiqueta
      vista.actualizarEtiquetas();
    }
  }

  //Método para Eliminar un jugador
  public void eliminarJugador() {
    if (validarJugador()) {
      dialogo.show("Elimnar Jugador", "Eliminar",
        NOMBRE_OFF, COMBOS_OFF);
    }
  }

  //Método para editar un jugador
  public void editarJugador() {
    if (validarJugador()) {
      dialogo.show("Modificar Jugador", "Modificar",
        NOMBRE_OFF, COMBOS_ON);
    }
  }

  //Método para Validar que se seleccionó un jugador
  public boolean validarJugador() {
    int renglon = vista.getTabla().getSelectedRow();
    if (renglon != -1) {
      String[] valores = {
        (String) datosTabla.getValueAt(renglon, 0),
        (String) datosTabla.getValueAt(renglon, 1),
        (String) datosTabla.getValueAt(renglon, 2),
        (String) datosTabla.getValueAt(renglon, 3),
        (String) datosTabla.getValueAt(renglon, 4),
        (String) datosTabla.getValueAt(renglon, 5),};
      //
      dialogo.setComponentes(valores);
    } else {
      mostrarMensajeError("Error de Registro", "Debes seleccionar un registro de la tabla");
      return false;
    }
    return true;
  }

  //Método Registrar Jugador
  public void registrarJugador() {
    String[] valores = {"", "Soleado", "Caluroso", "Baja", "Si", "SI"};
    dialogo.setComponentes(valores);
    dialogo.show("Registrar Jugador", "Adicionar",
      NOMBRE_ON, COMBOS_ON);
  }

  //Mostrar mensaje error
  public void mostrarMensajeError(String titulo, String mensaje) {
    JOptionPane.showMessageDialog(vista, mensaje,
      titulo, JOptionPane.OK_OPTION);
  }

  //Método para la selección de 2 opciones
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
    Component origen = (Component) e.getSource();
    switch (origen.getName()) {
      case "ventana": {
        salirPrograma();
      }
      case "dialogo": {
        dialogo.setVisible(false);
      }
    }
  }

}
