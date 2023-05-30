/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import modelos.Figura;
import vistas.PanelDibujable;
import static java.awt.event.KeyEvent.*; //Importamos los estáticos de toda la calse
import modelos.Circulo;

/**
 *
 * @author Mario Pineda
 */
public class OyenteTeclado extends KeyAdapter {

  private Figura modelo;
  private PanelDibujable vista;

  public OyenteTeclado(Figura modelo, PanelDibujable vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int codigo = e.getKeyCode();
    int inc = 5;
    Circulo circulo = (Circulo) modelo;
    int radio = circulo.getRadio();
    switch (codigo) {
      case VK_UP, VK_W -> {//Podemos elimnar el "KeyEvent." al importar las variables estáticas de la clase
        if (modelo.y - radio - inc >= 0) { //Si el modelo se mantiene dentro del panel(es decir es mayor a y=0) se moverá
          modelo.y -= inc;
          vista.repaint();
        }
      }
      case VK_DOWN, VK_S -> { //Si el modelo se mantiene dentro del panel(es decir es mayor a y=altura) se moverá
        if (modelo.y + radio + inc <= vista.getHeight()) {
          modelo.y += inc;
          vista.repaint();
        }
      }
      case VK_LEFT, VK_A -> { //Si el modelo se mantiene dentro del panel(es decir es mayor a x=0) se moverá
        if (modelo.x - radio - inc >= 0) {
          modelo.x -= inc;
          vista.repaint();
        }
      }
      case VK_RIGHT, VK_D -> { //Si el modelo se mantiene dentro del panel(es decir es mayor a x=Ancho) se moverá
        if (modelo.x + radio + inc <= vista.getWidth()) {
          modelo.x += inc;
          vista.repaint();
        }
      }
      case VK_1 -> {
        modelo.setColor(Color.BLUE);
        vista.repaint();
      }
      case VK_2 -> {
        modelo.setColor(Color.GREEN);
        vista.repaint();
      }
      case VK_3 -> {
        modelo.setColor(Color.RED);
        vista.repaint();
      }
      case VK_PLUS -> {
        circulo.setRadio(circulo.getRadio() + inc);
        vista.repaint();
      }
      case VK_MINUS -> {
        circulo.setRadio(circulo.getRadio() - inc);
        vista.repaint();
      }
    }

    /*
    1 azul
    2 verde
    3 rojo
     */
    System.out.println("Tecla = " + e.getKeyCode());
  }
  
  /*try {
      Integer.parseInt(cadena);
      return true;
    } catch (NumberFormatException nfe) {
      JOptionPane.showMessageDialog(null, "Debes ingresar numeros", "Error", JOptionPane.WARNING_MESSAGE);
      return false;
    }*/

}
