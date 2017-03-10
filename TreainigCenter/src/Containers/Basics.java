
package Containers;

import DatabaseConnection.OracleConn;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import static treainigcenter.MDIHome.jDesktopPane1;

/**
 *
 * @author David Sherif
 */
public class Basics extends javax.swing.JPanel {

    /**
     * Creates new form Basics
     */
    public Basics() {
        initComponents();
    }

    
    Students.Students myStudent=null;
    employees.employees myemployye=null;
    Departments.Department mydepartment=null;
    Courses.Course mycourse=null;
    Login_USER.AddUser myuser=null;
    Login_USER.EditeUser myEdite=null;
    Branchs.Branch mycenter=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        info.clearthought.layout.TableLayout _tableLayoutInstance;

        StudentBTN = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        changePass_btn = new javax.swing.JButton();
        UserLogin_btn1 = new javax.swing.JButton();

        setOpaque(false);
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(60);
        _tableLayoutInstance.setVGap(100);
        _tableLayoutInstance.setColumn(new double[]{145,145,145,145,145});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.PREFERRED,info.clearthought.layout.TableLayout.PREFERRED});
        setLayout(_tableLayoutInstance);

        StudentBTN.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        StudentBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/stBIG.png"))); // NOI18N
        StudentBTN.setText("Students");
        StudentBTN.setBorderPainted(false);
        StudentBTN.setContentAreaFilled(false);
        StudentBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/stsmall.png"))); // NOI18N
        StudentBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBTNActionPerformed(evt);
            }
        });
        add(StudentBTN, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        Employee.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/employee.png"))); // NOI18N
        Employee.setText("Employee");
        Employee.setBorderPainted(false);
        Employee.setContentAreaFilled(false);
        Employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Employee.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/employeeSMALL.png"))); // NOI18N
        Employee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        add(Employee, new info.clearthought.layout.TableLayoutConstraints(1, 0, 1, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/depatBIG.png"))); // NOI18N
        jButton11.setText("Departments");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/deptSMALL.png"))); // NOI18N
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11, new info.clearthought.layout.TableLayoutConstraints(2, 0, 2, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/centerBIG22.png"))); // NOI18N
        jButton12.setText("Centers");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/buildingSMALL.png"))); // NOI18N
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new info.clearthought.layout.TableLayoutConstraints(3, 0, 3, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/courseBIG.png"))); // NOI18N
        jButton15.setText("Corses");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/courseSMALL.png"))); // NOI18N
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        add(jButton15, new info.clearthought.layout.TableLayoutConstraints(2, 1, 2, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        changePass_btn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        changePass_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/changeBig.png"))); // NOI18N
        changePass_btn.setText("Change Pass");
        changePass_btn.setBorderPainted(false);
        changePass_btn.setContentAreaFilled(false);
        changePass_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changePass_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/changeSmall.png"))); // NOI18N
        changePass_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        changePass_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePass_btnActionPerformed(evt);
            }
        });
        add(changePass_btn, new info.clearthought.layout.TableLayoutConstraints(1, 1, 1, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        UserLogin_btn1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        UserLogin_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/loginBIG.png"))); // NOI18N
        UserLogin_btn1.setText("Login Users");
        UserLogin_btn1.setBorderPainted(false);
        UserLogin_btn1.setContentAreaFilled(false);
        UserLogin_btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserLogin_btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/loginSmall.png"))); // NOI18N
        UserLogin_btn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UserLogin_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLogin_btn1ActionPerformed(evt);
            }
        });
        add(UserLogin_btn1, new info.clearthought.layout.TableLayoutConstraints(0, 1, 0, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));
    }// </editor-fold>//GEN-END:initComponents

    private void StudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBTNActionPerformed
     if (myStudent==null) {
         myStudent=new Students.Students();
        }
          showForm(myStudent);
        
    }//GEN-LAST:event_StudentBTNActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
if (myemployye==null) {
            myemployye=new employees.employees();
        }
          showForm(myemployye);
    }//GEN-LAST:event_EmployeeActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
if (mydepartment==null) {
            mydepartment=new Departments.Department ();
        }
          showForm(mydepartment);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        if (mycourse==null) {
            mycourse=new Courses.Course ();
        }
          showForm(mycourse);
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void changePass_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePass_btnActionPerformed
 if (myEdite==null) {
            myEdite=new Login_USER.EditeUser();
        }
          showForm(myEdite);
     
    }//GEN-LAST:event_changePass_btnActionPerformed

    private void UserLogin_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLogin_btn1ActionPerformed
         if (myuser==null) {
            myuser=new Login_USER.AddUser();
        }
          showForm(myuser);
         
        
    }//GEN-LAST:event_UserLogin_btn1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
   if (mycenter==null) {
            mycenter=new Branchs.Branch();
        }
          showForm(mycenter);
         
    }//GEN-LAST:event_jButton12ActionPerformed
Groups.Group mygroup;
    
    
      private void showForm(JInternalFrame Form)
    {
  
        
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
    private javax.swing.JButton UserLogin_btn1;
    private javax.swing.JButton changePass_btn;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    // End of variables declaration//GEN-END:variables
}
