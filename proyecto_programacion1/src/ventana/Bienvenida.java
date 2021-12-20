
package ventana;

import clases.Reportes;
import AppPackage.AnimationClass;
import clases.reporte_Estudiantes;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ventana.componentes.usuarios;


public class Bienvenida extends javax.swing.JFrame {
    

    public Bienvenida() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        Registro_final m = new Registro_final();
        label_nombre.setText(m.texto_nombre);
        lb_apelli.setText(m.texto_apellidos);
        lb_cedula.setText(m.texto_numcedula);
        lb_email.setText(m.texto_email);
        lb_codigoestudiantil.setText(m.codigo_Est);
        
        if(componentes.rol == "Administrador"){
            label_estudiante.setVisible(false);
            lb_codigoestudiantil.setVisible(false);
            bt_carreras.setVisible(true);
            bt_estudiantes.setVisible(true);
        }else{
            label_estudiante.setVisible(true);
            lb_codigoestudiantil.setVisible(true);
            bt_carreras.setVisible(false);
            bt_estudiantes.setVisible(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        JPIngreso = new javax.swing.JPanel();
        Herramientas = new javax.swing.JLabel();
        jlblInternet = new javax.swing.JLabel();
        Jlabel_calculadora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_codigoestudiantil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_apelli = new javax.swing.JLabel();
        lb_apellidos = new javax.swing.JLabel();
        lb_cedula = new javax.swing.JLabel();
        label_estudiante = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JPIngreso1 = new javax.swing.JPanel();
        Herramientas1 = new javax.swing.JLabel();
        jlblInternet1 = new javax.swing.JLabel();
        Jlabel_calculadora1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        BtnEditar1 = new javax.swing.JButton();
        bt_carreras = new javax.swing.JButton();
        login1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bt_estudiantes = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lb_cursosmtriculados = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 242, 134));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 36));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 36));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(44, 47, 112));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 36));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 36));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 40));

        JPIngreso.setBackground(new java.awt.Color(255, 255, 255));
        JPIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        JPIngreso.setForeground(new java.awt.Color(255, 255, 255));
        JPIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        JPIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 140, 80));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Información Personal");
        JPIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

        lb_codigoestudiantil.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso.add(lb_codigoestudiantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 250, 20));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Número Cédula:");
        JPIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lb_apelli.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso.add(lb_apelli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 20));

        lb_apellidos.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lb_apellidos.setForeground(new java.awt.Color(51, 51, 51));
        lb_apellidos.setText("Apellidos:");
        JPIngreso.add(lb_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lb_cedula.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso.add(lb_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 20));

        label_estudiante.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        label_estudiante.setForeground(new java.awt.Color(51, 51, 51));
        label_estudiante.setText("Código Estudiantil:");
        JPIngreso.add(label_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        lb_email.setForeground(new java.awt.Color(153, 153, 153));
        JPIngreso.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 250, 20));

        jLabel12.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("E-mail:");
        JPIngreso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nombre:");
        JPIngreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        label_nombre.setForeground(new java.awt.Color(153, 153, 153));
        label_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                label_nombreKeyReleased(evt);
            }
        });
        JPIngreso.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 20));

        jPanel2.add(JPIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 590));

        login.setBackground(new java.awt.Color(44, 47, 112));
        login.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Cerrar Sesión");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

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
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 36));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, 36));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 40));

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

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Información Personal");
        JPIngreso1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

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

        BtnEditar1.setBackground(new java.awt.Color(44, 47, 112));
        BtnEditar1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BtnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar1.setText("Editar");
        BtnEditar1.setBorder(null);
        JPIngreso1.add(BtnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 538, 100, 30));

        jPanel5.add(JPIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 590));

        bt_carreras.setBackground(new java.awt.Color(44, 47, 112));
        bt_carreras.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        bt_carreras.setForeground(new java.awt.Color(255, 255, 255));
        bt_carreras.setText("Editar carreras");
        bt_carreras.setBorder(null);
        bt_carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_carrerasActionPerformed(evt);
            }
        });
        jPanel5.add(bt_carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 130, 30));

        login1.setBackground(new java.awt.Color(44, 47, 112));
        login1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        login1.setForeground(new java.awt.Color(255, 255, 255));
        login1.setText("Cerrar Sesión");
        login1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        jPanel5.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logos Universidad LD/Matricular.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ver cursos");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, -1));

        jLabel16.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Editar informacion personal");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        jLabel5.setBackground(new java.awt.Color(238, 112, 87));
        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cursos Matriculados");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 160, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logos Universidad LD/Ver cursos.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logos Universidad LD/Editar info.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        bt_estudiantes.setBackground(new java.awt.Color(44, 47, 112));
        bt_estudiantes.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        bt_estudiantes.setForeground(new java.awt.Color(255, 255, 255));
        bt_estudiantes.setText("Personas Registradas");
        bt_estudiantes.setBorder(null);
        bt_estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_estudiantesActionPerformed(evt);
            }
        });
        jPanel5.add(bt_estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 160, 30));

        jLabel18.setBackground(new java.awt.Color(238, 112, 87));
        jLabel18.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Automatrícula");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 110, 30));

        lb_cursosmtriculados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cursosmtriculadosMouseClicked(evt);
            }
        });
        jPanel5.add(lb_cursosmtriculados, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 150, 110));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void OpenInternet() {
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {

        }

    }
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setState(Registro_final.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir de la aplicación?","Salir", dialog);
        if (result == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void Jlabel_calculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_calculadoraMouseClicked
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_Jlabel_calculadoraMouseClicked

    private void jlblInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInternetMouseClicked
        OpenInternet();
    }//GEN-LAST:event_jlblInternetMouseClicked

    private void HerramientasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerramientasMouseClicked
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jlblInternet);
        internet.jLabelXLeft(10, -40, 10, 5, jlblInternet);

        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-40, 10, 10, 5, Jlabel_calculadora);
        calculadora.jLabelXLeft(10, -40, 10, 5, Jlabel_calculadora);
    }//GEN-LAST:event_HerramientasMouseClicked

    private void label_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_label_nombreKeyReleased


    }//GEN-LAST:event_label_nombreKeyReleased

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Registro_final m = null;
        m = new Registro_final();
        m.setVisible(true);
        m.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Registro_final m = null;
        m = new Registro_final();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
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

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login1ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Ventana_matricula m = new Ventana_matricula();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void bt_estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_estudiantesActionPerformed
        reporte_Estudiantes m = new reporte_Estudiantes(new Date().toString(),"C:\\Users\\Luis Miguel\\OneDrive\\Documentos\\NetBeansProjects\\proyecto_progragit\\Proyecto_progra\\proyecto_progra2.0\\src\\Image\\UNIVERSIDAD.jpeg",usuarios);
        m.CrearReporte_estu();
    }//GEN-LAST:event_bt_estudiantesActionPerformed

    private void bt_carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_carrerasActionPerformed
        Añadir_carreras m = null;
        try {
            m = new Añadir_carreras();
        } catch (IOException ex) {
            Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_carrerasActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Ver_cursos m = new Ver_cursos();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Editar_info m = new Editar_info();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
     Ventana_matricula m = new Ventana_matricula();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Editar_info m = new Editar_info();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Ver_cursos m = new Ver_cursos();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ventana_vercursosmatriculados m = new ventana_vercursosmatriculados();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void lb_cursosmtriculadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cursosmtriculadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_cursosmtriculadosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bienvenida().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar1;
    private javax.swing.JLabel Herramientas;
    private javax.swing.JLabel Herramientas1;
    private javax.swing.JPanel JPIngreso;
    private javax.swing.JPanel JPIngreso1;
    private javax.swing.JLabel Jlabel_calculadora;
    private javax.swing.JLabel Jlabel_calculadora1;
    private javax.swing.JButton bt_carreras;
    private javax.swing.JButton bt_estudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlblInternet;
    private javax.swing.JLabel jlblInternet1;
    private javax.swing.JLabel label_estudiante;
    private javax.swing.JLabel label_estudiante1;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nombre1;
    private javax.swing.JLabel lb_apelli;
    private javax.swing.JLabel lb_apelli1;
    private javax.swing.JLabel lb_apellidos;
    private javax.swing.JLabel lb_apellidos1;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_cedula1;
    private javax.swing.JLabel lb_codigo1;
    private javax.swing.JLabel lb_codigoestudiantil;
    private javax.swing.JLabel lb_cursosmtriculados;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_email1;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    // End of variables declaration//GEN-END:variables
}
