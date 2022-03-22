/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Calibre {
    
    JFactory factory = new JFactory();
    
    private Especificaciones especificaciones; 
    
     public Calibre() {
         
         especificaciones= new Especificaciones();        
    }
 
      protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = factory.createDialog(JTipoGui.SIMPLE, false);
        JGuiExtensible especif = new EspecificacionesGUI();
        
        dialog.addExtensibleChild(especif);
        dialog.setName("Calibre");
                      
        return dialog;
    }

  
   
    
  
    
 
}
