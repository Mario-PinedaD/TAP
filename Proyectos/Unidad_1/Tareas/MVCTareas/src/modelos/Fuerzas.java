/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Mario Pineda
 */
public class Fuerzas extends ArrayList<Fuerza> implements Dibujable {

  private Fuerza fuerzas;
  private Fuerza fuerzaResultante;

  @Override
  public void dibujar(Graphics g) {
    for (Fuerza fuerza : this) {
      fuerza.dibujar(g);
    }
  }

  public Fuerza sumarFuerzas(ArrayList<Fuerza> forces) {
    fuerzas = forces.get(0).sumatoria(forces.get(1));
    
    for (int i = 2; i < forces.size(); i++) {
      fuerzaResultante = fuerzas.sumatoria(forces.get(i));
      fuerzas = fuerzaResultante;
    }
    return fuerzaResultante;
  }

}
