package poligono;

import java.awt.Color;
import java.awt.Graphics;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JPanel;
import util.Archivo;

/**
 *
 * @author Mario Pineda
 */
public class PanelPoligono extends JPanel {

  private int[] x;
  private int[] y;
  private int j;

  public PanelPoligono() {
    this.setBackground(Color.CYAN);
    abrirArchivo();
  }

  public void abrirArchivo() {
    String archivo = "/datos/Puntos.txt";
    InputStream flujo = getClass().getResourceAsStream(archivo);
    ArrayList<String> lineas = Archivo.leerArchivo(flujo);

    x = new int[lineas.size()];
    y = new int[lineas.size()];
    j = 0;

    for (int i = 0; i < lineas.size(); i++) {

      System.out.println(lineas.get(i));
      String linea = lineas.get(i);
      String[] tokens = linea.split(","); // para separar los datos dentro de una linea
      //El tream quita los espacios si están antes despues
      if (tokens.length == 2) {
        x[j] = Integer.parseInt(tokens[0].trim());
        y[j++] = Integer.parseInt(tokens[1].trim());
        
      }
    }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (x != null) {
      //Abrimos el archivo en donde están las "x" y "y"
      //Si ponemos aqui las cosas vamos a estar abriendo todo el rato siempre que cambiemos la ventana
      g.setColor(Color.BLUE);
      g.fillPolygon(x, y, j);
      g.setColor(Color.BLACK);
      g.drawPolygon(x, y, j);
    }
  }
}
