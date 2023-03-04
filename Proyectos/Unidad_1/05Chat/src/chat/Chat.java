package chat;

import util.Ambiente;

/**
 *
 * @author Mario Pineda
 */
public class Chat {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    VentanaChat f = new VentanaChat();
    PanelChat panel = new PanelChat();
    f.setContentPane(panel);
    f.setSize(800, 600);
    f.setLocation(100, 100);
    f.setContentPane(panel);
    f.setVisible(true);
  }

}
