package ventana;

import clases.Usuario;
import AppPackage.AnimationClass;
import clases.enviar_Correo;
import clases.enviar_correocontra;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    File archivoregistro = new File("Registro.txt");
    String opcion = "Nuevo";

    public Registro() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lb_ocultar.setVisible(false);
        verificarArchivo();
    }

    private void verificarArchivo() throws IOException {

        if (!archivoregistro.exists()) {

            archivoregistro.createNewFile();
            System.out.println("Archivo creado.");
        } else {

            System.out.println("Archivo existente.");
            verificarInformacion();
        }
    }

    private void verificarInformacion() throws FileNotFoundException, IOException {

        String linea = null;
        int numeroRegistros = 0;

        BufferedReader leer = new BufferedReader(new FileReader(archivoregistro));

        while ((linea = leer.readLine()) != null) {
            numeroRegistros += 1;
        }
        leer.close();

        if (numeroRegistros == 0) {

            JOptionPane.showMessageDialog(rootPane, "El archivo se encuentra vacío.");
        } else {
            String[][] datos = new String[numeroRegistros][7];
            int posicion = 0;
            String linealeida = null;

            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivoregistro));

            while ((linealeida = leerArchivo.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linealeida, "\t");

                datos[posicion][0] = st.nextToken().trim();
                datos[posicion][1] = st.nextToken().trim();
                datos[posicion][2] = st.nextToken().trim();
                datos[posicion][3] = st.nextToken().trim();
                datos[posicion][4] = st.nextToken().trim();
                datos[posicion][5] = st.nextToken().trim();
                datos[posicion][6] = st.nextToken().trim();

                posicion += 1;
            }
            leerArchivo.close();
        }
    }
    
    private void guardarregistro() throws FileNotFoundException, UnsupportedEncodingException, IOException{
    
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivoregistro,true),"utf-8"));
        escribirArchivo.write(txt_nombre.getText()+"\t"+txt_apelli.getText()+"\t"+txt_numcedula.getText()+"\t"+txt_email.getText()+"\t"+txt_usuario.getText()+"\t"+txt_contra.getText()+"\t"+txt_celular.getText()+"\n");
        escribirArchivo.close();
        verificarInformacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_apelli = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_numcedula = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_Registrarse = new javax.swing.JButton();
        JPIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Herramientas = new javax.swing.JLabel();
        jlblInternet = new javax.swing.JLabel();
        Jlabel_calculadora = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        RBadmin_ingreso = new javax.swing.JRadioButton();
        RBestudiante_ingreso = new javax.swing.JRadioButton();
        lb_ver = new javax.swing.JLabel();
        lb_ocultar = new javax.swing.JLabel();
        lb_olvidocontraseña = new javax.swing.JLabel();
        RBadmin_registro = new javax.swing.JRadioButton();
        RBestudiante_registro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(44, 47, 112));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 36));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 36));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 40));

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(44, 47, 112));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Registro");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 160, 40));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Nombre:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 90, 40));

        txt_usuario.setBackground(new java.awt.Color(153, 153, 153));
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 230, 40));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Apellidos:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 90, 40));

        txt_contra.setBackground(new java.awt.Color(153, 153, 153));
        txt_contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel3.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 230, 40));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Cédula:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 90, 40));

        txt_celular.setBackground(new java.awt.Color(153, 153, 153));
        txt_celular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel3.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 230, 40));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("E-mail:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 90, 40));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 153));
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 230, 40));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Usuario:");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 90, 40));

        txt_apelli.setBackground(new java.awt.Color(153, 153, 153));
        txt_apelli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel3.add(txt_apelli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 230, 40));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Contraseña:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 120, 40));

        txt_numcedula.setBackground(new java.awt.Color(153, 153, 153));
        txt_numcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        jPanel3.add(txt_numcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 230, 40));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Teléfono Celular:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 170, 40));

        txt_email.setBackground(new java.awt.Color(153, 153, 153));
        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 230, 40));

        btn_Registrarse.setBackground(new java.awt.Color(44, 47, 112));
        btn_Registrarse.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btn_Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrarse.setText("Registrarse");
        btn_Registrarse.setBorder(null);
        btn_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegistrarseMouseClicked(evt);
            }
        });
        btn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarseActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 170, 40));

        JPIngreso.setBackground(new java.awt.Color(255, 255, 255));
        JPIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        JPIngreso.setForeground(new java.awt.Color(255, 255, 255));
        JPIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuario:");
        JPIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Contraseña:");
        JPIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        JPIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, 130));

        txt_login.setBackground(new java.awt.Color(255, 255, 255));
        txt_login.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_login.setForeground(new java.awt.Color(153, 153, 153));
        txt_login.setBorder(null);
        txt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loginActionPerformed(evt);
            }
        });
        JPIngreso.add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 30));
        JPIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 10));
        JPIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, 10));

        txt_pass.setBackground(new java.awt.Color(255, 255, 255));
        txt_pass.setForeground(new java.awt.Color(153, 153, 153));
        txt_pass.setToolTipText("");
        txt_pass.setBorder(null);
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        JPIngreso.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        JPIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Key_32px.png"))); // NOI18N
        JPIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        Herramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        Herramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Herramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HerramientasMouseClicked(evt);
            }
        });
        JPIngreso.add(Herramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Globe_32px.png"))); // NOI18N
        jlblInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblInternetMouseClicked(evt);
            }
        });
        JPIngreso.add(jlblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, -1, 30));

        Jlabel_calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calculator_32px.png"))); // NOI18N
        Jlabel_calculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel_calculadoraMouseClicked(evt);
            }
        });
        JPIngreso.add(Jlabel_calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 40, 30));

        jButton1.setBackground(new java.awt.Color(44, 47, 112));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 110, 40));

        RBadmin_ingreso.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(RBadmin_ingreso);
        RBadmin_ingreso.setForeground(new java.awt.Color(51, 51, 51));
        RBadmin_ingreso.setText("Administrador");
        RBadmin_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBadmin_ingresoActionPerformed(evt);
            }
        });
        JPIngreso.add(RBadmin_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        RBestudiante_ingreso.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(RBestudiante_ingreso);
        RBestudiante_ingreso.setForeground(new java.awt.Color(51, 51, 51));
        RBestudiante_ingreso.setText("Estudiante");
        JPIngreso.add(RBestudiante_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 100, 20));

        lb_ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ver_32px.png"))); // NOI18N
        lb_ver.setText("jLabel6");
        lb_ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_verMouseClicked(evt);
            }
        });
        JPIngreso.add(lb_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 30, 30));

        lb_ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ocultar_32px.png"))); // NOI18N
        lb_ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ocultarMouseClicked(evt);
            }
        });
        JPIngreso.add(lb_ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 30, 30));

        lb_olvidocontraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_olvidocontraseña.setForeground(new java.awt.Color(44, 47, 112));
        lb_olvidocontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_olvidocontraseña.setText("Olvido su contraseña?");
        lb_olvidocontraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        lb_olvidocontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_olvidocontraseñaMouseClicked(evt);
            }
        });
        JPIngreso.add(lb_olvidocontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, 30));

        jPanel3.add(JPIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 600));

        RBadmin_registro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RBadmin_registro);
        RBadmin_registro.setForeground(new java.awt.Color(51, 51, 51));
        RBadmin_registro.setText("Administrador");
        jPanel3.add(RBadmin_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        RBestudiante_registro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RBestudiante_registro);
        RBestudiante_registro.setForeground(new java.awt.Color(51, 51, 51));
        RBestudiante_registro.setText("Estudiante");
        jPanel3.add(RBestudiante_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenInternet() {
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
        }
    }

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(ventanaLogin.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed

        try {
            String rol = "";
            if (RBadmin_registro.isSelected()) {
                rol = "Administrador";
            } else if (RBestudiante_registro.isSelected()) {
                rol = "Estudiante";
            }
            Usuario m = new Usuario(txt_nombre.getText(), txt_apelli.getText(), txt_numcedula.getText(), txt_usuario.getText(), txt_contra.getText(), txt_celular.getText(), txt_email.getText(), rol);
            enviar_Correo m1 = new enviar_Correo(txt_email.getText());
            m1.enviarcorreo();
            componentes.usuarios.add(m);
            JOptionPane.showMessageDialog(rootPane, "Usuario registrado exitosamente.");
            
            txt_nombre.setText("");
            txt_apelli.setText("");
            txt_numcedula.setText("");
            txt_usuario.setText("");
            txt_contra.setText("");
            txt_celular.setText("");
            txt_email.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error en el proceso de registro.");
        }
    }//GEN-LAST:event_btn_RegistrarseActionPerformed

    private void HerramientasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerramientasMouseClicked
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jlblInternet);
        internet.jLabelXLeft(10, -40, 10, 5, jlblInternet);

        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-40, 10, 10, 5, Jlabel_calculadora);
        calculadora.jLabelXLeft(10, -40, 10, 5, Jlabel_calculadora);
    }//GEN-LAST:event_HerramientasMouseClicked

    private void jlblInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInternetMouseClicked
        OpenInternet();
    }//GEN-LAST:event_jlblInternetMouseClicked

    private void Jlabel_calculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_calculadoraMouseClicked
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Jlabel_calculadoraMouseClicked

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegistrarseMouseClicked

        try {
            guardarregistro();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_RegistrarseMouseClicked

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void RBadmin_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBadmin_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBadmin_ingresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = txt_login.getText();
        String contra = txt_pass.getText();

        boolean e = true;

        for (int i = 0; i < componentes.usuarios.size(); i++) {
            if (componentes.usuarios.get(i).getUsuario().equals(usuario) && componentes.usuarios.get(i).getContra().equals(contra)) {
                e = true;
                componentes.rol = componentes.usuarios.get(i).getRol();
                break;
            } else {
                e = false;
            }
        }
        if (e) {
            JOptionPane.showMessageDialog(rootPane, "Usuario y contraseña correctos");
            Bienvenida p = new Bienvenida();
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed

    private void lb_verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_verMouseClicked
        lb_ver.setVisible(false);
        lb_ocultar.setVisible(true);
        txt_pass.setEchoChar((char) 0);
    }//GEN-LAST:event_lb_verMouseClicked

    private void lb_ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ocultarMouseClicked
        lb_ver.setVisible(true);
        lb_ocultar.setVisible(false);
        txt_pass.setEchoChar('●');
    }//GEN-LAST:event_lb_ocultarMouseClicked

    private void lb_olvidocontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_olvidocontraseñaMouseClicked
        recuperar_contra m = new recuperar_contra();
        m.setVisible(true);
    }//GEN-LAST:event_lb_olvidocontraseñaMouseClicked

    private void txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Herramientas;
    private javax.swing.JPanel JPIngreso;
    private javax.swing.JLabel Jlabel_calculadora;
    private javax.swing.JRadioButton RBadmin_ingreso;
    private javax.swing.JRadioButton RBadmin_registro;
    private javax.swing.JRadioButton RBestudiante_ingreso;
    private javax.swing.JRadioButton RBestudiante_registro;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblInternet;
    private javax.swing.JLabel lb_ocultar;
    private javax.swing.JLabel lb_olvidocontraseña;
    private javax.swing.JLabel lb_ver;
    private javax.swing.JTextField txt_apelli;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numcedula;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
