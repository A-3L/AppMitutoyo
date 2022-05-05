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
public class MetricaDeInteriores {

    public MetricaDeInteriores() {
    }
       
    private Integer rangoInterior;       
    private Integer metricaInterior;    
    private Integer medida_R;    
    private Integer medida_f;   
    private Integer medida_g;    
    private Integer puntosDeMedicion;
 
    public JGuiExtensible createDialog() {
        
     return new MetricaDeInterioresGUI();    
    }
    
    public void borrarDatos() {
        
        this.setMedida_R(null);
        this.setMedida_f(null);
        this.setMedida_g(null);
        this.setMetricaInterior(null);
        this.setPuntosDeMedicion(null);
        this.setRangoInterior(null);
        
    }
    public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica de interiores.xml", this);
       
    }

    public static final String PROP_PUNTOSDEMEDICION = "puntosDeMedicion";

    /**
     * Get the value of puntosDeMedicion
     *
     * @return the value of puntosDeMedicion
     */
    public Integer getPuntosDeMedicion() {
        return puntosDeMedicion;
    }

    /**
     * Set the value of puntosDeMedicion
     *
     * @param puntosDeMedicion new value of puntosDeMedicion
     */
    public void setPuntosDeMedicion(Integer puntosDeMedicion) {
        Integer oldPuntosDeMedicion = this.puntosDeMedicion;
        this.puntosDeMedicion = puntosDeMedicion;
        propertyChangeSupport.firePropertyChange(PROP_PUNTOSDEMEDICION, oldPuntosDeMedicion, puntosDeMedicion);
    }


    public static final String PROP_MEDIDA_G = "medida_g";

    /**
     * Get the value of medida_g
     *
     * @return the value of medida_g
     */
    public Integer getMedida_g() {
        return medida_g;
    }

    /**
     * Set the value of medida_g
     *
     * @param medida_g new value of medida_g
     */
    public void setMedida_g(Integer medida_g) {
        Integer oldMedida_g = this.medida_g;
        this.medida_g = medida_g;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_G, oldMedida_g, medida_g);
    }


    public static final String PROP_MEDIDA_F = "medida_f";

    /**
     * Get the value of medida_f
     *
     * @return the value of medida_f
     */
    public Integer getMedida_f() {
        return medida_f;
    }

    /**
     * Set the value of medida_f
     *
     * @param medida_f new value of medida_f
     */
    public void setMedida_f(Integer medida_f) {
        Integer oldMedida_f = this.medida_f;
        this.medida_f = medida_f;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_F, oldMedida_f, medida_f);
    }


    public static final String PROP_MEDIDA_R = "medida_R";

    /**
     * Get the value of medida_R
     *
     * @return the value of medida_R
     */
    public Integer getMedida_R() {
        return medida_R;
    }

    /**
     * Set the value of medida_R
     *
     * @param medida_R new value of medida_R
     */
    public void setMedida_R(Integer medida_R) {
        Integer oldMedida_R = this.medida_R;
        this.medida_R = medida_R;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_R, oldMedida_R, medida_R);
    }


    public static final String PROP_METRICAINTERIOR = "metricaInterior";

    /**
     * Get the value of metricaInterior
     *
     * @return the value of metricaInterior
     */
    public Integer getMetricaInterior() {
        return metricaInterior;
    }

    /**
     * Set the value of metricaInterior
     *
     * @param metricaInterior new value of metricaInterior
     */
    public void setMetricaInterior(Integer metricaInterior) {
        Integer oldMetricaInterior = this.metricaInterior;
        this.metricaInterior = metricaInterior;
        propertyChangeSupport.firePropertyChange(PROP_METRICAINTERIOR, oldMetricaInterior, metricaInterior);
    }


    public static final String PROP_RANGOINTERIOR = "rangoInterior";

    /**
     * Get the value of rangoInterior
     *
     * @return the value of rangoInterior
     */
    public Integer getRangoInterior() {
        return rangoInterior;
    }

    /**
     * Set the value of rangoInterior
     *
     * @param rangoInterior new value of rangoInterior
     */
    public void setRangoInterior(Integer rangoInterior) {
        Integer oldRangoInterior = this.rangoInterior;
        this.rangoInterior = rangoInterior;
        propertyChangeSupport.firePropertyChange(PROP_RANGOINTERIOR, oldRangoInterior, rangoInterior);
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
