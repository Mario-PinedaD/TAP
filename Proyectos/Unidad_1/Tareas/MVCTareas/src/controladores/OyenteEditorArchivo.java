/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import trabajoarchivos.DialogoPalabras;
import util.Archivo;
import vistas.VentanaEditorArchivo;

/**
 *
 * @author Mario Pineda
 */
public class OyenteEditorArchivo extends WindowAdapter implements ActionListener {

  private VentanaEditorArchivo vent;
  private File archivo; //Archivo
  private ArrayList<String> lineas; //Donde se guardan las lineas
  private JTextArea areaTexto;

  public OyenteEditorArchivo(VentanaEditorArchivo vent) {
    this.vent = vent;
    lineas = vent.getLineas();
    areaTexto = vent.getAreaTexto();
    archivo = vent.getArchivo();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component disparo = (Component) e.getSource();

    switch (disparo.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }
      case "guardar": {
        guardarArchivo();
        break;
      }
      case "salir": {
        salirPrograma();
        break;
      }
      case "copiar": {
        copiar();
        break;
      }
      case "cortar": {
        cortar();
        break;
      }
      case "pegar": {
        pegar();
        break;
      }
      case "mayus": {
        cambiarMayus();
        break;
      }
      case "minus": {
        cambiarMinus();
        break;
      }
      case "contar": {
        contarPalabras();
        break;
      }
    }
  }

  public void abrirArchivo() {
    JFileChooser selec = new JFileChooser();
    FileNameExtensionFilter filtroTexto = new FileNameExtensionFilter("Archivos de texto", "txt");
    selec.setFileFilter(filtroTexto);//Aplicamos un filtro para esperar recibir un txt
    int opcion = selec.showOpenDialog(vent);
    if (opcion == JFileChooser.APPROVE_OPTION) {
      archivo = selec.getSelectedFile();
      lineas = Archivo.leerArchivo(archivo); //Leemos el archivo
      areaTexto.setText("");
      for (String linea : lineas) {
        areaTexto.append(linea + "\n");
      }
    }
  }

  public void guardarArchivo() {
    JFileChooser seleccion = new JFileChooser();
    int opcion = seleccion.showSaveDialog(vent); //Preguntar si quiere guardar

    if (opcion == JFileChooser.APPROVE_OPTION) { //Si dice que si
      archivo = seleccion.getSelectedFile();
      if (lineas != null) {
        lineas.clear();
        lineas.add(areaTexto.getText());
      } else {
        ArrayList<String> linea = new ArrayList<>();
        linea.add(areaTexto.getText());
        lineas = linea;
      }
      Archivo.grabarArchivo(archivo, lineas);
    }
  }

  public void salirPrograma() {
    int seleccion = this.mostrarMensajeSeleccion("Salir del Programa", "¿Amonos?");
    if (seleccion == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }

  //Método para la selección de 2 opciones
  public int mostrarMensajeSeleccion(String titulo, String mensaje) {
    return JOptionPane.showConfirmDialog(vent, mensaje,
      titulo, JOptionPane.YES_NO_OPTION);
  }

  public void copiar() {
    areaTexto.copy();
  }

  public void cortar() {
    areaTexto.cut();
  }

  public void pegar() {
    areaTexto.paste();
  }

  public void cambiarMayus() {
    String[] cadena = areaTexto.getText().split("\n");
    areaTexto.removeAll();
    areaTexto.setText("");
    String mayus;
    for (int i = 0; i < cadena.length; i++) {
      mayus = cadena[i].toUpperCase();
      areaTexto.append(mayus + "\n");
    }
  }

  public void cambiarMinus() {
    String[] cadena = areaTexto.getText().split("\n");
    areaTexto.removeAll();
    areaTexto.setText("");
    String minus;
    for (int i = 0; i < cadena.length; i++) {
      minus = cadena[i].toLowerCase();
      areaTexto.append(minus + "\n");
    }

  }

  public void contarPalabras() {
    String[] cadenaTexto = areaTexto.getText().split("\n");
    DialogoPalabras dialogo = new DialogoPalabras(vent, true, cadenaTexto);
    dialogo.setSize(400, 200);
    int posX = vent.getX() + (vent.getWidth() - dialogo.getWidth()) / 2;
    int posY = vent.getY() + 100;
    dialogo.setLocation(posX, posY);
    dialogo.setVisible(true);
  }

//  @Override
//  public void windowClosing(WindowEvent e) {
//    Component disparo = (Component) e.getSource();
//    switch (disparo.getName()) {
//      case "ventana": {
//      }
//    }
//  }
}
