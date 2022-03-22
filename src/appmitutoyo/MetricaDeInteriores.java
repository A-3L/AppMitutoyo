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
public class MetricaDeInteriores {

    public MetricaDeInteriores() {
    }
    
    private String puntosMedicion;
    
    private int medicionInterior; 
    
    private int medida_R;
    
    private int medida_f;
    
    private int medida_g;
    
    private int rangoInterior;

    public static final String PROP_RANGOINTERIOR = "rangoInterior";

    /**
     * Get the value of rangoInterior
     *
     * @return the value of rangoInterior
     */
    public int getRangoInterior() {
        return rangoInterior;
    }

    /**
     * Set the value of rangoInterior
     *
     * @param rangoInterior new value of rangoInterior
     */
    public void setRangoInterior(int rangoInterior) {
        int oldRangoInterior = this.rangoInterior;
        this.rangoInterior = rangoInterior;
        propertyChangeSupport.firePropertyChange(PROP_RANGOINTERIOR, oldRangoInterior, rangoInterior);
    }


    public static final String PROP_MEDIDA_G = "medida_g";

    /**
     * Get the value of medida_g
     *
     * @return the value of medida_g
     */
    public int getMedida_g() {
        return medida_g;
    }

    /**
     * Set the value of medida_g
     *
     * @param medida_g new value of medida_g
     */
    public void setMedida_g(int medida_g) {
        int oldMedida_g = this.medida_g;
        this.medida_g = medida_g;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_G, oldMedida_g, medida_g);
    }


    public static final String PROP_MEDIDA_F = "medida_f";

    /**
     * Get the value of medida_f
     *
     * @return the value of medida_f
     */
    public int getMedida_f() {
        return medida_f;
    }

    /**
     * Set the value of medida_f
     *
     * @param medida_f new value of medida_f
     */
    public void setMedida_f(int medida_f) {
        int oldMedida_f = this.medida_f;
        this.medida_f = medida_f;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_F, oldMedida_f, medida_f);
    }


    public static final String PROP_MEDIDA_R = "medida_R";

    /**
     * Get the value of medida_R
     *
     * @return the value of medida_R
     */
    public int getMedida_R() {
        return medida_R;
    }

    /**
     * Set the value of medida_R
     *
     * @param medida_R new value of medida_R
     */
    public void setMedida_R(int medida_R) {
        int oldMedida_R = this.medida_R;
        this.medida_R = medida_R;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_R, oldMedida_R, medida_R);
    }


    public static final String PROP_MEDICIONINTERIOR = "medicionInterior";

    /**
     * Get the value of medicionInterior
     *
     * @return the value of medicionInterior
     */
    public int getMedicionInterior() {
        return medicionInterior;
    }

    /**
     * Set the value of medicionInterior
     *
     * @param medicionInterior new value of medicionInterior
     */
    public void setMedicionInterior(int medicionInterior) {
        int oldMedicionInterior = this.medicionInterior;
        this.medicionInterior = medicionInterior;
        propertyChangeSupport.firePropertyChange(PROP_MEDICIONINTERIOR, oldMedicionInterior, medicionInterior);
    }


    public static final String PROP_PUNTOSMEDICION = "PuntosMedicion";

    /**
     * Get the value of puntosMedicion
     *
     * @return the value of puntosMedicion
     */
    public String getPuntosMedicion() {
        return puntosMedicion;
    }

    /**
     * Set the value of puntosMedicion
     *
     * @param PuntosMedicion new value of puntosMedicion
     */
    public void setPuntosMedicion(String PuntosMedicion) {
        String oldPuntosMedicion = this.puntosMedicion;
        this.puntosMedicion = PuntosMedicion;
        propertyChangeSupport.firePropertyChange(PROP_PUNTOSMEDICION, oldPuntosMedicion, PuntosMedicion);
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
