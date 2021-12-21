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
        jLabel7 = new javax.swing.JLabel();
        lb_codigo1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_apelli1 = new javax.swing.JLabel();
        lb_apellidos1 = new javax.swing.JLabel();
        lb_cedula1 = new javax.swing.JLabel();
        label_estudiante1 = new javax.swing.JLabel();
        lb_email1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label_nombre1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb_selecionar = new javax.swing.JLabel();
        label_vercursos = new javax.swing.JLabel();
        combo_vercarreras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bt_seleccionarcarrera = new javax.swing.JButton();

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

        label_nombre1.setForeground(new java.awt.Color(153, 153, 153));
        label_nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                label_nombre1KeyReleased(evt);
            }
        });
        JPIngreso1.add(label_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 20));

        jLabel12.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Nombre:");
        JPIngreso1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Información Personal");
        JPIngreso1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

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
        jPanel5.add(combo_vercarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 280, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 780, 350));

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
        jPanel5.add(bt_seleccionarcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 140, -1));

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
     
    private void llenar_combo (){

          try {
          BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_de_programacion\\Proyecto_de_Programacion\\proyecto_programacion1\\Carreras.txt"));
          String linea;
          JComboBox<String> combo = new JComboBox<String>();
          while((linea = br.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea,",");
            System.out.println(tokens.nextElement());
            combo_vercarreras.addItem(tokens.nextToken());
            
          }
          br.close();
        } catch(Exception x) {
          x.printStackTrace();
        }
    }
    private void llenar_tabla_admi(){

    }
    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.setState(Ver_cursos.ICONIFIED);
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

    private void bt_seleccionarcarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seleccionarcarreraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_seleccionarcarreraMouseClicked

    private void bt_seleccionarcarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seleccionarcarreraActionPerformed
        {
	BufferedReader br = null;
        DefaultTableModel modelo = new DefaultTableModel();

	try {
		File archivo = new File("C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_de_programacion\\Proyecto_de_Programacion\\proyecto_programacion1\\Cursos_Administración.txt");
		if (archivo.exists()) {
			br = new BufferedReader(new FileReader(archivo));
			String linea;

			while ((linea = br.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(linea, ";");
                                String curso = token.nextToken().trim();
                                String codigo = token.nextToken().trim();
                                String creditos = token.nextToken().trim();
                                ;

				Object[] obj = new Object[] {
					curso, codigo, creditos,
				};
				modelo.addRow(obj);
			}
			br.close();
                        tabla.setModel(modelo);
		}
		else
			JOptionPane.showMessageDialog(null, "No existe el archivo");
	}
	catch (IOException ex) {
		System.out.println("Error al leer el archivo\n" + ex.getMessage());
	}
}
    }//GEN-LAST:event_bt_seleccionarcarreraActionPerformed


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
    private javax.swing.JButton bt_seleccionarcarrera;
    public javax.swing.JComboBox<String> combo_vercarreras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblInternet1;
    private javax.swing.JLabel label_estudiante1;
    private javax.swing.JLabel label_nombre1;
    private javax.swing.JLabel label_vercursos;
    private javax.swing.JLabel lb_apelli1;
    private javax.swing.JLabel lb_apellidos1;
    private javax.swing.JLabel lb_cedula1;
    private javax.swing.JLabel lb_codigo1;
    private javax.swing.JLabel lb_email1;
    private javax.swing.JLabel lb_selecionar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
