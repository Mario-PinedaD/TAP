/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.io.File;
import java.util.ArrayList;
import modelos.GraficaCalculos;
import vistas.PanelGrafica;
import util.Archivo;

/**
 *
 * @author Mario Pineda
 */
public class OyenteGrafica {

  private GraficaCalculos modelo;
  private PanelGrafica vista;

  public OyenteGrafica(GraficaCalculos modelo, PanelGrafica vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  public void abrirArchivo() {
    String nombreArchivo = "D:/Mario Pineda/Documents/4to semestre/TAP/Proyectos/Unidad_1/Tareas/T18GraficaPastelArchivos/src/archivos";
    ArrayList<String> lineas = Archivo.leerArchivo(nombreArchivo); //Si carga el contendio del archivo al area de texto
    String cadena = lineas.get(0);
    String[] cantidades = cadena.split(",");
    modelo.llenarDatos(lineas);

    ArrayList<Integer> tmp = new ArrayList();
    for (String linea : cantidades) {
      tmp.add(Integer.parseInt(linea));
    }
    vista.repaint();
  }
}
