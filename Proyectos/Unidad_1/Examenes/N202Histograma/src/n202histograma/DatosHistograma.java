/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n202histograma;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Mario Pineda
 */
public class DatosHistograma {

  private Color[] colorines = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.YELLOW, Color.red};

  public DatosHistograma() {
  }

  public ArrayList<Integer> generarDatos() {
    ArrayList<Integer> dat = new ArrayList<>();
    while (dat.size() < 11) {
      int val = (int) (Math.random() * 301);
      if (!dat.contains(val)) {
        dat.add(val);
        System.out.println("Instruccion " + dat.size() + " Dato: " + val);
      }
    }
    return dat;
  }

  public Color[] getColorines() {
    return colorines;
  }
}
