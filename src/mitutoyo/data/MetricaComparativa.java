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

import mitutoyo.interfaces.MetricaComparativaGUI;
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
public class MetricaComparativa  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
    * Creates an instance of MetricaComparativa.
    */
    public MetricaComparativa() {
    }
    
    private Integer errorMaximo;  
    private Integer hyteresis;
    private Integer escala;
    private Integer rangoDeMedida;
    
     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
    public JGuiExtensible createDialog() {
                  
    return new MetricaComparativaGUI(); 
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        this.setErrorMaximo(null);
        this.setHyteresis(null);
        this.setEscala(null);
        this.setRangoDeMedida(25);
        
    }
    /**
     * This method saves all the values of the properties in an XML file.
     */
      public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica de comparacion.xml", this);
       
    }

    /**
     * The measure range of the instrument
     */
    public static final String PROP_RANGODEMEDIDA = "rangoDeMedida";

    /**
     * Get the value of rangoDeMedida
     *
     * @return the value of rangoDeMedida
     */
    public Integer getRangoDeMedida() {
        return rangoDeMedida;
    }

    /**
     * Set the value of rangoDeMedida
     *
     * @param rangoDeMedida new value of rangoDeMedida
     */
    public void setRangoDeMedida(Integer rangoDeMedida) {
        Integer oldRangoDeMedida = this.rangoDeMedida;
        this.rangoDeMedida = rangoDeMedida;
        propertyChangeSupport.firePropertyChange(PROP_RANGODEMEDIDA, oldRangoDeMedida, rangoDeMedida);
    }

    /**
     * The measurement scale of the instrument
     */
    public static final String PROP_ESCALA = "escala";

    /**
     * Get the value of escala
     *
     * @return the value of escala
     */
    public Integer getEscala() {
        return escala;
    }

    /**
     * Set the value of escala
     *
     * @param escala new value of escala
     */
    public void setEscala(Integer escala) {
        Integer oldEscala = this.escala;
        this.escala = escala;
        propertyChangeSupport.firePropertyChange(PROP_ESCALA, oldEscala, escala);
    }

    /**
     * The hyteresis value of the measure
     */
    public static final String PROP_HYTERESIS = "hyteresis";

    /**
     * Get the value of hyteresis
     *
     * @return the value of hyteresis
     */
    public Integer getHyteresis() {
        return hyteresis;
    }

    /**
     * Set the value of hyteresis
     *
     * @param hyteresis new value of hyteresis
     */
    public void setHyteresis(Integer hyteresis) {
        Integer oldHyteresis = this.hyteresis;
        this.hyteresis = hyteresis;
        propertyChangeSupport.firePropertyChange(PROP_HYTERESIS, oldHyteresis, hyteresis);
    }

    /**
     * The maxim measurement error
     */
    public static final String PROP_ERRORMAXIMO = "errorMaximo";

    /**
     * Get the value of errorMaximo
     *
     * @return the value of errorMaximo
     */
    public Integer getErrorMaximo() {
        return errorMaximo;
    }

    /**
     * Set the value of errorMaximo
     *
     * @param errorMaximo new value of errorMaximo
     */
    public void setErrorMaximo(Integer errorMaximo) {
        Integer oldErrorMaximo = this.errorMaximo;
        this.errorMaximo = errorMaximo;
        propertyChangeSupport.firePropertyChange(PROP_ERRORMAXIMO, oldErrorMaximo, errorMaximo);
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
