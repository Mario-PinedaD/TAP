/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hiloscontadores;

/**
 *
 * @author Mario Pineda
 */
public class HiloContador extends Thread {

  public HiloContador(String nombre) {
    this.setName(nombre);
  }

  public void imprimir(String nombre) {
    for (int i = 0; i < 10; i++) {
      System.out.println(nombre + " = " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        System.out.println("Error de interrupción de proceso!! " + ex);
      }
    }
  }
  //Es necesario implementar el "run()" para considerarlo un subproceso
  @Override
  public void run(){
    imprimir(this.getName());
  }
}
