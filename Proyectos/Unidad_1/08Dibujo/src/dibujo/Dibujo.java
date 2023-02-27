package dibujo;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class Dibujo {

  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame("Dibujo");
    PanelDibujo panel = new PanelDibujo();
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
