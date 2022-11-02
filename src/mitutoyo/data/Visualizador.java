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

import mitutoyo.Utilidades;
import mitutoyo.interfaces.VisualizadorGUI;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;

/**
 * This is a data structure to save the fields´s values of the GUI with the same name as this class.
 * 
 * @author a31r1z
 */
public class Visualizador  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
    * Creates an instance of Visualizador.
    */
    public Visualizador() {
        
    }
  
    private Integer resolucion;
    private Integer tasaDeRefresco;
    private String visualizador;
    private boolean salidaDeDatos;

     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */  
    public JGuiExtensible createDialog() {
        
    return new VisualizadorGUI();    
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        this.setSalidaDeDatos(false);
        this.setResolucion(null);
        this.setVisualizador(null);
        
    }
    
    /**
     * This method saves all the values of the properties in an XML file.
     */
     public void guardarDatos() {
        
       Utilidades.saveInXml("Visualizador.xml", this);
       
    }
     
    /**
     * The screen refresh rate
     */
    public static final String PROP_TASADEREFRESCO = "tasaDeRefresco";

    /**
     * Get the value of tasaDeRefresco
     *
     * @return the value of tasaDeRefresco
     */
    public Integer getTasaDeRefresco() {
        return tasaDeRefresco;
    }

    /**
     * Set the value of tasaDeRefresco
     *
     * @param tasaDeRefresco new value of tasaDeRefresco
     */
    public void setTasaDeRefresco(Integer tasaDeRefresco) {
        Integer oldTasaDeRefresco = this.tasaDeRefresco;
        this.tasaDeRefresco = tasaDeRefresco;
        propertyChangeSupport.firePropertyChange(PROP_TASADEREFRESCO, oldTasaDeRefresco, tasaDeRefresco);
    }

    /**
     * The type of visualizer
     */
    public static final String PROP_VISUALIZADOR = "visualizador";

    /**
     * Get the value of visualizador
     *
     * @return the value of visualizador
     */
    public String getVisualizador() {
        return visualizador;
    }

    /**
     * Set the value of visualizador
     *
     * @param visualizador new value of visualizador
     */
    public void setVisualizador(String visualizador) {
        String oldVisualizador = this.visualizador;
        this.visualizador = visualizador;
        propertyChangeSupport.firePropertyChange(PROP_VISUALIZADOR, oldVisualizador, visualizador);
    }
    
    /**
     * If the visualizar has a data output
     */
    public static final String PROP_SALIDADEDATOS = "salidaDeDatos";

    /**
     * Get the value of salidaDeDatos
     *
     * @return the value of salidaDeDatos
     */
    public boolean isSalidaDeDatos() {
        return salidaDeDatos;
    }

    /**
     * Set the value of salidaDeDatos
     *
     * @param salidaDeDatos new value of salidaDeDatos
     */
    public void setSalidaDeDatos(boolean salidaDeDatos) {
        boolean oldSalidaDeDatos = this.salidaDeDatos;
        this.salidaDeDatos = salidaDeDatos;
        propertyChangeSupport.firePropertyChange(PROP_SALIDADEDATOS, oldSalidaDeDatos, salidaDeDatos);
    }

    /**
     * The resolution of the display
     */
    public static final String PROP_RESOLUCION = "resolucion";

    /**
     * Get the value of resolucion
     *
     * @return the value of resolucion
     */
    public Integer getResolucion() {
        return resolucion;
    }

    /**
     * Set the value of resolucion
     *
     * @param resolucion new value of resolucion
     */
    public void setResolucion(Integer resolucion) {
        Integer oldResolucion = this.resolucion;
        this.resolucion = resolucion;
        propertyChangeSupport.firePropertyChange(PROP_RESOLUCION, oldResolucion, resolucion);
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
