/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hiloscontadores;

/**
 *
 * @author Mario Pineda
 */
public class HilosContadores {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    for (int contador = 1; contador <= 2; contador++) {
      String nombre = "C" + contador;
      System.out.println("Contador " + nombre);
      HiloContador hilo = new HiloContador(nombre);
      System.out.println("Inicia contador " + nombre);
//      hilo.imprimir(nombre);
      hilo.start();
      System.out.println("Termina contador " + nombre);
    }
    System.out.println("Termina el método Main()");
  }

}
