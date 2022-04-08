/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author a31r1z
 */
public class MetricaMicrometrica {

    public MetricaMicrometrica() {
    }
    
    private int avance;
    private int paralelismo;
    private int perpendicularidad;
    private int planitud;
    private int rectitud;

    public static final String PROP_RECTITUD = "rectitud";

    /**
     * Get the value of rectitud
     *
     * @return the value of rectitud
     */
    public int getRectitud() {
        return rectitud;
    }

    /**
     * Set the value of rectitud
     *
     * @param rectitud new value of rectitud
     */
    public void setRectitud(int rectitud) {
        int oldRectitud = this.rectitud;
        this.rectitud = rectitud;
        propertyChangeSupport.firePropertyChange(PROP_RECTITUD, oldRectitud, rectitud);
    }


    public static final String PROP_PLANITUD = "planitud";

    /**
     * Get the value of planitud
     *
     * @return the value of planitud
     */
    public int getPlanitud() {
        return planitud;
    }

    /**
     * Set the value of planitud
     *
     * @param planitud new value of planitud
     */
    public void setPlanitud(int planitud) {
        int oldPlanitud = this.planitud;
        this.planitud = planitud;
        propertyChangeSupport.firePropertyChange(PROP_PLANITUD, oldPlanitud, planitud);
    }


    public static final String PROP_PERPENDICULARIDAD = "perpendicularidad";

    /**
     * Get the value of perpendicularidad
     *
     * @return the value of perpendicularidad
     */
    public int getPerpendicularidad() {
        return perpendicularidad;
    }

    /**
     * Set the value of perpendicularidad
     *
     * @param perpendicularidad new value of perpendicularidad
     */
    public void setPerpendicularidad(int perpendicularidad) {
        int oldPerpendicularidad = this.perpendicularidad;
        this.perpendicularidad = perpendicularidad;
        propertyChangeSupport.firePropertyChange(PROP_PERPENDICULARIDAD, oldPerpendicularidad, perpendicularidad);
    }


    public static final String PROP_PARALELISMO = "paralelismo";

    /**
     * Get the value of paralelismo
     *
     * @return the value of paralelismo
     */
    public int getParalelismo() {
        return paralelismo;
    }

    /**
     * Set the value of paralelismo
     *
     * @param paralelismo new value of paralelismo
     */
    public void setParalelismo(int paralelismo) {
        int oldParalelismo = this.paralelismo;
        this.paralelismo = paralelismo;
        propertyChangeSupport.firePropertyChange(PROP_PARALELISMO, oldParalelismo, paralelismo);
    }

        

    public static final String PROP_AVANCE = "avance";

    /**
     * Get the value of avance
     *
     * @return the value of avance
     */
    public int getAvance() {
        return avance;
    }

    /**
     * Set the value of avance
     *
     * @param avance new value of avance
     */
    public void setAvance(int avance) {
        int oldAvance = this.avance;
        this.avance = avance;
        propertyChangeSupport.firePropertyChange(PROP_AVANCE, oldAvance, avance);
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
