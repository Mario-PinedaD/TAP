/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e201separadorbilletes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mario Pineda
 */
class OyenteVentana implements ActionListener {

  private VentanaMonedas ventana;

  public OyenteVentana(VentanaMonedas ventana) {
    this.ventana = ventana;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    JTextField cant = ventana.getCampoCantidad();
    String texto = cant.getText();
    try {
      int cantidad = Integer.parseInt(texto);
      convertirEnBilletes(cantidad);

    } catch (NumberFormatException er) {
      JOptionPane.showMessageDialog(ventana, "Solo numeros", "Error", JOptionPane.ERROR_MESSAGE);
      cant.setText("");
    }

  }

  private void convertirEnBilletes(int cantidad) {
    int denominaciones[] = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
    JTextField campos[] = ventana.getCampos();
    for (int i = 8; i >= 0; i--) {
      if (cantidad == 0) {
        campos[i].setText(Integer.toString(0));
        continue;
      }
      int monedas = cantidad / denominaciones[i];
      campos[i].setText(Integer.toString(monedas));
      cantidad %= denominaciones[i];
    }
  }

}
