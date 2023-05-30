/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package malla;

import java.awt.event.ActionListener;

/**
 *
 * @author Mario Pineda
 */
public class VentanaMalla extends javax.swing.JFrame {

  private int hori;
  private int verti;

  /**
   * Creates new form VentanaMalla
   */
  public VentanaMalla() {
    initComponents();
  }

  public void addEventos(ActionListener e) {
    this.opcionArchivo.addActionListener(e);
    this.opcionSalir.addActionListener(e);

    this.opcionArchivo.setName("abrir");
    this.opcionSalir.setName("salir");
  }

  public void setHori(int cant) {
    this.hori = cant;
    panelCentro.repaint();
  }

  public void setVerti(int cant) {
    this.verti = cant;
    panelCentro.repaint();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelCentro = new PanelDibujo(this.hori,this.verti);
    jMenuBar1 = new javax.swing.JMenuBar();
    menuArchiivo = new javax.swing.JMenu();
    opcionArchivo = new javax.swing.JMenuItem();
    opcionSalir = new javax.swing.JMenuItem();

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

    menuArchiivo.setText("Archivo");

    opcionArchivo.setText("Abrir Archivo");
    menuArchiivo.add(opcionArchivo);

    opcionSalir.setText("Salir");
    menuArchiivo.add(opcionSalir);

    jMenuBar1.add(menuArchiivo);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenu menuArchiivo;
  private javax.swing.JMenuItem opcionArchivo;
  private javax.swing.JMenuItem opcionSalir;
  private javax.swing.JPanel panelCentro;
  // End of variables declaration//GEN-END:variables


}
