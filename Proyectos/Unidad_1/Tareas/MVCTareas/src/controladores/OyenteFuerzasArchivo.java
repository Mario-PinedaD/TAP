/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import modelos.Fuerza;
import modelos.Fuerzas;
import util.Archivo;
import vistas.FrameEquilibrio;

/**
 *
 * @author Mario Pineda
 */
public class OyenteFuerzasArchivo implements ActionListener {

  private Fuerzas modelo;
  private FrameEquilibrio vista;
  private double[] magnitudes;
  private double[] angulos;

  public OyenteFuerzasArchivo(Fuerzas modelo, FrameEquilibrio vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component disparo = (Component) e.getSource();

    switch (disparo.getName()) {
      case "abrir": {
        abrirArchivo();
        break;
      }
      case "salir": {
        System.exit(0);
        break;
      }
    }
  }

  public void abrirArchivo() {
    Fuerzas fuerzas = vista.getFuerza();
    fuerzas.clear();
    JFileChooser arch = new JFileChooser();//PA elegir archivo
    int operacion = arch.showOpenDialog(vista);

    if (operacion == JFileChooser.APPROVE_OPTION) {
      System.out.println("Abriendo");
      File archivo = arch.getSelectedFile();
      ArrayList<String> lineas = Archivo.leerArchivo(archivo); //Se lee el archivo
      //Ocupamos saber cuantos datos son
      int cantDatos = lineas.size();
      //Ponermos el largo de los datos
      magnitudes = new double[cantDatos];
      angulos = new double[cantDatos];

      for (int i = 0; i < cantDatos; i++) {
        String linea = lineas.get(i);
        String[] temp = linea.split(",");
        magnitudes[i] = Double.parseDouble(temp[0]);
        angulos[i] = Double.parseDouble(temp[1]);
        Fuerza fuerza = new Fuerza(magnitudes[i], angulos[i], Color.BLACK);
        fuerzas.add(fuerza);
      }
      Fuerza fuerzaResultante = fuerzas.sumarFuerzas(fuerzas);
      fuerzas.add(fuerzaResultante);
      vista.repaint();
    }

  }
}
