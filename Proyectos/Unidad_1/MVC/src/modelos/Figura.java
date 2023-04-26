package modelos;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Mario Pineda
 */
public abstract class Figura extends Point implements Dibujable {

  protected Color color;

  public Figura(int x, int y, Color color) {
    super(x, y);
    this.color = color;
  }

  public Figura() {
    this(0, 0, Color.BLACK);
  }

  public abstract double getArea();

  public abstract double getPerimetro();

  public Color getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
