package paneles;

import java.awt.event.InputEvent;
import javax.swing.*;
/**
 *
 * @author Mario Pineda
 */

public class BarraConImagenes extends JMenuBar{
  
  public BarraConImagenes(){
    addMenus();
  }
  
  public final void addMenus(){
    JMenu menuArchivo = new JMenu("Archivo");
    menuArchivo.setMnemonic('A');
    add(menuArchivo);
    JMenu menuEdicion = new JMenu("Editar");
    menuEdicion.setMnemonic('D');
    add(menuEdicion);

    JMenuItem abrir = new JMenuItem("Abrir");
    KeyStroke tecla = KeyStroke.getKeyStroke('A',
      InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK);
    abrir.setAccelerator(tecla);
    menuArchivo.add(abrir);
    
    JMenuItem copiar = new JMenuItem("Copiar");
    tecla = KeyStroke.getKeyStroke('C',InputEvent.CTRL_DOWN_MASK);
    copiar.setAccelerator(tecla);
    copiar.setMnemonic('C');
    String imagen = "/imagenes/copy-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon icono = new ImageIcon(this.getClass().getResource(imagen));
    copiar.setIcon(icono);
    menuEdicion.add(copiar);//Hasta aqui termina
    
    JMenuItem guardar = new JMenuItem("Guardar");
    String img = "/imagenes/save-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon icon = new ImageIcon(this.getClass().getResource(img));
    guardar.setIcon(icon);
    guardar.setMnemonic('G');

    menuArchivo.add(guardar);
    menuArchivo.addSeparator();
    menuArchivo.add(new JMenuItem("Salir"));
    

  }

}
