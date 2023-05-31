/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelos.Imagenes;

/**
 *
 * @author Mario Pineda
 */
class PanelAnimacion extends JPanel {

  private Imagenes imagenes;
  private JLabel etiqueta;

  public PanelAnimacion(Imagenes imagenes) {
    this.imagenes = imagenes;
    this.setBackground(Color.CYAN);
    addComponentes();
  }

  public void addEventos(MouseAdapter oyente) {
    this.addMouseWheelListener(oyente);
  }

  public void addComponentes() {
    etiqueta = new JLabel();
    etiqueta.setFont(new Font("Arial", Font.BOLD, 48));
    this.add(etiqueta);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Image activa = imagenes.getActiva();
    int x = (getWidth() - activa.getWidth(this)) / 2;
    int y = (getHeight() - activa.getHeight(this)) / 2;
    imagenes.setLocation(x, y);
    imagenes.dibujar(g);
  }
}
