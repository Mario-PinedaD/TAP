package modelos;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rafael Rivera-López
 */
public class Imagenes extends ArrayList<Image> implements Dibujable {

  private int x;
  private int y;
  private Image activa;

  public Imagenes(String nombre) {
    int i = 0;
    URL imagen;
    do {
      String archivo = "/imagenes/" + nombre.trim() + "-" + (i++) + ".png";
      imagen = getClass().getResource(archivo);
      if (imagen != null) {
        this.add(new ImageIcon(imagen).getImage());
      }
    } while (imagen != null);
    activa = this.get(0);  //<==
  }

  @Override
  public void dibujar(Graphics g) {
    if (activa != null) {
      g.drawImage(activa, x, y, null);
    }
  }

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Image getActiva() {
    return activa;
  }

  public void setActiva(int numero) {
    this.activa = this.get(numero);
  }

}
