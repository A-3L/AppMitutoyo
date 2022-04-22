/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package appmitutoyo.interfaces;

import jguiextensible.JGuiSimple;

/**
 *
 * @author a31r1z
 */
public class VisualizadorGUI extends JGuiSimple {
    
    /**
     * Creates new form Visualizador
     */
    public VisualizadorGUI() {
        
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

        jPanel1 = new javax.swing.JPanel();
        lblVisualizador = new javax.swing.JLabel();
        jcbVisualizador = new javax.swing.JComboBox<>();
        lblResolucion = new javax.swing.JLabel();
        jchkFuncionTolerancia = new javax.swing.JCheckBox();
        jftxResolucion = new javax.swing.JFormattedTextField();

        setName("Visualizador"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizador"));
        jPanel1.setName("Visualizador"); // NOI18N

        lblVisualizador.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblVisualizador.setText("Visualizador");

        jcbVisualizador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "LCD-6Digitos", "LCD-9Digitos", "TN Monocrome", "Graficos LCD", "Analogico", " " }));
        jcbVisualizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVisualizadorActionPerformed(evt);
            }
        });

        lblResolucion.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblResolucion.setText("Resolucion");

        jchkFuncionTolerancia.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jchkFuncionTolerancia.setText("Funcion de Tolerancia");

        jftxResolucion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jftxResolucionPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchkFuncionTolerancia)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVisualizador)
                            .addComponent(lblResolucion))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbVisualizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftxResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblVisualizador)
                    .addComponent(jcbVisualizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblResolucion)
                    .addComponent(jftxResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jchkFuncionTolerancia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jftxResolucionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jftxResolucionPropertyChange

    }//GEN-LAST:event_jftxResolucionPropertyChange

    private void jcbVisualizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVisualizadorActionPerformed
        jcbVisualizador.getSelectedItem().toString();
      
    }//GEN-LAST:event_jcbVisualizadorActionPerformed
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbVisualizador;
    private javax.swing.JCheckBox jchkFuncionTolerancia;
    private javax.swing.JFormattedTextField jftxResolucion;
    private javax.swing.JLabel lblResolucion;
    private javax.swing.JLabel lblVisualizador;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @return
     */
    @Override  
    protected boolean validacion( ) {  
    
    if (jftxResolucion.getValue() == null){
            
             Validar.mostrar("ERROR: Faltan datos en:\n "
                          + this.getName() +"-> Resolucion");
            jftxResolucion.requestFocusInWindow();
        
            return false;
        }
    
     if (jcbVisualizador.getSelectedIndex() == 0){
            
             Validar.mostrar("ERROR: Falta seleccion en:\n "
                          + this.getName() +"-> Visualizador");
            jcbVisualizador.requestFocusInWindow();
        
            return false;
        } 
    return true;
}
    @Override
     protected void actualizarCambio(String id, Object value) {}
}
