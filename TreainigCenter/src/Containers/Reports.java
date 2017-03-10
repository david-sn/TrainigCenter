
package Containers;

import DatabaseConnection.OracleConn;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static treainigcenter.MDIHome.jDesktopPane1;

/**
 *
 * @author David Sherif
 */
public class Reports extends javax.swing.JPanel {

    /**
     * Creates new form Basics
     */
    public Reports() {
        initComponents();
    }

    
    Registers.Regester myregister1=null;
    Groups.Group mygroup1=null;
    Attendances.Attendance myattendance=null;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        info.clearthought.layout.TableLayout _tableLayoutInstance;

        StudentBTN = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();

        setOpaque(false);
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(40);
        _tableLayoutInstance.setVGap(30);
        _tableLayoutInstance.setColumn(new double[]{info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        setLayout(_tableLayoutInstance);

        StudentBTN.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        StudentBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/std_repBig.jpg"))); // NOI18N
        StudentBTN.setText("<html>All Student");
        StudentBTN.setBorderPainted(false);
        StudentBTN.setContentAreaFilled(false);
        StudentBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/std_repSmall.png"))); // NOI18N
        StudentBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBTNActionPerformed(evt);
            }
        });
        add(StudentBTN, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        Employee.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/course_rep_Big.png"))); // NOI18N
        Employee.setText("<html>Open <br>Courses</html>");
        Employee.setBorderPainted(false);
        Employee.setContentAreaFilled(false);
        Employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Employee.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/course_repSmall.png"))); // NOI18N
        Employee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        add(Employee, new info.clearthought.layout.TableLayoutConstraints(1, 0, 1, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/capacityBig_rep.png"))); // NOI18N
        jButton11.setText("<html>Groups and<br>Occupation</html>");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/capacitSmall_rep.png"))); // NOI18N
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11, new info.clearthought.layout.TableLayoutConstraints(2, 0, 2, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/gr_repBig.png"))); // NOI18N
        jButton12.setText("<html>Courses with <br>Instructor</html>");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/gr_rep_small.png"))); // NOI18N
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new info.clearthought.layout.TableLayoutConstraints(3, 0, 3, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionBig.png"))); // NOI18N
        jButton16.setText("<html>Courses Fees");
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionSmall.png"))); // NOI18N
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        add(jButton16, new info.clearthought.layout.TableLayoutConstraints(4, 0, 4, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/depatBIG.png"))); // NOI18N
        jButton17.setText("<html>Department<br>Occupation");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/deptSMALL.png"))); // NOI18N
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        add(jButton17, new info.clearthought.layout.TableLayoutConstraints(0, 1, 0, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/centerBIG22.png"))); // NOI18N
        jButton19.setText("<html>Center<br>Rooms And Capacity");
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/centerBIG.png"))); // NOI18N
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        add(jButton19, new info.clearthought.layout.TableLayoutConstraints(2, 1, 2, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerBIG.png"))); // NOI18N
        jButton20.setText("<html>Students<br> Registered In Groups");
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerSmall.png"))); // NOI18N
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        add(jButton20, new info.clearthought.layout.TableLayoutConstraints(3, 1, 3, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/paybig.png"))); // NOI18N
        jButton22.setText("Center Profit");
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png"))); // NOI18N
        jButton22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        add(jButton22, new info.clearthought.layout.TableLayoutConstraints(4, 1, 4, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/pay_big.png"))); // NOI18N
        jButton23.setText("<html>Student Payment For Course ");
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/pay_small.png"))); // NOI18N
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        add(jButton23, new info.clearthought.layout.TableLayoutConstraints(1, 1, 1, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));
    }// </editor-fold>//GEN-END:initComponents

    private void StudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBTNActionPerformed
    
  // System.out.println("Usage: ReportGenerator ....");

  try {
   System.out.println("Start ....");
   // Get jasper report
   String jrxmlFileName = "A:\\My programs\\TreainigCenter\\src\\Reports\\newReport.jrxml";
   String jasperFileName = "A:\\My programs\\TreainigCenter\\src\\Reports\\newReport.jasper";
   String pdfFileName = "A:\\My programs\\TreainigCenter\\src\\Reports\\t.pdf";

  // JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
   
//     String dbUrl = props.getProperty("jdbc.url");
   String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
   // String dbDriver = props.getProperty("jdbc.driver");
   String dbDriver = "oracle.jdbc.driver.OracleDriver";
   // String dbUname = props.getProperty("db.username");
   String dbUname = "center";
 

   // Load the JDBC driver
   Class.forName(dbDriver);
   // Get the connection
   Connection conn = DriverManager.getConnection(dbUrl, dbUname, dbUname);

   // Create arguments
   // Map params = new HashMap();
   
   // Generate jasper print
   JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, null, conn);

   JasperViewer.viewReport(jprint);
   
   
   // Export pdf file
   //JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

   
   
   
   
   
   
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFileName,null, conn);
    JasperExportManager.exportReportToPdfFile(jasperPrint, "A:\\My programs\\ad.pdf");
      
   
   
   

   
   System.out.println("Done exporting reports to pdf");
   
  } catch (Exception e) {
   System.out.print("Exceptiion" + e);
  }
     
       
    }//GEN-LAST:event_StudentBTNActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
   
    }//GEN-LAST:event_EmployeeActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
  
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
   
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    
    
      private void showForm(JInternalFrame Form)
    {
  
       // Voice_Translate.RunMusic.RUN_WAV("A:\\My programs\\TreainigCenter\\src\\IconUsed\\FREE - SOUND.mp3");
         OracleConn.validation(Form.getClass().getName());
        
         if(DatabaseConnection.OracleConn.array[4]==1) {
Form.setLocation( 
        (int) (jDesktopPane1.getSize().getWidth() -Form.getSize().width)/2,
              (jDesktopPane1.getSize().height- Form.getSize().height)/2);

if(jDesktopPane1.isAncestorOf(Form));

//jDesktopPane1.remove(Form);
  else          jDesktopPane1.add(Form);

        Form.setVisible(true);
        

       }
         else JOptionPane.showMessageDialog(null,"You Don't Have Privilage To Open This\nContact with Admin", "Authorization",JOptionPane.INFORMATION_MESSAGE);
    }

      
       
      
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee;
    private javax.swing.JButton StudentBTN;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    // End of variables declaration//GEN-END:variables
}
