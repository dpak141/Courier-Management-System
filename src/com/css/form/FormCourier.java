package com.css.form;

import com.css.bll.Courier;
import com.css.dao.CourierDaoImpl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.css.dao.CourierDao;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class FormCourier extends javax.swing.JFrame {

    public FormCourier() {
        initComponents();
        this.setTitle("Courier Form");
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

    private void loadData() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMainMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        txtContact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCourierID = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        txtCustomername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cmbCourierType = new javax.swing.JComboBox<>();
        txtCost = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cmbCourierStatus = new javax.swing.JComboBox<>();
        lblAdminDashboard = new javax.swing.JLabel();
        clbl = new javax.swing.JLabel();

        btnMainMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMainMenu.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnMainMenu.setForeground(new java.awt.Color(0, 0, 204));
        btnMainMenu.setText("Main menu");
        btnMainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(10, 40, 70));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Courier Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setBackground(new java.awt.Color(10, 40, 70));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDate.setBackground(new java.awt.Color(255, 255, 255));
        txtDate.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        btnRegister.setBackground(new java.awt.Color(10, 40, 70));
        btnRegister.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtContact.setBackground(new java.awt.Color(255, 255, 255));
        txtContact.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 40, 70));
        jLabel3.setText("Courier ID");

        txtCourierID.setBackground(new java.awt.Color(255, 255, 255));
        txtCourierID.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtCourierID.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        txtWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtWeight.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(0, 0, 0));
        txtWeight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 40, 70));
        jLabel4.setText("Date");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(10, 40, 70));
        jLabel17.setText("Contact");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(10, 40, 70));
        jLabel19.setText("Address");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(10, 40, 70));
        jLabel20.setText("Source");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(10, 40, 70));
        jLabel22.setText("Destination");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(10, 40, 70));
        jLabel23.setText("Weight");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(10, 40, 70));
        jLabel24.setText("Cost");

        txtSource.setBackground(new java.awt.Color(255, 255, 255));
        txtSource.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtSource.setForeground(new java.awt.Color(0, 0, 0));
        txtSource.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        txtCustomername.setBackground(new java.awt.Color(255, 255, 255));
        txtCustomername.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtCustomername.setForeground(new java.awt.Color(0, 0, 0));
        txtCustomername.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 40, 70));
        jLabel5.setText("Customer Name");

        txtDestination.setBackground(new java.awt.Color(255, 255, 255));
        txtDestination.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtDestination.setForeground(new java.awt.Color(0, 0, 0));
        txtDestination.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(10, 40, 70));
        jLabel25.setText("Courier Type");

        cmbCourierType.setBackground(new java.awt.Color(255, 255, 255));
        cmbCourierType.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cmbCourierType.setForeground(new java.awt.Color(0, 0, 0));
        cmbCourierType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parcel", "Document", " " }));
        cmbCourierType.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        cmbCourierType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtCost.setBackground(new java.awt.Color(255, 255, 255));
        txtCost.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCost.setForeground(new java.awt.Color(0, 0, 0));
        txtCost.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(10, 40, 70));
        jLabel26.setText("Courier Status");

        cmbCourierStatus.setBackground(new java.awt.Color(255, 255, 255));
        cmbCourierStatus.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cmbCourierStatus.setForeground(new java.awt.Color(0, 0, 0));
        cmbCourierStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Delivered", "" }));
        cmbCourierStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        cmbCourierStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblAdminDashboard.setBackground(new java.awt.Color(255, 255, 255));
        lblAdminDashboard.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        lblAdminDashboard.setForeground(new java.awt.Color(0, 0, 204));
        lblAdminDashboard.setText("Admin Dashboard");
        lblAdminDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdminDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminDashboardMouseClicked(evt);
            }
        });

        clbl.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        clbl.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(94, 94, 94)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSource, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourierID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestination)
                            .addComponent(cmbCourierType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(cmbCourierStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addComponent(clbl, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblAdminDashboard)))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtCourierID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(clbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cmbCourierType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCourierStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnRegister))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdminDashboard)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseClicked
        UserType ut = new UserType();
        ut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMainMenuMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        try {

            ///// sir lai dekhaune
            if (txtCourierID.getText().equals("") || txtDate.getText().equals("") || txtAddress.getText().equals("") || txtContact.getText().equals("") || txtSource.getText().equals("") || cmbCourierType.getSelectedItem().equals("") || txtWeight.getText().equals("") || txtCost.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "All field are required!");
            } else {
                Courier c = new Courier();
                CourierDao cd = new CourierDaoImpl();
                c.setCid(txtCourierID.getText());
                String date = txtDate.getText();
                c.setDate(date);
                c.setCustomerName(txtCustomername.getText());
                c.setAddress(txtAddress.getText());
                String contact = txtContact.getText();
                c.setContact(contact);
                c.setSource(txtSource.getText());
                c.setDestination(txtDestination.getText());
                double weight = Double.parseDouble(txtWeight.getText());
                c.setWeight(weight);
                double cost = Double.parseDouble(txtCost.getText());
                c.setCost(cost);
                c.setCourierType(cmbCourierType.getSelectedItem().toString());
                c.setCourierStatus(cmbCourierStatus.getSelectedItem().toString());
                cd.saveCourier(c);
                JOptionPane.showMessageDialog(null, "SuccessFully Register!");
                
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            //.getLogger(FormCourier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        txtCourierID.setText(null);
        txtDate.setText(null);
        txtAddress.setText(null);
        txtContact.setText(null);
        txtSource.setText(null);
        cmbCourierType.setSelectedItem(null);
        txtWeight.setText(null);
        txtCost.setText(null);
        cmbCourierStatus.setSelectedItem(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblAdminDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminDashboardMouseClicked
        DashboardAdmin ad = new DashboardAdmin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdminDashboardMouseClicked

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        String PATTERN = "^[0-9]{0,12}$";
        Pattern patrn = Pattern.compile(PATTERN);
        Matcher match = patrn.matcher(txtContact.getText());
        if (!match.matches()) {
            clbl.setText("Contact is incorrect");
        } else {
            clbl.setText(null);
        }
    }//GEN-LAST:event_txtContactKeyReleased

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
            java.util.logging.Logger.getLogger(FormCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCourier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMainMenu;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel clbl;
    private javax.swing.JComboBox<String> cmbCourierStatus;
    private javax.swing.JComboBox<String> cmbCourierType;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAdminDashboard;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtCourierID;
    private javax.swing.JTextField txtCustomername;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtSource;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
