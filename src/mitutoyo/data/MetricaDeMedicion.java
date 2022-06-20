/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import mitutoyo.interfaces.MetricaDeMedicionGUI;
import mitutoyo.interfaces.Utilidades;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class MetricaDeMedicion {

    public MetricaDeMedicion() {
    }
    
    private Integer rango;    
    private Integer precision;
    private Integer resolucion;    
    private Integer graduacion;    
    private Integer presionDeMedida;
    
    public JGuiExtensible createDialog() {
                  
    return new MetricaDeMedicionGUI(); 
    }
    
    public void borrarDatos() {
        
        this.setRango(null);
        this.setPrecision(null);
        this.setGraduacion(null);
        this.setPresionDeMedida(null);    
        this.setResolucion(null);
    }

     public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica de medicion.xml", this);
       
    }
     
    public static final String PROP_PRESIONDEMEDIDA = "presionDeMedida";

    /**
     * Get the value of presionDeMedida
     *
     * @return the value of presionDeMedida
     */
    public Integer getPresionDeMedida() {
        return presionDeMedida;
    }

    /**
     * Set the value of presionDeMedida
     *
     * @param presionDeMedida new value of presionDeMedida
     */
    public void setPresionDeMedida(Integer presionDeMedida) {
        Integer oldPresionDeMedida = this.presionDeMedida;
        this.presionDeMedida = presionDeMedida;
        propertyChangeSupport.firePropertyChange(PROP_PRESIONDEMEDIDA, oldPresionDeMedida, presionDeMedida);
    }


    public static final String PROP_GRADUACION = "graduacion";

    /**
     * Get the value of graduacion
     *
     * @return the value of graduacion
     */
    public Integer getGraduacion() {
        return graduacion;
    }

    /**
     * Set the value of graduacion
     *
     * @param graduacion new value of graduacion
     */
    public void setGraduacion(Integer graduacion) {
        Integer oldGraduacion = this.graduacion;
        this.graduacion = graduacion;
        propertyChangeSupport.firePropertyChange(PROP_GRADUACION, oldGraduacion, graduacion);
    }


    public static final String PROP_RESOLUCION = "resolucion";

    /**
     * Get the value of resolucion
     *
     * @return the value of resolucion
     */
    public Integer getResolucion() {
        return resolucion;
    }

    /**
     * Set the value of resolucion
     *
     * @param resolucion new value of resolucion
     */
    public void setResolucion(Integer resolucion) {
        Integer oldResolucion = this.resolucion;
        this.resolucion = resolucion;
        propertyChangeSupport.firePropertyChange(PROP_RESOLUCION, oldResolucion, resolucion);
    }


    public static final String PROP_PRECISION = "precision";

    /**
     * Get the value of precision
     *
     * @return the value of precision
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Set the value of precision
     *
     * @param precision new value of precision
     */
    public void setPrecision(Integer precision) {
        Integer oldPrecision = this.precision;
        this.precision = precision;
        propertyChangeSupport.firePropertyChange(PROP_PRECISION, oldPrecision, precision);
    }


    public static final String PROP_RANGO = "rango";

    /**
     * Get the value of rango
     *
     * @return the value of rango
     */
    public Integer getRango() {
        return rango;
    }

    /**
     * Set the value of rango
     *
     * @param rango new value of rango
     */
    public void setRango(Integer rango) {
        Integer oldRango = this.rango;
        this.rango = rango;
        propertyChangeSupport.firePropertyChange(PROP_RANGO, oldRango, rango);
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
