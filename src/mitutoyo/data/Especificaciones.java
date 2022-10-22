/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import java.io.Serializable;
import jguiextensible.JGuiExtensible;
import mitutoyo.interfaces.EspecificacionesGUI;

/**
 *
 * @author a31r1z
 */
public class Especificaciones implements Serializable{

    private static final long serialVersionUID = 1L;

    private final Articulo articulo= new Articulo();
    private final Dimensiones dimensiones = new Dimensiones();
    
    public Especificaciones() {
    }
    
    public JGuiExtensible createDialog() {
                  
       return new EspecificacionesGUI(); 
    }
    
    public void borrarDatos() {
        
       articulo.borrarDatos();
       dimensiones.borrarDatos();
    }
    
    public void guardarDatos() {
        
      articulo.guardarDatos();
      dimensiones.guardarDatos();
       
    }
    
}
