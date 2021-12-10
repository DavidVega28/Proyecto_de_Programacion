
package ventana;

import clases.Usuario;
import clases.arraylist_carreras;
import clases.carreras;
import clases.enviar_correocontra;
import java.io.UnsupportedEncodingException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Añadir_carreras extends javax.swing.JFrame {
    
    DefaultTableModel t = new DefaultTableModel();

    public Añadir_carreras() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabla.setModel(t);
        t.addColumn("Nombre de la carrera");
        t.addColumn("Código");
        t.addColumn("Cupos");
    }

    public void cargar() {
        t.setRowCount(0);
        for (int i = 0; i < arraylist_carreras.Arraycarrera.size(); i++) {
            t.addRow(new Object[]{
                arraylist_carreras.Arraycarrera.get(i).getNombre_carrera(),
                arraylist_carreras.Arraycarrera.get(i).getCodigo(),
                arraylist_carreras.Arraycarrera.get(i).getCupos(),});
        }
         
    }


    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cupos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        txt_nombrecarrera = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_refrescar = new javax.swing.JButton();
        btn_reportecarreras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_añadircarrera2 = new javax.swing.JButton();
        btn_modificarcarrera2 = new javax.swing.JButton();
        btn_eliminarcarrera1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar carreras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, -1));

        txt_cupos.setBackground(new java.awt.Color(153, 153, 153));
        txt_cupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel1.add(txt_cupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 200, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Código:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        btn_volver.setBackground(new java.awt.Color(44, 47, 112));
        btn_volver.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver ");
        btn_volver.setBorder(null);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 120, 30));

        txt_nombrecarrera.setBackground(new java.awt.Color(153, 153, 153));
        txt_nombrecarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel1.add(txt_nombrecarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 200, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cupos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        txt_codigo.setBackground(new java.awt.Color(153, 153, 153));
        txt_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel1.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 200, 30));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre de la carrera:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        btn_refrescar.setBackground(new java.awt.Color(44, 47, 112));
        btn_refrescar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_refrescar.setForeground(new java.awt.Color(255, 255, 255));
        btn_refrescar.setText("Refrescar");
        btn_refrescar.setBorder(null);
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 130, 40));

        btn_reportecarreras.setBackground(new java.awt.Color(44, 47, 112));
        btn_reportecarreras.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_reportecarreras.setForeground(new java.awt.Color(255, 255, 255));
        btn_reportecarreras.setText("Crear reporte");
        btn_reportecarreras.setBorder(null);
        btn_reportecarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportecarrerasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reportecarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 730, 270));

        btn_añadircarrera2.setBackground(new java.awt.Color(44, 47, 112));
        btn_añadircarrera2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_añadircarrera2.setForeground(new java.awt.Color(255, 255, 255));
        btn_añadircarrera2.setText("Agregar carrera");
        btn_añadircarrera2.setBorder(null);
        btn_añadircarrera2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadircarrera2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadircarrera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, 40));

        btn_modificarcarrera2.setBackground(new java.awt.Color(44, 47, 112));
        btn_modificarcarrera2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_modificarcarrera2.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificarcarrera2.setText("Modificar Carrera");
        btn_modificarcarrera2.setBorder(null);
        btn_modificarcarrera2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarcarrera2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificarcarrera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 40));

        btn_eliminarcarrera1.setBackground(new java.awt.Color(44, 47, 112));
        btn_eliminarcarrera1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_eliminarcarrera1.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarcarrera1.setText("Eliminar carrera");
        btn_eliminarcarrera1.setBorder(null);
        btn_eliminarcarrera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarcarrera1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminarcarrera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Bienvenida l = new Bienvenida();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed

    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void btn_reportecarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportecarrerasActionPerformed

    }//GEN-LAST:event_btn_reportecarrerasActionPerformed

    private void btn_añadircarrera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadircarrera2ActionPerformed

        String nombre_carrera = txt_nombrecarrera.getText();
        String codigo = txt_codigo.getText();
        String cupos = txt_cupos.getText();

        carreras m = new carreras();

        m.setNombre_carrera(nombre_carrera);
        m.setCodigo(codigo);
        m.setCupos(cupos);

        arraylist_carreras.Arraycarrera.add(m);

        txt_nombrecarrera.setText("");
        txt_codigo.setText("");
        txt_cupos.setText("");

        cargar();
    }//GEN-LAST:event_btn_añadircarrera2ActionPerformed

    private void btn_modificarcarrera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarcarrera2ActionPerformed
     
    }//GEN-LAST:event_btn_modificarcarrera2ActionPerformed

    private void btn_eliminarcarrera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarcarrera1ActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila>0){
            int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la carrera?", "Eliminar", JOptionPane.YES_NO_OPTION); //0 = SI, 1 = NO
            if(opcion == 0){
                arraylist_carreras.Arraycarrera.remove(fila);
                
            }
            
        }
    }//GEN-LAST:event_btn_eliminarcarrera1ActionPerformed

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
            java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Añadir_carreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadircarrera2;
    private javax.swing.JButton btn_eliminarcarrera1;
    private javax.swing.JButton btn_modificarcarrera2;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JButton btn_reportecarreras;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_cupos;
    private javax.swing.JTextField txt_nombrecarrera;
    // End of variables declaration//GEN-END:variables

}
