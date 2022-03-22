/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author a31r1z
 */
public class Funciones {

    public Funciones() {
    }
    
    private boolean ajusteFino;
        
    private boolean bloqueo;
    
    private boolean cambioSentido;
    
    private boolean salidaDeDatos;
    
    private boolean selectorZeroAbs;
    
    private boolean valoracionGoNg;

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


    public static final String PROP_CAMBIOSENTIDO = "cambioSentido";

    /**
     * Get the value of cambioSentido
     *
     * @return the value of cambioSentido
     */
    public boolean isCambioSentido() {
        return cambioSentido;
    }

    /**
     * Set the value of cambioSentido
     *
     * @param cambioSentido new value of cambioSentido
     */
    public void setCambioSentido(boolean cambioSentido) {
        boolean oldCambioSentido = this.cambioSentido;
        this.cambioSentido = cambioSentido;
        propertyChangeSupport.firePropertyChange(PROP_CAMBIOSENTIDO, oldCambioSentido, cambioSentido);
    }


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
