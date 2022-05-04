/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class Articulo {

    public Articulo() {
    }
    
    private String refArticulo;
    private String serie;
    
    
    public JGuiExtensible createDialog() {
                  
    return new ArticuloGUI(); 
    }
    
    public void borrarDatos() {
        
        setRefArticulo(null);
        setSerie(null);
    }

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
