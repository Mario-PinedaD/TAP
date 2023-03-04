package editor;

import java.util.ArrayList;
import util.Archivo;

public class PanelEditor extends javax.swing.JPanel {

  public PanelEditor() {
    initComponents();
    abrirArchivo();
  }

  public void abrirArchivo() {
      String nombreArchivo = "/archivos/HimnoITV 1.txt";
      ArrayList<String> contenido = 
        Archivo.leerArchivo(getClass().getResourceAsStream(nombreArchivo));
      for (String linea : contenido) {
        areaEdicion.append(linea + "\n");
      }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelCentro = new javax.swing.JScrollPane();
    areaEdicion = new javax.swing.JTextArea();

    setLayout(new java.awt.BorderLayout());

    panelCentro.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground()));
    panelCentro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    panelCentro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

    areaEdicion.setColumns(20);
    areaEdicion.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
    areaEdicion.setRows(5);
    panelCentro.setViewportView(areaEdicion);

    add(panelCentro, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea areaEdicion;
  private javax.swing.JScrollPane panelCentro;
  // End of variables declaration//GEN-END:variables
}
