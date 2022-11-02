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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;
import mitutoyo.interfaces.SingularidadGUI;
import mitutoyo.Utilidades;

/**
 * This is a data structure to save the fields´s values of the GUI with the same name as this class.
 * 
 * @author a31r1z
 */
public class Singularidad  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * Creates an instance of Singularidad.
    */
    public Singularidad() {
        
    }
    
    private Integer desvAbsoluta;   
    private Integer desvMedia;   
    private Integer desvTipica;   
    private Integer limite;    
    private Integer mediana;   
    private Integer promedio;    
    private Integer singularidad;    
    private Integer valorRef;    
    private Integer margen;
    
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
     public JGuiExtensible createDialog() {
                  
    return new SingularidadGUI(); 
    }
    /**
     * This method clean all the values inserted in the properties
     */ 
    public void borrarDatos() {
        
        this.setDesvAbsoluta(null);
        this.setDesvMedia(null);
        this.setDesvTipica(null);
        this.setLimite(null);
        this.setMediana(null);
        this.setSingularidad(null);
        this.setValorRef(null);
        this.setMargen(50);
        
    }
    
    /**
     * This method saves all the values of the properties in an XML file.
     */
    public void guardarDatos() {
        
       Utilidades.saveInXml("Singularidad.xml", this);
       
    }

    /**
     * The deviation margin
     */
    public static final String PROP_MARGEN = "margen";

    /**
     * Get the value of margen
     *
     * @return the value of margen
     */
    public Integer getMargen() {
        return margen;
    }

    /**
     * Set the value of margen
     *
     * @param margen new value of margen
     */
    public void setMargen(Integer margen) {
        Integer oldMargen = this.margen;
        this.margen = margen;
        propertyChangeSupport.firePropertyChange(PROP_MARGEN, oldMargen, margen);
    }

    /**
     * The reference value
     */
    public static final String PROP_VALORREF = "valorRef";

    /**
     * Get the value of valorRef
     *
     * @return the value of valorRef
     */
    public Integer getValorRef() {
        return valorRef;
    }

    /**
     * Set the value of valorRef
     *
     * @param valorRef new value of valorRef
     */
    public void setValorRef(Integer valorRef) {
        Integer oldValorRef = this.valorRef;
        this.valorRef = valorRef;
        propertyChangeSupport.firePropertyChange(PROP_VALORREF, oldValorRef, valorRef);
    }

    /**
     * The singularity feature of the measure
     */
    public static final String PROP_SINGULARIDAD = "singularidad";

    /**
     * Get the value of singularidad
     *
     * @return the value of singularidad
     */
    public Integer getSingularidad() {
        return singularidad;
    }

    /**
     * Set the value of singularidad
     *
     * @param singularidad new value of singularidad
     */
    public void setSingularidad(Integer singularidad) {
        Integer oldSingularidad = this.singularidad;
        this.singularidad = singularidad;
        propertyChangeSupport.firePropertyChange(PROP_SINGULARIDAD, oldSingularidad, singularidad);
    }

    /**
     * The average measure of all measurements
     */
    public static final String PROP_PROMEDIO = "promedio";

    /**
     * Get the value of promedio
     *
     * @return the value of promedio
     */
    public Integer getPromedio() {
        return promedio;
    }

    /**
     * Set the value of promedio
     *
     * @param promedio new value of promedio
     */
    public void setPromedio(Integer promedio) {
        Integer oldPromedio = this.promedio;
        this.promedio = promedio;
        propertyChangeSupport.firePropertyChange(PROP_PROMEDIO, oldPromedio, promedio);
    }

    /**
     * The median of all measurements
     */
    public static final String PROP_MEDIANA = "mediana";

    /**
     * Get the value of mediana
     *
     * @return the value of mediana
     */
    public Integer getMediana() {
        return mediana;
    }

    /**
     * Set the value of mediana
     *
     * @param mediana new value of mediana
     */
    public void setMediana(Integer mediana) {
        Integer oldMediana = this.mediana;
        this.mediana = mediana;
        propertyChangeSupport.firePropertyChange(PROP_MEDIANA, oldMediana, mediana);
    }

    /**
     * The limit of all measurements
     */
    public static final String PROP_LIMITE = "limite";

    /**
     * Get the value of limite
     *
     * @return the value of limite
     */
    public Integer getLimite() {
        return limite;
    }

    /**
     * Set the value of limite
     *
     * @param limite new value of limite
     */
    public void setLimite(Integer limite) {
        Integer oldLimite = this.limite;
        this.limite = limite;
        propertyChangeSupport.firePropertyChange(PROP_LIMITE, oldLimite, limite);
    }

    /**
     * The typical deviation of all measurements
     */
    public static final String PROP_DESVTIPICA = "desvTipica";

    /**
     * Get the value of desvTipica
     *
     * @return the value of desvTipica
     */
    public Integer getDesvTipica() {
        return desvTipica;
    }

    /**
     * Set the value of desvTipica
     *
     * @param desvTipica new value of desvTipica
     */
    public void setDesvTipica(Integer desvTipica) {
        Integer oldDesvTipica = this.desvTipica;
        this.desvTipica = desvTipica;
        propertyChangeSupport.firePropertyChange(PROP_DESVTIPICA, oldDesvTipica, desvTipica);
    }

    /**
     * The mean deviation of all measurements
     */
    public static final String PROP_DESVMEDIA = "desvMedia";

    /**
     * Get the value of desvMedia
     *
     * @return the value of desvMedia
     */
    public Integer getDesvMedia() {
        return desvMedia;
    }

    /**
     * Set the value of desvMedia
     *
     * @param desvMedia new value of desvMedia
     */
    public void setDesvMedia(Integer desvMedia) {
        Integer oldDesvMedia = this.desvMedia;
        this.desvMedia = desvMedia;
        propertyChangeSupport.firePropertyChange(PROP_DESVMEDIA, oldDesvMedia, desvMedia);
    }

    /**
     * The absolute deviation of all measurements
     */
    public static final String PROP_DESVABSOLUTA = "desvAbsoluta";

    /**
     * Get the value of desvAbsoluta
     *
     * @return the value of desvAbsoluta
     */
    public Integer getDesvAbsoluta() {
        return desvAbsoluta;
    }

    /**
     * Set the value of desvAbsoluta
     *
     * @param desvAbsoluta new value of desvAbsoluta
     */
    public void setDesvAbsoluta(Integer desvAbsoluta) {
        Integer oldDesvAbsoluta = this.desvAbsoluta;
        this.desvAbsoluta = desvAbsoluta;
        propertyChangeSupport.firePropertyChange(PROP_DESVABSOLUTA, oldDesvAbsoluta, desvAbsoluta);
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
