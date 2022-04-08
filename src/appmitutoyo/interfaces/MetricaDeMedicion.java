/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class MetricaDeMedicion {

    private static final long serialVersionUID = 1L;

    
    private int graduacion;
    
    private int precision;
    
    private int presionMedida;
    
    private int rango;
    
    private int resolucion;
    
    public MetricaDeMedicion() {
        
        
    }
  
    public void validar() {
        
        
       
    }

    public static final String PROP_RESOLUCION = "resolucion";

    /**
     * Get the value of resolucion
     *
     * @return the value of resolucion
     */
    public int getResolucion() {
        return resolucion;
    }

    /**
     * Set the value of resolucion
     *
     * @param resolucion new value of resolucion
     */
    public void setResolucion(int resolucion) {
        int oldResolucion = this.resolucion;
        this.resolucion = resolucion;
        propertyChangeSupport.firePropertyChange(PROP_RESOLUCION, oldResolucion, resolucion);
    }


    public static final String PROP_RANGO = "rango";

    /**
     * Get the value of rango
     *
     * @return the value of rango
     */
    public int getRango() {
        return rango;
    }

    /**
     * Set the value of rango
     *
     * @param rango new value of rango
     */
    public void setRango(int rango) {
        
        int oldRango = this.rango;
        this.rango = rango;
        propertyChangeSupport.firePropertyChange(PROP_RANGO, oldRango, rango);
        System.out.println(rango+"HECHO");
        
    }


    public static final String PROP_PRESIONMEDIDA = "presionMedida";

    /**
     * Get the value of presionMedida
     *
     * @return the value of presionMedida
     */
    public int getPresionMedida() {
        return presionMedida;
    }

    /**
     * Set the value of presionMedida
     *
     * @param presionMedida new value of presionMedida
     */
    public void setPresionMedida(int presionMedida) {
        int oldPresionMedida = this.presionMedida;
        this.presionMedida = presionMedida;
        propertyChangeSupport.firePropertyChange(PROP_PRESIONMEDIDA, oldPresionMedida, presionMedida);
    }


    public static final String PROP_PRECISION = "precision";

    /**
     * Get the value of precision
     *
     * @return the value of precision
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Set the value of precision
     *
     * @param precision new value of precision
     */
    public void setPrecision(int precision) {
        int oldPrecision = this.precision;
        this.precision = precision;
        propertyChangeSupport.firePropertyChange(PROP_PRECISION, oldPrecision, precision);
    }


    public static final String PROP_GRADUACION = "graduacion";

    /**
     * Get the value of graduacion
     *
     * @return the value of graduacion
     */
    public int getGraduacion() {
        return graduacion;
    }

    /**
     * Set the value of graduacion
     *
     * @param graduacion new value of graduacion
     */
    public void setGraduacion(int graduacion) {
        int oldGraduacion = this.graduacion;
        this.graduacion = graduacion;
        propertyChangeSupport.firePropertyChange(PROP_GRADUACION, oldGraduacion, graduacion);
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

    

