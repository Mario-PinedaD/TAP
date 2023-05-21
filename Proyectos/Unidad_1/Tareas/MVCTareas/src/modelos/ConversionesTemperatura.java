package modelos;

/**
 *
 * @author Mario Pineda
 */
public class ConversionesTemperatura {

  double respuesta;

  public void convertirFC(double grados) {
    respuesta = (grados - 32) * (5 / 9);
  }

  public void convertirCF(double grados) {
    respuesta = (grados * (9 / 5)) + 32;
  }

  public void convertirCK(double grados) {
    respuesta = grados + 273.15;
  }

  public void convertirKC(double grados) {
    respuesta = grados - 273.15;
  }

  public double getRespuesta() {
    return respuesta;
  }

}
