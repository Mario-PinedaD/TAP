package contadores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario Pineda
 */
public class Contadores {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) { //Se considera un SUB PROCESO
    // TODO code application logic here
    for (int contador = 1; contador <= 2; contador++) {
      String nombre = "C" + contador;
      System.out.println("Contador " + nombre);
      System.out.println("Inicia contador " + nombre);
      imprimir(nombre);
      System.out.println("Termina contador " + nombre);
    }
    System.out.println("Termina el método Main()");
  }

  public static void imprimir(String nombre) {
    for (int i = 0; i < 10; i++) {
      System.out.println(nombre + " = " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        System.out.println("Error de interrupción de proceso!! " + ex);
      }
    }
  }
}
