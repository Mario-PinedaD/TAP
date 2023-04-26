package contextografico;

import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class ContextoGrafico {

  public static void main(String[] args) {
    // TODO code application logic here
    JFrame f = new JFrame("Contexto Gráfico");
    PanelContextoGrafico panel = new PanelContextoGrafico();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(panel);
    //f.setContentPane(panel);
    f.setVisible(true);
  }
  
}
