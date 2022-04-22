/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmitutoyo;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class AppMitutoyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       javax.swing.SwingUtilities.invokeLater(() -> {
         init();
     });
    }
    
     private static JFrame crearFrame(Container gui) {
       
    JFrame frame;
    frame= new JFrame(gui.getName());
     
    frame.add(gui, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setTitle(gui.getName());
    
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setMinimumSize(frame.getMinimumSize());
   
    return frame;
    
    }
     
    private static void init() {
        
      Calibre cal = new Calibre();
      Calibre calAbsDig = new CalibreDigimatic();
      Calibre calAlt = new CalibreDeAlturas();
      Micrometro micro = new Micrometro();
      MicrometroDeInteriores microInt = new MicrometroDeInteriores();
      
    // JGuiExtensible gui1 = cal.createDialog();
     //JGuiExtensible gui2 = calAbsDig.createDialog();
     //JGuiExtensible gui3 = calAlt.createDialog();
     // JGuiExtensible gui4 = micro.createDialog();
      JGuiExtensible gui5 = microInt.createDialog();
      
     // crearFrame(gui1);
     // crearFrame(gui2);
      //crearFrame(gui3);
      // crearFrame(gui4);
      crearFrame(gui5);
       
     
    }
}
