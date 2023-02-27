package componentes;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Mario Pineda
 */
public class PanelComponentes extends JPanel {
  
  public PanelComponentes() {
    this.setBackground(Color.CYAN);
    addComponentes();
  }
  
  public final void addComponentes() {
    //Botones
    this.setLayout(null);
    JButton boton = new JButton();
    boton.setText("Primer Botón");
    boton.setSize(150, 40);
    boton.setLocation(50, 50);
    this.add(boton);
    
    //Etiqueta
    JLabel etiqueta = new JLabel("Este es un mensaje:");
    etiqueta.setBounds(300, 50, 200, 40);
    this.add(etiqueta);
    
    //Campo de texto
    JTextField campo = new JTextField("Valor de entrada");
    campo.setBounds(30, 120, 200, 80);
    add(campo);
    //Area de texto
    JTextArea area = new JTextArea(30,3);
    area.setBackground(Color.LIGHT_GRAY);
    area.setText("Captura de texto env arias líneas");
    area.setBounds(300,120,200,80);
    area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    add(area);
    
    //CheckBox
    JCheckBox ch1 = new JCheckBox("Uno",true);
    ch1.setBounds(50, 260, 100, 30);
    ch1.setBackground(this.getBackground());
    add(ch1);
    JCheckBox ch2 = new JCheckBox("Dos");
    ch2.setBounds(50, 290, 100, 30);
    ch2.setBackground(this.getBackground());
    add(ch2);
    
    //Casillas en grupo, check box
    JCheckBox chA = new JCheckBox("Azul",true);
    chA.setBounds(300, 260, 100, 30);
    chA.setBackground(this.getBackground());
    add(chA);
    JCheckBox chB = new JCheckBox("Verde");
    chB.setBounds(420, 260, 100, 30);
    chB.setBackground(this.getBackground());
    add(chB);
    JCheckBox chC = new JCheckBox("Amarillo");
    chC.setBounds(540, 260, 100, 30);
    chC.setBackground(this.getBackground());
    add(chC);
    ButtonGroup grupo = new ButtonGroup();
    grupo.add(chA);
    grupo.add(chB);
    grupo.add(chC);
    
    //Lista deplegable
    JComboBox sel = new JComboBox();
    sel.addItem("Azul");
    sel.addItem("Verde");
    sel.addItem("AMarillo");
    sel.setSelectedIndex(1);
    sel.setBounds(50,340,100,30);
    add(sel);
    
    String[] elementos ={
      "Opcion 1","Opcion 2",
      "Opcion 3","Opcion 4",
      "Opcion 5","Opcion 6"
    };
    JList lista =new JList(elementos);
    lista.setBounds(300,340,100,150);
    add(lista);
  }
  
}
