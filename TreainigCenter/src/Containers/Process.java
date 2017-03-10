
package Containers;

import DatabaseConnection.OracleConn;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import static treainigcenter.MDIHome.jDesktopPane1;

/**
 *
 * @author David Sherif
 */
public class Process extends javax.swing.JPanel {

    /**
     * Creates new form Basics
     */
    public Process() {
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
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setOpaque(false);
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(60);
        _tableLayoutInstance.setVGap(100);
        _tableLayoutInstance.setColumn(new double[]{145,145,145,145,145});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.PREFERRED,info.clearthought.layout.TableLayout.PREFERRED});
        setLayout(_tableLayoutInstance);

        StudentBTN.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        StudentBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/groupBIG.png"))); // NOI18N
        StudentBTN.setText("<html>\nGroups & <br>\nSchedule\n</html> ");
        StudentBTN.setBorderPainted(false);
        StudentBTN.setContentAreaFilled(false);
        StudentBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/GroupSmall.png"))); // NOI18N
        StudentBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBTNActionPerformed(evt);
            }
        });
        add(StudentBTN, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        Employee.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerBIG.png"))); // NOI18N
        Employee.setText("Registers");
        Employee.setBorderPainted(false);
        Employee.setContentAreaFilled(false);
        Employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Employee.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerSmall.png"))); // NOI18N
        Employee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        add(Employee, new info.clearthought.layout.TableLayoutConstraints(1, 0, 1, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/paybig.png"))); // NOI18N
        jButton11.setText("Payments");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png"))); // NOI18N
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11, new info.clearthought.layout.TableLayoutConstraints(2, 0, 2, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/attenBig.png"))); // NOI18N
        jButton12.setText("Attendance");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/attensmall.png"))); // NOI18N
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new info.clearthought.layout.TableLayoutConstraints(3, 0, 3, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/DashBIG.png"))); // NOI18N
        jButton15.setText("<html><pre><b>   My<br>Dashboard");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/dashsmall.png"))); // NOI18N
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        add(jButton15, new info.clearthought.layout.TableLayoutConstraints(0, 1, 0, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionBig.png"))); // NOI18N
        jButton16.setText("<html><pre><b>  Center<br>Commision");
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
        add(jButton16, new info.clearthought.layout.TableLayoutConstraints(1, 1, 1, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));
    }// </editor-fold>//GEN-END:initComponents

    private void StudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBTNActionPerformed
      if (mygroup1==null) {
            mygroup1=new Groups.Group();
        }
          showForm(mygroup1);
        
     
       
    }//GEN-LAST:event_StudentBTNActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
  if (myregister1==null) {
            myregister1=new Registers.Regester();
        }
          showForm(myregister1); 
    }//GEN-LAST:event_EmployeeActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
  // if (mypay1==null) {
   //         mypay1=new Payment.Payment();
   //     }
   //       showForm(mypay1); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
Dashboard.ParentDash  myD1=new Dashboard.ParentDash();
   showForm(myD1);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
  
        if (myattendance==null) {
            myattendance=new Attendances.Attendance();
        }
          showForm(myattendance); 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    
    
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
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    // End of variables declaration//GEN-END:variables
}
