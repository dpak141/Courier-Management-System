package com.css.form;

import com.css.dao.ReportDao;
import com.css.dao.ReportDaoImpl;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewReport extends javax.swing.JFrame {

    public ViewReport() throws IOException {
        initComponents();
        this.setTitle("View Report");
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
        writeData();
        loadData();
    }

    private void writeData() throws IOException {
        PrintWriter pw = new PrintWriter("src/com/css/textFiles/Report.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("src/com/css/textFiles/Customer.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("src/com/css/textFiles/Employee.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("src/com/css/textFiles/Courier.txt"));
        String line1 = br1.readLine();
        String line2 = br2.readLine();
        String line3 = br3.readLine();
        String[] splt1 = line1.split(",");
        String[] splt2 = line2.split(",");
        String[] splt3 = line3.split(",");

        while ((line1 != null) || (line2 != null) || (line3 != null)) {
            if (line1 != null) {
                splt1 = line1.split(",");
                pw.print(splt1[0]);
                pw.print(",");
                pw.print(splt1[1]);
                pw.print(",");
                pw.print(splt1[2]);
                pw.print(",");
                pw.print(splt1[3]);
                pw.print(",");
                pw.print(splt1[4]);
                pw.print(",");
                line1 = br1.readLine();
            }
            if (line2 != null) {
                splt2 = line2.split(",");
                pw.print(splt2[0]);
                pw.print(",");
                pw.print(splt2[1]);
                pw.print(",");
                pw.print(splt2[4]);
                pw.print(",");
                line2 = br2.readLine();
            }
            if (line3 != null) {
                splt3 = line3.split(",");
                pw.print(splt3[0]);
                pw.print(",");
                pw.print(splt3[8]);
                pw.print(",");
                pw.print(splt3[10]);
                pw.print(",");
                pw.println();
                line3 = br3.readLine();
            }

        }
        pw.flush();
        br1.close();
        br2.close();
        br3.close();
        pw.close();

    }

    private void loadData() {
        ArrayList<String> fileData;
        ReportDao rd = new ReportDaoImpl();
        try {
            fileData = rd.getAllReports();
            DefaultTableModel dtm = new DefaultTableModel(new String[]{"CustomerID", "Name", "Address", "Email", "Phone", "EmployeeID", "Courierer", "Contact", "Courier ID", "Cost", "Status"}, 0);
            Object[] tableLines = fileData.toArray();
            for (int i = 0; i < tableLines.length; ++i) {
                String lines = tableLines[i].toString();
                String[] row = lines.split(",");
                dtm.addRow(row);
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(ViewReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(10, 40, 70));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Report");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(aDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
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
                .addGap(33, 33, 33)
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
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
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

    private void aReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aReportMouseClicked
       this.setVisible(false);
        try {
            ViewReport rt = new ViewReport();
            rt.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_aReportMouseClicked

    private void aLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aLogoutMouseClicked
        this.setVisible(false);
        LoginAdmin la = new LoginAdmin();
        la.setVisible(true);
    }//GEN-LAST:event_aLogoutMouseClicked

    private void aFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aFeedbackMouseClicked
        this.setVisible(false);
        ViewFeedback vf = new ViewFeedback();
        vf.setVisible(true);
    }//GEN-LAST:event_aFeedbackMouseClicked

    private void aDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aDashboardMouseClicked
        this.setVisible(false);
        DashboardAdmin ad = new DashboardAdmin();
        ad.setVisible(true);
    }//GEN-LAST:event_aDashboardMouseClicked

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
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
                try {
                    new ViewReport().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ViewReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aDashboard;
    private javax.swing.JLabel aFeedback;
    private javax.swing.JLabel aLogout;
    private javax.swing.JLabel aReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
