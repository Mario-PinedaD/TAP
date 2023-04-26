package panelesconherencia;

import javax.swing.*;

/**
 *
 * @author Mario Pineda
 */
public class PanelesConHerencia {

  public static void main(String[] args) {
     JFrame f = new JFrame("Constructores y Herencia");
     PanelHerencia panel = new PanelHerencia();
     
     f.setSize(800,600);
     f.setLocation(100,100);
     f.add(panel);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     f.setVisible(true);
  }

}
