/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n202histograma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Mario Pineda
 */
public class PanelGrafica extends JPanel {
  
  private ArrayList<Integer> arr;
  private ArrayList<Color> color;
  
  public PanelGrafica() {
    arr = new ArrayList<>();
    color = new ArrayList<>();
    this.setBackground(Color.WHITE);
  }
  
  public void addEventos(MouseListener e) {
    this.addMouseListener(e);
  }
  
  public void setDatos(ArrayList<Integer> arr) {
    arr.clear();
    for (int i = 0; i < arr.size(); i++) {
      this.arr.add(arr.get(i));
    }
  }
  
  public void setColores(Color[] color) {
    for (Color color1 : color) {
      this.color.add(color1);
    }
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.drawLine(50, 0, 50, this.getHeight());
    g.drawLine(0, 400, this.getWidth(), 400);
    
    for (int i = 0; i < arr.size(); i++) {
      System.out.println("a");
      if (i > color.size() - 1) {
        g.setColor(color.get(color.size() - i));
      } else {
        g.setColor(color.get(i));
      }
      g.fillRect(50 + (i * 40), this.getHeight() - arr.get(i) - 63, 40, arr.get(i));
      
      g.setColor(Color.BLACK);
      g.drawRect(50 + (i * 40), this.getHeight() - arr.get(i) - 63, 40, arr.get(i));
      System.out.println("Instruccion " + i);
      System.out.println("Color: " + g.getColor());
    }
    
  }
}
