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
public class Funciones {

    public Funciones() {
    }
    
    private boolean ajusteFino;       
    private boolean selectorZeroAbs;   
    private boolean salidaDeDatos;    
    private boolean cambioSentidoContaje;  
    private boolean valoracionGoNg;   
    private boolean bloqueo;

     public JGuiExtensible createDialog() {
                  
    return new FuncionesGUI(); 
    }
    
    public void borrarDatos() {
        
        setAjusteFino(false);
        setBloqueo(false);
        setCambioSentidoContaje(false);
        setSalidaDeDatos(false);
        setSelectorZeroAbs(false);
        setValoracionGoNg(false);
     
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
        this.cambioSentidoContaje = cambioSentidoContaje;
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
