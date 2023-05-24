/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import modelos.GraficaPastel;
import util.Archivo;
import vistas.VentanaGraficaPastel;

/**
 *
 * @author Mario Pineda
 */
public class OyenteGrafica implements ActionListener {

  private final GraficaPastel modelo;
  private final VentanaGraficaPastel vista;

  public OyenteGrafica(GraficaPastel modelo, VentanaGraficaPastel vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component disparo = (Component) e.getSource();
    switch (disparo.getName()) {
      case "abrir": {
        System.out.println("Abriendo");
        abrirArchivo();
        break;
      }
      case "cerrar": {
        System.exit(0);
        break;
      }
    }

  }

  //Se abre el poderoso Archivo
  public void abrirArchivo() {
    JFileChooser arch = new JFileChooser();//PA elegir archivo
    int operacion = arch.showOpenDialog(vista);

    if (operacion == JFileChooser.APPROVE_OPTION) {
      System.out.println("Se abrió");
      File archivo = arch.getSelectedFile();
      ArrayList<String> lineas = Archivo.leerArchivo(archivo); //Se lee el archivo
      String cadena = lineas.get(0);
      String[] cantidades = cadena.split(",");
      modelo.getDatos().clear();

      //Llenamos un poderoso Arraylist con enteros
      ArrayList<Integer> datos = new ArrayList();
      for (String linea : cantidades) {
        datos.add(Integer.parseInt(linea));
      }
      modelo.setDatos(datos);
      vista.repaint();
      System.out.println("abrirArchivo Finalizado");
    }

  }
}
