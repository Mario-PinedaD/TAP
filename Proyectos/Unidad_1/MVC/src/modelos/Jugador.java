package modelos;

/**
 *
 * @author Rafael
 */
public class Jugador {

  //Atributos del jugador
  private String nombre;
  private String pronostico;
  private String temperatura;
  private String humedad;
  private String viento;
  private String jugar;

  public Jugador(String nombre, String pronostico, String temperatura,
    String humedad, String viento, String jugar) {
    this.nombre = nombre;
    this.pronostico = pronostico;
    this.temperatura = temperatura;
    this.humedad = humedad;
    this.viento = viento;
    this.jugar = jugar;
  }

  //Le pasamos los jugadores con un arreglo
  public Jugador(String[] valores) {
    this(valores[0], valores[1], valores[2], valores[3], valores[4], valores[5]);
  }

  //Jugador por defecto
  
  public Jugador() {
    this("", "", "", "", "", "");
  }

  @Override
  public String toString() {
    return nombre + "," + pronostico + "," + temperatura + "," + 
      humedad + "," + viento + "," + jugar;
  }

  public String[] getJugador() {
    return new String[]{nombre, pronostico, temperatura, humedad, viento, jugar};
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPronostico() {
    return pronostico;
  }

  public void setPronostico(String pronostico) {
    this.pronostico = pronostico;
  }

  public String getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(String temperatura) {
    this.temperatura = temperatura;
  }

  public String getHumedad() {
    return humedad;
  }

  public void setHumedad(String humedad) {
    this.humedad = humedad;
  }

  public String getViento() {
    return viento;
  }

  public void setViento(String viento) {
    this.viento = viento;
  }

  public String getJugar() {
    return jugar;
  }

  public void setJugar(String jugar) {
    this.jugar = jugar;
  }

}
