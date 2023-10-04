package com.css.form;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserType extends javax.swing.JFrame {

    public UserType() {
        initComponents();
        this.setTitle("User Type");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLoginDeliveryStaff = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnFeedbackForm = new javax.swing.JButton();
        btnLoginManagingStaff1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Type");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(63, 33, 8));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 40, 70));
        jLabel2.setText("Select User Type");
        jPanel2.add(jLabel2);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 90, 330, 40);

        jLabel1.setBackground(new java.awt.Color(141, 63, 43));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 40, 70));
        jLabel1.setText("Online Courier Service");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 510, 57);

        btnLoginDeliveryStaff.setBackground(new java.awt.Color(10, 40, 70));
        btnLoginDeliveryStaff.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnLoginDeliveryStaff.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginDeliveryStaff.setText("Delivery Staff");
        btnLoginDeliveryStaff.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnLoginDeliveryStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginDeliveryStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginDeliveryStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginDeliveryStaff);
        btnLoginDeliveryStaff.setBounds(350, 310, 190, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/css/media/userType.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 130, 150, 160);

        btnFeedbackForm.setBackground(new java.awt.Color(10, 40, 70));
        btnFeedbackForm.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnFeedbackForm.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedbackForm.setText("Send Feedback");
        btnFeedbackForm.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnFeedbackForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFeedbackForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackFormActionPerformed(evt);
            }
        });
        jPanel1.add(btnFeedbackForm);
        btnFeedbackForm.setBounds(260, 360, 90, 20);

        btnLoginManagingStaff1.setBackground(new java.awt.Color(10, 40, 70));
        btnLoginManagingStaff1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnLoginManagingStaff1.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginManagingStaff1.setText("Managing Staff");
        btnLoginManagingStaff1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnLoginManagingStaff1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginManagingStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginManagingStaff1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginManagingStaff1);
        btnLoginManagingStaff1.setBounds(70, 310, 190, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 610, 390));

        setSize(new java.awt.Dimension(689, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginDeliveryStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginDeliveryStaffActionPerformed
        LoginEmployee le = new LoginEmployee();
        this.setVisible(false);
        le.setVisible(true);
    }//GEN-LAST:event_btnLoginDeliveryStaffActionPerformed

    private void btnFeedbackFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackFormActionPerformed
        FormFeedback la = new FormFeedback();
        this.setVisible(false);
        la.setVisible(true);
    }//GEN-LAST:event_btnFeedbackFormActionPerformed

    private void btnLoginManagingStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginManagingStaff1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginManagingStaff1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new UserType().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeedbackForm;
    private javax.swing.JButton btnLoginDeliveryStaff;
    private javax.swing.JButton btnLoginManagingStaff1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
