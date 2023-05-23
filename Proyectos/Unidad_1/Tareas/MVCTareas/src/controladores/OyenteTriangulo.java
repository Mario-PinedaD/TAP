/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelos.TrianguloInscrito;
import vistas.PanelTrianguloInscrito;

/**
 *
 * @author mario
 */
public class OyenteTriangulo implements ActionListener {

  private TrianguloInscrito modelo;
  private PanelTrianguloInscrito vista;

  public OyenteTriangulo(TrianguloInscrito modelo, PanelTrianguloInscrito vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton boton = (JButton) e.getSource();
    
    switch (boton.getName()) {
      case "aumentar": {
        System.out.println("Aumentar");
        break;
      }
      case "disminuir": {
        System.out.println("Disminuir");
        break;
      }
    }
  }
  
  public void aumentar(){
    
  }
  public void disminuir(){
    
  }
}
