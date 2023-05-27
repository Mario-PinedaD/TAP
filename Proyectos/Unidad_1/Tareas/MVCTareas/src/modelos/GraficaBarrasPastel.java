/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Mario Pineda
 */
public class GraficaBarrasPastel extends Circulo implements Dibujable {

  private ArrayList<Integer> datos;
  private ArrayList<Color> colorines;
  private int dato;
  private boolean estadoPastel;

  public GraficaBarrasPastel() {
    this(new ArrayList<Integer>());
  }

  public GraficaBarrasPastel(ArrayList<Integer> datos) {
    this.datos = datos;
    this.colorines = new ArrayList<>();
    this.setColorines();
  }

  public void setDatos(ArrayList<Integer> datos) {
    this.datos = datos;
    colorines.clear();
    this.setColorines();
  }

  public ArrayList<Integer> getDatos() {
    return datos;
  }
//==========================0

  public void SetGraficaPastel(boolean estado) {
    this.estadoPastel = estado;
  }

  public boolean getGraficaPastel() {
    return this.estadoPastel;
  }

  public void setDato(int dato) {
    this.dato = dato;
  }

  public int getDato() {
    return this.dato;
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

  //El "total De numeros"
  public int getTotal() {
    int suma = 0;
    for (Integer valor : datos) {
      suma += valor;
    }
    return suma;
  }

  //Dibujo coqueton de la grafica de pastel
  public void dibujarGraficaPastel(Graphics g) {
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

  public void dibujarGraficaBarra(Graphics g) {
    for (int i = 0; i < datos.size(); i++) {
      int numero = datos.get(i);
      g.setColor(colorines.get(i));
      g.fillRect(dato * i, -datos.get(i), dato, numero);
      g.setColor(Color.BLACK);
      g.drawRect(dato * i, -datos.get(i), dato, numero);
      String datosbarra = String.valueOf(numero);
      g.drawString(datosbarra, dato * i + (dato / 3)+10, 25);
    }
  }

  @Override
  public void dibujar(Graphics g) {
    if (!datos.isEmpty()) {
      if (estadoPastel) {
        this.dibujarGraficaPastel(g);
      } else {
        this.dibujarGraficaBarra(g);
      }
    }
  }
}
