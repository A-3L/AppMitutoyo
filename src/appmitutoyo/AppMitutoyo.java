/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.Utilidades;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class AppMitutoyo extends WindowAdapter{
    
private static final List<JGuiExtensible> lista = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       javax.swing.SwingUtilities.invokeLater(() -> {
         init();
     });
    }
     
    private static void init() {
        
       Calibre cal = new Calibre();
       Calibre calAbsDig = new CalibreDigimatic();
       Calibre calAlt = new CalibreDeAlturas();
       Micrometro micro = new Micrometro();
       Comparador comp = new Comparador();
        MicrometroDeInteriores microInt = new MicrometroDeInteriores(); 
       
       JGuiExtensible jgui= cal.createDialog();
       //jgui.addExtensibleChild(micro.createDialog());
       jgui.addExtensibleChild(calAlt.createDialog());
    
       JFrame frame1= Utilidades.crearFrame(cal.createDialog());
       frame1.addWindowListener(new WindowAdapter() {
         
          @Override
          public void windowClosed(WindowEvent evt) {
          
              JFrame frame2=Utilidades.crearFrame(calAlt.createDialog());
              frame2.addWindowListener(new WindowAdapter() {
              
              @Override
              public void windowClosed(WindowEvent evt) {
              JFrame frame3=Utilidades.crearFrame(micro.createDialog());
              frame3.addWindowListener(new WindowAdapter() {
              
              @Override
              public void windowClosed(WindowEvent evt) {
              
              JFrame frame4=Utilidades.crearFrame(microInt.createDialog());
              frame4.addWindowListener(new WindowAdapter(){
                  
               public void WindowClosed(WindowEvent evt) {
                  System.exit(0);
            }
            });
                           
            }
            });
              
            }
            }); 
              
        }
        }); 
    }  
}
        
    
  

