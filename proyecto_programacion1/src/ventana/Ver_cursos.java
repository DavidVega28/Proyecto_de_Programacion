/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import clases.arraylist_carreras;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static ventana.Ventana_matricula.combo_carreras;

public class Ver_cursos extends javax.swing.JFrame {
    File archivofarma = new File("Cursos_farmacia.txt");
    File archivoInge= new File("Cursos_IngenieriaenSistemas.txt");
    File archivocursos = new File("Cursos_Administración.txt");
    String opcion = "Nuevo";

    public Ver_cursos() {
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
        jButton1 = new javax.swing.JButton();
        lb_selecionar = new javax.swing.JLabel();
        label_vercursos = new javax.swing.JLabel();
        combo_vercarreras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

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
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, 36));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 36));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 840, 40));

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 100, -1));

        lb_selecionar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lb_selecionar.setForeground(new java.awt.Color(51, 51, 51));
        lb_selecionar.setText("Seleccione la carrera:");
        jPanel5.add(lb_selecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 160, -1));

        label_vercursos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        label_vercursos.setForeground(new java.awt.Color(51, 51, 51));
        label_vercursos.setText("Ver Cursos");
        jPanel5.add(label_vercursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 110, 30));

        combo_vercarreras.setBackground(new java.awt.Color(153, 153, 153));
        combo_vercarreras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        combo_vercarreras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_vercarrerasItemStateChanged(evt);
            }
        });
        combo_vercarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_vercarrerasActionPerformed(evt);
            }
        });
        jPanel5.add(combo_vercarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 280, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso", "Código", "Créditos"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 780, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
    private void llenar_combo() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_de_programacion\\Proyecto_de_Programacion\\proyecto_programacion1\\Carreras.txt"));
            String linea;
            JComboBox<String> combo = new JComboBox<String>();
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(linea, ",");
                System.out.println(tokens.nextElement());
                combo_vercarreras.addItem(tokens.nextToken());

            }
            br.close();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.setState(Ver_cursos.ICONIFIED);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Bienvenida m = null;
        try {
            m = new Bienvenida();
        } catch (IOException ex) {
            Logger.getLogger(Ver_cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void combo_vercarrerasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_vercarrerasItemStateChanged
        
    }//GEN-LAST:event_combo_vercarrerasItemStateChanged

    private void combo_vercarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_vercarrerasActionPerformed
        String opcion = (String)combo_vercarreras.getSelectedItem();
        
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
    }//GEN-LAST:event_combo_vercarrerasActionPerformed

    private void Jlabel_calculadora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_calculadora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlabel_calculadora1MouseClicked

    private void jlblInternet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInternet1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblInternet1MouseClicked

    private void Herramientas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Herramientas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Herramientas1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Herramientas1;
    private javax.swing.JPanel JPIngreso1;
    private javax.swing.JLabel Jlabel_calculadora1;
    public javax.swing.JComboBox<String> combo_vercarreras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblInternet1;
    private javax.swing.JLabel label_vercursos;
    private javax.swing.JLabel lb_selecionar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
