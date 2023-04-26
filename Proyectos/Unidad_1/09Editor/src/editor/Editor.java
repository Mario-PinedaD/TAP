package editor;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class Editor {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    JFrame f = new JFrame("Editor");
    PanelEditor panel = new PanelEditor();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f.setVisible(true);
  }
  
}
