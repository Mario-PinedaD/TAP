/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package n101moneda;

/**
 *
 * @author Mario Pineda
 */
public class PanelMoneda extends javax.swing.JPanel {

  /**
   * Creates new form PanelMoneda
   */
  public PanelMoneda() {
    initComponents();
    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setLayout(new java.awt.BorderLayout(10, 0));

    jLabel1.setText("Cantidad a convertir");
    jPanel1.add(jLabel1);

    jTextField1.setColumns(5);
    jTextField1.setText("58.89");
    jPanel1.add(jTextField1);

    jLabel2.setText("Resultado 9465,70");
    jPanel1.add(jLabel2);

    add(jPanel1, java.awt.BorderLayout.PAGE_START);

    jButton1.setText("Euros a Pesetas");
    jPanel2.add(jButton1);

    jButton2.setText("Cambiar");
    jPanel2.add(jButton2);

    add(jPanel2, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField jTextField1;
  // End of variables declaration//GEN-END:variables
}
