/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import modelos.GraficaBarrasPastel;

/**
 *
 * @author Mario Pineda
 */
public class VentanaBarraPastel extends javax.swing.JFrame {

  private GraficaBarrasPastel modelo;

  /**
   * Creates new form VentanaBarraPastel
   */
  public VentanaBarraPastel() {
    initComponents();
  }

  public VentanaBarraPastel(GraficaBarrasPastel modelo) {
    this.modelo = modelo;
    initComponents();
  }

  public void addEventos(ActionListener e) {
    this.opcionAbrir.addActionListener(e);
    this.opcionSalir.addActionListener(e);
    this.opcionBarras.addActionListener(e);
    this.opcionPastel.addActionListener(e);
    this.opAyudaBarras.addActionListener(e);
    this.opAyudaPastel.addActionListener(e);

    this.opcionAbrir.setName("abrir");
    this.opcionSalir.setName("salir");
    this.opcionBarras.setName("barra");
    this.opcionPastel.setName("pastel");
    this.opAyudaBarras.setName("ayuBarra");
    this.opAyudaPastel.setName("ayuPastel");

    this.addWindowListener((WindowListener) e);
    this.setName("vent");

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelCentro = new PanelGraficas(modelo);
    barraMenu = new javax.swing.JMenuBar();
    menuArchio = new javax.swing.JMenu();
    opcionAbrir = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    opcionSalir = new javax.swing.JMenuItem();
    menuGraficas = new javax.swing.JMenu();
    opcionPastel = new javax.swing.JMenuItem();
    opcionBarras = new javax.swing.JMenuItem();
    menuAyuida = new javax.swing.JMenu();
    opAyudaBarras = new javax.swing.JMenuItem();
    opAyudaPastel = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout panelCentroLayout = new javax.swing.GroupLayout(panelCentro);
    panelCentro.setLayout(panelCentroLayout);
    panelCentroLayout.setHorizontalGroup(
      panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    panelCentroLayout.setVerticalGroup(
      panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 280, Short.MAX_VALUE)
    );

    getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

    menuArchio.setText("Archivo");

    opcionAbrir.setText("Abrir Archivo");
    menuArchio.add(opcionAbrir);
    menuArchio.add(jSeparator1);

    opcionSalir.setText("Salir del Programa");
    menuArchio.add(opcionSalir);

    barraMenu.add(menuArchio);

    menuGraficas.setText("Grafica");

    opcionPastel.setText("Mostrar como Grafica de Pastel");
    menuGraficas.add(opcionPastel);

    opcionBarras.setText("Mostrar como Grafica de Barras");
    menuGraficas.add(opcionBarras);

    barraMenu.add(menuGraficas);

    menuAyuida.setText("Ayuda");

    opAyudaBarras.setText("Grafica de Barras");
    menuAyuida.add(opAyudaBarras);

    opAyudaPastel.setText("Grafica de Pastel");
    menuAyuida.add(opAyudaPastel);

    barraMenu.add(menuAyuida);

    setJMenuBar(barraMenu);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JMenu menuArchio;
  private javax.swing.JMenu menuAyuida;
  private javax.swing.JMenu menuGraficas;
  private javax.swing.JMenuItem opAyudaBarras;
  private javax.swing.JMenuItem opAyudaPastel;
  private javax.swing.JMenuItem opcionAbrir;
  private javax.swing.JMenuItem opcionBarras;
  private javax.swing.JMenuItem opcionPastel;
  private javax.swing.JMenuItem opcionSalir;
  private javax.swing.JPanel panelCentro;
  // End of variables declaration//GEN-END:variables
}
