/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports.Attendance;

import Reports.Students.*;
import DatabaseConnection.OracleConn;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static treainigcenter.MDIHome.REPORTSPATH;
import static treainigcenter.MDIHome.jDesktopPane1;

/**
 *
 * @author David Sherif
 */
public class Filtering_At extends javax.swing.JFrame {

    /**
     * Creates new form Filtering
     */
    public Filtering_At() {
        initComponents();
        
      this.setIconImage(new ImageIcon(getClass().getResource("/IconUsed/filter-icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        c = new javax.swing.JComboBox<>();
        g = new javax.swing.JComboBox<>();
        l = new javax.swing.JComboBox<>();

        setTitle("Student Filter");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Course");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Group");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Lecture No.");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Name..." }));
        c.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        g.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        g.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group Number..." }));
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        l.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        l.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture No. ..." }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (c.getSelectedIndex()==0||g.getSelectedIndex()==0||l.getSelectedIndex()==0) {
        JOptionPane.showMessageDialog(null, "Select Required Paramter To View Report");
        return;
        }
        showREPORT(REPORTSPATH+"\\Reports\\Attendance\\Attendance.jasper", 
        new Object[]{"Coursename",c.getSelectedItem(),
                        "Groupid",g.getSelectedItem(),
                        "Lec",l.getSelectedItem()});
 
this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cAncestorAdded
OracleConn.FullCombo(c, "courses", "coursename");
    }//GEN-LAST:event_cAncestorAdded

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
OracleConn.FullCombo(g, "groups", "groupid"," courseid=(select courseid from courses where coursename='"+c.getSelectedItem()+"') order by groupid");
    }//GEN-LAST:event_cActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
OracleConn.FullCombo(l, "attendance", "lecnumber"," groupid=(select tableid from groups where to_char(groupid)='"+g.getSelectedItem()+"' and courseid=(select courseid from courses where coursename ='"+c.getSelectedItem()+"'))");
    }//GEN-LAST:event_gActionPerformed

    
      private void showREPORT(String PathJasper, Object[] Parameter) {

        try {
            Map params = null;

            // JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
            if (Parameter == null) {
                params = null;
            } else {
                params = new HashMap();
                for (int i = 0; i < Parameter.length; i++) {
                    params.put(Parameter[i], Parameter[++i]);
                }
            }

            // Generate jasper printPathJasper.getFile().replaceAll("%20", " ")
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(PathJasper,
                    params,
                    OracleConn.GetConn());

            JasperViewer.viewReport(jprint, false);

            // Export pdf file
            //    JasperExportManager.exportReportToPdfFile(jprint, getClass().getResource("/Reports/Report.pdf").getFile().replaceAll("%20", " "));
//if(JOptionPane.showConfirmDialog(jDesktopPane1, "Do You Want To Open Report With PDF Reader ?")==JOptionPane.YES_OPTION)
            //     Desktop.getDesktop().open(new java.io.File(getClass().getResource("/Reports/Report.pdf").getFile().replaceAll("%20", " ")));
// JasperPrint jasperPrint = JasperFillManager.fillReport(PathJasper,params, OracleConn.OpenConn( ));
            //JasperExportManager.exportReportToPdfFile(jasperPrint, "A:\\My programs\\ad.pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.print("Exceptiion" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c;
    private javax.swing.JComboBox<String> g;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> l;
    // End of variables declaration//GEN-END:variables
}
