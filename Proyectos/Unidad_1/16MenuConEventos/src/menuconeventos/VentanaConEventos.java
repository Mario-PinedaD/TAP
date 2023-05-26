/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menuconeventos;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import util.Archivo;

/**
 *
 * @author Mario Pineda
 */
public class VentanaConEventos extends javax.swing.JFrame {

  /**
   * Creates new form VentanaConEventos
   */
  public VentanaConEventos() {
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

    panelCentro = new poligonoconeventos.PanelDibujo();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    opcionAbrir = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    opcionSalir = new javax.swing.JMenuItem();
    menuAyuda = new javax.swing.JMenu();
    opcionAcecaDe = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Ventana Con Eventos");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

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

    menuArchivo.setText("Archivo");

    opcionAbrir.setText("Abrir Archivo");
    opcionAbrir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        abrirArchivo(evt);
      }
    });
    menuArchivo.add(opcionAbrir);
    menuArchivo.add(jSeparator1);

    opcionSalir.setText("Salir");
    opcionSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        opcionSalirActionPerformed(evt);
      }
    });
    menuArchivo.add(opcionSalir);

    barraMenu.add(menuArchivo);

    menuAyuda.setText("Ayuda");
    menuAyuda.setToolTipText("");

    opcionAcecaDe.setText("Aceca de");
    opcionAcecaDe.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        opcionAcecaDeActionPerformed(evt);
      }
    });
    menuAyuda.add(opcionAcecaDe);

    barraMenu.add(menuAyuda);

    setJMenuBar(barraMenu);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    // TODO add your handling code here:
    //Esto es para preguntar si queremos salir realmente
    salirDelPrograma();
  }//GEN-LAST:event_formWindowClosing

  private void opcionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionSalirActionPerformed
    // TODO add your handling code here:
    //Esto es para preguntar si queremos salir realmente
    salirDelPrograma();

  }//GEN-LAST:event_opcionSalirActionPerformed

  private void abrirArchivo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivo
    // TODO add your handling code here:
    JFileChooser selector = new JFileChooser();
    //filtramos los archvivos dependiendo de la "terminñación"
    FileNameExtensionFilter filtro
      = new FileNameExtensionFilter("Archivo de pol{igono", "lados");

    //aplicamos el filtro
    selector.setFileFilter(filtro);
    int opcion = selector.showOpenDialog(this);

//En caso de que se aprueve el seleccionar el archivo
    if (opcion == JFileChooser.APPROVE_OPTION) {

      //Se lee el archivo
      ArrayList<String> lineas = Archivo.leerArchivo(selector.getSelectedFile());
      panelCentro.setLados(Integer.parseInt(lineas.get(0)));
      this.repaint();
    }

  }//GEN-LAST:event_abrirArchivo

  private void opcionAcecaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAcecaDeActionPerformed
    // TODO add your handling code here:
    DialogoAcercaDe dialogo = new DialogoAcercaDe(this, true);//Selecionamos q el padre es esta ventana y modal pa q no haga nada
    dialogo.setSize(400, 500); //Seleccionamos el Tamaño de la ventana de dialogo
    
    //Toamos la posicion del dialogo de la ventana
    //Le sumamos el angulo de la ventana entre 2
    //Le restamos el largo de la ventana entre 2
    //el getWitdh, seria como tomar la mitad del panel
    int dX = this.getX() + this.getWidth() / 2 - dialogo.getWidth() / 2;

    //Unicamente se añaden 100 pixeles en y para que no Aparezca tan arriba
    int dY = this.getY() + 100;
    dialogo.setLocation(dX,dY);
    dialogo.setVisible(true);
  }//GEN-LAST:event_opcionAcecaDeActionPerformed

  private void salirDelPrograma() {
    //Genera una ventana de dialogo en donde preguntemos, si quiere salir
    int opcion = JOptionPane.showConfirmDialog(this,
      "¿Salir del programa?",
      "Confirmación",
      JOptionPane.OK_CANCEL_OPTION);

    if (opcion == JOptionPane.OK_OPTION) {
      System.exit(0);
    }

  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JMenuItem opcionAbrir;
  private javax.swing.JMenuItem opcionAcecaDe;
  private javax.swing.JMenuItem opcionSalir;
  private poligonoconeventos.PanelDibujo panelCentro;
  // End of variables declaration//GEN-END:variables

}