/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package mitutoyo.interfaces;

import mitutoyo.data.MetricaMicrometrica;
import javax.swing.JTextField;
import jguiextensible.JGuiSimple;
import jguiextensible.JGuiTabbed;

/**
 *
 * @author a31r1z
 */
public class MetricaMicrometricaGUI extends JGuiSimple {
    
    private MetricaMicrometrica metMicro = new MetricaMicrometrica();

    /**
     * Creates new form MetricaMicrometrica
     */
    public MetricaMicrometricaGUI() {
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

        panelMetrMicrometrica = new javax.swing.JPanel();
        lblAvance = new javax.swing.JLabel();
        lblPlanitud = new javax.swing.JLabel();
        lblParalelismo = new javax.swing.JLabel();
        lblPerpendicularidad = new javax.swing.JLabel();
        lblRectitud = new javax.swing.JLabel();
        jftxAvance = new javax.swing.JFormattedTextField();
        jftxPlanitud = new javax.swing.JFormattedTextField();
        jftxParalelismo = new javax.swing.JFormattedTextField();
        jftxPerpendicularidad = new javax.swing.JFormattedTextField();
        jftxRectitud = new javax.swing.JFormattedTextField();

        setName("Metrica micrometrica"); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        panelMetrMicrometrica.setBorder(javax.swing.BorderFactory.createTitledBorder("Metrica Micrometrica"));
        panelMetrMicrometrica.setName("Metrica micrometrica"); // NOI18N

        lblAvance.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblAvance.setText("Avance ± (µm)");

        lblPlanitud.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblPlanitud.setText("Planitud (µm)");

        lblParalelismo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblParalelismo.setText("Paralelismo (µm)");

        lblPerpendicularidad.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblPerpendicularidad.setText("Perpendicularidad (µm)");

        lblRectitud.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblRectitud.setText("Rectitud (µm)");

        jftxAvance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxAvance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxAvance.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxPlanitud.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxPlanitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxPlanitud.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jftxPlanitud.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxParalelismo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxParalelismo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxParalelismo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxPerpendicularidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxPerpendicularidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxPerpendicularidad.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        jftxRectitud.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jftxRectitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftxRectitud.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N

        javax.swing.GroupLayout panelMetrMicrometricaLayout = new javax.swing.GroupLayout(panelMetrMicrometrica);
        panelMetrMicrometrica.setLayout(panelMetrMicrometricaLayout);
        panelMetrMicrometricaLayout.setHorizontalGroup(
            panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetrMicrometricaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParalelismo)
                    .addComponent(lblPlanitud)
                    .addComponent(lblRectitud)
                    .addComponent(lblPerpendicularidad)
                    .addComponent(lblAvance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftxAvance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxPlanitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxParalelismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxPerpendicularidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftxRectitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMetrMicrometricaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jftxAvance, jftxParalelismo, jftxPerpendicularidad, jftxPlanitud, jftxRectitud});

        panelMetrMicrometricaLayout.setVerticalGroup(
            panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetrMicrometricaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvance)
                    .addComponent(jftxAvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlanitud)
                    .addComponent(jftxPlanitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParalelismo)
                    .addComponent(jftxParalelismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerpendicularidad)
                    .addComponent(jftxPerpendicularidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelMetrMicrometricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRectitud)
                    .addComponent(jftxRectitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelMetrMicrometrica);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jftxAvance;
    private javax.swing.JFormattedTextField jftxParalelismo;
    private javax.swing.JFormattedTextField jftxPerpendicularidad;
    private javax.swing.JFormattedTextField jftxPlanitud;
    private javax.swing.JFormattedTextField jftxRectitud;
    private javax.swing.JLabel lblAvance;
    private javax.swing.JLabel lblParalelismo;
    private javax.swing.JLabel lblPerpendicularidad;
    private javax.swing.JLabel lblPlanitud;
    private javax.swing.JLabel lblRectitud;
    private javax.swing.JPanel panelMetrMicrometrica;
    // End of variables declaration//GEN-END:variables

    @Override
 protected boolean validateData( ) {
             
    return  Utilidades.matcher(jftxAvance, "Avance",this) &&
            Utilidades.matcher(jftxPlanitud, "Planitud",this) &&
            Utilidades.matcher(jftxParalelismo, "Paralelismo",this) &&
            Utilidades.matcher(jftxPerpendicularidad, "Perpendicularidad",this) &&
            Utilidades.matcher(jftxRectitud, "Rectitud",this) ;
 }
 
    @Override
    protected void saveData() {
        
        metMicro.setAvance(Integer.valueOf(String.valueOf(jftxAvance.getValue())));
        metMicro.setParalelismo(Integer.valueOf(String.valueOf(jftxParalelismo.getValue())));
        metMicro.setPerpendicularidad(Integer.valueOf(String.valueOf(jftxPerpendicularidad.getValue())));
        metMicro.setPlanitud(Integer.valueOf(String.valueOf(jftxPlanitud.getValue())));
        metMicro.setRectitud(Integer.valueOf(String.valueOf(jftxRectitud.getValue())));
        
        metMicro.guardarDatos();
    }
    
    @Override
    protected void cleanData() {
        
        jftxAvance.setValue(null);
        jftxParalelismo.setValue(null);
        jftxPerpendicularidad.setValue(null);
        jftxPlanitud.setValue(null);
        jftxRectitud.setValue(null);
        
        metMicro.borrarDatos();
    }
    
         @Override
    protected void updateChanges(String id, Object value) {
     
             System.out.println("Actualizando Avance");
        switch(id) {
            case "rangoMedida" -> { jftxAvance.setValue(value); }
        }
    }

}