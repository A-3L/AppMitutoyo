/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import mitutoyo.interfaces.MetricaComparativaGUI;
import mitutoyo.Utilidades;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class MetricaComparativa  implements Serializable{

    private static final long serialVersionUID = 1L;

    public MetricaComparativa() {
    }
    
    private Integer errorMaximo;  
    private Integer hyteresis;
    private Integer escala;
    private Integer rangoDeMedida;
    
    
    public JGuiExtensible createDialog() {
                  
    return new MetricaComparativaGUI(); 
    }
    
    public void borrarDatos() {
        
        this.setErrorMaximo(null);
        this.setHyteresis(null);
        this.setEscala(null);
        this.setRangoDeMedida(25);
        
    }
    
      public void guardarDatos() {
        
       Utilidades.saveInXml("Metrica de comparacion.xml", this);
       
    }

    public static final String PROP_RANGODEMEDIDA = "rangoDeMedida";

    /**
     * Get the value of rangoDeMedida
     *
     * @return the value of rangoDeMedida
     */
    public Integer getRangoDeMedida() {
        return rangoDeMedida;
    }

    /**
     * Set the value of rangoDeMedida
     *
     * @param rangoDeMedida new value of rangoDeMedida
     */
    public void setRangoDeMedida(Integer rangoDeMedida) {
        Integer oldRangoDeMedida = this.rangoDeMedida;
        this.rangoDeMedida = rangoDeMedida;
        propertyChangeSupport.firePropertyChange(PROP_RANGODEMEDIDA, oldRangoDeMedida, rangoDeMedida);
    }


    public static final String PROP_ESCALA = "escala";

    /**
     * Get the value of escala
     *
     * @return the value of escala
     */
    public Integer getEscala() {
        return escala;
    }

    /**
     * Set the value of escala
     *
     * @param escala new value of escala
     */
    public void setEscala(Integer escala) {
        Integer oldEscala = this.escala;
        this.escala = escala;
        propertyChangeSupport.firePropertyChange(PROP_ESCALA, oldEscala, escala);
    }


    public static final String PROP_HYTERESIS = "hyteresis";

    /**
     * Get the value of hyteresis
     *
     * @return the value of hyteresis
     */
    public Integer getHyteresis() {
        return hyteresis;
    }

    /**
     * Set the value of hyteresis
     *
     * @param hyteresis new value of hyteresis
     */
    public void setHyteresis(Integer hyteresis) {
        Integer oldHyteresis = this.hyteresis;
        this.hyteresis = hyteresis;
        propertyChangeSupport.firePropertyChange(PROP_HYTERESIS, oldHyteresis, hyteresis);
    }


    public static final String PROP_ERRORMAXIMO = "errorMaximo";

    /**
     * Get the value of errorMaximo
     *
     * @return the value of errorMaximo
     */
    public Integer getErrorMaximo() {
        return errorMaximo;
    }

    /**
     * Set the value of errorMaximo
     *
     * @param errorMaximo new value of errorMaximo
     */
    public void setErrorMaximo(Integer errorMaximo) {
        Integer oldErrorMaximo = this.errorMaximo;
        this.errorMaximo = errorMaximo;
        propertyChangeSupport.firePropertyChange(PROP_ERRORMAXIMO, oldErrorMaximo, errorMaximo);
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
