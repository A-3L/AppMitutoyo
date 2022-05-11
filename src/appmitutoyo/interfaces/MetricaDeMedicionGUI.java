/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package appmitutoyo.interfaces;

import appmitutoyo.data.MetricaDeMedicion;
import jguiextensible.JGuiSimple;
import jguiextensible.JGuiTabbed;

/**
 *
 * @author a31r1z
 */
public class MetricaDeMedicionGUI extends JGuiSimple {

    private static final long serialVersionUID = 1L;
    
    private MetricaDeMedicion metDeMed = new MetricaDeMedicion();
  
    /**
     * Creates new form CalibrePieDeReyGui
     */
    public MetricaDeMedicionGUI() {
          
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMetrMedicion = new javax.swing.JPanel();
        lblRango = new javax.swing.JLabel();
        lblPrecision = new javax.swing.JLabel();
        lblGraduacion = new javax.swing.JLabel();
        lblResolucion = new javax.swing.JLabel();
        lblPresionMedida = new javax.swing.JLabel();
        jftxRango = new javax.swing.JFormattedTextField();
        jftxPrecision = new javax.swing.JFormattedTextField();
        jftxResolucion = new javax.swing.JFormattedTextField();
        jftxGraduacion = new javax.swing.JFormattedTextField();
        jftxPresionDeMedida = new javax.swing.JFormattedTextField();

        setName(" Metrica de medicion"); // NOI18N

        panelMetrMedicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Metrica de Medicion"));
        panelMetrMedicion.setName("Metrica de Medicion"); // NOI18N

        lblRango.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblRango.setText("Rango [mm]");

        lblPrecision.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblPrecision.setText("Precision± [mm]");

        lblGraduacion.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblGraduacion.setText("Graduacion");

        lblResolucion.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblResolucion.setText("Resolucion (mm)");

        lblPresionMedida.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblPresionMedida.setText("Presion de medida [N]");

        jftxRango.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxRango.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxRango.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxPrecision.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxPrecision.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxPrecision.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxResolucion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxResolucion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxResolucion.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxGraduacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxGraduacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxGraduacion.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxPresionDeMedida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxPresionDeMedida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxPresionDeMedida.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        javax.swing.GroupLayout panelMetrMedicionLayout = new javax.swing.GroupLayout(panelMetrMedicion);
        panelMetrMedicion.setLayout(panelMetrMedicionLayout);
        panelMetrMedicionLayout.setHorizontalGroup(
            panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetrMedicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPresionMedida)
                    .addComponent(lblGraduacion)
                    .addComponent(lblResolucion)
                    .addComponent(lblPrecision)
                    .addComponent(lblRango))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftxRango, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxGraduacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxPresionDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMetrMedicionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblGraduacion, lblRango});

        panelMetrMedicionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jftxGraduacion, jftxPrecision, jftxPresionDeMedida, jftxRango, jftxResolucion});

        panelMetrMedicionLayout.setVerticalGroup(
            panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetrMedicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblRango)
                    .addComponent(jftxRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecision)
                    .addComponent(jftxPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResolucion)
                    .addComponent(jftxResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGraduacion)
                    .addComponent(jftxGraduacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(panelMetrMedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPresionMedida)
                    .addComponent(jftxPresionDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelMetrMedicion);

        getAccessibleContext().setAccessibleName("Metrica de medicion");
    }// </editor-fold>//GEN-END:initComponents
  
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jftxGraduacion;
    private javax.swing.JFormattedTextField jftxPrecision;
    private javax.swing.JFormattedTextField jftxPresionDeMedida;
    private javax.swing.JFormattedTextField jftxRango;
    private javax.swing.JFormattedTextField jftxResolucion;
    private javax.swing.JLabel lblGraduacion;
    private javax.swing.JLabel lblPrecision;
    private javax.swing.JLabel lblPresionMedida;
    private javax.swing.JLabel lblRango;
    private javax.swing.JLabel lblResolucion;
    private javax.swing.JPanel panelMetrMedicion;
    // End of variables declaration//GEN-END:variables

    @Override
    protected void actualizarCambio(String id, Object value) {
        System.out.println("Actualizando Metrica De Medicion");
     if (id.equals("rangoMedida")) {  
          
       jftxRango.setValue(value); 
       
     }
     
     if(id.equals("errorMax")) {
         
        System.out.println("YEPIYEI " +String.valueOf(value));               
     }
   
    }
    
    @Override
   protected boolean validarDatos() {
        
        return  Utilidades.matcher(jftxRango, "Rango",this) &&
                Utilidades.matcher(jftxPrecision, "Precision",this) &&
                Utilidades.matcher(jftxResolucion, "Resolucion",this) &&
                Utilidades.matcher(jftxGraduacion, "Graduacion",this) &&
                Utilidades.matcher(jftxPresionDeMedida, "PresionDeMedida",this);             
    } 
  
    @Override
      protected void guardarDatos() {
  
     metDeMed.setGraduacion(Integer.valueOf(String.valueOf(jftxGraduacion.getValue())));
     metDeMed.setRango(Integer.valueOf(String.valueOf(jftxRango.getValue())));
     metDeMed.setPrecision(Integer.valueOf(String.valueOf(jftxPrecision.getValue())));
     metDeMed.setResolucion(Integer.valueOf(String.valueOf(jftxResolucion.getValue())));
     metDeMed.setPresionDeMedida(Integer.valueOf(String.valueOf(jftxPresionDeMedida.getValue())));
     
     metDeMed.guardarDatos();
   
    }
      
    @Override
      protected void limpiarDatos() {
          
          jftxGraduacion.setValue(null);
          jftxRango.setValue(null);
          jftxPrecision.setValue(null);
          jftxResolucion.setValue(null);
          jftxPresionDeMedida.setValue(null); 
          
          metDeMed.borrarDatos();
          
      }
}