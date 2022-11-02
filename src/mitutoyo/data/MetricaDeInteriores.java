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

import mitutoyo.interfaces.MetricaDeInterioresGUI;
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
public class MetricaDeInteriores  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
    * Creates an instance of MetricaDeInteriores.
    */
    public MetricaDeInteriores() {
    }
       
    private Integer rangoInterior;       
    private Integer metricaInterior;    
    private Integer medida_R;    
    private Integer medida_f;   
    private Integer medida_g;    
    private Integer puntosDeMedicion;
 
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
        
     return new MetricaDeInterioresGUI();    
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        this.setMedida_R(null);
        this.setMedida_f(null);
        this.setMedida_g(null);
        this.setMetricaInterior(null);
        this.setPuntosDeMedicion(null);
        this.setRangoInterior(null);
        
    }
    
    /**
     * This method saves all the values of the properties in an XML file.
     */
    public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica de interiores.xml", this);
       
    }

    /**
     * Number of measurement points that have been taken
     */
    public static final String PROP_PUNTOSDEMEDICION = "puntosDeMedicion";

    /**
     * Get the value of puntosDeMedicion
     *
     * @return the value of puntosDeMedicion
     */
    public Integer getPuntosDeMedicion() {
        return puntosDeMedicion;
    }

    /**
     * Set the value of puntosDeMedicion
     *
     * @param puntosDeMedicion new value of puntosDeMedicion
     */
    public void setPuntosDeMedicion(Integer puntosDeMedicion) {
        Integer oldPuntosDeMedicion = this.puntosDeMedicion;
        this.puntosDeMedicion = puntosDeMedicion;
        propertyChangeSupport.firePropertyChange(PROP_PUNTOSDEMEDICION, oldPuntosDeMedicion, puntosDeMedicion);
    }

    /**
     *  The g measure of the instrument
     */
    public static final String PROP_MEDIDA_G = "medida_g";

    /**
     * Get the value of medida_g
     *
     * @return the value of medida_g
     */
    public Integer getMedida_g() {
        return medida_g;
    }

    /**
     * Set the value of medida_g
     *
     * @param medida_g new value of medida_g
     */
    public void setMedida_g(Integer medida_g) {
        Integer oldMedida_g = this.medida_g;
        this.medida_g = medida_g;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_G, oldMedida_g, medida_g);
    }

    /**
     *  The f measure of the instrument
     */
    public static final String PROP_MEDIDA_F = "medida_f";

    /**
     * Get the value of medida_f
     *
     * @return the value of medida_f
     */
    public Integer getMedida_f() {
        return medida_f;
    }

    /**
     * Set the value of medida_f
     *
     * @param medida_f new value of medida_f
     */
    public void setMedida_f(Integer medida_f) {
        Integer oldMedida_f = this.medida_f;
        this.medida_f = medida_f;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_F, oldMedida_f, medida_f);
    }

    /**
     *  The R measure of the instrument
     */
    public static final String PROP_MEDIDA_R = "medida_R";

    /**
     * Get the value of medida_R
     *
     * @return the value of medida_R
     */
    public Integer getMedida_R() {
        return medida_R;
    }

    /**
     * Set the value of medida_R
     *
     * @param medida_R new value of medida_R
     */
    public void setMedida_R(Integer medida_R) {
        Integer oldMedida_R = this.medida_R;
        this.medida_R = medida_R;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_R, oldMedida_R, medida_R);
    }

    /**
     * The inside measurement
     */
    public static final String PROP_METRICAINTERIOR = "metricaInterior";

    /**
     * Get the value of metricaInterior
     *
     * @return the value of metricaInterior
     */
    public Integer getMetricaInterior() {
        return metricaInterior;
    }

    /**
     * Set the value of metricaInterior
     *
     * @param metricaInterior new value of metricaInterior
     */
    public void setMetricaInterior(Integer metricaInterior) {
        Integer oldMetricaInterior = this.metricaInterior;
        this.metricaInterior = metricaInterior;
        propertyChangeSupport.firePropertyChange(PROP_METRICAINTERIOR, oldMetricaInterior, metricaInterior);
    }

    /**
     * The inside measure range of the instrument
     */
    public static final String PROP_RANGOINTERIOR = "rangoInterior";

    /**
     * Get the value of rangoInterior
     *
     * @return the value of rangoInterior
     */
    public Integer getRangoInterior() {
        return rangoInterior;
    }

    /**
     * Set the value of rangoInterior
     *
     * @param rangoInterior new value of rangoInterior
     */
    public void setRangoInterior(Integer rangoInterior) {
        Integer oldRangoInterior = this.rangoInterior;
        this.rangoInterior = rangoInterior;
        propertyChangeSupport.firePropertyChange(PROP_RANGOINTERIOR, oldRangoInterior, rangoInterior);
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
