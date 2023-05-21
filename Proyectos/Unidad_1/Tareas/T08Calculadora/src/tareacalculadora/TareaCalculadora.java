package tareacalculadora;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class TareaCalculadora {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    JFrame f = new JFrame("Calculator");
    PanelCalculadora panel = new PanelCalculadora();
    
    f.add(panel);
    f.setSize(300,300);
    f.setLocation(100,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setVisible(true);
  }
  
}
