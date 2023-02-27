/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraventana;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Mario Pineda
 */
public class PrimeraVentana {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //F es la variable
    JFrame f = new JFrame();
    f.setTitle("Primera Ventana");
    f.setLocation(100, 100);
    f.setSize(800,600);
    //Si creo un nuevo objeto de tipo color puedo ismplemente ponerlo, en caso de que no quiera
    //en el parámetro para poner el color puedo ponerle new Color(R,G,B) de 0 a 255 lo que crea un objeto anínimo
    //f.getContentPane().setBackground esto se le conoce como llamado en cascada
    f.getContentPane().setBackground(Color.BLACK);
    //Todo lo que está escrito en mayusculas son: VARIABLE CONSTANTE
    //Las constantes estáticas funcionan para poder acceder al objeto sint ener que crear nada
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Cuando un objeto tiene nombre osea se crea un objeto tiene nombre
    //Si no tiene nombre, es un objeto "anónimo"
    f.setVisible(true);
    
  }
}
