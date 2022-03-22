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
public class Visualizador {
    
    private boolean funcionTolerancia;        
    private int resolucion;
    private String visualizador;
    
     public Visualizador() {
    
     }
    

    public static final String PROP_VISUALIZADOR = "visualizador";

    /**
     * Get the value of visualizador
     *
     * @return the value of visualizador
     */
    public String getVisualizador() {
        return visualizador;
    }

    /**
     * Set the value of visualizador
     *
     * @param visualizador new value of visualizador
     */
    public void setVisualizador(String visualizador) {
        String oldVisualizador = this.visualizador;
        this.visualizador = visualizador;
        propertyChangeSupport.firePropertyChange(PROP_VISUALIZADOR, oldVisualizador, visualizador);
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

    public static final String PROP_FUNCIONTOLERANCIA = "funcionTolerancia";

    /**
     * Get the value of funcionTolerancia
     *
     * @return the value of funcionTolerancia
     */
    public boolean isFuncionTolerancia() {
        return funcionTolerancia;
    }

    /**
     * Set the value of funcionTolerancia
     *
     * @param funcionTolerancia new value of funcionTolerancia
     */
    public void setFuncionTolerancia(boolean funcionTolerancia) {
        boolean oldFuncionTolerancia = this.funcionTolerancia;
        this.funcionTolerancia = funcionTolerancia;
        propertyChangeSupport.firePropertyChange(PROP_FUNCIONTOLERANCIA, oldFuncionTolerancia, funcionTolerancia);
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
