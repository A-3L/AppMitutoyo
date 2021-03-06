/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package mitutoyo.interfaces;

import mitutoyo.data.Articulo;
import jguiextensible.JGuiSimple;

/**
 *
 * @author a31r1z
 */
public class ArticuloGUI extends JGuiSimple {

    private static final long serialVersionUID = 1L;
    
    private final Articulo articulo= new Articulo();
   
    /**
     * Creates new form Articulo
     */
    public ArticuloGUI() {
        
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

        jGuiSimple1 = new jguiextensible.JGuiSimple();
        lblRefArticulo = new javax.swing.JLabel();
        jtxtRefArticulo = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        jtxtSerie = new javax.swing.JTextField();

        setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        setName("Articulo"); // NOI18N

        jGuiSimple1.setBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"));
        jGuiSimple1.setName("Articulo"); // NOI18N

        lblRefArticulo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblRefArticulo.setText("Ref.Articulo");

        jtxtRefArticulo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jtxtRefArticulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSerie.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblSerie.setText("Serie");

        jtxtSerie.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        jtxtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jGuiSimple1Layout = new javax.swing.GroupLayout(jGuiSimple1);
        jGuiSimple1.setLayout(jGuiSimple1Layout);
        jGuiSimple1Layout.setHorizontalGroup(
            jGuiSimple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGuiSimple1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRefArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtRefArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblSerie)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jtxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jGuiSimple1Layout.setVerticalGroup(
            jGuiSimple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGuiSimple1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jGuiSimple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblRefArticulo)
                    .addComponent(jtxtRefArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSerie)
                    .addComponent(jtxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jGuiSimple1);

        getAccessibleContext().setAccessibleName("Articulo");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jguiextensible.JGuiSimple jGuiSimple1;
    private javax.swing.JTextField jtxtRefArticulo;
    private javax.swing.JTextField jtxtSerie;
    private javax.swing.JLabel lblRefArticulo;
    private javax.swing.JLabel lblSerie;
    // End of variables declaration//GEN-END:variables
    @Override
  
    
    protected boolean validateData() {
        
        return Utilidades.matcher(jtxtRefArticulo, "Ref.Articulo",this) &&
               Utilidades.matcher(jtxtSerie, "Serie",this);
    }
 
    @Override
    protected void saveData() {
        
        articulo.setRefArticulo(jtxtRefArticulo.getText());
        articulo.setSerie(jtxtSerie.getText());
        
        articulo.guardarDatos(); 
    }
    
    @Override
    protected void cleanData() {
        
        jtxtRefArticulo.setText(null);
        jtxtSerie.setText(null);
    }
    
      @Override
     protected void updateChanges(String id, Object value) {}

  
}
