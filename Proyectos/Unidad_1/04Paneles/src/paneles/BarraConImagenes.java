package paneles;

import java.awt.event.InputEvent;
import javax.swing.*;

/**
 *
 * @author Mario Pineda
 */
public class BarraConImagenes extends JMenuBar {

  public BarraConImagenes() {
    addMenus();
  }

  public final void addMenus() {
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
    abrir.setMnemonic('A');
    String direccionImagen = "/imagenes/open-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon iconoAbrir = new ImageIcon(this.getClass().getResource(direccionImagen));
    abrir.setIcon(iconoAbrir);

    JMenuItem guardar = new JMenuItem("Guardar");
    tecla = KeyStroke.getKeyStroke('G', InputEvent.CTRL_DOWN_MASK);
    guardar.setAccelerator(tecla);
    String img = "/imagenes/save-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon icon = new ImageIcon(this.getClass().getResource(img));
    guardar.setIcon(icon);
    guardar.setMnemonic('G');

    JMenuItem guardarComo = new JMenuItem("Guardar Como");
    tecla = KeyStroke.getKeyStroke('G', InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK);
    guardarComo.setAccelerator(tecla);
    String imgGComo = "/imagenes/save-as-icon.png";
    ImageIcon iconGuardarComo = new ImageIcon(this.getClass().getResource(imgGComo));
    guardarComo.setIcon(iconGuardarComo);
    guardarComo.setMnemonic('C');

    JMenuItem salir = new JMenuItem("Salir");
    tecla = KeyStroke.getKeyStroke(115, InputEvent.ALT_DOWN_MASK);
    salir.setAccelerator(tecla);
    String imgSalir = "/imagenes/exit-icon.png";
    ImageIcon iconSalir = new ImageIcon(this.getClass().getResource(imgSalir));
    salir.setIcon(iconSalir);
    salir.setMnemonic('S');

    //==
    JMenuItem copiar = new JMenuItem("Copiar");
    tecla = KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK);
    copiar.setAccelerator(tecla);
    copiar.setMnemonic('C');
    String imagen = "/imagenes/copy-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon icono = new ImageIcon(this.getClass().getResource(imagen));
    copiar.setIcon(icono);

    JMenuItem cortar = new JMenuItem("Cortar");
    tecla = KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK);
    cortar.setAccelerator(tecla);
    cortar.setMnemonic('O');
    String imagenCortar = "/imagenes/cut-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon iconoCortar = new ImageIcon(this.getClass().getResource(imagenCortar));
    cortar.setIcon(iconoCortar);
    
    JMenuItem pegar = new JMenuItem("Pegar");
    tecla = KeyStroke.getKeyStroke('V', InputEvent.CTRL_DOWN_MASK);
    pegar.setAccelerator(tecla);
    pegar.setMnemonic('P');
    String imagenPegar = "/imagenes/paste-icon.png";//Esto es para ir viendo que rollo con las imagenes
    ImageIcon iconoPegar = new ImageIcon(this.getClass().getResource(imagenPegar));
    pegar.setIcon(iconoPegar);
    //=========
    //Parte de "archivo"
    menuArchivo.add(abrir);
    menuArchivo.add(guardar);
    menuArchivo.add(guardarComo);
    menuArchivo.addSeparator();
    menuArchivo.add(salir);
    //Parte de Edicion
    menuEdicion.add(copiar);//Hasta aqui termina
    menuEdicion.add(cortar);
    menuEdicion.add(pegar);

  }

}
