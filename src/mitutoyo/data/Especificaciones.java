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
package mitutoyo.data;

import java.io.Serializable;
import jguiextensible.JGuiExtensible;
import mitutoyo.interfaces.EspecificacionesGUI;

/**
 * This is a data structure to save the fields´s values of the GUI with the same name as this class.
 * 
 * @author a31r1z
 */
public class Especificaciones implements Serializable{

    private static final long serialVersionUID = 1L;

    private final Articulo articulo= new Articulo();
    private final Dimensiones dimensiones = new Dimensiones();
    
     /**
    * Creates an instance of Especificaciones.
    */
    public Especificaciones() {
    }
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
                  
       return new EspecificacionesGUI(); 
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
       articulo.borrarDatos();
       dimensiones.borrarDatos();
    }
    /**
     * This method saves all the values of the properties in an XML file.
     */
    public void guardarDatos() {
        
      articulo.guardarDatos();
      dimensiones.guardarDatos();
       
    }
    
}
