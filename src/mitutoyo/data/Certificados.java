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
import mitutoyo.interfaces.CertificadosGUI;

/**
 *
 * @author a31r1z
 */
public class Certificados implements Serializable{

    private static final long serialVersionUID = 1L;

    public Certificados() {
    }
    
    private String grado;
    private String tipoCalibracion; 
    private String tipoInspeccion;    
    private boolean inspeccionado;    
    private Integer anguloHz;   
    private Integer anguloV;    
    private Integer desviacion;   
    private Integer intervalo;    
    private Integer medidaPatron;   
    private Integer numId;    
    private Integer sufijo;  
    
    public JGuiExtensible createDialog() {
                  
    return new CertificadosGUI(); 
    }
     
    public void borrarDatos() {
        
        this.setGrado(null);
        this.setTipoCalibracion(null);
        this.setTipoInspeccion(null);
        this.setInspeccionado(false);
        this.setAnguloHz(null);
        this.setAnguloV(null);
        this.setDesviacion(null);
        this.setIntervalo(null);
        this.setMedidaPatron(null);
        this.setNumId(null);
        this.setSufijo(null);
       
    }
      
    public void guardarDatos() {
        
       Utilidades.saveInXml("Certificados.xml", this);
       
    }

    public static final String PROP_SUFIJO = "sufijo";

    /**
     * Get the value of sufijo
     *
     * @return the value of sufijo
     */
    public Integer getSufijo() {
        return sufijo;
    }

    /**
     * Set the value of sufijo
     *
     * @param sufijo new value of sufijo
     */
    public void setSufijo(Integer sufijo) {
        Integer oldSufijo = this.sufijo;
        this.sufijo = sufijo;
        propertyChangeSupport.firePropertyChange(PROP_SUFIJO, oldSufijo, sufijo);
    }


    public static final String PROP_NUMID = "numId";

    /**
     * Get the value of numId
     *
     * @return the value of numId
     */
    public Integer getNumId() {
        return numId;
    }

    /**
     * Set the value of numId
     *
     * @param numId new value of numId
     */
    public void setNumId(Integer numId) {
        Integer oldNumId = this.numId;
        this.numId = numId;
        propertyChangeSupport.firePropertyChange(PROP_NUMID, oldNumId, numId);
    }


    public static final String PROP_MEDIDAPATRON = "medidaPatron";

    /**
     * Get the value of medidaPatron
     *
     * @return the value of medidaPatron
     */
    public Integer getMedidaPatron() {
        return medidaPatron;
    }

    /**
     * Set the value of medidaPatron
     *
     * @param medidaPatron new value of medidaPatron
     */
    public void setMedidaPatron(Integer medidaPatron) {
        Integer oldMedidaPatron = this.medidaPatron;
        this.medidaPatron = medidaPatron;
        propertyChangeSupport.firePropertyChange(PROP_MEDIDAPATRON, oldMedidaPatron, medidaPatron);
    }


    public static final String PROP_INTERVALO = "intervalo";

    /**
     * Get the value of intervalo
     *
     * @return the value of intervalo
     */
    public Integer getIntervalo() {
        return intervalo;
    }

    /**
     * Set the value of intervalo
     *
     * @param intervalo new value of intervalo
     */
    public void setIntervalo(Integer intervalo) {
        Integer oldIntervalo = this.intervalo;
        this.intervalo = intervalo;
        propertyChangeSupport.firePropertyChange(PROP_INTERVALO, oldIntervalo, intervalo);
    }


    public static final String PROP_DESVIACION = "desviacion";

    /**
     * Get the value of desviacion
     *
     * @return the value of desviacion
     */
    public Integer getDesviacion() {
        return desviacion;
    }

    /**
     * Set the value of desviacion
     *
     * @param desviacion new value of desviacion
     */
    public void setDesviacion(Integer desviacion) {
        Integer oldDesviacion = this.desviacion;
        this.desviacion = desviacion;
        propertyChangeSupport.firePropertyChange(PROP_DESVIACION, oldDesviacion, desviacion);
    }


    public static final String PROP_ANGULOV = "anguloV";

    /**
     * Get the value of anguloV
     *
     * @return the value of anguloV
     */
    public Integer getAnguloV() {
        return anguloV;
    }

    /**
     * Set the value of anguloV
     *
     * @param anguloV new value of anguloV
     */
    public void setAnguloV(Integer anguloV) {
        Integer oldAnguloV = this.anguloV;
        this.anguloV = anguloV;
        propertyChangeSupport.firePropertyChange(PROP_ANGULOV, oldAnguloV, anguloV);
    }


    public static final String PROP_ANGULOHZ = "anguloHz";

    /**
     * Get the value of anguloHz
     *
     * @return the value of anguloHz
     */
    public Integer getAnguloHz() {
        return anguloHz;
    }

    /**
     * Set the value of anguloHz
     *
     * @param anguloHz new value of anguloHz
     */
    public void setAnguloHz(Integer anguloHz) {
        Integer oldAnguloHz = this.anguloHz;
        this.anguloHz = anguloHz;
        propertyChangeSupport.firePropertyChange(PROP_ANGULOHZ, oldAnguloHz, anguloHz);
    }


    public static final String PROP_INSPECCIONADO = "inspeccionado";

    /**
     * Get the value of inspeccionado
     *
     * @return the value of inspeccionado
     */
    public boolean isInspeccionado() {
        return inspeccionado;
    }

    /**
     * Set the value of inspeccionado
     *
     * @param inspeccionado new value of inspeccionado
     */
    public void setInspeccionado(boolean inspeccionado) {
        boolean oldInspeccionado = this.inspeccionado;
        this.inspeccionado = inspeccionado;
        propertyChangeSupport.firePropertyChange(PROP_INSPECCIONADO, oldInspeccionado, inspeccionado);
    }


    public static final String PROP_TIPOINSPECCION = "tipoInspeccion";

    /**
     * Get the value of tipoInspeccion
     *
     * @return the value of tipoInspeccion
     */
    public String getTipoInspeccion() {
        return tipoInspeccion;
    }

    /**
     * Set the value of tipoInspeccion
     *
     * @param tipoInspeccion new value of tipoInspeccion
     */
    public void setTipoInspeccion(String tipoInspeccion) {
        String oldTipoInspeccion = this.tipoInspeccion;
        this.tipoInspeccion = tipoInspeccion;
        propertyChangeSupport.firePropertyChange(PROP_TIPOINSPECCION, oldTipoInspeccion, tipoInspeccion);
    }

    

    public static final String PROP_TIPOCALIBRACION = "tipoCalibracion";

    /**
     * Get the value of tipoCalibracion
     *
     * @return the value of tipoCalibracion
     */
    public String getTipoCalibracion() {
        return tipoCalibracion;
    }

    /**
     * Set the value of tipoCalibracion
     *
     * @param tipoCalibracion new value of tipoCalibracion
     */
    public void setTipoCalibracion(String tipoCalibracion) {
        String oldTipoCalibracion = this.tipoCalibracion;
        this.tipoCalibracion = tipoCalibracion;
        propertyChangeSupport.firePropertyChange(PROP_TIPOCALIBRACION, oldTipoCalibracion, tipoCalibracion);
    }


    public static final String PROP_GRADO = "grado";

    /**
     * Get the value of grado
     *
     * @return the value of grado
     */
    public String getGrado() {
        return grado;
    }

    /**
     * Set the value of grado
     *
     * @param grado new value of grado
     */
    public void setGrado(String grado) {
        String oldGrado = this.grado;
        this.grado = grado;
        propertyChangeSupport.firePropertyChange(PROP_GRADO, oldGrado, grado);
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
