/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import mitutoyo.Utilidades;
import mitutoyo.interfaces.VisualizadorGUI;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class Visualizador  implements Serializable{

    private static final long serialVersionUID = 1L;

    public Visualizador() {
        
    }
    
    private Integer resolucion;
    private boolean funcionDeTolerancia;   
    private String visualizador;

      
    public JGuiExtensible createDialog() {
        
    return new VisualizadorGUI();    
    }
    
    public void borrarDatos() {
        
        this.setFuncionDeTolerancia(false);
        this.setResolucion(null);
        this.setVisualizador(null);
        
    }
    
     public void guardarDatos() {
        
       Utilidades.saveInXml("Visualizador.xml", this);
       
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


    public static final String PROP_FUNCIONDETOLERANCIA = "funcionDeTolerancia";

    /**
     * Get the value of funcionDeTolerancia
     *
     * @return the value of funcionDeTolerancia
     */
    public boolean isFuncionDeTolerancia() {
        return funcionDeTolerancia;
    }

    /**
     * Set the value of funcionDeTolerancia
     *
     * @param funcionDeTolerancia new value of funcionDeTolerancia
     */
    public void setFuncionDeTolerancia(boolean funcionDeTolerancia) {
        boolean oldFuncionDeTolerancia = this.funcionDeTolerancia;
        this.funcionDeTolerancia = funcionDeTolerancia;
        propertyChangeSupport.firePropertyChange(PROP_FUNCIONDETOLERANCIA, oldFuncionDeTolerancia, funcionDeTolerancia);
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
