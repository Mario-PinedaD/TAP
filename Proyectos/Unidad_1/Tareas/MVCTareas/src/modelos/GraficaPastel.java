package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Mario Pineda
 */
public class GraficaPastel extends Circulo implements Dibujable {

  private ArrayList<Integer> datos;
  private ArrayList<Color> colorines;

  public GraficaPastel() {
    this(new ArrayList<Integer>());
  }

  public GraficaPastel(ArrayList<Integer> datos) {
    this.datos = datos;
    this.colorines = new ArrayList<>();
    this.setColorines();
  }

  public void setDatos(ArrayList<Integer> datos) {
    this.datos = datos;
    colorines.clear();
    this.setColorines();
  }
  
  public ArrayList<Integer> getDatos(){
    return datos;
  }

  //Colores coquetos
  public void setColorines() {
    for (int i = 0; i < datos.size(); i++) {
      int red = (int) (Math.random() * 255);
      int green = (int) (Math.random() * 255);
      int blue = (int) (Math.random() * 255);
      colorines.add(new Color(red, green, blue));
    }
  }

  //El "total De datos"
  public int getTotal() {
    int suma = 0;
    for (Integer valor : datos) {
      suma += valor;
    }
    return suma;
  }

  //Dibujo coqueton
  public void dibujarGrafica(Graphics g) {
    int resultado = getTotal();
    int anguloInicio = 0;
    int radio = super.getRadio();

    for (int i = 0; i < datos.size(); i++) {
      // Si el total son 360 ps debemos hacer regla de 3
      int angulo = (datos.get(i) * 360 / resultado);
      g.setColor(colorines.get(i));
      g.fillArc(x - radio, y - radio, 2 * radio, 2 * radio, anguloInicio, angulo);
      anguloInicio += angulo;
    }
    if (anguloInicio != 360) {
      g.fillArc(x - radio, y - radio, 2 * radio, 2 * radio, anguloInicio, 360 - anguloInicio);
    }
  }

  @Override
  public void dibujar(Graphics g) {
    if (!datos.isEmpty()) {
      this.dibujarGrafica(g);
    }
  }
}
