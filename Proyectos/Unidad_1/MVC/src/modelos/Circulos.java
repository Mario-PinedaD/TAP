package modelos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Mario Pineda
 */
public class Circulos extends ArrayList<Circulo> implements Dibujable{

  @Override
  public void dibujar(Graphics g) {
    for (Circulo circulo:this){ //Pasará por cada uno de los elementos de la Lista
      circulo.dibujar(g); 
    }
  }
  
  @Override
  public String toString(){
    return String.valueOf(this.size());  //Convierte los valoes enteros a un String
  }
 
  
}
