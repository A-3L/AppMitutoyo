/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import jguiextensible.JGuiExtensible;
import mitutoyo.Utilidades;
import mitutoyo.interfaces.ObservacionesGUI;

/**
 *
 * @author a31r1z
 */
public class Observaciones  implements Serializable{

    private static final long serialVersionUID = 1L;
 
    public Observaciones() {
    }
    
      public void borrarDatos() {
        
     setText(null);
     
    }
    
      public void guardarDatos() {
        
       Utilidades.saveInXml("Observaciones.xml", this);
       
    }
    private String text;

    public static final String PROP_TEXT = "text";

    /**
     * Get the value of text
     *
     * @return the value of text
     */
    public String getText() {
        return text;
    }

    /**
     * Set the value of text
     *
     * @param text new value of text
     */
    public void setText(String text) {
        String oldText = this.text;
        this.text = text;
        propertyChangeSupport.firePropertyChange(PROP_TEXT, oldText, text);
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

    public JGuiExtensible createDialog() {
        return new ObservacionesGUI();
    }

    
}
