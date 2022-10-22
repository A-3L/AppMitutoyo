/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;
import mitutoyo.interfaces.SingularidadGUI;
import mitutoyo.Utilidades;

/**
 *
 * @author a31r1z
 */
public class Singularidad  implements Serializable {

    private static final long serialVersionUID = 1L;

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
    
     public JGuiExtensible createDialog() {
                  
    return new SingularidadGUI(); 
    }
     
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
      
    public void guardarDatos() {
        
       Utilidades.saveInXml("Singularidad.xml", this);
       
    }

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
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
