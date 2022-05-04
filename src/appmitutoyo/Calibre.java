/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.Articulo;
import appmitutoyo.interfaces.Dimensiones;
import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class Calibre {
    
    private Articulo articulo = new Articulo();
    private Dimensiones dimensiones = new Dimensiones();
    
    
    public Calibre() {
         
    }
 
    protected JGuiExtensible createDialog() {
                
        JGuiExtensible articuloGui = articulo.createDialog();
        JGuiExtensible dimensionesGui = dimensiones.createDialog();
        
        articuloGui.addExtensibleChild(dimensionesGui);
        articuloGui.setName("Calibre");
                      
        return articuloGui;
    }
  
}