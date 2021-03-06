
package ventana;

import clases.Usuario;
import clases.arraylist_carreras;
import clases.carreras;
import clases.enviar_correocontra;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.StringTokenizer;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Añadir_carreras extends javax.swing.JFrame {
    
    File archivocarreras = new File("Carreras.txt");
    String opcion = "Nuevo";
    
    DefaultTableModel t = new DefaultTableModel();

    public Añadir_carreras() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        tabla.setModel(t);
        t.addColumn("Nombre de la carrera");
        t.addColumn("Código");
        t.addColumn("Cupos");
        
        verificarArchivo();
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
    private void verificarArchivo() throws IOException {

        if (!archivocarreras.exists()) {

            archivocarreras.createNewFile();
            System.out.println("Archivo creado.");
        } else {

            System.out.println("Archivo existente.");
            verificarInformacion();
        }
    }

    private void verificarInformacion() throws FileNotFoundException, IOException {
        String linea = null;
        int numeroRegistros = 0;

        BufferedReader leer = new BufferedReader(new FileReader(archivocarreras));
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
            BufferedReader leerarchivo = new BufferedReader(new FileReader(archivocarreras));
            while ((linealeida = leerarchivo.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linealeida, ",");

                datos[posicion][0] = st.nextToken().trim();
                datos[posicion][1] = st.nextToken().trim();
                datos[posicion][2] = st.nextToken().trim();

                posicion += 1;
            }

            leerarchivo.close();
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
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
        for (int i = tabla.getRowCount() -1; i >=0 ; i--) {
            modelo.removeRow(i);
        }
    }
    private void guardarregistro() throws FileNotFoundException, UnsupportedEncodingException, IOException{
    
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivocarreras,true),"utf-8"));
        escribirArchivo.write(txt_codigo.getText()+","+txt_nombrecarrera.getText()+","+txt_cupos.getText()+"\n");
        verificarInformacion();
        escribirArchivo.close();
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
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_añadircarrera2 = new javax.swing.JButton();
        txt_filtrar = new javax.swing.JTextField();
        btn_reportecarreras1 = new javax.swing.JButton();

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

        btn_buscar.setBackground(new java.awt.Color(44, 47, 112));
        btn_buscar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 110, 30));

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
        jPanel1.add(btn_añadircarrera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 130, 40));

        txt_filtrar.setBackground(new java.awt.Color(153, 153, 153));
        txt_filtrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel1.add(txt_filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 260, 30));

        btn_reportecarreras1.setBackground(new java.awt.Color(44, 47, 112));
        btn_reportecarreras1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_reportecarreras1.setForeground(new java.awt.Color(255, 255, 255));
        btn_reportecarreras1.setText("Crear reporte");
        btn_reportecarreras1.setBorder(null);
        btn_reportecarreras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportecarreras1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reportecarreras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, 30));

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
        Bienvenida l = null;
        try {
            l = new Bienvenida();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        try {
            verificarInformacion();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String buscar = String.valueOf(txt_filtrar.getText());
        
        String [][]datos = new String[tabla.getRowCount()][3];
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int j = 0; j < 3; j++) {
                datos[i][j] = String.valueOf(tabla.getValueAt(i, j));
            }
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        limpliartabla(modelo);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][1].equalsIgnoreCase(buscar)) {
                modelo.addRow(new Object[]{datos[i][0],datos[i][1],datos[i][2]});
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_añadircarrera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadircarrera2ActionPerformed

        String nombre_carrera = txt_nombrecarrera.getText();
        String codigo = txt_codigo.getText();
        String cupos = txt_cupos.getText();

        carreras m = new carreras();

        m.setNombre_carrera(nombre_carrera);
        m.setCodigo(codigo);
        m.setCupos(cupos);

        arraylist_carreras.Arraycarrera.add(m);
        cargar();
        try {
            guardarregistro();
        } catch (UnsupportedEncodingException ex) {
            java.util.logging.Logger.getLogger(Registro_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Registro_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        txt_nombrecarrera.setText("");
        txt_codigo.setText("");
        txt_cupos.setText("");
    }//GEN-LAST:event_btn_añadircarrera2ActionPerformed

    private void btn_reportecarreras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportecarreras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportecarreras1ActionPerformed

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
                try {
                    new Añadir_carreras().setVisible(true);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Añadir_carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadircarrera2;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JButton btn_reportecarreras1;
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
    private javax.swing.JTextField txt_filtrar;
    private javax.swing.JTextField txt_nombrecarrera;
    // End of variables declaration//GEN-END:variables

}
