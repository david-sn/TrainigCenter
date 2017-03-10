/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports.RommsDaySchdule;

import DatabaseConnection.OracleConn;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static treainigcenter.MDIHome.REPORTSPATH;
 
public class runsGroupfilter extends javax.swing.JFrame {
 
    public runsGroupfilter() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IconUsed/filter-icon.png")).getImage());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        info.clearthought.layout.TableLayout _tableLayoutInstance;

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filter Data");

        jPanel1.setBackground(new java.awt.Color(157, 236, 255));
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(5);
        _tableLayoutInstance.setVGap(10);
        _tableLayoutInstance.setColumn(new double[]{info.clearthought.layout.TableLayout.MINIMUM,info.clearthought.layout.TableLayout.FILL,20});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.MINIMUM,info.clearthought.layout.TableLayout.MINIMUM,info.clearthought.layout.TableLayout.MINIMUM,info.clearthought.layout.TableLayout.MINIMUM});
        jPanel1.setLayout(_tableLayoutInstance);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new info.clearthought.layout.TableLayoutConstraints(1, 3, 1, 3, info.clearthought.layout.TableLayout.RIGHT, info.clearthought.layout.TableLayout.FULL));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(" Branch");
        jPanel1.add(jLabel1, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(" Room No.");
        jPanel1.add(jLabel2, new info.clearthought.layout.TableLayoutConstraints(0, 1, 0, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(" Day");
        jPanel1.add(jLabel3, new info.clearthought.layout.TableLayoutConstraints(0, 2, 0, 2, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branch Name" }));
        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new info.clearthought.layout.TableLayoutConstraints(1, 0, 1, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Number" }));
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox2FocusGained(evt);
            }
        });
        jPanel1.add(jComboBox2, new info.clearthought.layout.TableLayoutConstraints(1, 1, 1, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day...", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        jPanel1.add(jComboBox3, new info.clearthought.layout.TableLayoutConstraints(1, 2, 1, 2, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jComboBox1.getSelectedIndex()==0||jComboBox2.getSelectedIndex()==0||jComboBox3.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Please Select Parameter To Run Report");
            return;
        }
        
          
        showREPORT(REPORTSPATH+"\\Reports\\RommsDaySchdule\\roomSchdule.jasper", 
        new Object[]{"day",jComboBox3.getSelectedIndex(),
                        "bran",jComboBox1.getSelectedItem(),
                        "rom",jComboBox2.getSelectedItem()});
 this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox1AncestorAdded
OracleConn.FullCombo(jComboBox1, "centerbranch", "centername");
    }//GEN-LAST:event_jComboBox1AncestorAdded

    private void jComboBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusGained

    }//GEN-LAST:event_jComboBox2FocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
OracleConn.FullCombo(jComboBox2, "rooms", "roomfloor||'0'||rommseq","branchid=(select centerid from centerbranch where centername='"+jComboBox1.getSelectedItem()+"' )");
    }//GEN-LAST:event_jComboBox1ActionPerformed

     
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

            JasperViewer.viewReport(jprint, false,Locale.US);

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
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
