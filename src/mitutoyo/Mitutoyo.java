/**
 * AppMitutoyo is an application to show how works the implementation of the library JGuiExtensible
 * that develops a reusable gui pattern.
 * 
 * Copyright (C) 2022 Alberto Eiriz Lopez
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
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
 * This class creates a sequence of dialogs to visualize the application of the JGuiExtensible library 
 * on the creation of one extensible graphical interface  
 *  
 * @author a31r1z
 */
public class Mitutoyo extends WindowAdapter{
    
    private static final String LOOKANDFEEL="com.jtattoo.plaf.mcwin.McWinLookAndFeel";
   
    /**
     * Initialize the application.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       javax.swing.SwingUtilities.invokeLater(() -> {
           
         setMyLookAndFeel();
         init();
        
     });
    }
    /**
     * Method to change the visual look and feel of the application dialogs.
     */
    private static void setMyLookAndFeel() {
        
        try{
    
            UIManager.setLookAndFeel(LOOKANDFEEL);
           
        } catch(UnsupportedLookAndFeelException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
           Logger.getLogger(Mitutoyo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * Creates a cascade of dialogs to display the application graphical interface  
     */ 
    private static void init() {
        
       Calibre cal = new Calibre();
       CalibrePieDeRey calPie= new CalibrePieDeRey();
       Calibre calAlt = new CalibreDeAlturas();
       Calibre calDig = new CalibreDigimatic();
       Micrometro micro = new Micrometro();
       Comparador comp = new Comparador();
       MicrometroDeInteriores microInt = new MicrometroDeInteriores(); 
       MicrometroDeAlturas microAlt = new MicrometroDeAlturas();
     
       JFrame frame= Utilidades.crearFrame(cal.createDialog());
       frame.addWindowListener(new WindowAdapter() {
       
       @Override
        public void windowClosed(WindowEvent evt) {
       
       JFrame frame0= Utilidades.crearFrame(calPie.createDialog());
       frame0.addWindowListener(new WindowAdapter() {
       
            @Override
           public void windowClosed(WindowEvent evt) {
           
           JFrame frame1= Utilidades.crearFrame(calDig.createDialog());
           frame1.addWindowListener(new WindowAdapter() {
          
             @Override
             public void windowClosed(WindowEvent evt) {
           
             JFrame frame2= Utilidades.crearFrame(calAlt.createDialog());
             frame2.addWindowListener(new WindowAdapter() {
           
                @Override
                public void windowClosed(WindowEvent evt) {
           
                JFrame frame3=Utilidades.crearFrame(comp.createDialog());
                frame3.addWindowListener(new WindowAdapter() {
           
                   @Override
                   public void windowClosed(WindowEvent evt) {
           
                   JFrame frame4=Utilidades.crearFrame(micro.createDialog());
                   frame4.addWindowListener(new WindowAdapter() {
           
                       @Override
                       public void windowClosed(WindowEvent evt) {
              
                       JFrame frame5=Utilidades.crearFrame(microInt.createDialog());
                       frame5.addWindowListener(new WindowAdapter() {
                           
                           @Override
                           public void windowClosed(WindowEvent evt) {
              
                           JFrame frame6=Utilidades.crearFrame(microAlt.createDialog());
                           frame6.addWindowListener(new WindowAdapter() {
                  
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
     });
    }
  });
 }
}
        
    
  

