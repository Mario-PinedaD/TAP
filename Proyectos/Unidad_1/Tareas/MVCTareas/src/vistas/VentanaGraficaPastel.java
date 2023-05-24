/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.event.ActionListener;
import modelos.GraficaPastel;

/**
 *
 * @author mario
 */
public class VentanaGraficaPastel extends javax.swing.JFrame {
  private GraficaPastel grafica;

  /**
   * Creates new form VentanaGraficaPastel
   */
  public VentanaGraficaPastel(GraficaPastel panel) {
    this.grafica=grafica;
    initComponents();
  }
  
  public void addEventos(ActionListener e) {
    this.opcionAbrir.addActionListener(e);
    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    barraMenu = new javax.swing.JMenuBar();
    menuArchivos = new javax.swing.JMenu();
    opcionAbrir = new javax.swing.JMenuItem();
    separador = new javax.swing.JPopupMenu.Separator();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    menuArchivos.setText("Archivo");

    opcionAbrir.setText("Abrir Archivo");
    menuArchivos.add(opcionAbrir);
    menuArchivos.add(separador);

    barraMenu.add(menuArchivos);

    setJMenuBar(barraMenu);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JMenu menuArchivos;
  private javax.swing.JMenuItem opcionAbrir;
  private javax.swing.JSeparator separador;
  // End of variables declaration//GEN-END:variables
}
