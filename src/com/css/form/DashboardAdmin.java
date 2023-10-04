package com.css.form;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DashboardAdmin extends javax.swing.JFrame {

    public DashboardAdmin() {
        initComponents();
        this.setTitle("Admin Dashboard");
        ImageIcon img = new ImageIcon("src/com/css/media/logo.png");
        this.setIconImage(img.getImage());
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "Do you really want to exit?",
                        "Close", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (x == JOptionPane.YES_OPTION) {
                    e.getWindow().dispose();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        aDashboardPannel = new javax.swing.JPanel();
        aDashboard = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        aReport = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        aFeedback = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        aLogout = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAddEmployee = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        btnViewEmployee = new javax.swing.JButton();
        btnAddCustomer = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        brnViewCustomer = new javax.swing.JButton();
        btnManageCustomer = new javax.swing.JButton();
        btnManageOrder = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(10, 40, 70));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/dashboard_26px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin Panel");

        jLabel15.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/admin.png"))); // NOI18N
        jLabel15.setText("Administrator");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        aDashboardPannel.setBackground(new java.awt.Color(51, 51, 51));
        aDashboardPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aDashboard.setBackground(new java.awt.Color(51, 51, 51));
        aDashboard.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        aDashboard.setForeground(new java.awt.Color(255, 255, 255));
        aDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/home_24px.png"))); // NOI18N
        aDashboard.setText("Dashboard");
        aDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout aDashboardPannelLayout = new javax.swing.GroupLayout(aDashboardPannel);
        aDashboardPannel.setLayout(aDashboardPannelLayout);
        aDashboardPannelLayout.setHorizontalGroup(
            aDashboardPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aDashboardPannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(aDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        aDashboardPannelLayout.setVerticalGroup(
            aDashboardPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aDashboardPannelLayout.createSequentialGroup()
                .addComponent(aDashboard)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        aReport.setBackground(new java.awt.Color(51, 51, 51));
        aReport.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        aReport.setForeground(new java.awt.Color(255, 255, 255));
        aReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/report_24px.png"))); // NOI18N
        aReport.setText("Report");
        aReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(aReport, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aReport, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        aFeedback.setBackground(new java.awt.Color(51, 51, 51));
        aFeedback.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        aFeedback.setForeground(new java.awt.Color(255, 255, 255));
        aFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/feedback_24px.png"))); // NOI18N
        aFeedback.setText("Feedback");
        aFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aFeedbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(aFeedback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aFeedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        aLogout.setBackground(new java.awt.Color(51, 51, 51));
        aLogout.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        aLogout.setForeground(new java.awt.Color(255, 255, 255));
        aLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/logout_24px.png"))); // NOI18N
        aLogout.setText("Logout");
        aLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(aLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aLogout, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aDashboardPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(aDashboardPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 40, 70));
        jLabel1.setText("Welcome To Admin Panel");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 40, 70));
        jLabel2.setText("Add");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 40, 70));
        jLabel3.setText("View");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 40, 70));
        jLabel4.setText("Manage");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 40, 70));
        jLabel6.setText("Customer");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 40, 70));
        jLabel7.setText("Order");

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(10, 40, 70));
        jLabel12.setText("Employee");

        btnAddEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Add_Icon.png"))); // NOI18N
        btnAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseClicked(evt);
            }
        });

        btnAddOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnAddOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Add_Icon.png"))); // NOI18N
        btnAddOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOrderMouseClicked(evt);
            }
        });
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnViewEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnViewEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Report_Icon.png"))); // NOI18N
        btnViewEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewEmployeeMouseClicked(evt);
            }
        });

        btnAddCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Add_Icon.png"))); // NOI18N
        btnAddCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseClicked(evt);
            }
        });

        btnViewOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Report_Icon.png"))); // NOI18N
        btnViewOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewOrderMouseClicked(evt);
            }
        });

        brnViewCustomer.setBackground(new java.awt.Color(255, 255, 255));
        brnViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        brnViewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Report_Icon.png"))); // NOI18N
        brnViewCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brnViewCustomerMouseClicked(evt);
            }
        });

        btnManageCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnManageCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Update_Icon.png"))); // NOI18N
        btnManageCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageCustomerMouseClicked(evt);
            }
        });

        btnManageOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Update_Icon.png"))); // NOI18N
        btnManageOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageOrderMouseClicked(evt);
            }
        });

        btnManageEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/Update_Icon.png"))); // NOI18N
        btnManageEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel3)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel4)
                                .addGap(139, 139, 139))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnManageOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(brnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnManageCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator5))
                                .addGap(113, 113, 113))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel6)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brnViewCustomer)
                            .addComponent(btnManageCustomer)
                            .addComponent(btnAddCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewEmployee)
                            .addComponent(btnAddEmployee)
                            .addComponent(btnManageEmployee))))
                .addGap(14, 14, 14)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOrder)
                    .addComponent(btnViewOrder)
                    .addComponent(btnManageOrder)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseClicked
        this.setVisible(false);
        FormCustomer cf = new FormCustomer();
        cf.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerMouseClicked

    private void brnViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brnViewCustomerMouseClicked
        this.setVisible(false);
        ViewCustomer ct = new ViewCustomer();
        ct.setVisible(true);
    }//GEN-LAST:event_brnViewCustomerMouseClicked

    private void btnManageCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageCustomerMouseClicked
        this.setVisible(false);
        ManageCustomer mc = new ManageCustomer();
        mc.setVisible(true);
    }//GEN-LAST:event_btnManageCustomerMouseClicked

    private void btnAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseClicked
        this.setVisible(false);
        FormEmployee mf = new FormEmployee();
        mf.setVisible(true);
    }//GEN-LAST:event_btnAddEmployeeMouseClicked

    private void btnViewEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewEmployeeMouseClicked
        this.setVisible(false);
        ViewEmployee et = new ViewEmployee();
        et.setVisible(true);
    }//GEN-LAST:event_btnViewEmployeeMouseClicked

    private void btnManageEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMouseClicked
        this.setVisible(false);
        ManageEmployee me = new ManageEmployee();
        me.setVisible(true);
    }//GEN-LAST:event_btnManageEmployeeMouseClicked

    private void btnAddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOrderMouseClicked
        this.setVisible(false);
        FormCourier cf = new FormCourier();
        cf.setVisible(true);
    }//GEN-LAST:event_btnAddOrderMouseClicked

    private void btnViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewOrderMouseClicked
        this.setVisible(false);
        ViewCourier ct = new ViewCourier();
        ct.setVisible(true);
    }//GEN-LAST:event_btnViewOrderMouseClicked

    private void btnManageOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageOrderMouseClicked
        this.setVisible(false);
        ManageCourier mc = new ManageCourier();
        mc.setVisible(true);
    }//GEN-LAST:event_btnManageOrderMouseClicked

    private void aLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aLogoutMouseClicked
        this.setVisible(false);
        LoginAdmin la = new LoginAdmin();
        la.setVisible(true);
    }//GEN-LAST:event_aLogoutMouseClicked

    private void aDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aDashboardMouseClicked
        this.setVisible(false);
        DashboardAdmin ad = new DashboardAdmin();
        ad.setVisible(true);
    }//GEN-LAST:event_aDashboardMouseClicked

    private void aReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aReportMouseClicked
        this.setVisible(false);
        try {
            ViewReport rt = new ViewReport();
            rt.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_aReportMouseClicked

    private void aFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aFeedbackMouseClicked
        this.setVisible(false);
        ViewFeedback ft = new ViewFeedback();
        ft.setVisible(true);
    }//GEN-LAST:event_aFeedbackMouseClicked

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrderActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aDashboard;
    private javax.swing.JPanel aDashboardPannel;
    private javax.swing.JLabel aFeedback;
    private javax.swing.JLabel aLogout;
    private javax.swing.JLabel aReport;
    private javax.swing.JButton brnViewCustomer;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnManageCustomer;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnViewEmployee;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
