/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumerodeFilas = new javax.swing.JTextField();
        txtNumerodeColumnas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLlenarAutomatico = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("RECORRIDOS CON MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("N° Filas :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel2.add(txtNumerodeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 30, -1));
        jPanel2.add(txtNumerodeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 30, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("N° Columnas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 410, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        cmdLimpiar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(240, 240, 240));
        cmdLimpiar.setText("Limpiar");
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        cmdOperacion.setBackground(new java.awt.Color(0, 0, 0));
        cmdOperacion.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdOperacion.setForeground(new java.awt.Color(240, 240, 240));
        cmdOperacion.setText("Recorrer");
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        cmdLlenarAutomatico.setBackground(new java.awt.Color(0, 0, 0));
        cmdLlenarAutomatico.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdLlenarAutomatico.setForeground(new java.awt.Color(240, 240, 240));
        cmdLlenarAutomatico.setText("Automatico");
        jPanel3.add(cmdLlenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        cmdLlenarManual.setBackground(new java.awt.Color(0, 0, 0));
        cmdLlenarManual.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdLlenarManual.setForeground(new java.awt.Color(240, 240, 240));
        cmdLlenarManual.setText("Manual");
        jPanel3.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cmdCrear.setBackground(new java.awt.Color(0, 0, 0));
        cmdCrear.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(240, 240, 240));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, 220));

        tblTablaInicial.setBackground(new java.awt.Color(240, 240, 240));
        tblTablaInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 350, 210));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 550, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(626, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm;
        if (txtNumerodeFilas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite El Numero De Filas ", 2);
            txtNumerodeFilas.requestFocusInWindow();
        } else if (txtNumerodeColumnas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Digite El Numero De Columnas ", 2);
            txtNumerodeColumnas.requestFocusInWindow();
        } else {
            nf = Integer.parseInt(txtNumerodeFilas.getText());
            nc = Integer.parseInt(txtNumerodeColumnas.getText());
            if (nf == 0) {
                Helper.mensaje(this, "Numero De Filas No Puede Ser Cero", 3);
                txtNumerodeFilas.requestFocusInWindow();
            } else if (nc == 0) {
                Helper.mensaje(this, "Numero De Columnas No Puede Ser Cero", 3);
                txtNumerodeColumnas.requestFocusInWindow();
            } else if (nc > 13) {
                Helper.mensaje(this, "El Numero De Columnas No Puede Ser Mayor A 13", 2);
                txtNumerodeColumnas.requestFocusInWindow();
            } else {
                tm = (DefaultTableModel) tblTablaInicial.getModel();
                tm.setRowCount(nf);
                tm.setColumnCount(nc);
                JButton botonesH[] = {cmdLlenarManual, cmdLlenarAutomatico, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperacion};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenarAutomatico;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTextField txtNumerodeColumnas;
    private javax.swing.JTextField txtNumerodeFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
