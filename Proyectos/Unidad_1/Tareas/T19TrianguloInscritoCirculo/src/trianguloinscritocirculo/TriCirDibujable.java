/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trianguloinscritocirculo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mario
 */
public class TriCirDibujable extends JPanel {

  private int radio;
  private int dis;
  
  public void setRadio(int radio) {
    this.radio = radio;
    this.setBackground(Color.CYAN);
  }

  @Override
  public void paintComponents(Graphics g) {
    super.paintComponents(g);

    //Dibujar Triangulo
    //Dibujar Circulo
  }

}
