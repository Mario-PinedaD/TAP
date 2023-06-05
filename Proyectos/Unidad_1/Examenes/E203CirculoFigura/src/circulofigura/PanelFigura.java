/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package circulofigura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Mario Pineda
 */
public class PanelFigura extends javax.swing.JPanel {

  /**
   * Creates new form PanelFigura
   */
  public PanelFigura() {
    initComponents();
    this.panelCentro.setLados(3);
    this.botonAumentar.addActionListener(new OyenteFigura());
    this.botonDisminuir.addActionListener(new OyenteFigura());
    this.botonAumentar.setName("aumentar");
    this.botonDisminuir.setName("disminuir");
  }
  
  public void addEventos(ActionListener e) {
    this.botonAumentar.addActionListener(e);
    this.botonDisminuir.addActionListener(e);
    this.botonAumentar.setName("aumentar");
    this.botonDisminuir.setName("disminuir");
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
    panelCentro = new poligonoconeventos.PanelDibujo();

    setLayout(new java.awt.BorderLayout());

    botonAumentar.setText("Aumentar");
    panelSur.add(botonAumentar);

    botonDisminuir.setText("Disminuir");
    panelSur.add(botonDisminuir);

    add(panelSur, java.awt.BorderLayout.PAGE_END);

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
  private poligonoconeventos.PanelDibujo panelCentro;
  private javax.swing.JPanel panelSur;
  // End of variables declaration//GEN-END:variables

  public class OyenteFigura implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
      JButton boton = (JButton) e.getSource();
      
      switch (boton.getName()) {
        case "aumentar": {
          if (panelCentro.getLados() >= 2) {
            int lado = panelCentro.getLados();
            panelCentro.setLados(lado + 1);
          }
          break;
        }
        case "disminuir": {
          if (panelCentro.getLados() > 3) {
            int lado = panelCentro.getLados();
            panelCentro.setLados(lado - 1);
          }else{
            
          }
        }
      }
      panelCentro.repaint();
    }
    
  }
}
