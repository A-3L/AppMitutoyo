/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JGuiExtensible;
import jguiextensible.JGuiSimple;

/**
 *
 * @author a31r1z
 */
public class MetricaComparador {

    public MetricaComparador() {
       
    }
    
    private int rangoMedida;
    private int errorMax;
    private int escala;
    private int hyteresis;

    public static final String PROP_HYTERESIS = "hyteresis";

    /**
     * Get the value of hyteresis
     *
     * @return the value of hyteresis
     */
    public int getHyteresis() {
        return hyteresis;
    }

    /**
     * Set the value of hyteresis
     *
     * @param hyteresis new value of hyteresis
     */
    public void setHyteresis(int hyteresis) {
        int oldHyteresis = this.hyteresis;
        this.hyteresis = hyteresis;
        propertyChangeSupport.firePropertyChange(PROP_HYTERESIS, oldHyteresis, hyteresis);
    }


    public static final String PROP_ESCALA = "escala";

    /**
     * Get the value of escala
     *
     * @return the value of escala
     */
    public int getEscala() {
        return escala;
    }

    /**
     * Set the value of escala
     *
     * @param escala new value of escala
     */
    public void setEscala(int escala) {
        int oldEscala = this.escala;
        this.escala = escala;
        propertyChangeSupport.firePropertyChange(PROP_ESCALA, oldEscala, escala);
    }


    public static final String PROP_ERRORMAX = "errorMax";

    /**
     * Get the value of errorMax
     *
     * @return the value of errorMax
     */
    public int getErrorMax() {
        return errorMax;
    }

    /**
     * Set the value of errorMax
     *
     * @param errorMax new value of errorMax
     */
    public void setErrorMax(int errorMax) {
        int oldErrorMax = this.errorMax;
        this.errorMax = errorMax;
        propertyChangeSupport.firePropertyChange(PROP_ERRORMAX, oldErrorMax, errorMax);
    }


    public static final String PROP_RANGOMEDIDA = "rangoMedida";

    /**
     * Get the value of rangoMedida
     *
     * @return the value of rangoMedida
     */
    public int getRangoMedida() {
        return rangoMedida;
    }

    /**
     * Set the value of rangoMedida
     *
     * @param rangoMedida new value of rangoMedida
     */
    public void setRangoMedida(int rangoMedida) {
        int oldRangoMedida = this.rangoMedida;
        this.rangoMedida = rangoMedida;
        propertyChangeSupport.firePropertyChange(PROP_RANGOMEDIDA, oldRangoMedida, rangoMedida);
        
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
