package editorconeventos;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import util.Archivo;

/**
 *
 * @author Mario Pineda
 */
public class VentanaEditor extends javax.swing.JFrame implements ActionListener {

  /**
   * Creates new form VentanaEditor
   */
  public VentanaEditor() {
    initComponents();
    addEventos();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component origen = (Component) e.getSource();

    switch (origen.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }
      case "salir": {
        System.exit(0);
      }
    }
  }

  public void abrirArchivo() {
    JFileChooser seleccion = new JFileChooser(); //El FileChooser genera una nueva ventana para poder seleccionar el archivo
    /*Al retornar un entero guardamos la seleccion dentro de una variable para despues poder aplicar 
    diferentes casos con diferentes opciones*/
    int opcion = seleccion.showOpenDialog(this);
    if (opcion == JFileChooser.APPROVE_OPTION) {
      //Abrimos el archivo con el Método "leerArchivo" y el seleccion.getSelectedFile().getPath() nos devuelve el nombre del mismo
      ArrayList<String> lineas = Archivo.leerArchivo(seleccion.getSelectedFile().getPath());

      areaTexto.setText("");//Dejamos vacio el area de texto para q al abrir un nuevo archivo aparezca unicamente ese
      for (String linea : lineas) {
        //Añade todas las lineas al textArea con el Salto de linea para q no se vea feo
        areaTexto.append(linea + "\n");//append unicamente adiciona sin simportar que haya algo antes
      }

      //System.out.println(seleccion.getSelectedFile().getPath()); //Imprime en consola el nombre del archivo seleccionado
    } else {

    }

  }

  public void addEventos() { //Simplemente se dice que el oyente es de la clase Listener
    opcionAbrir.addActionListener(this); //dice que esta clase es el oyente y ya
    opcionSalir.addActionListener(this);

    //Nombramos los generadores de eventos
    opcionAbrir.setName("abrir");
    opcionSalir.setName("salir");
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelCentro = new javax.swing.JScrollPane();
    areaTexto = new javax.swing.JTextArea();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    opcionAbrir = new javax.swing.JMenuItem();
    separador = new javax.swing.JPopupMenu.Separator();
    opcionSalir = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Editor de texto");

    panelCentro.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 20));
    panelCentro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    panelCentro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

    areaTexto.setColumns(20);
    areaTexto.setRows(5);
    panelCentro.setViewportView(areaTexto);

    getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

    menuArchivo.setText("Archivo");

    opcionAbrir.setText("Abrir Archivo");
    menuArchivo.add(opcionAbrir);
    menuArchivo.add(separador);

    opcionSalir.setText("Salir del programa");
    menuArchivo.add(opcionSalir);

    barraMenu.add(menuArchivo);

    setJMenuBar(barraMenu);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea areaTexto;
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenuItem opcionAbrir;
  private javax.swing.JMenuItem opcionSalir;
  private javax.swing.JScrollPane panelCentro;
  private javax.swing.JPopupMenu.Separator separador;
  // End of variables declaration//GEN-END:variables

}
