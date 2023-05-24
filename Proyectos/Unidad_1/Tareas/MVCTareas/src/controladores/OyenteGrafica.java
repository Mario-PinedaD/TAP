/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

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

  private GraficaPastel modelo;
  private VentanaGraficaPastel vista;

  public OyenteGrafica(GraficaPastel modelo, VentanaGraficaPastel vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    this.abrirArchivo();
  }

  //Se abre el poderoso Archivo
  public void abrirArchivo() {
    JFileChooser arch = new JFileChooser();//PA elegir archivo
    int operacion = arch.showOpenDialog(vista);

    if (operacion == JFileChooser.APPROVE_OPTION) {
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

      vista.repaint();
    }

  }
}
