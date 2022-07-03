/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JGuiExtensible;
import mitutoyo.interfaces.ArticuloGUI;
import mitutoyo.interfaces.EspecificacionesGUI;
import mitutoyo.interfaces.Utilidades;

/**
 *
 * @author a31r1z
 */
public class Especificaciones {

    private Articulo articulo= new Articulo();
    private Dimensiones dimensiones = new Dimensiones();
    
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
