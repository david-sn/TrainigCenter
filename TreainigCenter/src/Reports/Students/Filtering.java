/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports.Students;

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
public class Filtering extends javax.swing.JFrame {

    /**
     * Creates new form Filtering
     */
    public Filtering() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        toid = new javax.swing.JTextField();
        fromage = new javax.swing.JTextField();
        toage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("Student Filter");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("From ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("To ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("From Age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("To Age");

        fid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        toid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        fromage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        toage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromage, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(toage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toid, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(fid))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(toid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fromage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(toage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (fid.getText().equals("")&&toid.getText().equals("")&&fromage.getText().equals("")&&toage.getText().equals("")) 
        {    JOptionPane.showMessageDialog(null, "Please Select Range");
             return;
        }
 
        if (fid.getText().equals("")&&!toid.getText().equals("")||!fid.getText().equals("")&&toid.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select Range From ID/To ID");
            return;
        }
        
        if (fromage.getText().equals("")&&!toage.getText().equals("")||!fromage.getText().equals("")&&toage.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select Range From Age/To Age");
            return;
        }
        
        showREPORT(REPORTSPATH+"\\Reports\\Students\\Student.jasper",new Object[]{"FromAge",fromage.getText(),"ToAge",toage.getText(),"fid",fid.getText(),"tid",toid.getText()});

this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fromage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField toage;
    private javax.swing.JTextField toid;
    // End of variables declaration//GEN-END:variables
}
