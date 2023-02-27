package contextografico;

import java.awt.*;
import javax.swing.JPanel;
import static java.awt.Color.*;

import javax.swing.ImageIcon;

/**
 *
 * @author Mario Pineda
 */
public class PanelLetras extends JPanel {

  /*
  a diferencia de los demás paneles, el mensaje tiene la esquina en la parte inferior izquiera no como todos,
  en la parte inferior derecha
   */
  public PanelLetras() {
    this.setBackground(WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(BLUE);
    g.drawString("Mensaje en azul", 20, 20);
    g.setColor(new Color(100, 100, 0));
    g.drawString("Mensaje en otro color", 400, 20);

    System.out.println(g.getFont().getFontName());
    System.out.println(g.getFont().getSize());

    Font f1 = new Font("Times New Roman", Font.BOLD, 24);
    g.setFont(f1);
    g.setColor(RED);
    g.drawString("Mensaje en Times New Roman", 20, 450);
    System.out.println(g.getFont().getSize());
    System.out.println(g.getFont().getFontName());

    Font f2 = new Font("New Courier", Font.BOLD | Font.ITALIC, 18);
    g.setFont(f2);
    g.setColor(MAGENTA);
    g.drawString("Mensaje en Courier", 400, 450);
    System.out.println(g.getFont().getSize());

    // imagen
    String nombre = "/imagenes/storm-trooper-da-vinci.jpg";
    //String nombre = "/imagenes/java-beatles.jpg";
    ImageIcon img = new ImageIcon(getClass().getResource(nombre));
    Image imagen = img.getImage();
    //g.drawImage(imagen, 0, 0, this);

    int anchoPanel = this.getWidth();
    int altoPanel = this.getHeight();
    int anchoImagen = imagen.getWidth(this);
    int altoImagen = imagen.getHeight(this);
    int xC = anchoPanel / 2;
    int yC = altoPanel / 2;
    int x = xC - anchoImagen / 2;
    int y = yC - altoImagen / 2;

    //g.drawImage(imagen, x, y, this);
    g.drawImage(imagen, 0, 0, anchoPanel, altoPanel, this);
  }
}
