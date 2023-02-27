package util;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Mario Pineda
 */
public class Ambiente {

  public static void checarAmbientes() {
    LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
    for (int i = 0; i < looks.length; i++) {
      System.out.println(looks[i].getClassName());
    }
  }
  
  public static void setAmbiente(String ambiente) {
   String lookAndFeel = "";
   switch (ambiente) {
     case "Nimbus" ->  {
       lookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
     }
     case "Metal" ->  {
       lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
     }

     case "Motif" ->  {
       lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
     }
     case "Windows" ->  {
       lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
     }
     case "Classic" ->  {
       lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
     }
   }
    try {      
      UIManager.setLookAndFeel(lookAndFeel);
    } catch (ClassNotFoundException 
      | InstantiationException 
      | IllegalAccessException 
      | UnsupportedLookAndFeelException ex) {
      System.out.print("Error de ambiente "+ex);
      System.exit(-1);
    }
  
}
}
