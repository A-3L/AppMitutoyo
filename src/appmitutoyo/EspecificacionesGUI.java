/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/BeanForm.java to edit this template
 */
package appmitutoyo;

import jguiextensible.JGuiSimple;

/**
 *
 * @author a31r1z
 */
public class EspecificacionesGUI extends JGuiSimple {
  
    Especificaciones especif;
    /**
     * Creates new form CalibreGui
     */
    public EspecificacionesGUI() {
        initComponents();
        especif = new Especificaciones();
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
        lblLongitud = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblMedida_b = new javax.swing.JLabel();
        lblMedida_d = new javax.swing.JLabel();
        jtxtLongitud = new javax.swing.JTextField();
        jtxtPeso = new javax.swing.JTextField();
        jtxtMedida_b = new javax.swing.JTextField();
        jtxtMedida_d = new javax.swing.JTextField();
        lblMedida_a = new javax.swing.JLabel();
        lblMedida_c = new javax.swing.JLabel();
        lblMedida_e = new javax.swing.JLabel();
        jtxtMedida_a = new javax.swing.JTextField();
        jtxtMedida_c = new javax.swing.JTextField();
        jtxtMedida_e = new javax.swing.JTextField();
        lblRefArticulo = new javax.swing.JLabel();
        jtxtRefArticulo = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        jtxtSerie = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Especificaciones"));
        setName("Calibre"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensiones"));

        lblLongitud.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblLongitud.setText("Longitud [mm]");

        lblPeso.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblPeso.setText("Peso [gr]");

        lblMedida_b.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_b.setText("b [mm]");

        lblMedida_d.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_d.setText("d [mm]");

        lblMedida_a.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_a.setText("a [mm]");

        lblMedida_c.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_c.setText("c [mm]");

        lblMedida_e.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblMedida_e.setText("e [mm]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLongitud)
                    .addComponent(lblPeso)
                    .addComponent(lblMedida_b)
                    .addComponent(lblMedida_d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jtxtMedida_b, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtMedida_d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMedida_a, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jtxtMedida_a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedida_e)
                            .addComponent(lblMedida_c, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtMedida_e, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMedida_c, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtxtLongitud, jtxtMedida_a, jtxtMedida_b, jtxtMedida_c, jtxtMedida_d, jtxtMedida_e, jtxtPeso});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblMedida_a, lblMedida_c, lblMedida_e});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblLongitud, lblMedida_b, lblMedida_d, lblPeso});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLongitud, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtLongitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedida_a, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtMedida_a, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedida_b, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtMedida_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedida_c, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtMedida_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedida_d, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtMedida_d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedida_e, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtMedida_e, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtxtLongitud, jtxtMedida_a, jtxtMedida_b, jtxtMedida_c, jtxtMedida_d, jtxtMedida_e, jtxtPeso});

        lblRefArticulo.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblRefArticulo.setText("Ref. Articulo");

        jtxtRefArticulo.setName("Especificaciones"); // NOI18N

        lblSerie.setFont(new java.awt.Font("URW Gothic", 0, 13)); // NOI18N
        lblSerie.setText("Serie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRefArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtRefArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSerie)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jtxtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtxtRefArticulo, jtxtSerie});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRefArticulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtRefArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtLongitud;
    private javax.swing.JTextField jtxtMedida_a;
    private javax.swing.JTextField jtxtMedida_b;
    private javax.swing.JTextField jtxtMedida_c;
    private javax.swing.JTextField jtxtMedida_d;
    private javax.swing.JTextField jtxtMedida_e;
    private javax.swing.JTextField jtxtPeso;
    private javax.swing.JTextField jtxtRefArticulo;
    private javax.swing.JTextField jtxtSerie;
    private javax.swing.JLabel lblLongitud;
    private javax.swing.JLabel lblMedida_a;
    private javax.swing.JLabel lblMedida_b;
    private javax.swing.JLabel lblMedida_c;
    private javax.swing.JLabel lblMedida_d;
    private javax.swing.JLabel lblMedida_e;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRefArticulo;
    private javax.swing.JLabel lblSerie;
    // End of variables declaration//GEN-END:variables
}
