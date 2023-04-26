package poligonoconeventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario Pineda
 */
public class VentanaPoligono extends javax.swing.JFrame {

  /**
   * Creates new form VentanaPoligono
   */
  public VentanaPoligono() {
    initComponents();
    //Creamos una nueva cosa para añadir un nuevo evento con la clase OyenteVentana.
    this.campoLados.addActionListener(new OyenteVentana());

  }

  //Crear una clase privada dentro de otra, en donde va a ser un oyente de eventos
  private class OyenteVentana implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String texto = campoLados.getText();//Nos devuelve en texto la cantidad de lados

      try {
        //Llamamos al panel dibujo aunque ahora aqui lo llamamos "panelCentro"
        panelCentro.setLados(Integer.parseInt(texto)); //Convertimos el "cinco" en un 5

      } catch (NumberFormatException ex) {

        /*En el caso de que Se introduzcan valores ue no se puedan usar, como strings por ejemplo, 
        se muestra un mensaje con el error de "Error de captura para la wea", 
        se reinician los lados y se vacía el campo
         */
        JOptionPane.showMessageDialog(panelCentro, "Captura Numeros Enteros",
          "Error de Captura", JOptionPane.ERROR_MESSAGE);
        panelCentro.setLados(0);
        campoLados.setText("");
      }

      panelCentro.repaint();//Necesita repintarse para que ejecute lo anteriór

    }
  }

  /*
  
  1 Debe ser una herencia de alguna wea
  2 debe tener un constructor sin argumentos
   */
 /*
  Para agregar un Componente gráfico necesitamos:
  1.- Dar clean and build
  2.- Ir al panel que queremos anexar y darle clic derecho
  3.- En tools ponerle "add to palete"
  4.- Dependiendo del tipo de cosa que ocupemos vamos a utilizar cosas, en este caso el beans
  5.- Ingresamos al JFrame y ahora si podemos buscarlo dentro de 
    la categoría que tenemos para poder añadirlo al panel
   */
  @SuppressWarnings("unchecked")

  //En el campo lados podemos utilizar lo de "setColumns" para que no se vea reducida el area
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelNorte = new javax.swing.JPanel();
    etiquetaLados = new javax.swing.JLabel();
    campoLados = new javax.swing.JTextField();
    panelCentro = new poligonoconeventos.PanelDibujo();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    etiquetaLados.setText("Número de Lados:");
    panelNorte.add(etiquetaLados);

    campoLados.setColumns(10);
    panelNorte.add(campoLados);

    getContentPane().add(panelNorte, java.awt.BorderLayout.PAGE_START);
    getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField campoLados;
  private javax.swing.JLabel etiquetaLados;
  private poligonoconeventos.PanelDibujo panelCentro;
  private javax.swing.JPanel panelNorte;
  // End of variables declaration//GEN-END:variables
}
