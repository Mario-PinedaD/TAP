
package tareapaneles;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Mario Pineda
 */
public class PanelMezclado extends JTabbedPane{
  
  private final Border bordePanelTab;
  
  public PanelMezclado(){
    bordePanelTab = BorderFactory.createEtchedBorder();
    addComponentes();
  }
  
  private void addComponentes(){
    setBackground(Color.CYAN);
    setOpaque(true);
    setBorder(BorderFactory.createLineBorder(getBackground(),50));
    addTab("Panel con malla",addPanelConMalla());
    addTab("Panel con border",addPanelConBorder());
    addTab("Mezcla de Paneles",mezclaPaneles());
  }
  
  public Component mezclaPaneles(){
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(new JButton("Principal"),"Center");
    
    JPanel panelNorte = new JPanel();  //Un JPanel usa FlowLayout por omisión
    panelNorte.setBackground(Color.WHITE);

    panelNorte.add(new JButton("Aceptar"));
    panelNorte.add(new JButton("Cancelar"));

    panel.add(panelNorte,"North");
    return panel;
  }
  
  //Con Border no podemos colocer varios objetos en un mismo sentido, 2 en norte, no se puede
  public Component addPanelConBorder() {
    JPanel panel = new JPanel();
    panel.setBorder(bordePanelTab);
    BorderLayout layout = new BorderLayout();
    layout.setHgap(10); //Espaciado Horizontal
    layout.setVgap(15); //Espaciado Vertical
    panel.setLayout(layout);
    panel.add(new JButton("Cancelar"), "North");
    panel.add(new JButton("Aceptar"), "North");
    panel.add(new JButton("Sur"), "South");
    panel.add(new JButton("Derecha"), "East");
    panel.add(new JButton("Izquerda"), "West");
    panel.add(BorderLayout.CENTER, new JButton("Otra cosa"));
    return panel;
  }

  private Component addPanelConMalla() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.GREEN);
    panel.setBorder(bordePanelTab);
    GridLayout layout = new GridLayout(2, 2); // 2 filas, 2 columnas
    panel.setLayout(layout);
    JButton boton1 = new JButton("Primer botón");
//    boton1.setBounds(100,100,300,50); // Con Layout, setBounds no funciona
    JButton boton2 = new JButton("Último botón");
    panel.add(new JButton("Otro botón"));  //<====
    panel.add(boton2);
    panel.add(boton1);

    return panel;
  }
}
