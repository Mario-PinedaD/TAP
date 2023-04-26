package contextografico;

import java.awt.Graphics;
import javax.swing.JPanel;
import static java.awt.Color.*;

/**
 *
 * @author Mario Pineda
 */
public class PanelArcos extends JPanel {

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(RED);
    g.drawRect(40, 35, 80, 80);
    g.drawRect(160, 35, 80, 80);
    g.drawRect(280, 35, 80, 80);

    g.setColor(BLACK);
    g.drawArc(40, 35, 80, 80, 0, 360);
    g.drawArc(160, 35, 80, 80, 0, 110);
    g.drawArc(280, 35, 80, 80, 0, -270);

    g.setColor(ORANGE);
    g.fillArc(40, 150, 80, 70, 0, 360);
    g.fillArc(160, 150, 80, 70, 270, -90);
    g.fillArc(280, 150, 80, 70, 0, -270);

    g.setColor(BLACK);
    g.drawArc(40, 150, 80, 70, 0, 360);
    g.drawArc(160, 150, 80, 70, 270, -90);
    g.drawArc(280, 150, 80, 70, 0, -270);
    g.drawLine(160, 185, 200, 185);
    g.drawLine(200, 185, 200, 220);

    //De A a B
    g.drawLine(320, 150, 320, 185);
    //De B a C
    g.drawLine(320, 185, 360, 185);
  }
}
