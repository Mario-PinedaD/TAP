package tareaspyral;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelSpyral extends JPanel {

  public PanelSpyral() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    //Posicion en X
    int posX = this.getWidth() / 2;
    //Posicion en Y
    int posY = this.getHeight() / 2;
    //Centro en nuevas posiciones
    g.translate(posX, posY);
    //Obtener el lado que mida menos
    int minimo = Math.min(this.getWidth(), this.getHeight());

    //Arreglos para coordenadas en X y Y
    int[] cX = new int[19];
    int[] cY = new int[19];

    //Distancia inicial del primer punto del centro
    int radio = minimo / 4 - 10;

    //Colocar todas las nuevas coordenadas dentro de los arreglos
    for (int i = 0; i < cX.length; i++) {
      /*Convertimos a radianes las posiciones debido a que vamos a tener
      8 posiciones para formar una "vuelta", así que necesitamos calcular
      cada una de ellas en radianes. */
      double rad = Math.toRadians(45 * i);
      //Convertimos en posiciones enteras las coordenadas en radianes
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      //Añadimos las coordenadas a la posicion i del arreglo
      cX[i] = x;
      cY[i] = y;
      //Aumentamos el radio un poquito
      radio += 5;
    }
    //Le ponemos un color coqueto
    g.setColor(Color.BLACK);
    //Dibujamos
    g.drawPolyline(cX, cY, cX.length);
  }
}
