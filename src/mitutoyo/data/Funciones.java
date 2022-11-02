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

import mitutoyo.interfaces.FuncionesGUI;
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
public class Funciones implements Serializable{
    
    private static final long serialVersionUID = 1L;

     /**
    * Creates an instance of Funciones.
    */
    public Funciones() {
    }
    
    private boolean ajusteFino;       
    private boolean selectorZeroAbs;   
    private boolean salidaDeDatos;    
    private boolean cambioSentidoContaje;
    private boolean valoracionGoNg;   
    private boolean bloqueo;

     /**
     * Creates a graphical interface to edit the properties of this class
     * 
     * @return one dialog with widgets for all the properties of this class
     */
     public JGuiExtensible createDialog() {
                  
    return new FuncionesGUI(); 
    }
    /**
     * This method clean all the values inserted in the properties
     */
    public void borrarDatos() {
        
        setAjusteFino(false);
        setBloqueo(false);
        setCambioSentidoContaje(false);
        setFuncionTolerancia(false);
        setSelectorZeroAbs(false);
        setValoracionGoNg(false);
     
    }
    /**
     * This method saves all the values of the properties in an XML file.
     */
      public void guardarDatos() {
        
       Utilidades.saveInXml("Funciones.xml", this);
       
    }
    
    /**
     * If the instrument has a lock system
     */
    public static final String PROP_BLOQUEO = "bloqueo";

    /**
     * Get the value of bloqueo
     *
     * @return the value of bloqueo
     */
    public boolean isBloqueo() {
        return bloqueo;
    }

    /**
     * Set the value of bloqueo
     *
     * @param bloqueo new value of bloqueo
     */
    public void setBloqueo(boolean bloqueo) {
        boolean oldBloqueo = this.bloqueo;
        this.bloqueo = bloqueo;
        propertyChangeSupport.firePropertyChange(PROP_BLOQUEO, oldBloqueo, bloqueo);
    }

    /**
     * If the instrument has Go NoGo valoration 
     */
    public static final String PROP_VALORACIONGONG = "valoracionGoNg";

    /**
     * Get the value of valoracionGoNg
     *
     * @return the value of valoracionGoNg
     */
    public boolean isValoracionGoNg() {
        return valoracionGoNg;
    }

    /**
     * Set the value of valoracionGoNg
     *
     * @param valoracionGoNg new value of valoracionGoNg
     */
    public void setValoracionGoNg(boolean valoracionGoNg) {
        boolean oldValoracionGoNg = this.valoracionGoNg;
        this.valoracionGoNg = valoracionGoNg;
        propertyChangeSupport.firePropertyChange(PROP_VALORACIONGONG, oldValoracionGoNg, valoracionGoNg);
    }
    
    /**
     * If the instrument has change of counting direction
     */
    public static final String PROP_CAMBIOSENTIDOCONTAJE = "cambioSentidoContaje";

    /**
     * Get the value of cambioSentidoContaje
     *
     * @return the value of cambioSentidoContaje
     */
    public boolean isCambioSentidoContaje() {
        return cambioSentidoContaje;
    }

    /**
     * Set the value of cambioSentidoContaje
     *
     * @param cambioSentidoContaje new value of cambioSentidoContaje
     */
    public void setCambioSentidoContaje(boolean cambioSentidoContaje) {
        boolean oldCambioSentidoContaje = this.cambioSentidoContaje;
        this.cambioSentidoContaje = cambioSentidoContaje;
        propertyChangeSupport.firePropertyChange(PROP_CAMBIOSENTIDOCONTAJE, oldCambioSentidoContaje, cambioSentidoContaje);
    }


    /**
     * If the instrument has data output
     */
    public static final String PROP_SALIDADEDATOS = "salidaDeDatos";

    /**
     * Get the value of salidaDeDatos
     *
     * @return the value of salidaDeDatos
     */
    public boolean isFuncionTolerancia() {
        return salidaDeDatos;
    }

    /**
     * Set the value of salidaDeDatos
     *
     * @param salidaDeDatos new value of salidaDeDatos
     */
    public void setFuncionTolerancia(boolean salidaDeDatos) {
        boolean oldSalidaDeDatos = this.salidaDeDatos;
        this.salidaDeDatos = salidaDeDatos;
        propertyChangeSupport.firePropertyChange(PROP_SALIDADEDATOS, oldSalidaDeDatos, salidaDeDatos);
    }

    /**
     * If the instrument has a Zero Absolut selector
     */
    public static final String PROP_SELECTORZEROABS = "selectorZeroAbs";

    /**
     * Get the value of selectorZeroAbs
     *
     * @return the value of selectorZeroAbs
     */
    public boolean isSelectorZeroAbs() {
        return selectorZeroAbs;
    }

    /**
     * Set the value of selectorZeroAbs
     *
     * @param selectorZeroAbs new value of selectorZeroAbs
     */
    public void setSelectorZeroAbs(boolean selectorZeroAbs) {
        boolean oldSelectorZeroAbs = this.selectorZeroAbs;
        this.selectorZeroAbs = selectorZeroAbs;
        propertyChangeSupport.firePropertyChange(PROP_SELECTORZEROABS, oldSelectorZeroAbs, selectorZeroAbs);
    }

    /**
     * If the instrument has fine adjustment 
     */
    public static final String PROP_AJUSTEFINO = "ajusteFino";

    /**
     * Get the value of ajusteFino
     *
     * @return the value of ajusteFino
     */
    public boolean isAjusteFino() {
        return ajusteFino;
    }

    /**
     * Set the value of ajusteFino
     *
     * @param ajusteFino new value of ajusteFino
     */
    public void setAjusteFino(boolean ajusteFino) {
        boolean oldAjusteFino = this.ajusteFino;
        this.ajusteFino = ajusteFino;
        propertyChangeSupport.firePropertyChange(PROP_AJUSTEFINO, oldAjusteFino, ajusteFino);
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
