
package ventana;

import AppPackage.AnimationClass;
import clases.enviar_correocontra;
import java.awt.Desktop;
import java.io.UnsupportedEncodingException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URI;
import java.util.Date;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import static ventana.componentes.usuarios;

public class ventanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form ventanaLogin
     */
    public ventanaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        //JOptionPane.showMessageDialog(rootPane, componentes.usuarios.size());
        this.lb_ocultar1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lb_ver1 = new javax.swing.JLabel();
        lb_ocultar1 = new javax.swing.JLabel();
        lb_olvidocontraseña = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Login");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1050, 575));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton2.setBackground(new java.awt.Color(44, 47, 112));
        jButton2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JPIngreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 110, 40));

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
        JPIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 110, 40));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setText("Administrador");
        JPIngreso.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("Estudiante");
        JPIngreso.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, 20));

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

        getContentPane().add(JPIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 47, 112));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 36));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 36));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

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
        jPanel1.add(jLabel_Drive, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 130, 110));

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
        jPanel1.add(jLabel_socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 140, 130));

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
        jPanel1.add(jLabel_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 140, 130));

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
        jPanel1.add(jLabel_mante, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 130));

        jLabel13.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Acerca de la U");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 110, -1));

        jLabel14.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Carreras");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 70, -1));

        jLabel16.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Facultades, centros y sedes");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 210, -1));

        jLabel18.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Información");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 110, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logos Universidad LD/logo_small.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 30, 690, 500));

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
        jPanel1.add(jLabel_mante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 140, 130));

        jLabel17.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Calendario");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 590));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HerramientasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerramientasMouseClicked
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jlblInternet);
        internet.jLabelXLeft(10, -40, 10, 5, jlblInternet);

        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-40, 10, 10, 5, Jlabel_calculadora);
        calculadora.jLabelXLeft(10, -40, 10, 5, Jlabel_calculadora);
    }//GEN-LAST:event_HerramientasMouseClicked

    private void OpenInternet() {
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {

        }

    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(ventanaLogin.ICONIFIED);
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

    private void jLabel_manteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_manteMouseMoved
        jLabel_mante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_manteMouseMoved

    private void jLabel_manteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_manteMouseExited
        jLabel_mante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_manteMouseExited

    private void jLabel_sociosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sociosMouseMoved
        jLabel_socios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_sociosMouseMoved

    private void jLabel_sociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sociosMouseExited
        jLabel_socios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_sociosMouseExited

    private void jLabel_calendarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_calendarioMouseMoved
        jLabel_calendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_calendarioMouseMoved

    private void jLabel_calendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_calendarioMouseExited
        jLabel_calendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_calendarioMouseExited

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

    private void jLabel_calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_calendarioMouseClicked

        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_progra2.0\\src\\Documents\\Calendario.pdf");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel_calendarioMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Registro acceso = new Registro();
       acceso.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed

    }//GEN-LAST:event_contraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = Nombre_usuario.getText();
        String contra = contraseña.getText();

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

    private void jLabel_mante1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_mante1MouseMoved
         jLabel_mante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel_mante1MouseMoved

    private void jLabel_mante1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_mante1MouseExited
        jLabel_mante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel_mante1MouseExited

    private void jLabel_sociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sociosMouseClicked
         try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_progra2.0\\src\\Documents\\Calendario.pdf");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel_sociosMouseClicked

    private void lb_ver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ver1MouseClicked
        lb_ver1.setVisible(false);
        lb_ocultar1.setVisible(true);
        contraseña.setEchoChar((char)0);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Herramientas;
    private javax.swing.JPanel JPIngreso;
    private javax.swing.JLabel Jlabel_calculadora;
    private javax.swing.JTextField Nombre_usuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlblInternet;
    private javax.swing.JLabel lb_ocultar1;
    private javax.swing.JLabel lb_olvidocontraseña;
    private javax.swing.JLabel lb_ver1;
    // End of variables declaration//GEN-END:variables
}
