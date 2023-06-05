/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trayectorias;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Dibujable;
import modelos.Planetas;
import vistas.PanelDibujable;

/**
 *
 * @author Mario Pineda
 */
public class PanelTrayectorias extends JPanel {
  
  private Planetas planetas;
  
  public PanelTrayectorias(Planetas modelo) {
    this.planetas = modelo;
    this.setBackground(Color.BLACK);
  }
  
  public void addEventos(MouseAdapter oyente) {
    this.addMouseListener(oyente);
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.translate(this.getWidth() / 2, this.getHeight() / 2);
    planetas.dibujar(g);
  }
}
