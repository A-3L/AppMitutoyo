/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.ArticuloGUI;
import appmitutoyo.interfaces.DimensionesGUI;
import appmitutoyo.interfaces.Especificaciones;
import appmitutoyo.interfaces.MetricaDeInterioresGUI;
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
        
        ArticuloGUI articulo = new ArticuloGUI();
        DimensionesGUI dimensiones = new DimensionesGUI();
        
        articulo.addExtensibleChild(dimensiones);
        articulo.setName("Calibre");
                               
        return articulo;
    }

  
   
    
  
    
 
}
