/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.ArticuloGUI;
import appmitutoyo.interfaces.DimensionesGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class Calibre {
        
     public Calibre() {
           
    }
 
      protected JGuiExtensible createDialog() {
        
        ArticuloGUI articulo = new ArticuloGUI();
        DimensionesGUI dimensiones = new DimensionesGUI();
        
        articulo.addExtensibleChild(dimensiones);
        articulo.setName("Calibre");
                               
        return articulo;
    }

  
   
    
  
    
 
}
