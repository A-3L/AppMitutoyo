/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mitutoyo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a31r1z
 */
public class Mitutoyo extends WindowAdapter{
    
    private static final String LOOKANDFEEL="com.jtattoo.plaf.luna.LunaLookAndFeel";
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       javax.swing.SwingUtilities.invokeLater(() -> {
        //setMyLookAndFeel();
         init();
        
     });
    }
    
    private static void setMyLookAndFeel() {
        
        try{
    
            UIManager.setLookAndFeel(LOOKANDFEEL);
           
        } catch(UnsupportedLookAndFeelException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
           Logger.getLogger(Mitutoyo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    private static void init() {
        
       Calibre cal = new Calibre();
       Calibre calAlt = new CalibreDeAlturas();
       Calibre calDig = new CalibreDigimatic();
       Micrometro micro = new Micrometro();
       Comparador comp = new Comparador();
       MicrometroDeInteriores microInt = new MicrometroDeInteriores(); 
     
       JFrame frame= Utilidades.crearFrame(cal.createDialog());
       frame.addWindowListener(new WindowAdapter() {
       
       @Override
        public void windowClosed(WindowEvent evt) {
       
       JFrame frame0= Utilidades.crearFrame(calDig.createDialog());
       frame0.addWindowListener(new WindowAdapter() {
       
           @Override
           public void windowClosed(WindowEvent evt) {
           
           JFrame frame1= Utilidades.crearFrame(calAlt.createDialog());
           frame1.addWindowListener(new WindowAdapter() {
           
                @Override
                public void windowClosed(WindowEvent evt) {
           
                JFrame frame2=Utilidades.crearFrame(comp.createDialog());
                frame2.addWindowListener(new WindowAdapter() {
           
                   @Override
                   public void windowClosed(WindowEvent evt) {
           
                   JFrame frame3=Utilidades.crearFrame(micro.createDialog());
                   frame3.addWindowListener(new WindowAdapter() {
           
                       @Override
                       public void windowClosed(WindowEvent evt) {
              
                       JFrame frame4=Utilidades.crearFrame(microInt.createDialog());
                       frame4.addWindowListener(new WindowAdapter() {
                  
                           public void WindowClosing(WindowEvent evt) {
                              
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
            });
            } 
        });
        }
}
        
    
  

