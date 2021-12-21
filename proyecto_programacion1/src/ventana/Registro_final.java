/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import AppPackage.AnimationClass;
import clases.Usuario;
import clases.enviar_Correo;
import clases.seguridad;
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
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registro_final extends javax.swing.JFrame {

    private static Scanner sc;
    private static int intentos;
    private static String user, pass;

    public static String texto_nombre = "";
    public static String texto_apellidos = "";
    public static String texto_numcedula = "";
    public static String texto_email = "";
    public static String codigo_Est = "";

    File archivoIniciosesion = new File("Contrayusuario.txt");
    File archivoregistro = new File("Registro.txt");
    String opcion = "Nuevo";

    public Registro_final() {
        initComponents();
        layeredpane.removeAll();
        layeredpane.add(panel_login);
        layeredpane.repaint();
        layeredpane.revalidate();

        this.setLocationRelativeTo(null);
        this.lb_ocultar1.setVisible(false);

        try {
            verificarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        }
        rootPane.setDefaultButton(bt_ingresar);
    }

    public static void setIntentos(int intentos) {
        Registro_final.intentos = intentos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JPIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Herramientas = new javax.swing.JLabel();
        jlblInternet = new javax.swing.JLabel();
        Jlabel_calculadora = new javax.swing.JLabel();
        bt_registrar = new javax.swing.JButton();
        bt_ingresar = new javax.swing.JButton();
        rb_admin = new javax.swing.JRadioButton();
        rb_estu = new javax.swing.JRadioButton();
        lb_ver1 = new javax.swing.JLabel();
        lb_ocultar1 = new javax.swing.JLabel();
        lb_olvidocontraseña = new javax.swing.JLabel();
        layeredpane = new javax.swing.JLayeredPane();
        panel_login = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel_Drive = new javax.swing.JLabel();
        jLabel_socios = new javax.swing.JLabel();
        jLabel_calendario = new javax.swing.JLabel();
        jLabel_mante = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_mante1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        panel_registro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_apelli = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_numcedula = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btn_Registrarse = new javax.swing.JButton();
        RBadmin_registro = new javax.swing.JRadioButton();
        RBestudiante_registro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        JPIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, 120));

        Nombre_usuario.setBackground(new java.awt.Color(255, 255, 255));
        Nombre_usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nombre_usuario.setForeground(new java.awt.Color(153, 153, 153));
        Nombre_usuario.setBorder(null);
        JPIngreso.add(Nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 140, 30));
        JPIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 10));
        JPIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, 30));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setForeground(new java.awt.Color(153, 153, 153));
        contraseña.setToolTipText("");
        contraseña.setBorder(null);
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        JPIngreso.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 160, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        JPIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Key_32px.png"))); // NOI18N
        JPIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, 30));

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

        bt_registrar.setBackground(new java.awt.Color(44, 47, 112));
        bt_registrar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar.setText("Registrarse");
        bt_registrar.setBorder(null);
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });
        JPIngreso.add(bt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 110, 40));

        bt_ingresar.setBackground(new java.awt.Color(44, 47, 112));
        bt_ingresar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bt_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        bt_ingresar.setText("Ingresar");
        bt_ingresar.setBorder(null);
        bt_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ingresarActionPerformed(evt);
            }
        });
        JPIngreso.add(bt_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 110, 40));

        rb_admin.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_admin);
        rb_admin.setForeground(new java.awt.Color(51, 51, 51));
        rb_admin.setText("Administrador");
        rb_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_adminActionPerformed(evt);
            }
        });
        JPIngreso.add(rb_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        rb_estu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_estu);
        rb_estu.setForeground(new java.awt.Color(51, 51, 51));
        rb_estu.setText("Estudiante");
        JPIngreso.add(rb_estu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, 20));

        lb_ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ver_32px.png"))); // NOI18N
        lb_ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ver1MouseClicked(evt);
            }
        });
        JPIngreso.add(lb_ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 30));

        lb_ocultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ocultar_32px.png"))); // NOI18N
        lb_ocultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ocultar1MouseClicked(evt);
            }
        });
        JPIngreso.add(lb_ocultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        lb_olvidocontraseña.setBackground(new java.awt.Color(44, 47, 112));
        lb_olvidocontraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_olvidocontraseña.setForeground(new java.awt.Color(44, 47, 112));
        lb_olvidocontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_olvidocontraseña.setText("¿Olvidó su contraseña?");
        lb_olvidocontraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        lb_olvidocontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_olvidocontraseñaMouseClicked(evt);
            }
        });
        JPIngreso.add(lb_olvidocontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 30));

        jPanel2.add(JPIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 590));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 590));

        layeredpane.setLayout(new java.awt.CardLayout());

        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(44, 47, 112));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 36));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 36));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        jLabel_Drive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Drive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/uni.jpeg"))); // NOI18N
        jLabel_Drive.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_DriveMouseMoved(evt);
            }
        });
        jLabel_Drive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_DriveMouseExited(evt);
            }
        });
        jPanel4.add(jLabel_Drive, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 130, 110));

        jLabel_socios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_socios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calendario- Dimensiones personalizadas (1).jpeg"))); // NOI18N
        jLabel_socios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_sociosMouseMoved(evt);
            }
        });
        jLabel_socios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_sociosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_sociosMouseExited(evt);
            }
        });
        jPanel4.add(jLabel_socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 140, 120));

        jLabel_calendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Today_96px.png"))); // NOI18N
        jLabel_calendario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_calendarioMouseMoved(evt);
            }
        });
        jLabel_calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_calendarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_calendarioMouseExited(evt);
            }
        });
        jPanel4.add(jLabel_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, 130));

        jLabel_mante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lugares- Dimensiones personalizadas.jpeg"))); // NOI18N
        jLabel_mante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_manteMouseMoved(evt);
            }
        });
        jLabel_mante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_manteMouseExited(evt);
            }
        });
        jPanel4.add(jLabel_mante, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 140, 130));

        jLabel13.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Acerca de la U");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 110, -1));

        jLabel14.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Carreras");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 70, -1));

        jLabel16.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Facultades, centros y sedes");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 210, -1));

        jLabel18.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Información");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 110, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logos Universidad LD/logo_small.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 20, 620, 570));

        jLabel_mante1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icono info - Dimensiones personalizadas.jpeg"))); // NOI18N
        jLabel_mante1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_mante1MouseMoved(evt);
            }
        });
        jLabel_mante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_mante1MouseExited(evt);
            }
        });
        jPanel4.add(jLabel_mante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 140, 130));

        jLabel17.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Calendario");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 90, -1));

        panel_login.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        layeredpane.add(panel_login, "card2");

        panel_registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(44, 47, 112));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 36));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 36));

        panel_registro.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(44, 47, 112));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Registro");
        panel_registro.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 170, 40));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 153));
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        panel_registro.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 230, 40));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Nombre:");
        panel_registro.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 40));

        txt_usuario.setBackground(new java.awt.Color(153, 153, 153));
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        panel_registro.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 230, 40));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Usuario:");
        panel_registro.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 90, 40));

        txt_apelli.setBackground(new java.awt.Color(153, 153, 153));
        txt_apelli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        panel_registro.add(txt_apelli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 230, 40));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Apellidos:");
        panel_registro.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 90, 40));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Cédula:");
        panel_registro.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 90, 40));

        txt_numcedula.setBackground(new java.awt.Color(153, 153, 153));
        txt_numcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        panel_registro.add(txt_numcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 230, 40));

        txt_celular.setBackground(new java.awt.Color(153, 153, 153));
        txt_celular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        panel_registro.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 230, 40));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Teléfono Celular:");
        panel_registro.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 170, 40));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Contraseña:");
        panel_registro.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 120, 40));

        txt_contra.setBackground(new java.awt.Color(153, 153, 153));
        txt_contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        panel_registro.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 230, 40));

        txt_email.setBackground(new java.awt.Color(153, 153, 153));
        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 47, 112)));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        panel_registro.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 230, 40));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("E-mail:");
        panel_registro.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 90, 40));

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
        panel_registro.add(btn_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 170, 40));

        RBadmin_registro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(RBadmin_registro);
        RBadmin_registro.setForeground(new java.awt.Color(51, 51, 51));
        RBadmin_registro.setText("Administrador");
        panel_registro.add(RBadmin_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        RBestudiante_registro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(RBestudiante_registro);
        RBestudiante_registro.setForeground(new java.awt.Color(51, 51, 51));
        RBestudiante_registro.setText("Estudiante");
        panel_registro.add(RBestudiante_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        layeredpane.add(panel_registro, "card3");

        jPanel1.add(layeredpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 830, 590));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void verificarArchivo() throws IOException {

        if (!archivoregistro.exists()) {

            archivoregistro.createNewFile();
            System.out.println("Archivo creado.");
        } else {

            System.out.println("Archivo existente.");
            verificarInformacion();
        }
    }

    private void verificarArchivo1() throws IOException {

        if (!archivoIniciosesion.exists()) {

            archivoIniciosesion.createNewFile();
            System.out.println("Archivo creado.");
        } else {

            System.out.println("Archivo existente.");
            verificar_contrayusuario();
        }
    }

    private void verificar_contrayusuario() throws FileNotFoundException, IOException {
        String linea = null;
        int numeroRegistros = 0;

        BufferedReader leer = new BufferedReader(new FileReader(archivoIniciosesion));

        while ((linea = leer.readLine()) != null) {
            numeroRegistros += 1;
        }
        leer.close();

        if (numeroRegistros == 0) {

            JOptionPane.showMessageDialog(rootPane, "El archivo se encuentra vacío.");
        } else {
            String[][] datos = new String[numeroRegistros][1];
            int posicion = 0;
            String linealeida = null;

            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivoIniciosesion));

            while ((linealeida = leerArchivo.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linealeida, "\n");

                datos[posicion][0] = st.nextToken().trim();

            }
            leerArchivo.close();
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

                StringTokenizer st = new StringTokenizer(linealeida, "\n");

                datos[posicion][0] = st.nextToken().trim();
                datos[posicion][1] = st.nextToken().trim();
                datos[posicion][2] = st.nextToken().trim();
                datos[posicion][3] = st.nextToken().trim();
                datos[posicion][4] = st.nextToken().trim();
                datos[posicion][5] = st.nextToken().trim();
                datos[posicion][6] = st.nextToken().trim();

            }
            leerArchivo.close();
        }
    }

    private void guardar_contrayusuario() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        BufferedWriter escribirArchivo1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivoIniciosesion, true), "utf-8"));
        escribirArchivo1.write(txt_usuario.getText() + "\n" + txt_contra.getText() + "\n");
        verificar_contrayusuario();
        escribirArchivo1.close();
    }

    private void guardarregistro() throws FileNotFoundException, UnsupportedEncodingException, IOException {

        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivoregistro, true), "utf-8"));
        escribirArchivo.write(txt_nombre.getText() + "," + txt_apelli.getText() + "," + txt_numcedula.getText() + "," + txt_email.getText() + "," + txt_usuario.getText() + "," + txt_contra.getText() + "," + txt_celular.getText() + "\n");
        verificarInformacion();
        escribirArchivo.close();
    }

    private void OpenInternet() {
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
        }
    }

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed

    }//GEN-LAST:event_contraseñaActionPerformed

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

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        layeredpane.removeAll();
        layeredpane.add(panel_registro);
        layeredpane.repaint();
        layeredpane.revalidate();
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void bt_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ingresarActionPerformed
        String rol = "";
        if (rb_admin.isSelected()) {
            rol = "Administrador";
        } else if (rb_estu.isSelected()) {
            rol = "Estudiante";
        }
        System.out.println(rol);

        FileReader fr = null;
        try {
            int nLineas = 0;
            int i = 0;
            String[] usuarios = null;
            String linea;
            try {
                sc = new Scanner(new File("C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_de_programacion\\Proyecto_de_Programacion\\proyecto_programacion1\\Contrayusuario.txt"));
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(Registro_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            File f = new File("C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_de_programacion\\Proyecto_de_Programacion\\proyecto_programacion1\\Contrayusuario.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            try {
                while ((linea = br.readLine()) != null) {
                    nLineas++;
                }
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Registro_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            usuarios = new String[nLineas];//tamaño

            while (sc.hasNextLine()) {
                usuarios[i++] = sc.nextLine();//Almacenando cada linea 
            }
            intentos++;

            user = Nombre_usuario.getText();
            pass = contraseña.getText();

            seguridad s = new seguridad();
            try {
                s.validarUsuario(usuarios, user, pass, intentos);
            } catch (IOException ex) {
                Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bt_ingresarActionPerformed

    private void lb_ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ver1MouseClicked
        lb_ver1.setVisible(false);
        lb_ocultar1.setVisible(true);
        contraseña.setEchoChar((char) 0);
    }//GEN-LAST:event_lb_ver1MouseClicked

    private void lb_ocultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ocultar1MouseClicked
        lb_ver1.setVisible(true);
        lb_ocultar1.setVisible(false);
        contraseña.setEchoChar('●');
    }//GEN-LAST:event_lb_ocultar1MouseClicked

    private void lb_olvidocontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_olvidocontraseñaMouseClicked
        recuperar_contra m = new recuperar_contra();
        m.setVisible(true);
    }//GEN-LAST:event_lb_olvidocontraseñaMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(Registro_final.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel_DriveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DriveMouseMoved
        jLabel_Drive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_DriveMouseMoved

    private void jLabel_DriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DriveMouseExited
        jLabel_Drive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_DriveMouseExited

    private void jLabel_sociosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sociosMouseMoved
        jLabel_socios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_sociosMouseMoved

    private void jLabel_sociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sociosMouseClicked
        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_progra2.0\\src\\Documents\\Calendario.pdf");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel_sociosMouseClicked

    private void jLabel_sociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sociosMouseExited
        jLabel_socios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_sociosMouseExited

    private void jLabel_calendarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_calendarioMouseMoved
        jLabel_calendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_calendarioMouseMoved

    private void jLabel_calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_calendarioMouseClicked

        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_progra2.0\\src\\Documents\\Calendario.pdf");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel_calendarioMouseClicked

    private void jLabel_calendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_calendarioMouseExited
        jLabel_calendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_calendarioMouseExited

    private void jLabel_manteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_manteMouseMoved
        jLabel_mante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_manteMouseMoved

    private void jLabel_manteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_manteMouseExited
        jLabel_mante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_manteMouseExited

    private void jLabel_mante1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_mante1MouseMoved
        jLabel_mante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_mante1MouseMoved

    private void jLabel_mante1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_mante1MouseExited
        jLabel_mante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_mante1MouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        this.setState(Registro_final.ICONIFIED);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación?", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegistrarseMouseClicked

        try {
            guardarregistro();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_RegistrarseMouseClicked

    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed

        try {
            String rol = "";
            if (RBadmin_registro.isSelected()) {
                rol = "Administrador";
            } else if (RBestudiante_registro.isSelected()) {
                rol = "Estudiante";

                int cedu = 0, cel = 0;
                String name = "", lasName = "";

                try {

                    name = String.format(txt_nombre.getText());

                } catch (Exception q) {

                    JOptionPane.showMessageDialog(rootPane, "Su nombre puede contener caracteres incorrectos");
                }

                try {

                    cedu = Integer.parseInt(txt_numcedula.getText());

                } catch (Exception ax) {

                    JOptionPane.showMessageDialog(rootPane, "Su número de cédula consta de 9 digitos" + "\n"
                            + "Por favor digitelo sin guiones ni espacios");
                }

                try {

                    cel = Integer.parseInt(txt_celular.getText());

                } catch (Exception a) {

                    JOptionPane.showMessageDialog(rootPane, "Su número de celular contiene caracteres incorrectos" + "\n"
                            + "Por favor digitelo correctamente");
                }
            }
            
                
            Usuario m = new Usuario(txt_nombre.getText(), txt_apelli.getText(), txt_numcedula.getText(), txt_usuario.getText(), txt_contra.getText(), txt_celular.getText(), txt_email.getText(), rol, codigo_Est);
            System.out.println(rol);
            enviar_Correo m1 = new enviar_Correo(txt_email.getText());
            m1.enviarcorreo();

            JOptionPane.showMessageDialog(rootPane, "Usuario registrado exitosamente.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error en el proceso de registro.");
        }
        try {
            guardarregistro();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            guardar_contrayusuario();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registro_final.class.getName()).log(Level.SEVERE, null, ex);
        }

        texto_nombre = txt_nombre.getText();
        texto_apellidos = txt_apelli.getText();
        texto_numcedula = txt_numcedula.getText();
        texto_email = txt_email.getText();

        Random codi = new Random();

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String codigoEst = "";
        int m = 0, pos = 0, num;

        while (m < 1) {
            pos = (int) (codi.nextDouble() * abc.length() - 1 + 0);
            num = (int) (codi.nextDouble() * 9999 + 1000);
            codigoEst = codigoEst + abc.charAt(pos) + num;
            pos = (int) (codi.nextDouble() + abc.length() - 1 + 0);
            codigoEst = codigoEst + abc.charAt(pos);

            System.out.println("Codigo de estudiante" + " : " + codigoEst + "\n");
            m++;

            codigo_Est = codigoEst;
        }

        txt_nombre.setText("");
        txt_apelli.setText("");
        txt_numcedula.setText("");
        txt_usuario.setText("");
        txt_contra.setText("");
        txt_celular.setText("");
        txt_email.setText("");
    }//GEN-LAST:event_btn_RegistrarseActionPerformed

    private void rb_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_adminActionPerformed

    }//GEN-LAST:event_rb_adminActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Herramientas;
    private javax.swing.JPanel JPIngreso;
    private javax.swing.JLabel Jlabel_calculadora;
    private javax.swing.JTextField Nombre_usuario;
    private javax.swing.JRadioButton RBadmin_registro;
    private javax.swing.JRadioButton RBestudiante_registro;
    private javax.swing.JButton bt_ingresar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Drive;
    private javax.swing.JLabel jLabel_calendario;
    private javax.swing.JLabel jLabel_mante;
    private javax.swing.JLabel jLabel_mante1;
    private javax.swing.JLabel jLabel_socios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblInternet;
    private javax.swing.JLayeredPane layeredpane;
    private javax.swing.JLabel lb_ocultar1;
    private javax.swing.JLabel lb_olvidocontraseña;
    private javax.swing.JLabel lb_ver1;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_registro;
    public static javax.swing.JRadioButton rb_admin;
    public static javax.swing.JRadioButton rb_estu;
    private javax.swing.JTextField txt_apelli;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numcedula;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
