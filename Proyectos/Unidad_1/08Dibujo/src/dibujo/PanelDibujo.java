package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujo extends JPanel {

  public PanelDibujo() {
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    g.translate(ancho / 2, alto / 2);  // ell Gtranslate sería para trasladar el comienzo a (x,y) puntos
//    System.out.println("Alto: " + alto);
//    System.out.println("Ancho: " + ancho);
    g.drawLine(-ancho / 2, 0, ancho / 2, 0);
    g.drawLine(0, -alto / 2, 0, alto / 2);

    int menor = (ancho < alto ? ancho : alto); //Sería como un if else

    int lado = menor / 2 - 40;  //<==

    // Cuadrado con centro en el origen
    g.setColor(Color.BLUE);// Unicamente cambia el relleno a azul
    g.fillRect(-lado / 2, -lado / 2, lado, lado);//Crea un cuadro azul relleno
    g.setColor(Color.BLACK);// Contorno negro
    g.drawRect(-lado / 2, -lado / 2, lado, lado);

    //Ovalo Azul
    g.setColor(Color.CYAN);// Unicamente cambia el relleno a azul
    g.fillOval(-lado / 2, -lado / 2, lado, lado);//Crea un cuadro azul relleno
    g.setColor(Color.BLACK);// Contorno negro
    g.drawOval(-lado / 2, -lado / 2, lado, lado);

    //Rombo Verde
    int[] pX = {0, -lado / 2, 0, lado / 2};
    int[] pY = {-lado / 2, 0, lado / 2, 0};
    g.setColor(Color.GREEN);
    g.fillPolygon(pX, pY, pX.length);
    g.setColor(Color.BLACK);
    g.drawPolygon(pX, pY, pX.length);

    // Círculo con centro en el origen
    int radio = lado; //<=======
    g.setColor(Color.GRAY);
    g.drawOval(-radio, -radio, 2 * radio, 2 * radio);

    g.setColor(Color.RED);
    for (int i = 0; i < 8; i++) {
      double rad = Math.toRadians(45 * i);
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      g.drawLine(0, 0, x, y);
    }
    // Dibujar líneas que unan los rayos
    g.setColor(Color.RED);
    int ax = radio;
    int ay = 0;
    for (int i = 1; i <= 8; i++) {
      double rad = Math.toRadians(45 * i);
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      g.drawLine(ax, ay, x, y);
      ax = x;
      ay = y;
    }

    g.setColor(Color.MAGENTA);
    int rInt = menor / 50;
    for (int i = 0; i < 8; i++) {
      double rad = Math.toRadians(45 * i);
      int x = (int) (radio * Math.cos(rad));
      int y = (int) (radio * Math.sin(rad));
      g.setColor(Color.MAGENTA);
      g.fillOval(x - rInt, y - rInt, 2 * rInt, 2 * rInt);
      g.setColor(Color.BLACK);
      g.drawOval(x - rInt, y - rInt, 2 * rInt, 2 * rInt);
    }
  }
}
