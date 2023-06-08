/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n103tiroparabolico;

/**
 *
 * @author Mario Pineda
 */
public class Proyectil {

  private double velocidadInicial;
  private double anguloTiro;

  public Proyectil(double velocidadInicial, double anguloTiro) {
    this.velocidadInicial = velocidadInicial;
    this.anguloTiro = anguloTiro;
  }

  public double getVelocidadInicial() {
    return velocidadInicial;
  }

  public double getAnguloTiro() {
    return anguloTiro;
  }

  public double calcularX(double tiempo) {
    return velocidadInicial * Math.cos(Math.toRadians(anguloTiro)) * tiempo;
  }

  public double calcularY(double tiempo) {
    return velocidadInicial * Math.sin(Math.toRadians(anguloTiro)) * tiempo + (0.5 * (-9.81) * (Math.pow(tiempo, 2)));
  }
}
