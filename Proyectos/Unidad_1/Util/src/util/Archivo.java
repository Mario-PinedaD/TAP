package util;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Mario Pineda
 */
public class Archivo {

  public static ArrayList<String> leerArchivo(String nombre) {
    return leerArchivo(new File(nombre));
  }

  public static ArrayList<String> leerArchivo(File nombre) {
    try {
      return leerArchivo(new FileInputStream(nombre));
    } catch (IOException ex) {
      System.out.println("Error de archivo " + ex);
      System.exit(-1);
    }
    return null;
  }

  public static ArrayList<String> leerArchivo(InputStream nombre) {
    ArrayList<String> lineas = new ArrayList();

    try {
      InputStreamReader flujo = new InputStreamReader(nombre);    //Apertura de archivo
      BufferedReader buffer = new BufferedReader(flujo);//APertura
      String linea = buffer.readLine();                    //USO
      while (linea != null) {                              //Mientras haya contenido en la linea
        lineas.add(linea);                               //Se añade la linea al arreglo
        linea = buffer.readLine();                         //Luego se sigue leyendo a la siguiente linea
      }
      buffer.close();                                      //Ya cerramos los archivos y los flujos
      flujo.close();
    } catch (IOException ex) {
      System.out.println("Error de archivo " + ex);
      System.exit(-1);
    }
    return lineas;
  }

  public static void grabarArchivo(String nombre, ArrayList<String> lineas) {
    grabarArchivo(new File(nombre), lineas);
  }

  public static void grabarArchivo(File nombre, ArrayList<String> lineas) {
    try {
      FileWriter flujo = new FileWriter(nombre);
      BufferedWriter buffer = new BufferedWriter(flujo);
      for (int i = 0; i < lineas.size(); i++) {
        String linea = lineas.get(i);
        buffer.write(linea);
        buffer.newLine();
        System.out.println(linea+" Archivo");
      }
      buffer.close();
      
    } catch (IOException ex) {
      System.out.println("Error con el archivo: " + ex);
      System.exit(-1);
    }
  }

}
