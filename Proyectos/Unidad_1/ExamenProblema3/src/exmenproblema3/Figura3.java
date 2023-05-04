package exmenproblema3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Figura3 extends JPanel {

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int ancho = this.getWidth() / 2;
    int alto = this.getHeight() / 2;

    g.translate(ancho / 4, alto / 4);
    int radio = 200;
    int lado = radio / 4;

    g.setColor(Color.BLACK);

    //
    g.drawArc(0, 0, 2 * radio, 2 * radio, 210, 240);
    g.setColor(Color.YELLOW);
    g.fillArc(0, 0, 2 * radio, 2 * radio, -30, 120);
    g.setColor(Color.red);
    g.fillArc(0, 0, 2 * radio, 2 * radio, 210, 120);
    g.setColor(Color.WHITE);
    g.fillArc(0, 0, 2 * radio, 2 * radio, 90, 120);

    g.translate(this.getWidth() - (ancho - 100), alto / 2);

    g.setColor(Color.BLUE);// Unicamente cambia el relleno a azul

    JLabel v1 = new JLabel("Valor 1");
    v1.setBounds(75, 20, 200, 40);
    this.add(v1);

    JLabel v2 = new JLabel("Valor 2");
    v2.setBounds(75, 50, 200, 40);
    this.add(v2);

    JLabel v3 = new JLabel("Valor 3");
    v3.setBounds(75, 80, 200, 40);
    this.add(v3);
    //g.drawRect(-lado / 2, -lado / 2, lado, lado);//Crea un cuadro azul relleno
    g.drawRect(0, 20, 150, 100);//Crea un cuadro azul relleno

    g.setColor(Color.YELLOW);
    g.fillRect(50, 30, 20, 20);
    g.setColor(Color.red);
    g.fillRect(50, 60, 20, 20);
    g.setColor(Color.WHITE);
    g.fillRect(50, 90, 20, 20);
    g.setColor(Color.BLACK);
    g.drawRect(50, 30, 20, 20);
    g.drawRect(50, 60, 20, 20);
    g.drawRect(50, 90, 20, 20);
  }

}
