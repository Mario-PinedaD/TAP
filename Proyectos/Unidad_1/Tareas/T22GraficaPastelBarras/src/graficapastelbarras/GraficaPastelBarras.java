/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficapastelbarras;

import javax.swing.JFrame;
import modelos.GraficaBarrasPastel;
import vistas.VentanaBarraPastel;

/**
 *
 * @author Mario Pineda
 */
public class GraficaPastelBarras {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    GraficaBarrasPastel modelo = new GraficaBarrasPastel();
    VentanaBarraPastel vista = new VentanaBarraPastel(modelo);
    OyenteBarraPastel oyente = new OyenteBarraPastel(modelo, vista);
    vista.addEventos(oyente);
    vista.setTitle("Graficas de Barras y Pastel");
    vista.setSize(800,800);
    vista.setLocation(100, 100);
    vista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    vista.setVisible(true);

  }

  /*
Diseñe las clases necesarias para que una aplicación pueda leer datos
de de un archivo de texto para presentarlas en una gráfica de barras o de pastel. La
gráfica de barras debe tener los ejes horizontal y vertical. El eje vertical debe
presentar la escala de medición y el eje vertical debe presentar el valor de cada
barra. La aplicación deberá tener tres menús: El primero, denominado Archivo,
tendrá las opciones de abrir y salir. Al abrir debe solicitar el nombre del archivo a
desplegar y para salir, deberá preguntar si desea abandonar el programa (misma
pregunta si se oprime la opción de salir de la barra de título. El segundo menú
deberá tener dos opciones que indique que tipo de gráfica se deberá presentar (de
barras o de pastel) y el tercero debera llamarce Ayuda y deberá tener dos opciones
que expliquen cada tipo de gráfica. El contenido de las ayudas deberá leerse desde
archivos HTML. Los archivos deberán contener los valores a graficar, uno por línea.
  
  En otras palabras:
  barraMenu:
    Leer archivo.
    Salir de aqui, preguntar si se quiere ir o q tmb si pide salir desde la ekis.
  menuGrafico:
    Poner Grafica de barras.
    Poner Grafica de pasteluki
  menuArdyuda:
    Explicar Grafica de paste.
    Explicar grafica de barras.
  
   */
}
