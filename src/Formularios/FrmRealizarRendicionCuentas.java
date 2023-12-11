/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Comisionado;
import Clases.ComprobantePago;
import Clases.DeclaracionJurada;
import Clases.DocumentoAcreditadorGasto;
import Clases.SolicitudViatico;
import Controlador.cTrabajador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class FrmRealizarRendicionCuentas extends javax.swing.JFrame {

    /**
     * Creates new form frmRealizarRendicionCuentas
     */
    DefaultTableModel modelo=new DefaultTableModel();
    public FrmRealizarRendicionCuentas() {
        initComponents();
        jlNombreDeclarador.setVisible(false);
        tfNombreDeclarador.setVisible(false);
        jlApellidoDeclarador.setVisible(false);
        tfApellidoDeclarador.setVisible(false);
        jlTipoDocumentoDeclarador.setVisible(false);
        cbxTipoDocumentoDeclarador.setVisible(false);
        jlDocumentoDeclarador.setVisible(false);
        tfDocumentoDeclarador.setVisible(false);
        //-----------------------------------------------
        this.jTRealizarRC.setModel(modelo);
        this.modelo.addColumn("Codigo solicitud Viatico");
        this.modelo.addColumn("Codigo Comisionado");
        this.modelo.addColumn("Nombre empresa");
        this.modelo.addColumn("Código DAG");
        this.modelo.addColumn("Tipo DAG");
        this.modelo.addColumn("Descripcion gasto");
        this.modelo.addColumn("Nombre Declarador");
        this.modelo.addColumn("Apellido Declarador");
        this.modelo.addColumn("Tipo de documento del declarador");
        this.modelo.addColumn("Documento del declarador");
        this.modelo.addColumn("Fecha gasto");
        this.modelo.addColumn("Monto gasto");
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
        jLabel1 = new javax.swing.JLabel();
        tfSolicitudV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoDAG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRealizarRC = new javax.swing.JTable();
        btnAgregarDoc = new javax.swing.JButton();
        btnEliminarDoc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfFechaGasto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMontoGasto = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfNombreEmpresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCodigoComisionado = new javax.swing.JTextField();
        cbxTipoDAG = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescripcionGasto = new javax.swing.JTextArea();
        jlNombreDeclarador = new javax.swing.JLabel();
        tfNombreDeclarador = new javax.swing.JTextField();
        jlApellidoDeclarador = new javax.swing.JLabel();
        tfApellidoDeclarador = new javax.swing.JTextField();
        jlTipoDocumentoDeclarador = new javax.swing.JLabel();
        cbxTipoDocumentoDeclarador = new javax.swing.JComboBox<>();
        jlDocumentoDeclarador = new javax.swing.JLabel();
        tfDocumentoDeclarador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rendición de Cuentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código Solicitud Viático");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));
        jPanel1.add(tfSolicitudV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 220, -1));

        jLabel2.setText("Código DAG");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, -1));
        jPanel1.add(tfCodigoDAG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, 30));

        jTRealizarRC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo solicitud Viatico", "Codigo Comisionado", "Nombre empresa", "Código DAG", "Tipo DAG", "Descripcion gasto", "Nombre Declarador", "Apellido Declarador", "Tipo de documento del declarador", "Documento del declarador", "Fecha gasto", "Monto gasto"
            }
        ));
        jScrollPane1.setViewportView(jTRealizarRC);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 1060, 300));

        btnAgregarDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/page_white_add.png"))); // NOI18N
        btnAgregarDoc.setText("Agregar Documento");
        btnAgregarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDocActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 160, 30));

        btnEliminarDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnEliminarDoc.setText("Eliminar Documento");
        jPanel1.add(btnEliminarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, 160, 30));

        jLabel3.setText("Tipo DAG");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel4.setText("Fecha Gasto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));
        jPanel1.add(tfFechaGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 180, -1));

        jLabel5.setText("Monto Gasto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));
        jPanel1.add(tfMontoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 180, -1));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/to_do_list_cheked_all.png"))); // NOI18N
        btnListar.setText("Listar");
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, 100, 30));

        jLabel6.setText("Nombre Empresa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));
        jPanel1.add(tfNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 220, -1));

        jLabel7.setText("Codigo Comisionado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));
        jPanel1.add(tfCodigoComisionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 220, -1));

        cbxTipoDAG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comprobante de pago", "Declaracion jurada" }));
        cbxTipoDAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoDAGActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoDAG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 220, -1));

        jLabel8.setText("Descripcion del gasto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        taDescripcionGasto.setColumns(20);
        taDescripcionGasto.setRows(5);
        jScrollPane2.setViewportView(taDescripcionGasto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jlNombreDeclarador.setText("Nombre del declarador");
        jPanel1.add(jlNombreDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));
        jPanel1.add(tfNombreDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 180, -1));

        jlApellidoDeclarador.setText("Apellido del declarador");
        jPanel1.add(jlApellidoDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(tfApellidoDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, -1));

        jlTipoDocumentoDeclarador.setText("Tipo de documento del declarador");
        jPanel1.add(jlTipoDocumentoDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cbxTipoDocumentoDeclarador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dni", "carnet de extranjeria" }));
        jPanel1.add(cbxTipoDocumentoDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 180, -1));

        jlDocumentoDeclarador.setText("Documento del declarador");
        jPanel1.add(jlDocumentoDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(tfDocumentoDeclarador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDocActionPerformed
        // TODO add your handling code here:
        
        //GUARDADO EN EL JTABLE:
        this.modelo.addRow(new Object[]{
            this.tfSolicitudV.getText(),
            this.tfCodigoComisionado.getText(),
            this.tfNombreEmpresa.getText(),
            this.tfCodigoDAG.getText(),
            this.cbxTipoDAG.getSelectedItem().toString(),
            this.taDescripcionGasto.getText(),
            this.tfNombreDeclarador.getText(),
            this.tfApellidoDeclarador.getText(),
            this.cbxTipoDocumentoDeclarador.getSelectedItem().toString(),
            this.tfDocumentoDeclarador.getText(),
            this.tfFechaGasto.getText(),
            this.tfMontoGasto.getText()
            
        });
        
        //GUARDADO EN LA BASE DE DATOS
        String nEmpresa=tfNombreEmpresa.getText();
        double mGasto=Double.parseDouble(tfMontoGasto.getText());
        String fGasto=tfFechaGasto.getText();
        String cDAG=tfCodigoDAG.getText();
        String cSV=tfSolicitudV.getText();
        String tDAG=cbxTipoDAG.getSelectedItem().toString();
        String cComisionado=tfCodigoComisionado.getText();
        String dGasto=taDescripcionGasto.getText();
        String nDeclarador=tfNombreDeclarador.getText();
        String aDeclarador=tfApellidoDeclarador.getText();
        String tDocDeclarador=cbxTipoDocumentoDeclarador.getSelectedItem().toString();
        String docDeclarador=tfDocumentoDeclarador.getText();
        
        Comisionado cmdo=new Comisionado();
        cmdo.setCodigo(cComisionado);
        
        SolicitudViatico sv=new SolicitudViatico();
        sv.setCodSolicitud(cSV);
        sv.setComisionado(cmdo);
        
        cTrabajador cTb=new cTrabajador();
        
        DocumentoAcreditadorGasto dag=new DocumentoAcreditadorGasto();
            dag.setSolicitudV(sv);
            dag.setNombreEmpresa(nEmpresa);
            dag.setCodDoc(cDAG);
            dag.setTipoDAG(tDAG);
            dag.setDescripcionGasto(dGasto);
            dag.setNombreDeclarador(nDeclarador);
            dag.setApellidoDeclarador(aDeclarador);
            dag.setTipoDocumentoDeclarador(tDocDeclarador);
            dag.setDocumentoDeclarador(docDeclarador);
            dag.setFechaGasto(fGasto);
            dag.setMontoGasto(mGasto);
            cTb.addDocumentoAcreditadorGasto(dag);
            
        
        
        //MENSAJE DE CONFIRMACION
        JOptionPane.showMessageDialog(this, "El documento acreditador de gasto se registro correctamente.");
        
        //LIMPIAR DATOS
        this.tfSolicitudV.setText("");
        this.tfNombreEmpresa.setText("");
        this.tfNombreEmpresa.setText("");
        this.tfCodigoDAG.setText("");
        this.cbxTipoDAG.setSelectedItem("Comprobante de pago");
        this.taDescripcionGasto.setText("");
        this.tfNombreDeclarador.setText("");
        this.tfApellidoDeclarador.setText("");
        this.cbxTipoDocumentoDeclarador.setSelectedItem("dni");
        this.tfDocumentoDeclarador.setText("");
        this.tfFechaGasto.setText("");
        this.tfMontoGasto.setText("");
        
        
        
        
    }//GEN-LAST:event_btnAgregarDocActionPerformed

    private void cbxTipoDAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDAGActionPerformed
        // TODO add your handling code here:
        String var=cbxTipoDAG.getSelectedItem().toString();
        if(var.equalsIgnoreCase("Declaracion jurada")){
        jlNombreDeclarador.setVisible(true);
        tfNombreDeclarador.setVisible(true);
        jlApellidoDeclarador.setVisible(true);
        tfApellidoDeclarador.setVisible(true);
        jlTipoDocumentoDeclarador.setVisible(true);
        cbxTipoDocumentoDeclarador.setVisible(true);
        jlDocumentoDeclarador.setVisible(true);
        tfDocumentoDeclarador.setVisible(true);
        
        }
    }//GEN-LAST:event_cbxTipoDAGActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarRendicionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarRendicionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarRendicionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarRendicionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRealizarRendicionCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDoc;
    private javax.swing.JButton btnEliminarDoc;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> cbxTipoDAG;
    private javax.swing.JComboBox<String> cbxTipoDocumentoDeclarador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTRealizarRC;
    private javax.swing.JLabel jlApellidoDeclarador;
    private javax.swing.JLabel jlDocumentoDeclarador;
    private javax.swing.JLabel jlNombreDeclarador;
    private javax.swing.JLabel jlTipoDocumentoDeclarador;
    private javax.swing.JTextArea taDescripcionGasto;
    private javax.swing.JTextField tfApellidoDeclarador;
    private javax.swing.JTextField tfCodigoComisionado;
    private javax.swing.JTextField tfCodigoDAG;
    private javax.swing.JTextField tfDocumentoDeclarador;
    private javax.swing.JTextField tfFechaGasto;
    private javax.swing.JTextField tfMontoGasto;
    private javax.swing.JTextField tfNombreDeclarador;
    private javax.swing.JTextField tfNombreEmpresa;
    private javax.swing.JTextField tfSolicitudV;
    // End of variables declaration//GEN-END:variables
}
