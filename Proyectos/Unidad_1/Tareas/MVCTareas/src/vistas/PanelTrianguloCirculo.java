/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import controladores.OyenteTriangulo;
import java.awt.event.ActionListener;
import modelos.TrianguloCirculo;
import modelos.TrianguloInscrito;

/**
 *
 * @author Mario Pineda
 */
public class PanelTrianguloCirculo extends javax.swing.JPanel {

  private final TrianguloCirculo trangulo;

  /**
   * Creates new form PanelTrianguloCirculo
   */
  public PanelTrianguloCirculo(TrianguloCirculo trangulo) {
    this.trangulo = trangulo;
    initComponents();
  }

  public void addEventos(ActionListener e) {
    botonAumentar.addActionListener(e);
    botonDisminuir.addActionListener(e);

    botonAumentar.setName("aumentar");
    botonDisminuir.setName("disminuir");
  }

  public int getAnchoCentro() {
    return panelCentro.getWidth();
  }

  public int getAltoCentro() {
    return panelCentro.getHeight();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelSur = new javax.swing.JPanel();
    botonAumentar = new javax.swing.JButton();
    botonDisminuir = new javax.swing.JButton();
    panelCentro = new TrianguloInscrito(trangulo);

    setLayout(new java.awt.BorderLayout());

    panelSur.setBackground(panelCentro.getBackground());

    botonAumentar.setText("Aumentar el Radio");
    panelSur.add(botonAumentar);

    botonDisminuir.setText("Disminuir el Radio");
    panelSur.add(botonDisminuir);

    add(panelSur, java.awt.BorderLayout.SOUTH);

    javax.swing.GroupLayout panelCentroLayout = new javax.swing.GroupLayout(panelCentro);
    panelCentro.setLayout(panelCentroLayout);
    panelCentroLayout.setHorizontalGroup(
      panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    panelCentroLayout.setVerticalGroup(
      panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 265, Short.MAX_VALUE)
    );

    add(panelCentro, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonAumentar;
  private javax.swing.JButton botonDisminuir;
  private javax.swing.JPanel panelCentro;
  private javax.swing.JPanel panelSur;
  // End of variables declaration//GEN-END:variables
}
