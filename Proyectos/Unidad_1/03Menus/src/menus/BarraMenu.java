package menus;

import javax.swing.*;
/**
 *
 * @author Mario Pineda
 */
public class BarraMenu extends JMenuBar{
  
  public BarraMenu(){
    addMenu();
  }
  
  private void addMenu(){
    JMenu menuArchivo =  new JMenu("Archivo");
    menuArchivo.setMnemonic('A');
    add(menuArchivo);
    JMenu menuEditar = new JMenu("Editar");
    menuEditar.setMnemonic('E');
    add(menuEditar);
    
    JMenuItem opcionAbrir = new JMenuItem("Abrir");
    JMenuItem opcionGuardar = new JMenuItem("Guardar");
    JMenu menuInterior = new JMenu("Opciones");
    menuInterior.add(new JMenuItem("Opcion 1"));
    menuInterior.add(new JMenuItem("Opcion 2"));
    
    menuArchivo.add(opcionAbrir);
    menuArchivo.add(opcionGuardar);
    menuArchivo.add(menuInterior);
    menuArchivo.addSeparator();//Añade una linea para separarlos de lo siguiente que esté en elcódigo
    
    menuArchivo.add(new JMenuItem("Salir"));
    
    menuEditar.add(new JMenuItem("Cortar"));
    menuEditar.add(new JMenuItem("Copiar"));
    menuEditar.add(new JMenuItem("Pegar"));
    
    
  }
  
}
