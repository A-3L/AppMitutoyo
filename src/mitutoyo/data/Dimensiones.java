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

import mitutoyo.interfaces.DimensionesGUI;
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
public class Dimensiones implements Serializable {

    private static final long serialVersionUID = 1L;

     /**
    * Creates an instance of Dimensiones.
    */
    public Dimensiones() {
    }
    
    private Integer longitud;   
    private Integer peso;   
    private Integer medida_a;   
    private Integer medida_b;  
    private Integer medida_c;   
    private Integer medida_d;    
    private Integer medida_e;
    
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
                  
    return new DimensionesGUI(); 
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
     setLongitud(null);
     setPeso(null);
     setMedida_a(null);
     setMedida_b(null);
     setMedida_c(null);
     setMedida_d(null);
     setMedida_e(null);
     
    }
    /**
     * This method saves all the values of the properties in an XML file.
     */
      public void guardarDatos() {
        
       Utilidades.saveInXml("Dimensiones.xml", this);
       
    }

    /**
     *  The e measure of the instrument
     */
    public static final String PROP_MEDIDA_E = "medida_e";

    /**
     * Get the value of medida_e
     *
     * @return the value of medida_e
     */
    public Integer getMedida_e() {
        return medida_e;
    }

    /**
     * Set the value of medida_e
     *
     * @param medida_e new value of medida_e
     */
    public void setMedida_e(Integer medida_e) {
        Integer oldMedida_e = this.medida_e;
        this.medida_e = medida_e;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_E, oldMedida_e, medida_e);
    }

    /**
     *  The d measure of the instrument
     */
    public static final String PROP_MEDIDA_D = "medida_d";

    /**
     * Get the value of medida_d
     *
     * @return the value of medida_d
     */
    public Integer getMedida_d() {
        return medida_d;
    }

    /**
     * Set the value of medida_d
     *
     * @param medida_d new value of medida_d
     */
    public void setMedida_d(Integer medida_d) {
        Integer oldMedida_d = this.medida_d;
        this.medida_d = medida_d;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_D, oldMedida_d, medida_d);
    }

    /**
     *  The c measure of the instrument
     */
    public static final String PROP_MEDIDA_C = "medida_c";

    /**
     * Get the value of medida_c
     *
     * @return the value of medida_c
     */
    public Integer getMedida_c() {
        return medida_c;
    }

    /**
     * Set the value of medida_c
     *
     * @param medida_c new value of medida_c
     */
    public void setMedida_c(Integer medida_c) {
        Integer oldMedida_c = this.medida_c;
        this.medida_c = medida_c;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_C, oldMedida_c, medida_c);
    }

    /**
     *  The b measure of the instrument
     */
    public static final String PROP_MEDIDA_B = "medida_b";

    /**
     * Get the value of medida_b
     *
     * @return the value of medida_b
     */
    public Integer getMedida_b() {
        return medida_b;
    }

    /**
     * Set the value of medida_b
     *
     * @param medida_b new value of medida_b
     */
    public void setMedida_b(Integer medida_b) {
        Integer oldMedida_b = this.medida_b;
        this.medida_b = medida_b;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_B, oldMedida_b, medida_b);
    }

    /**
     *  The a measure of the instrument
     */
    public static final String PROP_MEDIDA_A = "medida_a";

    /**
     * Get the value of medida_a
     *
     * @return the value of medida_a
     */
    public Integer getMedida_a() {
        return medida_a;
    }

    /**
     * Set the value of medida_a
     *
     * @param medida_a new value of medida_a
     */
    public void setMedida_a(Integer medida_a) {
        Integer oldMedida_a = this.medida_a;
        this.medida_a = medida_a;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_A, oldMedida_a, medida_a);
    }

    /**
     * The weigth of the instrument
     */
    public static final String PROP_PESO = "peso";

    /**
     * Get the value of peso
     *
     * @return the value of peso
     */
    public Integer getPeso() {
        return peso;
    }

    /**
     * Set the value of peso
     *
     * @param peso new value of peso
     */
    public void setPeso(Integer peso) {
        Integer oldPeso = this.peso;
        this.peso = peso;
        propertyChangeSupport.firePropertyChange(PROP_PESO, oldPeso, peso);
    }

    /**
     * The length of the instrument
     */
    public static final String PROP_LONGITUD = "longitud";

    /**
     * Get the value of longitud
     *
     * @return the value of longitud
     */
    public Integer getLongitud() {
        return longitud;
    }

    /**
     * Set the value of longitud
     *
     * @param longitud new value of longitud
     */
    public void setLongitud(Integer longitud) {
        Integer oldLongitud = this.longitud;
        this.longitud = longitud;
        propertyChangeSupport.firePropertyChange(PROP_LONGITUD, oldLongitud, longitud);
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
