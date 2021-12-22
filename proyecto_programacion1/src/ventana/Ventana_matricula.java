
package ventana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana_matricula extends javax.swing.JFrame {
    File archivofarma = new File("Cursos_farmacia.txt");
    File archivoInge= new File("Cursos_IngenieriaenSistemas.txt");
    File archivocursos = new File("Cursos_Administración.txt");
    String opcion = "Nuevo";
    public static DefaultTableModel t = new DefaultTableModel();
    public static DefaultTableModel t2 = new DefaultTableModel();

    
    public Ventana_matricula() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar_combo();
        
        Tablamatricula1.setModel(t);
        Tabla_matricula2.setModel(t2);
        t.addColumn("Nombre de curso");
        t.addColumn("Código");
        t.addColumn("Créditos");

        
        t2.addColumn("Nombre de curso");
        t2.addColumn("Código");
        t2.addColumn("Créditos");
        Tabla_matricula2.setModel(t2);
        
        

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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        combo_carreras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_matricula2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablamatricula1 = new javax.swing.JTable();
        bt_matricular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        combo_carreras.setBackground(new java.awt.Color(204, 204, 204));
        combo_carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_carrerasActionPerformed(evt);
            }
        });
        jPanel5.add(combo_carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 290, 30));

        Tabla_matricula2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla_matricula2);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 790, 140));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cursos matriculados:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 170, 30));

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

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 780, 140));

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
        jPanel5.add(bt_matricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 140, -1));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Seleccione la carrera:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 170, 30));

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Seleccione el curso:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 170, 30));

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
    private void verificarInformacion_farma() throws FileNotFoundException, IOException {
        String linea = null;
        int numeroRegistros = 0;

        BufferedReader leer = new BufferedReader(new FileReader(archivofarma));
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
            BufferedReader leerarchivo = new BufferedReader(new FileReader(archivofarma));
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
private void verificarInformacion_ingenieria() throws FileNotFoundException, IOException {
        String linea = null;
        int numeroRegistros = 0;

        BufferedReader leer = new BufferedReader(new FileReader(archivoInge));
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
            BufferedReader leerarchivo = new BufferedReader(new FileReader(archivoInge));
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_matricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_matricularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_matricularMouseClicked

    private void bt_matricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_matricularActionPerformed

        int Filaselect = Tablamatricula1.getSelectedRow();
        
        if(Filaselect>=0){
            String info_tareas []= new String[3];
            info_tareas[0]=Tablamatricula1.getValueAt(Filaselect, 0).toString();
            info_tareas[1]=Tablamatricula1.getValueAt(Filaselect, 1).toString();
            info_tareas[2]=Tablamatricula1.getValueAt(Filaselect, 2).toString();
            
            Ventana_matricula.t2.addRow(info_tareas);
            t.removeRow(Filaselect);      
        }
    }//GEN-LAST:event_bt_matricularActionPerformed

    private void combo_carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_carrerasActionPerformed
        String opcion = (String)combo_carreras.getSelectedItem();
         
        if(opcion.equals("Administración")){
            try {
                verificarInformacion();
            } catch (IOException ex) {
                Logger.getLogger(Ver_cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(opcion.equals("Ingenieria en sistemas")){
            try {
                verificarInformacion_ingenieria();
            } catch (IOException ex) {
                Logger.getLogger(Ver_cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
        if(opcion.equals("Farmacia")){
            try {
                verificarInformacion_farma();
            } catch (IOException ex) {
                Logger.getLogger(Ver_cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_combo_carrerasActionPerformed

    private void Jlabel_calculadora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_calculadora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlabel_calculadora1MouseClicked

    private void jlblInternet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInternet1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblInternet1MouseClicked

    private void Herramientas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Herramientas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Herramientas1MouseClicked

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
    private javax.swing.JTable Tabla_matricula2;
    private javax.swing.JTable Tablamatricula1;
    private javax.swing.JButton bt_matricular;
    public static javax.swing.JComboBox<String> combo_carreras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlblInternet1;
    // End of variables declaration//GEN-END:variables
}
