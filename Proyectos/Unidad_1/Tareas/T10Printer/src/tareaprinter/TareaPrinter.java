package tareaprinter;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class TareaPrinter {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    JFrame f = new JFrame("Printer");
    PanelPrinter panel = new PanelPrinter();

    f.add(panel);
    f.setSize(550, 200);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setVisible(true);
  }

}
