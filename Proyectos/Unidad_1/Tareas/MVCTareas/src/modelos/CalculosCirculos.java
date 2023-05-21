package modelos;

/**
 *
 * @author Mario Pineda
 */
public class CalculosCirculos {

  private double area;
  private double diametro;
  private double circunferencia;
  private int radio;

  public void setRadio(int radio) {
    this.radio = radio;
  }

  public void calcularArea(int radio) {
    this.area = Math.PI * Math.pow(radio, 2);
  }

  public void calcularDiametro(int radio) {
    this.diametro = radio * 2;
  }

  public void calcularCircunferencia() {
    this.circunferencia = Math.PI * (diametro);
  }

  public int getRadio() {
    return radio;
  }

  public double getArea() {
    return area;
  }

  public double getDiametro() {
    return diametro;
  }

  public double getCircunferencia() {
    return circunferencia;
  }
}
