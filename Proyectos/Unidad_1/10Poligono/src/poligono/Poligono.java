package poligono;

import javax.swing.JFrame;

public class Poligono {

  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame("Polígono");
    PanelPoligono panel = new PanelPoligono();
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
