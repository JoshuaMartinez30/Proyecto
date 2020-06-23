package proyecto;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {
    ArrayList<Registro> usuarios = new ArrayList();
    ArrayList<Proyecto> proyectos = new ArrayList();
    ArrayList<Tarea> tareas = new ArrayList();
    String email, contraseña;
    int posicion;
    AdminUsuarios usuario = new AdminUsuarios("./usuarios.txt");
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ImageIcon icon = new ImageIcon("C:\\Users\\joshu\\OneDrive\\Documentos\\Progra 2\\Tareas\\Proyecto\\Iconos\\todoist5.png");
        this.setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_Login = new javax.swing.JDialog();
        jSeparator3 = new javax.swing.JSeparator();
        tb_IniciarS = new javax.swing.JToggleButton();
        pf_ContraI = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        tf_EmailI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        JD_Registro = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_EmailR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tb_Registrar = new javax.swing.JToggleButton();
        pf_contraR = new javax.swing.JPasswordField();
        cbodireccion = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        JD_Nuevo = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jd_Fecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Comentario = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        JD_Modificar = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Modificar = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tf_NuevoNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jd_NuevaFecha = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta_NuevoComentario = new javax.swing.JTextArea();
        btnModificar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        JD_Eliminar = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_Eliminar = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        JD_Listar = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_Listar = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        JD_NuevaTarea = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_NombreTarea = new javax.swing.JTextField();
        jd_FechaTarea = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jta_ComentarioTarea = new javax.swing.JTextArea();
        btnAgregarTarea = new javax.swing.JButton();
        cboProyectos = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        JD_ModificarUsuario = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        tf_EmailNuevo = new javax.swing.JTextField();
        cbodireccionnuevo = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        pf_contraNuevo = new javax.swing.JPasswordField();
        tb_Modificar = new javax.swing.JToggleButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pf_contraAntigua = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Inicio = new javax.swing.JMenu();
        jmi_Login = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmi_Logout = new javax.swing.JMenuItem();
        jm_NuevoProyecto = new javax.swing.JMenu();
        jmi_NuevoProyecto = new javax.swing.JMenuItem();
        jmi_NuevaTarea = new javax.swing.JMenuItem();
        jm_AdminProyecto = new javax.swing.JMenu();
        jmi_Modificar = new javax.swing.JMenuItem();
        jmi_EliminarProyecto = new javax.swing.JMenuItem();
        jmi_ListarProyecto = new javax.swing.JMenuItem();
        jm_Configurar = new javax.swing.JMenu();
        jmi_ModificarCuenta = new javax.swing.JMenuItem();
        jmi_EliminarCuenta = new javax.swing.JMenuItem();
        jmi_Salir = new javax.swing.JMenuItem();

        tb_IniciarS.setBackground(new java.awt.Color(219, 76, 63));
        tb_IniciarS.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tb_IniciarS.setForeground(new java.awt.Color(255, 255, 255));
        tb_IniciarS.setSelected(true);
        tb_IniciarS.setText("Iniciar Sesion");
        tb_IniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb_IniciarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_IniciarSMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña");

        tf_EmailI.setFocusCycleRoot(true);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Iniciar Sesion");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("¿No tienes Cuenta?");

        lblRegistrarse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(255, 0, 0));
        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.setOpaque(true);
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Todoist-lockup_positive2.png"))); // NOI18N

        javax.swing.GroupLayout JD_LoginLayout = new javax.swing.GroupLayout(JD_Login.getContentPane());
        JD_Login.getContentPane().setLayout(JD_LoginLayout);
        JD_LoginLayout.setHorizontalGroup(
            JD_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(JD_LoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JD_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JD_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_LoginLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(lblRegistrarse)
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(JD_LoginLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JD_LoginLayout.createSequentialGroup()
                        .addGroup(JD_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JD_LoginLayout.createSequentialGroup()
                                .addGroup(JD_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tb_IniciarS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pf_ContraI)
                            .addComponent(tf_EmailI, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        JD_LoginLayout.setVerticalGroup(
            JD_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_EmailI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pf_ContraI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tb_IniciarS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblRegistrarse))
                .addGap(52, 52, 52))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrarse");

        jLabel2.setText("¿Ya te Registraste?");

        lblLogin.setBackground(new java.awt.Color(255, 0, 0));
        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblLogin.setText("Iniciar sesion ");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        tf_EmailR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_EmailRKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        tb_Registrar.setBackground(new java.awt.Color(219, 76, 63));
        tb_Registrar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tb_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        tb_Registrar.setSelected(true);
        tb_Registrar.setText("Registrarse");
        tb_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_RegistrarMouseClicked(evt);
            }
        });

        cbodireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@unitec.edu", "@hotmail.com" }));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Todoist-lockup_positive2.png"))); // NOI18N

        javax.swing.GroupLayout JD_RegistroLayout = new javax.swing.GroupLayout(JD_Registro.getContentPane());
        JD_Registro.getContentPane().setLayout(JD_RegistroLayout);
        JD_RegistroLayout.setHorizontalGroup(
            JD_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(JD_RegistroLayout.createSequentialGroup()
                .addGroup(JD_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_RegistroLayout.createSequentialGroup()
                        .addGroup(JD_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JD_RegistroLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblLogin))
                            .addGroup(JD_RegistroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(JD_RegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JD_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_EmailR)
                            .addComponent(tb_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pf_contraR)
                            .addGroup(JD_RegistroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbodireccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(JD_RegistroLayout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JD_RegistroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JD_RegistroLayout.setVerticalGroup(
            JD_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_EmailR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pf_contraR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tb_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JD_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblLogin))
                .addGap(49, 49, 49))
        );

        JD_Nuevo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        JD_Nuevo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));
        JD_Nuevo.getContentPane().add(tf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, 390, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        JD_Nuevo.getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 348, 83, 34));
        JD_Nuevo.getContentPane().add(jd_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 390, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Fecha");
        JD_Nuevo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Comentario");
        JD_Nuevo.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, -1, -1));

        jta_Comentario.setColumns(20);
        jta_Comentario.setRows(5);
        jScrollPane1.setViewportView(jta_Comentario);

        JD_Nuevo.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, 390, 109));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Nuevo Proyecto");
        JD_Nuevo.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 26, -1, -1));
        JD_Nuevo.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 380));

        jt_Modificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Comentario"
            }
        ));
        jt_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ModificarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_Modificar);

        jLabel9.setText("Nombre");

        jLabel14.setText("Fecha");

        jLabel15.setText("Comentario");

        jta_NuevoComentario.setColumns(20);
        jta_NuevoComentario.setRows(5);
        jScrollPane3.setViewportView(jta_NuevoComentario);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Modificar Proyecto");

        javax.swing.GroupLayout JD_ModificarLayout = new javax.swing.GroupLayout(JD_Modificar.getContentPane());
        JD_Modificar.getContentPane().setLayout(JD_ModificarLayout);
        JD_ModificarLayout.setHorizontalGroup(
            JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(190, 190, 190))
            .addGroup(JD_ModificarLayout.createSequentialGroup()
                .addGroup(JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_ModificarLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_ModificarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JD_ModificarLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tf_NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jd_NuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JD_ModificarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JD_ModificarLayout.setVerticalGroup(
            JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ModificarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addGap(26, 26, 26)
                .addGroup(JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel14))
                    .addComponent(jd_NuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jt_Eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jt_Eliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Comentario"
            }
        ));
        jScrollPane4.setViewportView(jt_Eliminar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_EliminarLayout = new javax.swing.GroupLayout(JD_Eliminar.getContentPane());
        JD_Eliminar.getContentPane().setLayout(JD_EliminarLayout);
        JD_EliminarLayout.setHorizontalGroup(
            JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EliminarLayout.createSequentialGroup()
                .addGroup(JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_EliminarLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_EliminarLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        JD_EliminarLayout.setVerticalGroup(
            JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EliminarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jt_Listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Comentario"
            }
        ));
        jScrollPane5.setViewportView(jt_Listar);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setText("Listar");

        javax.swing.GroupLayout JD_ListarLayout = new javax.swing.GroupLayout(JD_Listar.getContentPane());
        JD_Listar.getContentPane().setLayout(JD_ListarLayout);
        JD_ListarLayout.setHorizontalGroup(
            JD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ListarLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(JD_ListarLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JD_ListarLayout.setVerticalGroup(
            JD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ListarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Nueva Tarea");

        jLabel18.setText("Nombre");

        jLabel19.setText("Fecha");

        jLabel20.setText("Comentario");

        jta_ComentarioTarea.setColumns(20);
        jta_ComentarioTarea.setRows(5);
        jScrollPane6.setViewportView(jta_ComentarioTarea);

        btnAgregarTarea.setText("Agregar");
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });

        jLabel22.setText("Proyecto");

        javax.swing.GroupLayout JD_NuevaTareaLayout = new javax.swing.GroupLayout(JD_NuevaTarea.getContentPane());
        JD_NuevaTarea.getContentPane().setLayout(JD_NuevaTareaLayout);
        JD_NuevaTareaLayout.setHorizontalGroup(
            JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_NuevaTareaLayout.createSequentialGroup()
                .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_NuevaTareaLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_NuevaTareaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addGap(47, 47, 47)
                        .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6)
                            .addComponent(jd_FechaTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_NombreTarea)
                            .addComponent(cboProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_NuevaTareaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(222, 222, 222))
        );
        JD_NuevaTareaLayout.setVerticalGroup(
            JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_NuevaTareaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addGap(51, 51, 51)
                .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_NombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jd_FechaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(JD_NuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(45, 45, 45)
                .addComponent(btnAgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Email");

        tf_EmailNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_EmailNuevoKeyTyped(evt);
            }
        });

        cbodireccionnuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@unitec.edu", "@hotmail.com" }));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Nueva Contraseña");

        tb_Modificar.setBackground(new java.awt.Color(219, 76, 63));
        tb_Modificar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tb_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        tb_Modificar.setSelected(true);
        tb_Modificar.setText("Modificar");
        tb_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_ModificarActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setText("Modificar Cuenta");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setText("Contraseña antigua");

        javax.swing.GroupLayout JD_ModificarUsuarioLayout = new javax.swing.GroupLayout(JD_ModificarUsuario.getContentPane());
        JD_ModificarUsuario.getContentPane().setLayout(JD_ModificarUsuarioLayout);
        JD_ModificarUsuarioLayout.setHorizontalGroup(
            JD_ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarUsuarioLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JD_ModificarUsuarioLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(JD_ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tb_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_EmailNuevo)
                    .addComponent(cbodireccionnuevo, 0, 447, Short.MAX_VALUE)
                    .addComponent(pf_contraNuevo)
                    .addGroup(JD_ModificarUsuarioLayout.createSequentialGroup()
                        .addGroup(JD_ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pf_contraAntigua))
                .addContainerGap())
        );
        JD_ModificarUsuarioLayout.setVerticalGroup(
            JD_ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_ModificarUsuarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_EmailNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbodireccionnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pf_contraAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pf_contraNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tb_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todoist");

        jm_Inicio.setText("Inicio");

        jmi_Login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmi_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Login5.0.png"))); // NOI18N
        jmi_Login.setText("Login");
        jmi_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_LoginActionPerformed(evt);
            }
        });
        jm_Inicio.add(jmi_Login);
        jm_Inicio.add(jSeparator2);

        jmi_Logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jmi_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/log out inicio1.jpg"))); // NOI18N
        jmi_Logout.setText("Log out");
        jmi_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_LogoutActionPerformed(evt);
            }
        });
        jm_Inicio.add(jmi_Logout);

        jMenuBar1.add(jm_Inicio);

        jm_NuevoProyecto.setText("Proyecto");
        jm_NuevoProyecto.setEnabled(false);

        jmi_NuevoProyecto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmi_NuevoProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo1.jpg"))); // NOI18N
        jmi_NuevoProyecto.setText("Nuevo Proyecto");
        jmi_NuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_NuevoProyectoActionPerformed(evt);
            }
        });
        jm_NuevoProyecto.add(jmi_NuevoProyecto);

        jmi_NuevaTarea.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jmi_NuevaTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nueva tarea1.png"))); // NOI18N
        jmi_NuevaTarea.setText("Nueva Tarea");
        jmi_NuevaTarea.setEnabled(false);
        jmi_NuevaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_NuevaTareaActionPerformed(evt);
            }
        });
        jm_NuevoProyecto.add(jmi_NuevaTarea);

        jm_AdminProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/admin1.png"))); // NOI18N
        jm_AdminProyecto.setText("Administrar Proyecto");

        jmi_Modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/modificar1.png"))); // NOI18N
        jmi_Modificar.setText("Modificar");
        jmi_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ModificarActionPerformed(evt);
            }
        });
        jm_AdminProyecto.add(jmi_Modificar);

        jmi_EliminarProyecto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmi_EliminarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar1.png"))); // NOI18N
        jmi_EliminarProyecto.setText("Eliminar");
        jmi_EliminarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EliminarProyectoActionPerformed(evt);
            }
        });
        jm_AdminProyecto.add(jmi_EliminarProyecto);

        jmi_ListarProyecto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmi_ListarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Listar1.png"))); // NOI18N
        jmi_ListarProyecto.setText("Listar");
        jmi_ListarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ListarProyectoActionPerformed(evt);
            }
        });
        jm_AdminProyecto.add(jmi_ListarProyecto);

        jm_NuevoProyecto.add(jm_AdminProyecto);

        jm_Configurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Configuracion1.png"))); // NOI18N
        jm_Configurar.setText("Configuracion");

        jmi_ModificarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/modificar1.png"))); // NOI18N
        jmi_ModificarCuenta.setText("Modificar cuenta");
        jmi_ModificarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ModificarCuentaActionPerformed(evt);
            }
        });
        jm_Configurar.add(jmi_ModificarCuenta);

        jmi_EliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar1.png"))); // NOI18N
        jmi_EliminarCuenta.setText("Eliminar Cuenta");
        jmi_EliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EliminarCuentaActionPerformed(evt);
            }
        });
        jm_Configurar.add(jmi_EliminarCuenta);

        jm_NuevoProyecto.add(jm_Configurar);

        jmi_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/log out.png"))); // NOI18N
        jmi_Salir.setText("Cerrar Sesion");
        jmi_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SalirActionPerformed(evt);
            }
        });
        jm_NuevoProyecto.add(jmi_Salir);

        jMenuBar1.add(jm_NuevoProyecto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // Regresar al login
        JD_Login.setModal(true);
        JD_Login.pack();
        JD_Login.setLocationRelativeTo(null);
        JD_Login.setVisible(true);
        JD_Registro.setVisible(false);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void tb_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_RegistrarMouseClicked
        String emailR, contraseñaR, aux;
        if (tf_EmailR.getText().isEmpty() || pf_contraR.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_Registro, "Por favor, LLene los campos vacios");
        } else {
            try {
                usuario.cargarArchivo();
                aux = tf_EmailR.getText();
                contraseñaR = pf_contraR.getText();
                emailR = aux + cbodireccion.getSelectedItem();
                Registro r = new Registro(emailR, contraseñaR);
                usuario.getListaPersonas().add(r);
                usuario.escribirArchivo();
                JOptionPane.showMessageDialog(JD_Registro, "Guardado exitosamente");
                cbodireccion.setSelectedIndex(0);
                tf_EmailR.setText("");
                pf_contraR.setText("");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(JD_Registro, "Ocurrio un error no se guardaron los datos");
            }
        }
    }//GEN-LAST:event_tb_RegistrarMouseClicked

    private void tb_IniciarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_IniciarSMouseClicked
        if (tf_EmailI.getText().isEmpty() || pf_ContraI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_Registro, "Por favor, LLene los campos vacios");
        } else {
            String email, contraseña;
            int cont = 0;
            email = tf_EmailI.getText();
            contraseña = pf_ContraI.getText();
            try {
                usuario.cargarArchivo();
                for (int i = 0; i < usuario.getListaPersonas().size(); i++) {
                    if (usuario.getListaPersonas().get(i).getEmail().equalsIgnoreCase(email) && usuario.getListaPersonas().get(i).getContraseña().equalsIgnoreCase(contraseña) ){
                        posicion = i;
                        JD_Login.setVisible(false);
                        jm_NuevoProyecto.setEnabled(true);
                        jmi_Login.setEnabled(false);
                        tf_EmailI.setText("");
                        pf_ContraI.setText("");
                        cont = 1;
                        i = usuario.getListaPersonas().size();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(JD_Login, "Email o contraseña incorrectos");
            }
        }
    }//GEN-LAST:event_tb_IniciarSMouseClicked

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        JD_Registro.setModal(true);
        JD_Registro.pack();
        JD_Registro.setLocationRelativeTo(null);
        JD_Registro.setVisible(true);
        tf_EmailI.setText("");
        pf_ContraI.setText("");
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void jmi_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_LoginActionPerformed
        // TODO add your handling code here:
        JD_Login.setModal(true);
        JD_Login.pack();
        JD_Login.setLocationRelativeTo(null);
        JD_Login.setVisible(true);
    }//GEN-LAST:event_jmi_LoginActionPerformed

    private void jmi_NuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_NuevoProyectoActionPerformed
        // TODO add your handling code here:
        JD_Nuevo.setModal(true);
        JD_Nuevo.pack();
        JD_Nuevo.setLocationRelativeTo(null);
        JD_Nuevo.setVisible(true);
    }//GEN-LAST:event_jmi_NuevoProyectoActionPerformed

    private void jmi_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ModificarActionPerformed
        // TODO add your handling code here:
        JD_Modificar.setModal(true);
        JD_Modificar.pack();
        JD_Modificar.setLocationRelativeTo(null);
        JD_Modificar.setVisible(true);
    }//GEN-LAST:event_jmi_ModificarActionPerformed

    private void jmi_EliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EliminarProyectoActionPerformed
        // TODO add your handling code here:
        JD_Eliminar.setModal(true);
        JD_Eliminar.pack();
        JD_Eliminar.setLocationRelativeTo(null);
        JD_Eliminar.setVisible(true);
    }//GEN-LAST:event_jmi_EliminarProyectoActionPerformed

    private void jmi_ListarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ListarProyectoActionPerformed
        // TODO add your handling code here:
        JD_Listar.setModal(true);
        JD_Listar.pack();
        JD_Listar.setLocationRelativeTo(null);
        JD_Listar.setVisible(true);
    }//GEN-LAST:event_jmi_ListarProyectoActionPerformed

    private void jmi_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SalirActionPerformed
        // TODO add your handling code here:
        jm_NuevoProyecto.setEnabled(false);
        jmi_Login.setEnabled(true);

        jt_Eliminar.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Fecha", "Comentario"
                }
        ));

        jt_Modificar.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Fecha", "Comentario"
                }
        ));

        jt_Listar.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Fecha", "Comentario"
                }
        ));
    }//GEN-LAST:event_jmi_SalirActionPerformed

    private void jmi_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_LogoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmi_LogoutActionPerformed

    private void tf_EmailRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_EmailRKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 47
                || evt.getKeyChar() >= 58 && evt.getKeyChar() <= 64
                || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 95
                || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 126) {
            evt.consume();
            JOptionPane.showMessageDialog(JD_Registro, "No se permite este caracter");
        }
    }//GEN-LAST:event_tf_EmailRKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (tf_Nombre.getText().isEmpty() || jta_Comentario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_Registro, "Por favor, LLene los campos vacios");
        } else {
            try {
                archivo = new File("./Proyectos.txt");
                fw = new FileWriter(archivo,true);
                bw = new BufferedWriter(fw);
                String nombre1, comentario1;
                Date Fecha1;
                usuario.cargarArchivo();
                nombre1 = tf_Nombre.getText();
                Fecha1 = jd_Fecha.getDate();
                comentario1 = jta_Comentario.getText();
                DefaultComboBoxModel model = (DefaultComboBoxModel) cboProyectos.getModel();
                Proyecto p = new Proyecto(usuario.getListaPersonas().get(posicion).getEmail(), nombre1, Fecha1, comentario1);
                bw.append(usuario.getListaPersonas().get(posicion).getEmail()+ ";");
                bw.append(nombre1+";");
                bw.append(Fecha1+";");
                bw.append(comentario1+"\n");
                bw.flush();
                proyectos.add(p);
                System.out.println("Proyectos: "+ usuario.getListaPersonas().get(posicion).getProyecto());
                model.addElement(p);
                cboProyectos.setModel(model);
                tf_Nombre.setText("");
                jd_Fecha.setDate(new Date());
                jta_Comentario.setText("");
                jmi_NuevaTarea.setEnabled(true);
                JOptionPane.showMessageDialog(JD_Nuevo, "Se creo correctamente");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(JD_Nuevo, "Error, No se creo correctamente");
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        mostrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String nombre2, comentario2;
        Date Fecha2;
        if (tf_NombreTarea.getText().isEmpty() || jta_ComentarioTarea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_Registro, "Por favor, LLene los campos vacios");
        } else {
            try {
                archivo = new File("./Tareas.txt");
                fw = new FileWriter(archivo,true);
                bw = new BufferedWriter(fw);
                usuario.cargarArchivo();
                nombre2 = tf_NombreTarea.getText();
                Fecha2 = jd_FechaTarea.getDate();
                comentario2 = jta_ComentarioTarea.getText();
                Tarea t = new Tarea(usuario.getListaPersonas().get(posicion).getEmail(), cboProyectos.getSelectedItem().toString(), nombre2, Fecha2, comentario2);
                tareas.add(t);
                bw.append(usuario.getListaPersonas().get(posicion).getEmail()+";");
                bw.append(cboProyectos.getSelectedItem().toString()+";");
                bw.append(nombre2+";");
                bw.append(Fecha2+";");
                bw.append(comentario2+"\n");
                bw.flush();
                tf_NombreTarea.setText("");
                jd_FechaTarea.setDate(new Date());
                jta_ComentarioTarea.setText("");
                JOptionPane.showMessageDialog(JD_Nuevo, "Se creo correctamente");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(JD_Nuevo, "Error, No se creo correctamente");
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgregarTareaActionPerformed

    private void jmi_NuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_NuevaTareaActionPerformed
        // TODO add your handling code here:
        JD_NuevaTarea.setModal(true);
        JD_NuevaTarea.pack();
        JD_NuevaTarea.setLocationRelativeTo(null);
        JD_NuevaTarea.setVisible(true);
    }//GEN-LAST:event_jmi_NuevaTareaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int i = jt_Modificar.getSelectedRow();
        usuario.cargarArchivo();
        usuario.getListaPersonas().get(posicion).getProyecto().get(i).setNombre(tf_NuevoNombre.getText());
        usuario.getListaPersonas().get(posicion).getProyecto().get(i).setFecha(jd_NuevaFecha.getDate());
        usuario.getListaPersonas().get(posicion).getProyecto().get(i).setComentario(jta_NuevoComentario.getText());
        tf_NuevoNombre.setText("");
        jd_NuevaFecha.setDate(new Date());
        jta_NuevoComentario.setText("");
        mostrar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        usuario.cargarArchivo();
        for (int i = 0; i < usuario.getListaPersonas().get(posicion).getProyecto().size(); i++) {
            usuario.getListaPersonas().get(posicion).getProyecto().remove(i);
        }
        JOptionPane.showMessageDialog(JD_Eliminar, "Eliminado correctamente");
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jt_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ModificarMouseClicked
        usuario.cargarArchivo();
        int seleccion = jt_Modificar.getSelectedRow();
        tf_NuevoNombre.setText(jt_Modificar.getValueAt(seleccion, 0).toString());
        jd_NuevaFecha.setDate(usuario.getListaPersonas().get(posicion).getProyecto().get(seleccion).getFecha());
        jta_NuevoComentario.setText(jt_Modificar.getValueAt(seleccion, 2).toString());
    }//GEN-LAST:event_jt_ModificarMouseClicked

    private void jmi_ModificarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ModificarCuentaActionPerformed
        JD_ModificarUsuario.setModal(true);
        JD_ModificarUsuario.pack();
        JD_ModificarUsuario.setLocationRelativeTo(null);
        JD_ModificarUsuario.setVisible(true);
    }//GEN-LAST:event_jmi_ModificarCuentaActionPerformed

    private void tf_EmailNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_EmailNuevoKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 47
                || evt.getKeyChar() >= 58 && evt.getKeyChar() <= 64
                || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 95
                || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 126) {
            evt.consume();
            JOptionPane.showMessageDialog(JD_Registro, "No se permite este caracter");
        }
    }//GEN-LAST:event_tf_EmailNuevoKeyTyped

    private void tb_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_ModificarActionPerformed
        usuario.cargarArchivo();
        String aux, email, contraseña;
        if (usuario.getListaPersonas().get(posicion).getContraseña().equalsIgnoreCase(pf_contraAntigua.getText())) {
            try {
                aux = tf_EmailNuevo.getText();
                email = aux + cbodireccionnuevo.getSelectedItem();
                contraseña = pf_contraNuevo.getText();
                usuario.getListaPersonas().get(posicion).setEmail(email);
                usuario.getListaPersonas().get(posicion).setContraseña(contraseña);
                usuario.escribirArchivo();
                JOptionPane.showMessageDialog(JD_ModificarUsuario, "Usuario Modificado exitosamente");
                tf_EmailNuevo.setText("");
                pf_contraAntigua.setText("");
                pf_contraNuevo.setText("");
                cbodireccionnuevo.setSelectedIndex(0);
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(JD_ModificarUsuario, "Contraseña antigua incorrecta");
        }
    }//GEN-LAST:event_tb_ModificarActionPerformed

    private void jmi_EliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EliminarCuentaActionPerformed
        String confirmar, aux = "CONFIRMAR";
        confirmar = JOptionPane.showInputDialog("Ingrese (CONFIRMAR) si desea Eliminar esta cuenta");
        if (aux.equals(confirmar)) {
            try {
                email = tf_EmailNuevo.getText();
                contraseña = pf_contraNuevo.getText();
                usuario.cargarArchivo();
                usuario.getListaPersonas().remove(posicion);
                usuario.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            jm_NuevoProyecto.setEnabled(false);
            jmi_Login.setEnabled(true);
            
            jt_Eliminar.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre", "Fecha", "Comentario"
                    }
            ));

            jt_Modificar.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre", "Fecha", "Comentario"
                    }
            ));

            jt_Listar.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre", "Fecha", "Comentario"
                    }
            ));
        }
    }//GEN-LAST:event_jmi_EliminarCuentaActionPerformed

    public void mostrar() {
        usuario.cargarArchivo();
        for (int i = 0; i < proyectos.size(); i++) {
            usuario.getListaPersonas().get(posicion).getProyecto().add(proyectos.get(i));
        }
        DefaultTableModel model = (DefaultTableModel) jt_Modificar.getModel();
        System.out.println("Proyectos: "+ usuario.getListaPersonas().get(posicion).getProyecto());
        
        Object Matriz[][] = new String[usuario.getListaPersonas().get(posicion).getProyecto().size()][4];
        for (int i = 0; i < usuario.getListaPersonas().get(posicion).getProyecto().size(); i++) {
            Matriz[i][0] = usuario.getListaPersonas().get(posicion).getProyecto().get(i).getNombre();
            Matriz[i][1] = usuario.getListaPersonas().get(posicion).getProyecto().get(i).getFecha().toString();
            Matriz[i][2] = usuario.getListaPersonas().get(posicion).getProyecto().get(i).getComentario();
        }
        jt_Listar.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "Fecha", "Comentario"
                }
        ));
        jt_Eliminar.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "Fecha", "Comentario"
                }
        ));

        jt_Modificar.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "Fecha", "Comentario"
                }
        ));
    }

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_Eliminar;
    private javax.swing.JDialog JD_Listar;
    private javax.swing.JDialog JD_Login;
    private javax.swing.JDialog JD_Modificar;
    private javax.swing.JDialog JD_ModificarUsuario;
    private javax.swing.JDialog JD_NuevaTarea;
    private javax.swing.JDialog JD_Nuevo;
    private javax.swing.JDialog JD_Registro;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboProyectos;
    private javax.swing.JComboBox<String> cbodireccion;
    private javax.swing.JComboBox<String> cbodireccionnuevo;
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
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jd_Fecha;
    private com.toedter.calendar.JDateChooser jd_FechaTarea;
    private com.toedter.calendar.JDateChooser jd_NuevaFecha;
    private javax.swing.JMenu jm_AdminProyecto;
    private javax.swing.JMenu jm_Configurar;
    private javax.swing.JMenu jm_Inicio;
    private javax.swing.JMenu jm_NuevoProyecto;
    private javax.swing.JMenuItem jmi_EliminarCuenta;
    private javax.swing.JMenuItem jmi_EliminarProyecto;
    private javax.swing.JMenuItem jmi_ListarProyecto;
    private javax.swing.JMenuItem jmi_Login;
    private javax.swing.JMenuItem jmi_Logout;
    private javax.swing.JMenuItem jmi_Modificar;
    private javax.swing.JMenuItem jmi_ModificarCuenta;
    private javax.swing.JMenuItem jmi_NuevaTarea;
    private javax.swing.JMenuItem jmi_NuevoProyecto;
    private javax.swing.JMenuItem jmi_Salir;
    private javax.swing.JTable jt_Eliminar;
    private javax.swing.JTable jt_Listar;
    private javax.swing.JTable jt_Modificar;
    private javax.swing.JTextArea jta_Comentario;
    private javax.swing.JTextArea jta_ComentarioTarea;
    private javax.swing.JTextArea jta_NuevoComentario;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JPasswordField pf_ContraI;
    private javax.swing.JPasswordField pf_contraAntigua;
    private javax.swing.JPasswordField pf_contraNuevo;
    private javax.swing.JPasswordField pf_contraR;
    private javax.swing.JToggleButton tb_IniciarS;
    private javax.swing.JToggleButton tb_Modificar;
    private javax.swing.JToggleButton tb_Registrar;
    private javax.swing.JTextField tf_EmailI;
    private javax.swing.JTextField tf_EmailNuevo;
    private javax.swing.JTextField tf_EmailR;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_NombreTarea;
    private javax.swing.JTextField tf_NuevoNombre;
    // End of variables declaration//GEN-END:variables
}