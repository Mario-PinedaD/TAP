package tareaspyral;

import javax.swing.JFrame;

public class TareaSpyral {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    JFrame f = new JFrame("Spyral");
    PanelSpyral panel = new PanelSpyral();
    
    f.add(panel);
    f.setSize(800, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocation(100, 100);
    f.setVisible(true);
  }
  
}
