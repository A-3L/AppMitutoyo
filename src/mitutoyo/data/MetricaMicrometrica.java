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

import mitutoyo.interfaces.MetricaMicrometricaGUI;
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
public class MetricaMicrometrica  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
    * Creates an instance of MetricaMicrometrica.
    */
    public MetricaMicrometrica() {
    }
    
    private Integer avance;
    private Integer planitud;
    private Integer paralelismo;
    private Integer perpendicularidad;
    private Integer rectitud;
    
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
           
     return new MetricaMicrometricaGUI();     
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        this.setAvance(null);
        this.setParalelismo(null);
        this.setPerpendicularidad(null);
        this.setPlanitud(null);
        this.setRectitud(null);
        
    }
    
    /**
     * This method saves all the values of the properties in an XML file.
     */
     public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica micrometrica.xml", this);
       
    }

    /**
     * Property name: rectitud
     */
    public static final String PROP_RECTITUD = "rectitud";

    /**
     * Get the value of rectitud
     *
     * @return the value of rectitud
     */
    public Integer getRectitud() {
        return rectitud;
    }

    /**
     * Set the value of rectitud
     *
     * @param rectitud new value of rectitud
     */
    public void setRectitud(Integer rectitud) {
        Integer oldRectitud = this.rectitud;
        this.rectitud = rectitud;
        propertyChangeSupport.firePropertyChange(PROP_RECTITUD, oldRectitud, rectitud);
    }

    /**
     * The perpendicularity of the measurement
     */
    public static final String PROP_PERPENDICULARIDAD = "perpendicularidad";

    /**
     * Get the value of perpendicularidad
     *
     * @return the value of perpendicularidad
     */
    public Integer getPerpendicularidad() {
        return perpendicularidad;
    }

    /**
     * Set the value of perpendicularidad
     *
     * @param perpendicularidad new value of perpendicularidad
     */
    public void setPerpendicularidad(Integer perpendicularidad) {
        Integer oldPerpendicularidad = this.perpendicularidad;
        this.perpendicularidad = perpendicularidad;
        propertyChangeSupport.firePropertyChange(PROP_PERPENDICULARIDAD, oldPerpendicularidad, perpendicularidad);
    }

    /**
     * The paralelism that the instrument can reach
     */
    public static final String PROP_PARALELISMO = "paralelismo";

    /**
     * Get the value of paralelismo
     *
     * @return the value of paralelismo
     */
    public Integer getParalelismo() {
        return paralelismo;
    }

    /**
     * Set the value of paralelismo
     *
     * @param paralelismo new value of paralelismo
     */
    public void setParalelismo(Integer paralelismo) {
        Integer oldParalelismo = this.paralelismo;
        this.paralelismo = paralelismo;
        propertyChangeSupport.firePropertyChange(PROP_PARALELISMO, oldParalelismo, paralelismo);
    }

    /**
     * The flatness of the measurement
     */
    public static final String PROP_PLANITUD = "planitud";

    /**
     * Get the value of planitud
     *
     * @return the value of planitud
     */
    public Integer getPlanitud() {
        return planitud;
    }

    /**
     * Set the value of planitud
     *
     * @param planitud new value of planitud
     */
    public void setPlanitud(Integer planitud) {
        Integer oldPlanitud = this.planitud;
        this.planitud = planitud;
        propertyChangeSupport.firePropertyChange(PROP_PLANITUD, oldPlanitud, planitud);
    }

    /**
     * The progress of the measure respect others measurements
     */
    public static final String PROP_AVANCE = "avance";

    /**
     * Get the value of avance
     *
     * @return the value of avance
     */
    public Integer getAvance() {
        return avance;
    }

    /**
     * Set the value of avance
     *
     * @param avance new value of avance
     */
    public void setAvance(Integer avance) {
        Integer oldAvance = this.avance;
        this.avance = avance;
        propertyChangeSupport.firePropertyChange(PROP_AVANCE, oldAvance, avance);
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
