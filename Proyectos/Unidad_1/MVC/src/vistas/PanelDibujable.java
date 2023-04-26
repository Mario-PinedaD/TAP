package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Dibujable;

/**
 *
 * @author Mario Pineda
 */
public class PanelDibujable extends JPanel {

  private Dibujable modelo;

  public PanelDibujable(Dibujable modelo) {
    this.modelo = modelo;
    this.setBackground(Color.CYAN);
  }

  public void addEventos(KeyAdapter oyente) {
    this.addKeyListener(oyente); //Ya le decimos al origen quien es el oyente, unicamente para eventos de teclado
    this.setFocusable(true); //Le damos importancia al panel pa q funcione bien la wea
  }

  //Sobrecargamos el método para introducir un nuevo tipo de oyente, oyente de mouse
  public void addEventos(MouseAdapter oyente) {//Ahora introducimos un nuevo oyente pero te tipo mouse
    this.addMouseListener(oyente);        //Con el clic
    this.addMouseMotionListener(oyente);  //Con el movimiento
    this.addMouseWheelListener(oyente);   //Con la ruedita
    this.setFocusable(true);
  }

  public PanelDibujable() {
    //Constructor sin argumentos para que el panel
    //Se pueda colorcar en la paleta de componentes
    this(null);
  }

  @Override
  public void paintComponent(Graphics g) { //Ponemos el método para dibujar
    super.paintComponent(g);              //Lo "seteamos"
    modelo.dibujar(g);                    //Dibujamos al modelo
    
    g.drawString(modelo.toString(), 10, this.getHeight() - 10); //Esto dibuja las coordenadas del centro de la figura
    
    Point puntero = this.getMousePosition(); //Obtenemos la posicion del puntero
    if (puntero != null) { //Cuando sea diferentes a null se realiza
      g.drawString("(" + puntero.x + "," + puntero.y + ")", this.getWidth() - 70, this.getHeight() - 10);
    }
  }

//  @Override
//  public void paintComponent(Graphics g) { //Ponemos el método para dibujar
//    super.paintComponent(g);              //Lo "seteamos"
//    modelo.dibujar(g);                    //Dibujamos al modelo
//
//    g.drawString(modelo.toString(), 10, this.getHeight() - 10); //Esto dibuja las coordenadas del centro de la figura
//  }
//  @Override
//  public void paintComponent(Graphics g) { //Ponemos el método para dibujar
//    super.paintComponent(g);              //Lo "seteamos"
//    modelo.dibujar(g);                    //Dibujamos al modelo
//  }
}
