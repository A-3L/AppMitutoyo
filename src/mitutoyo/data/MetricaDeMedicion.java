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

import mitutoyo.interfaces.MetricaDeMedicionGUI;
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
public class MetricaDeMedicion  implements Serializable{
    
    private static final long serialVersionUID = 1L;

    /**
    * Creates an instance of MetricaDeMedicion.
    */
    public MetricaDeMedicion() {
    }
    
    private Integer rango;    
    private Integer precision;
    private Integer resolucion;    
    private Integer graduacion;    
    private Integer presionDeMedida;
    
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
                  
    return new MetricaDeMedicionGUI(); 
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        this.setRango(null);
        this.setPrecision(null);
        this.setGraduacion(null);
        this.setPresionDeMedida(null);    
        this.setResolucion(null);
    }

    /**
     * This method saves all the values of the properties in an XML file.
     */
     public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica de medicion.xml", this);
       
    }
     
    /**
     * The measure pressure that can support the instrument
     */
    public static final String PROP_PRESIONDEMEDIDA = "presionDeMedida";

    /**
     * Get the value of presionDeMedida
     *
     * @return the value of presionDeMedida
     */
    public Integer getPresionDeMedida() {
        return presionDeMedida;
    }

    /**
     * Set the value of presionDeMedida
     *
     * @param presionDeMedida new value of presionDeMedida
     */
    public void setPresionDeMedida(Integer presionDeMedida) {
        Integer oldPresionDeMedida = this.presionDeMedida;
        this.presionDeMedida = presionDeMedida;
        propertyChangeSupport.firePropertyChange(PROP_PRESIONDEMEDIDA, oldPresionDeMedida, presionDeMedida);
    }

    /**
     * The graduation that can support the instrument
     */
    public static final String PROP_GRADUACION = "graduacion";

    /**
     * Get the value of graduacion
     *
     * @return the value of graduacion
     */
    public Integer getGraduacion() {
        return graduacion;
    }

    /**
     * Set the value of graduacion
     *
     * @param graduacion new value of graduacion
     */
    public void setGraduacion(Integer graduacion) {
        Integer oldGraduacion = this.graduacion;
        this.graduacion = graduacion;
        propertyChangeSupport.firePropertyChange(PROP_GRADUACION, oldGraduacion, graduacion);
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

    /**
     * The precision that the instrument can reach
     */
    public static final String PROP_PRECISION = "precision";

    /**
     * Get the value of precision
     *
     * @return the value of precision
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Set the value of precision
     *
     * @param precision new value of precision
     */
    public void setPrecision(Integer precision) {
        Integer oldPrecision = this.precision;
        this.precision = precision;
        propertyChangeSupport.firePropertyChange(PROP_PRECISION, oldPrecision, precision);
    }

    /**
     * The range of measurement
     */
    public static final String PROP_RANGO = "rango";

    /**
     * Get the value of rango
     *
     * @return the value of rango
     */
    public Integer getRango() {
        return rango;
    }

    /**
     * Set the value of rango
     *
     * @param rango new value of rango
     */
    public void setRango(Integer rango) {
        Integer oldRango = this.rango;
        this.rango = rango;
        propertyChangeSupport.firePropertyChange(PROP_RANGO, oldRango, rango);
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
