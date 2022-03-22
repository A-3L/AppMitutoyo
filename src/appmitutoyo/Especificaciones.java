/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Especificaciones {

    private int longitud;       
    private int medida_a;    
    private int medida_b;    
    private int medida_c;   
    private int medida_d;    
    private int medida_e;  
    private int peso;  
    private String refArticulo;  
    private String serie;
    
    public Especificaciones() {
        
       
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


    public static final String PROP_PESO = "peso";

    /**
     * Get the value of peso
     *
     * @return the value of peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Set the value of peso
     *
     * @param peso new value of peso
     */
    public void setPeso(int peso) {
        int oldPeso = this.peso;
        this.peso = peso;
        propertyChangeSupport.firePropertyChange(PROP_PESO, oldPeso, peso);
    }


    public static final String PROP_MEDIDA_E = "medida_e";

    /**
     * Get the value of medida_e
     *
     * @return the value of medida_e
     */
    public int getMedida_e() {
        return medida_e;
    }

    /**
     * Set the value of medida_e
     *
     * @param medida_e new value of medida_e
     */
    public void setMedida_e(int medida_e) {
        int oldMedida_e = this.medida_e;
        this.medida_e = medida_e;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_E, oldMedida_e, medida_e);
    }


    public static final String PROP_MEDIDA_D = "medida_d";

    /**
     * Get the value of medida_d
     *
     * @return the value of medida_d
     */
    public int getMedida_d() {
        return medida_d;
    }

    /**
     * Set the value of medida_d
     *
     * @param medida_d new value of medida_d
     */
    public void setMedida_d(int medida_d) {
        int oldMedida_d = this.medida_d;
        this.medida_d = medida_d;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_D, oldMedida_d, medida_d);
    }


    public static final String PROP_MEDIDA_C = "medida_c";

    /**
     * Get the value of medida_c
     *
     * @return the value of medida_c
     */
    public int getMedida_c() {
        return medida_c;
    }

    /**
     * Set the value of medida_c
     *
     * @param medida_c new value of medida_c
     */
    public void setMedida_c(int medida_c) {
        int oldMedida_c = this.medida_c;
        this.medida_c = medida_c;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_C, oldMedida_c, medida_c);
    }


    public static final String PROP_MEDIDA_B = "medida_b";

    /**
     * Get the value of medida_b
     *
     * @return the value of medida_b
     */
    public int getMedida_b() {
        return medida_b;
    }

    /**
     * Set the value of medida_b
     *
     * @param medida_b new value of medida_b
     */
    public void setMedida_b(int medida_b) {
        int oldMedida_b = this.medida_b;
        this.medida_b = medida_b;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_B, oldMedida_b, medida_b);
    }

    

    public static final String PROP_MEDIDA_A = "medida_a";

    /**
     * Get the value of medida_a
     *
     * @return the value of medida_a
     */
    public int getMedida_a() {
        return medida_a;
    }

    /**
     * Set the value of medida_a
     *
     * @param medida_a new value of medida_a
     */
    public void setMedida_a(int medida_a) {
        int oldMedida_a = this.medida_a;
        this.medida_a = medida_a;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDA_A, oldMedida_a, medida_a);
    }


    public static final String PROP_LONGITUD = "longitud";

    /**
     * Get the value of longitud
     *
     * @return the value of longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Set the value of longitud
     *
     * @param longitud new value of longitud
     */
    public void setLongitud(int longitud) {
        int oldLongitud = this.longitud;
        this.longitud = longitud;
        propertyChangeSupport.firePropertyChange(PROP_LONGITUD, oldLongitud, longitud);
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
