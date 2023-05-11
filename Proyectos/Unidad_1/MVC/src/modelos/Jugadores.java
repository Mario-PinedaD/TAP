package modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import util.Archivo;

/**
 *
 * @author rafael
 */
public class Jugadores extends HashMap<String, Jugador> {

  private String nombreArchivo;
  private int totalJugadores;
  private int totalJugando;

  //CREATE
  public void adicionarJugador(Jugador jugador) {
    this.put(jugador.getNombre(), jugador);
    totalJugadores++;
    totalJugando += jugador.getJugar().equals("Si") ? 1 : 0;
  }

  //READ
  public Jugador buscarJugador(String nombre) {
    return this.get(nombre);
  }

  //UPDATE
  public Jugador modificarJugador(Jugador jugador) {
    String nombre = jugador.getNombre();
    String valorNuevo = jugador.getJugar();  // Del objeto modificado
    String valorActual = this.get(nombre).getJugar(); // Del objeto en la tabla
    if (!valorNuevo.equals(valorActual)) {
      totalJugando += valorActual.equals("Si") ? -1 : 1;
    }
    return this.replace(nombre, jugador);
  }

  //DELETE
  public Jugador eliminarJugador(Jugador jugador) {
    Jugador jugadorEliminado = this.remove(jugador.getNombre());
    if (jugadorEliminado != null) {
      totalJugadores--;
      totalJugando -= jugadorEliminado.getJugar().equals("Si") ? 1 : 0;
    }
    return jugadorEliminado;
  }

  //LIMPIAR TABLA
  public void inicializarJugadores() {
    this.clear();
    totalJugadores = 0;
    totalJugando = 0;
  }

  //LECTURA
  public void leerJugadores(File archivo) {
    this.inicializarJugadores();//Limpiamos el mapa
    this.nombreArchivo = archivo.getName(); //Guardamos el nombre del archivo

    ArrayList<String> registros = Archivo.leerArchivo(archivo);

    for (String registro : registros) {//Paseamos por todo el archivo
      Jugador jugador = new Jugador(registro.split(",")); //
      this.adicionarJugador(jugador);
    }
  }

  //ESCRITURA
  public void grabarJugadores(File archivo) {
    ArrayList<String> lista = new ArrayList();
    Iterator<Jugador> iterador = this.values().iterator();
    while (iterador.hasNext()) {
      Jugador jugador = iterador.next();
      System.out.println(jugador.toString());
      lista.add(jugador.toString());
    }
    Archivo.grabarArchivo(archivo, lista);
    this.nombreArchivo = archivo.getName();
  }

  public String getNombreArchivo() {
    return nombreArchivo;
  }

  public void setNombreArchivo(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo;
  }

  public int getTotalJugadores() {
    return totalJugadores;
  }

  public void setTotalJugadores(int totalJugadores) {
    this.totalJugadores = totalJugadores;
  }

  public int getTotalJugando() {
    return totalJugando;
  }

  public void setTotalJugando(int totalJugando) {
    this.totalJugando = totalJugando;
  }

}
