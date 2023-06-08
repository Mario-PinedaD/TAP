/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malla;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import util.Archivo;

/**
 *
 * @author Mario Pineda
 */
public class OyenteVentana implements ActionListener {

  private PanelDibujo panel;
  private VentanaMalla vista;
  private int x;
  private int y;
  private File archivo;
  private ArrayList<Integer> datos;

  public OyenteVentana(VentanaMalla vista, PanelDibujo panel) {
    this.vista = vista;
    this.panel = panel;
    datos = new ArrayList<>();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component disparo = (Component) e.getSource();

    switch (disparo.getName()) {
      case "abrir" ->  {
        System.out.println("Abre");
        abrirArchivo();
      }
      case "salir" -> {
        System.out.println("Sale");
        System.exit(0);
      }
    }
  }

  public void abrirArchivo() {
    JFileChooser selec = new JFileChooser();
    int opcion = selec.showOpenDialog(vista);
    if (opcion == JFileChooser.APPROVE_OPTION) {
      //String archivo = "/datos/Otro.txt";
      archivo = selec.getSelectedFile();
      System.out.println("Selecionó el archiving");
      ArrayList<String> lineas = Archivo.leerArchivo(archivo);
      System.out.println("Si llega a leer");
      String cadena = lineas.get(0);
      String[] cantidades = cadena.split(",");
      for (String linea : cantidades) {
        datos.add(Integer.parseInt(linea.trim()));
        System.out.println(linea);
      }
      for (int i = 0; i < datos.size(); i++) {
        switch (i) {
          case 0 -> {
            x = datos.get(i);
            System.out.println("Equis qeuivale a : " + x);
          }
          case 1 -> {
            y = datos.get(i);
            System.out.println("Ye equivale a " + y);
          }
          default ->
            System.out.println("Mas de 2 datos");
        }
      }
      this.panel.setHorizontales(x);
      this.panel.setVerticales(y);

    }

    panel.repaint();

    vista.repaint();
  }
}
