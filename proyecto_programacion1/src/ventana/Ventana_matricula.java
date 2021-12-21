
package ventana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana_matricula extends javax.swing.JFrame {

    File archivocursos = new File("Cursos_Administración.txt");
    String opcion = "Nuevo";
    
    public Ventana_matricula() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar_combo();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JPIngreso1 = new javax.swing.JPanel();
        Herramientas1 = new javax.swing.JLabel();
        jlblInternet1 = new javax.swing.JLabel();
        Jlabel_calculadora1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_codigo1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_apelli1 = new javax.swing.JLabel();
        lb_apellidos1 = new javax.swing.JLabel();
        lb_cedula1 = new javax.swing.JLabel();
        label_estudiante1 = new javax.swing.JLabel();
        lb_email1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_nombre1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_carreras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_matricula = new javax.swing.JTable();
        bt_seleccionarcarrera = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablamatricula1 = new javax.swing.JTable();
        bt_matricular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(44, 47, 112));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 36));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 36));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 860, 40));

        JPIngreso1.setBackground(new java.awt.Color(255, 255, 255));
        JPIngreso1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        JPIngreso1.setForeground(new java.awt.Color(255, 255, 255));
        JPIngreso1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Herramientas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        Herramientas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Herramientas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Herramientas1MouseClicked(evt);
            }
        });
        JPIngreso1.add(Herramientas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlblInternet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Globe_32px.png"))); // NOI18N
        jlblInternet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblInternet1MouseClicked(evt);
            }
        });
        JPIngreso1.add(jlblInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, -1, 30));

        Jlabel_calculadora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calculator_32px.png"))); // NOI18N
        Jlabel_calculadora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel_calculadora1MouseClicked(evt);
            }
        });
        JPIngreso1.add(Jlabel_calculadora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 40, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        JPIngreso1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 80));

        lb_codigo1.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso1.add(lb_codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 170, 20));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Número Cédula:");
        JPIngreso1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lb_apelli1.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso1.add(lb_apelli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 20));

        lb_apellidos1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lb_apellidos1.setForeground(new java.awt.Color(51, 51, 51));
        lb_apellidos1.setText("Apellidos:");
        JPIngreso1.add(lb_apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lb_cedula1.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso1.add(lb_cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 20));

        label_estudiante1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        label_estudiante1.setForeground(new java.awt.Color(51, 51, 51));
        label_estudiante1.setText("Código Estudiantil:");
        JPIngreso1.add(label_estudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        lb_email1.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso1.add(lb_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, 20));

        jLabel13.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("E-mail:");
        JPIngreso1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Nombre:");
        JPIngreso1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        label_nombre1.setForeground(new java.awt.Color(153, 153, 153));
        label_nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                label_nombre1KeyReleased(evt);
            }
        });
        JPIngreso1.add(label_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 20));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Información Personal");
        JPIngreso1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

        jPanel5.add(JPIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 600));

        jButton1.setBackground(new java.awt.Color(44, 47, 112));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 100, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Matricula");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, 30));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Digite el código del curso:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 190, 30));

        combo_carreras.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.add(combo_carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 290, 30));

        Tabla_matricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del curso", "Código", "Créditos"
            }
        ));
        jScrollPane1.setViewportView(Tabla_matricula);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 790, 140));

        bt_seleccionarcarrera.setBackground(new java.awt.Color(44, 47, 112));
        bt_seleccionarcarrera.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_seleccionarcarrera.setForeground(new java.awt.Color(255, 255, 255));
        bt_seleccionarcarrera.setText("Seleccionar");
        bt_seleccionarcarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_seleccionarcarreraMouseClicked(evt);
            }
        });
        bt_seleccionarcarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seleccionarcarreraActionPerformed(evt);
            }
        });
        jPanel5.add(bt_seleccionarcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 140, -1));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Seleccione la carrera:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 170, 30));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 310, 30));

        Tablamatricula1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del curso", "Código", "Créditos"
            }
        ));
        jScrollPane2.setViewportView(Tablamatricula1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 780, 140));

        bt_matricular.setBackground(new java.awt.Color(44, 47, 112));
        bt_matricular.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_matricular.setForeground(new java.awt.Color(255, 255, 255));
        bt_matricular.setText("Matricular ");
        bt_matricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_matricularMouseClicked(evt);
            }
        });
        bt_matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_matricularActionPerformed(evt);
            }
        });
        jPanel5.add(bt_matricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1151, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void verificarInformacion() throws FileNotFoundException, IOException {
        String linea = null;
        int numeroRegistros = 0;

        BufferedReader leer = new BufferedReader(new FileReader(archivocursos));
        while ((linea = leer.readLine()) != null) {
            numeroRegistros += 1;
        }
        leer.close();
        if (numeroRegistros == 0) {
            JOptionPane.showMessageDialog(rootPane, "El archivo esta vacio");
        } else {
            String[][] datos = new String[numeroRegistros][3];
            int posicion = 0;
            String linealeida = null;
            BufferedReader leerarchivo = new BufferedReader(new FileReader(archivocursos));
            while ((linealeida = leerarchivo.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linealeida, ",");

                datos[posicion][0] = st.nextToken().trim();
                datos[posicion][1] = st.nextToken().trim();
                datos[posicion][2] = st.nextToken().trim();

                posicion += 1;
            }

            leerarchivo.close();
            DefaultTableModel modelo = (DefaultTableModel) Tablamatricula1.getModel();
            limpliartabla(modelo);
            for (int i = 0; i < datos.length; i++) {

                String[] data = new String[3];
                for (int j = 0; j < datos[i].length; j++) {
                    data[(j)] = datos[i][j];
                }
                modelo.addRow(data);
            }

        }
    }
    public void limpliartabla(DefaultTableModel modelo){
        for (int i = Tablamatricula1.getRowCount() -1; i >=0 ; i--) {
            modelo.removeRow(i);
        }
    }
    private void llenar_combo (){

          try {
          BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_de_programacion\\Proyecto_de_Programacion\\proyecto_programacion1\\Carreras.txt"));
          String linea;
          JComboBox<String> combo = new JComboBox<String>();
          while((linea = br.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea,",");
            System.out.println(tokens.nextElement());
            combo_carreras.addItem(tokens.nextToken());
            
          }
          br.close();
        } catch(Exception x) {
          x.printStackTrace();
        }
    
    }
    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.setState(Ventana_matricula.ICONIFIED);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir de la aplicación?","Salir", dialog);
        if (result == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void Herramientas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Herramientas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Herramientas1MouseClicked

    private void jlblInternet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInternet1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblInternet1MouseClicked

    private void Jlabel_calculadora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_calculadora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlabel_calculadora1MouseClicked

    private void label_nombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_label_nombre1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_label_nombre1KeyReleased

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Bienvenida m = null;
        try {
            m = new Bienvenida();
        } catch (IOException ex) {
            Logger.getLogger(Ventana_matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    m.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_seleccionarcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seleccionarcarreraActionPerformed
        try {
            verificarInformacion();
        } catch (IOException ex) {
            Logger.getLogger(Ventana_matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_seleccionarcarreraActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_seleccionarcarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seleccionarcarreraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_seleccionarcarreraMouseClicked

    private void bt_matricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_matricularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_matricularMouseClicked

    private void bt_matricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_matricularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_matricularActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Herramientas1;
    private javax.swing.JPanel JPIngreso1;
    private javax.swing.JLabel Jlabel_calculadora1;
    private javax.swing.JTable Tabla_matricula;
    private javax.swing.JTable Tablamatricula1;
    private javax.swing.JButton bt_matricular;
    private javax.swing.JButton bt_seleccionarcarrera;
    public static javax.swing.JComboBox<String> combo_carreras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlblInternet1;
    private javax.swing.JLabel label_estudiante1;
    private javax.swing.JLabel label_nombre1;
    private javax.swing.JLabel lb_apelli1;
    private javax.swing.JLabel lb_apellidos1;
    private javax.swing.JLabel lb_cedula1;
    private javax.swing.JLabel lb_codigo1;
    private javax.swing.JLabel lb_email1;
    // End of variables declaration//GEN-END:variables
}
