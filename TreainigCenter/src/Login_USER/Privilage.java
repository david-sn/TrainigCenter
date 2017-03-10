
package Login_USER;

import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.con;
import static DatabaseConnection.OracleConn.rs;
import static DatabaseConnection.OracleConn.sql;
import static DatabaseConnection.OracleConn.stat;
import Files.Error_Dynamic;
import Table_List_Property.AllProperty;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

 
public class Privilage extends javax.swing.JInternalFrame {
 

public Privilage() {
        initComponents();
        OracleConn.FullCombo(jComboBox2, "users", "username","blocked ='0' and locked='0'");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        form = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JCheckBox();
        edit = new javax.swing.JCheckBox();
        delete = new javax.swing.JCheckBox();
        show = new javax.swing.JCheckBox();
        open = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(){
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
                Component returnComp = super.prepareRenderer(renderer, row, column);
                Color alternateColor = new Color(252,242,206);
                Color whiteColor = Color.WHITE;
                if (!returnComp.getBackground().equals(getSelectionBackground())){
                    Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
                    returnComp .setBackground(bg);
                    bg = null;
                }
                return returnComp;
            }};

            setClosable(true);
            setIconifiable(true);
            setTitle("System privilage");
            setToolTipText("Assign System privilage to User");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/privilege-icon.png"))); // NOI18N

            jPanel1.setBackground(new java.awt.Color(180, 236, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign Privilage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

            form.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Form Title...", "Attendance", "Branch", "Center Comission", "Center", "Course", "Dashboard", "Department", "Exam", "Exams Detail", "Group", "Add User", "Edite User", "Privilage", "Register", "Student", "Employee", "Student Payment" }));
            form.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    formItemStateChanged(evt);
                }
            });
            form.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    formFocusLost(evt);
                }
            });

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
            jLabel2.setText("User Name");

            jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select UserName..." }));
            jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    jComboBox2FocusLost(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
            jLabel3.setText("Form Title");

            jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/sub.png"))); // NOI18N
            jButton1.setText("Apply");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true), "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
            jPanel2.setOpaque(false);

            add.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            add.setText("Add Record");
            add.setOpaque(false);

            edit.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            edit.setText("Edit Record");
            edit.setOpaque(false);

            delete.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            delete.setText("Delete Record");
            delete.setOpaque(false);

            show.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            show.setText("Show Data");
            show.setOpaque(false);

            open.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            open.setText("Open Form");
            open.setOpaque(false);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(open))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel2)
                    .addGap(5, 5, 5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(595, 595, 595)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jTable1.setGridColor(Color.red);
            jTable1.setShowGrid(true);
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "User Name", "Form Title", "Add Record", "Edit Record", "Delete Record", "Show Data", "Open Form"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setRowHeight(32);
            jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jScrollPane1.setViewportView(jTable1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost

   
         filltable(jComboBox2.getSelectedItem().toString(),forms(form));
    }//GEN-LAST:event_jComboBox2FocusLost

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost

    }//GEN-LAST:event_formFocusLost
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        OracleConn.updateSQL("update validations set ADDING='"+getval(add)+"'  ,EDITE='"+getval(edit)+"'  ,REMOVE='"+getval(delete)+"'   ,VIEWDATA='"+getval(show)+"'   ,SHOWFORM='"+getval(open)+"'   where USER_ID=(select USER_ID from users where username='"+jComboBox2.getSelectedItem()+"')   and  FORMID='"+forms(form)+"'");        
        filltable(jComboBox2.getSelectedItem().toString(), form.getSelectedItem().toString());

        reset();
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    void reset(){
    form.setSelectedIndex(0);
    jComboBox2.setSelectedIndex(0);
    add.setSelected(false);
    edit.setSelected(false);
    delete.setSelected(false);
    show.setSelected(false);
    open.setSelected(false);
    }
    
    private void formItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_formItemStateChanged
         filltable(jComboBox2.getSelectedItem().toString(), forms(form));
         
 if (jTable1.getRowCount()==1) {     
    add.setSelected((boolean)jTable1.getValueAt(0, 2));
    edit.setSelected((boolean)jTable1.getValueAt(0, 3));
    delete.setSelected((boolean)jTable1.getValueAt(0,4));
    show.setSelected((boolean)jTable1.getValueAt(0, 5));
    open.setSelected((boolean)jTable1.getValueAt(0, 6));
        }
        
    }//GEN-LAST:event_formItemStateChanged

    String getval(JCheckBox j){
        if (j.isSelected()) 
            return "1";
        
        else return "0";
    }
    
    void filltable(String user,String Form){
    
    
         AllProperty.clearRows(jTable1);
     
     try {
         DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
        
             rs=stat.executeQuery("select USERNAME,SUBSTR(FORMID,INSTR(FORMID,'.')+1,LENGTH(FORMID)),ADDING,EDITE,REMOVE,VIEWDATA,SHOWFORM     from validations v join users u on v.USER_ID=u.USER_ID  where v.USER_ID=(select USER_ID from users where USERNAME='"+user+"') and FORMID like '%"+Form+"%'"); 
         
         
         while (rs.next()) {
             mod.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getBoolean(3),rs.getBoolean(4),rs.getBoolean(5),rs.getBoolean(6),rs.getBoolean(7) });
             
         }
         
//           stat.setMaxRows(0);
         
         
     }catch(java.lang.NullPointerException r ){Error_Dynamic.getERRORS(OracleConn.class.getName()+"  >> QueryinTABLE(String sql,JTable table ) Method", r);} 
     catch (SQLException ex) {
         Error_Dynamic.getERRORS(OracleConn.class.getName()+"  >> QueryinTABLE(String sql,JTable table ) Method", sql, ex);
     JOptionPane.showMessageDialog(null, ex.getErrorCode()+"-"+ex.getLocalizedMessage()+"\n Please Contact with System Admin","Error",0);
     }
          
        
        
    }

    String forms(JComboBox g)
    {
         
        switch(g.getSelectedIndex())
        {
            case 0: return "%";
            case 1: return "Attendances.Attendance";
            case 2: return "Branchs.Branch";
            case 3: return "CenterComission.Comissions";
            case 4: return "Centers.Center";
            case 5: return "Courses.Course";
            case 6: return "Dashboard.ParentDash";
            case 7: return "Departments.Department";
            case 8: return "Exams.Exams";
            case 9: return "Exams.ExamsDetail";
            case 10: return "Groups.Group";
            case 11: return "Login_USER.AddUser";
            case 12: return "Login_USER.EditeUser";
            case 13: return "Privilage";
            case 14: return "Registers.Regester";
            case 15: return "Students.Students";
            case 16: return "employees.employees";
            case 17: return "payroll.StudentPayment";
            default: return "%";
        }
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox add;
    private javax.swing.JCheckBox delete;
    private javax.swing.JCheckBox edit;
    private javax.swing.JComboBox<String> form;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox open;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
