package eventoboton;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * @author Mario Pineda
 */
public class OyenteEventoBoton implements ActionListener {

  private PanelEventoBoton panel;

  public OyenteEventoBoton(PanelEventoBoton panel) { //Relacionamos el Oyente con el PAnel, para implementar eventos
    this.panel = panel;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
//    
//    String texto = e.getActionCommand();
//    if (texto.equals("Cambiar fondo a azul")) {
//      System.out.println("Cambia a azul");
//      panel.setBackground(Color.BLUE);
//    } else if (texto.equals("Cambiar fondo a verde")) {
//      System.out.println("Cambia a verde");
//      panel.setBackground(Color.GREEN);
//    }

    Component origen = (Component) e.getSource();

    switch (origen.getName()) {
      case "azul" -> {
        panel.setBackground(Color.BLUE);
      }
      case "verde" -> {
        panel.setBackground(Color.GREEN);
      }
    }
  }
}


/*
    System.out.println("Se ejecuta el método actionPerformed!");
    System.out.println("getActionCommand = " + e.getActionCommand());//Este sirve para identificar el boton q se le dio clic
    System.out.println("getSource = " + e.getSource());// Este nos dá toda las propiedasdes del botón
    System.out.println("getSource = " + e.getSource());// Este nos dá toda las propiedasdes del botón
    
 */
