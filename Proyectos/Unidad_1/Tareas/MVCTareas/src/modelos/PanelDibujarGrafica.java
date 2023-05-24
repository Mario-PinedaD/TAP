package modelos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mario
 */
public class PanelDibujarGrafica extends JPanel {

  private GraficaPastel grafica;

//  public DibujarGrafica(){
//    this(new ArrayList<Integer>());
//  }
  public PanelDibujarGrafica(GraficaPastel grafica) {
    this.grafica = grafica;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    int min = Math.min(ancho/2, alto/2);
    if(grafica != null){
      int tamaño = grafica.getDatos().size();
      if(tamaño>0){
        g.translate(ancho/2, alto/2);
        grafica.setRadio(min/2);
        grafica.x=0;
        grafica.y=0;
        grafica.dibujar(g);
      }
    }
  }
}
