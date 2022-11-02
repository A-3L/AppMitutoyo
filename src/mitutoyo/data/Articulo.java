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

import mitutoyo.interfaces.ArticuloGUI;
import mitutoyo.Utilidades;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;

/**
 * This is a data structure to save the fields´s values of the GUI with the same name as this class.
 * 
 * @author a31r1z
 */
 public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
   /**
    * Creates an instance of Articulo.
    */
    public Articulo() {
    }
    
    private String refArticulo;
    private String serie;
    
    /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
                  
    return new ArticuloGUI(); 
    }
    
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        setRefArticulo(null);
        setSerie(null);
    }
    
    /**
     * This method saves all the values of the properties in an XML file.
     */
    public void guardarDatos() {
        
       Utilidades.saveInXml("Articulo.xml", this);
       
    }

    /**
     * The serie´s number of the measurement instrument
     */
    public static final String PROP_SERIE = "serie";

    /**
     * Get the value of serie
     *
     * @return the value of serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Set the value of serie
     *
     * @param serie new value of serie
     */
    public void setSerie(String serie) {
        String oldSerie = this.serie;
        this.serie = serie;
        propertyChangeSupport.firePropertyChange(PROP_SERIE, oldSerie, serie);
    }

    /**
     * The identifier of the measurement instrument
     */
    public static final String PROP_REFARTICULO = "refArticulo";

    /**
     * Get the value of refArticulo
     *
     * @return the value of refArticulo
     */
    public String getRefArticulo() {
        return refArticulo;
    }

    /**
     * Set the value of refArticulo
     *
     * @param refArticulo new value of refArticulo
     */
    public void setRefArticulo(String refArticulo) {
        String oldRefArticulo = this.refArticulo;
        this.refArticulo = refArticulo;
        propertyChangeSupport.firePropertyChange(PROP_REFARTICULO, oldRefArticulo, refArticulo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener listener to add
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener listener to remove
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
