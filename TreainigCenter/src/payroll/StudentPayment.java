/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import DatabaseConnection.OracleConn;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static treainigcenter.MDIHome.REPORTSPATH;
import static treainigcenter.MDIHome.jDesktopPane1;


public class StudentPayment extends javax.swing.JInternalFrame {

    
    public StudentPayment() {
        initComponents();
    }

     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        courseCombo = new javax.swing.JComboBox<>();
        paid = new javax.swing.JTextField();
        totalPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 =  new JTable(){
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
            }}
            ;
            jButton1 = new javax.swing.JButton();
            paidType = new javax.swing.JTextField();
            paidDate = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            reset = new javax.swing.JTextField();
            cycleValue = new javax.swing.JTextField();
            instructor = new javax.swing.JTextField();
            pct = new javax.swing.JTextField();
            groupNo = new javax.swing.JTextField();
            jLabel13 = new javax.swing.JLabel();
            lect = new javax.swing.JTextField();

            setClosable(true);
            setIconifiable(true);
            setTitle("Payment Recipt");
            setToolTipText("Payment Card");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png"))); // NOI18N

            jPanel1.setBackground(new java.awt.Color(105, 193, 251));

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel1.setText("Next Lecture No.");

            studentCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            studentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Name" }));
            studentCombo.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    studentComboFocusLost(evt);
                }
            });

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel2.setText("Paid Date");

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel3.setText("Total Price");

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel4.setText("The Rest");

            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel5.setText("Paid");
            jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel6.setText("Student");

            courseCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Name" }));
            courseCombo.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    courseComboAncestorAdded(evt);
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });
            courseCombo.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    courseComboFocusLost(evt);
                }
            });
            courseCombo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    courseComboActionPerformed(evt);
                }
            });

            paid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            paid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            paid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
            paid.addCaretListener(new javax.swing.event.CaretListener() {
                public void caretUpdate(javax.swing.event.CaretEvent evt) {
                    paidCaretUpdate(evt);
                }
            });
            paid.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    paidFocusGained(evt);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    paidFocusLost(evt);
                }
            });
            paid.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    paidKeyTyped(evt);
                }
            });

            totalPrice.setEditable(false);
            totalPrice.setBackground(new java.awt.Color(235, 235, 235));
            totalPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            totalPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            totalPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Recipt No.", "Student Name", "Paid Date", "Course - Group No.", "Course Price", "Paid", "Center Comission %", "Commision Value"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setGridColor(new java.awt.Color(255, 0, 0));
            jTable1.setRowHeight(35);
            jTable1.setRowMargin(2);
            jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jScrollPane1.setViewportView(jTable1);
            jTable1.setGridColor(Color.red);
            jTable1.setShowGrid(true);

            jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/sub.png"))); // NOI18N
            jButton1.setText("Submit Payment");
            jButton1.setIconTextGap(25);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            paidType.setEditable(false);
            paidType.setBackground(new java.awt.Color(230, 230, 230));
            paidType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            paidType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            paidType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            paidDate.setEditable(false);
            paidDate.setBackground(new java.awt.Color(230, 230, 230));
            paidDate.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            paidDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            paidDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel7.setText("Course");

            jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
            jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

            jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel8.setText(">>>");

            jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel9.setText("Group No");

            jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel10.setText("Course Paid Type");

            jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel11.setText("Cycle Value");

            jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel12.setText("Instructor Name");

            reset.setEditable(false);
            reset.setBackground(new java.awt.Color(230, 230, 230));
            reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            reset.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            reset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            cycleValue.setEditable(false);
            cycleValue.setBackground(new java.awt.Color(230, 230, 230));
            cycleValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            cycleValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            cycleValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            instructor.setEditable(false);
            instructor.setBackground(new java.awt.Color(230, 230, 230));
            instructor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            instructor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            instructor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            pct.setEditable(false);
            pct.setBackground(new java.awt.Color(230, 230, 230));
            pct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            pct.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            pct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            groupNo.setEditable(false);
            groupNo.setBackground(new java.awt.Color(230, 230, 230));
            groupNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            groupNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            groupNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel13.setText("Center Comission");

            lect.setEditable(false);
            lect.setBackground(new java.awt.Color(230, 230, 230));
            lect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            lect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            lect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(studentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(paidDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(20, 20, 20)
                            .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(groupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paidType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cycleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(instructor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pct, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lect, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(studentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(paidDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel10)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel11)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel12)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(groupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(paidType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(cycleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(instructor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(pct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(lect, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(vALIDATE())
{  
    if(verify()){
    OracleConn.insertSQL("payroll", "SEQpayroll.nextval","sysdate","select courseid from courses where coursename ='"+courseCombo.getSelectedItem()+"'","select stdid from students where stdname ='"+studentCombo.getSelectedItem()+"'",paid.getText().replaceAll("[EGP]", ""),"select max(tableid) from comissions",++k); 
    History();
   
   
    
    callreport(REPORTSPATH+"\\Reports\\Personel_payroll\\studentPayment.jasper",
        new Object[]{"stdNaME",studentCombo.getSelectedItem(),
                     "RciptNO",OracleConn.ret_value("select SEQpayroll.currval from dual"),
                     "Course_GROUP",courseCombo.getSelectedItem()+" - "+groupNo.getText(),
                     "Payment",paidType.getText(),
                     "coursePrice",totalPrice.getText(),
                     "paid",paid.getText(),
                     "stdid",OracleConn.ret_value("select stdid from students where stdname='"+studentCombo.getSelectedItem()+"'"),
        });
     reset();
    return;
    }else return;
}

else JOptionPane.showInternalMessageDialog(this, "Check Basic Data To pay","Validation",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void courseComboAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_courseComboAncestorAdded
        OracleConn.FullCombo(courseCombo,"courses", "COURSENAME", "COURSEBLOCKED='0' and payment<>'3' and NVL(ENDDATE,sysdate)>=sysdate"); 
        History();
    }//GEN-LAST:event_courseComboAncestorAdded

    private void courseComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseComboFocusLost
        
    }//GEN-LAST:event_courseComboFocusLost

    private void paidCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_paidCaretUpdate
     try{   if (!(paid.getText().equals("")||paid.getText().equals(null)))
            reset.setText( (Integer.parseInt(totalPrice.getText().replaceAll("EGP", "").trim())) -  (Integer.parseInt(paid.getText().replaceAll("EGP", "").trim())) +"  EGP");
     
     }
     catch(java.lang.NumberFormatException e){e.getMessage();}

    }//GEN-LAST:event_paidCaretUpdate

    private void paidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyTyped
TextValidation.TextInput_type.NumbersOnlny(evt, paid);
    }//GEN-LAST:event_paidKeyTyped

    private void paidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paidFocusLost
        if (!paid.getText().contains("EGP")) 
                paid.setText(paid.getText()+"  EGP");
    }//GEN-LAST:event_paidFocusLost

    private void studentComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentComboFocusLost
        try {
            
            float min=Float.parseFloat(OracleConn.ret_value("select factorbefore from comissions where tableid=(select max(tableid) from comissions)").toString());
            float max=Float.parseFloat(OracleConn.ret_value("select factoafter from comissions where tableid=(select max(tableid) from comissions)").toString());
            
            if (studentCombo.getSelectedIndex()!=0){
                groupNo.setText(OracleConn.ret_value("select  GROUPS.GROUPID from registers join groups on GROUPS.TABLEID=REGISTERS.GROUPSID where student_id=(select stdid from students where stdname ='"+studentCombo.getSelectedItem()+"') and GROUPS.COURSEID=(select courseid from courses where coursename='"+courseCombo.getSelectedItem()+"')").toString());
            
            OracleConn.executeQuery("select case (payment) WHEN '0' THEN 'One Time'  WHEN '1' THEN 'Per Session' WHEN '2' THEN 'Per Cycle'  WHEN '3' THEN 'Free + Profit ' WHEN '4' THEN 'Full Free' END,  employeename, nvl(to_char(CYCLE),'No Cycle'),(select comvalue from comissions where tableid=(select max(tableid)from comissions)) from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR where coursename ='"+courseCombo.getSelectedItem()+"'");
            while (OracleConn.rs.next()) {
            paidType.setText(OracleConn.rs.getString(1));
            instructor.setText(OracleConn.rs.getString(2));
            cycleValue.setText(OracleConn.rs.getString(3));
            
                if (((Float.parseFloat(totalPrice.getText().trim().replaceAll("EGP", ""))*OracleConn.rs.getFloat(4))/100)>max)  
                        pct.setText( max+"  EGP");
                else if(((Float.parseFloat(totalPrice.getText().trim().replaceAll("EGP", ""))*OracleConn.rs.getFloat(4))/100)<min)
                    pct.setText( min+"  EGP");
                else
                    pct.setText( (Float.parseFloat(totalPrice.getText().trim().replaceAll("EGP", ""))*OracleConn.rs.getFloat(4))/100+"  EGP");
                    
            
            }
            
            lect.setText(OracleConn.ret_value("select count(*)+1 from ATTENDANCE\n" +
"where CLOSESTATUS='0' and months=(select max(months)from attendance) and groupid=(select tableid from GROUPS where GROUPS.GROUPID="+groupNo.getText()+" and courseid =(select courseid from courses where coursename ='"+courseCombo.getSelectedItem()+"'))").toString());
            History();
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(StudentPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studentComboFocusLost

    private void paidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paidFocusGained
paid.setText("");
    }//GEN-LAST:event_paidFocusGained

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboActionPerformed
if (courseCombo.getSelectedIndex()!=0) 
        {        OracleConn.FullCombo(studentCombo, "registers \n" +
" JOIN students on students.stdid=REGISTERS.STUDENT_ID \n" +
" JOIN GROUPS on GROUPS.TABLEID=REGISTERS.GROUPSID", " DISTINCT(stdname)","GROUPS.COURSEID=(select courseid from courses where coursename ='"+courseCombo.getSelectedItem()+"')");
        
        
totalPrice.setText(OracleConn.ret_value("select  to_char( nvl(courseprice, ( select comvalue from comissions where tableid=(select max(tableid)from comissions))))from COURSES where coursename='"+courseCombo.getSelectedItem()+"'")+"  EGP");
paidDate.setText(new SimpleDateFormat("dd/MMM/YYYY hh:mm").format(new Date())+""); 
        paid.setEnabled(true);
        }
        else {
            for (int i = studentCombo.getItemCount()-1; i >0; i--) 
                studentCombo.removeItemAt(i);  
                totalPrice.setText("");
                paidDate.setText("");
                paid.setEnabled(false);
            }
History();
    }//GEN-LAST:event_courseComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JTextField cycleValue;
    private javax.swing.JTextField groupNo;
    private javax.swing.JTextField instructor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lect;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField paidDate;
    private javax.swing.JTextField paidType;
    private javax.swing.JTextField pct;
    private javax.swing.JTextField reset;
    private javax.swing.JComboBox<String> studentCombo;
    private javax.swing.JTextField totalPrice;
    // End of variables declaration//GEN-END:variables
  void reset()
    {
        courseCombo.setSelectedIndex(0);
        cycleValue.setText("");
        instructor.setText("");  
        groupNo.setText("");   
        lect.setText("");
        paid.setText("");
        paidDate.setText("");
        paidType.setText("");
        pct.setText("");
        reset.setText("");
        studentCombo.setSelectedIndex(0);
        totalPrice.setText("");
                
    }
    
    
int k=-1,seq=-1;
    
    private boolean vALIDATE(){
        if (Integer.parseInt(reset.getText().replaceAll("EGP", "").trim())!=0) {
            JOptionPane.showMessageDialog(null, "Review Paid Money Again");
            return false;
        }
        
        return  !(courseCombo.getSelectedIndex()==0||studentCombo.getSelectedIndex()==0||paid.getText().trim().replaceAll("EGP", "").equals(""));
    }
    
    String mysql;
    private void History(){
        mysql="";
        //if (courseCombo.getSelectedIndex()==0&&studentCombo.getSelectedIndex()==0) 
            mysql="select PAYROLL.tableid, stdname," +
"       to_char(paydate,'DD/MON/YYYY')," +
"       coursename "+ 
"       ,COURSES.COURSEPRICE||' EGP',paid||' EGP'," +
"       comvalue||' %'," +
"       (COURSES.COURSEPRICE*COMISSIONS.COMVALUE)/100 ||' EGP'" +
"from PAYROLL  " +
"JOIN STUDENTS on  STUDENTS.STDID = PAYROLL.STDID " +
"JOIN COURSES on COURSES.COURSEID=PAYROLL.COURSEID  " +
"JOIN COMISSIONS on PAYROLL.pct = COMISSIONS.TABLEID " ;
        
        if(courseCombo.getSelectedIndex()!=0)
            mysql=mysql+" where COURSES.COURSENAME='"+courseCombo.getSelectedItem()+"'";
        
        if(studentCombo.getSelectedIndex()!=0) 
            mysql=mysql+" and stdname='"+studentCombo.getSelectedItem()+"'";
        
        
    OracleConn.QueryinTABLE(mysql, jTable1);
    
    //<editor-fold defaultstate="collapsed" desc="Column Set Sizes">
        for (int column = 0; column < jTable1.getColumnCount(); column++) {
            TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < jTable1.getRowCount(); row++) {
                TableCellRenderer cellRenderer = jTable1.getCellRenderer(row, column);
                Component c = jTable1.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + jTable1.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);

                //  We've exceeded the maximum width, no need to check other rows
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth + 20);

        }
  // </editor-fold> 
    
    
    }
    
    private boolean verify(){
        String res=OracleConn.ret_value("select payment from courses where coursename='"+courseCombo.getSelectedItem()+"'").toString();
        
        //oneShoot
        if (res.equals("0")) 
        {  
            for (int i = 0; i < jTable1.getRowCount(); i++)
              if (jTable1.getValueAt(i, 1).equals(studentCombo.getSelectedItem()))
              {JOptionPane.showInternalMessageDialog(this, "This Person Already Paid Before","Validation",JOptionPane.INFORMATION_MESSAGE);
                    return false;
              }
            return true;
        }   
        
        
        //persession
        if (res.equals("1")) 
        {  for (int i = 0; i < jTable1.getRowCount(); i++) 
              if (jTable1.getValueAt(i, 1).equals(studentCombo.getSelectedItem())&&jTable1.getValueAt(i, 2).toString().toLowerCase().equals(paidDate.getText().toLowerCase().substring(0, 11))) {  /*Verify Paid Date Format*/ 
                    JOptionPane.showInternalMessageDialog(this, "This Person Already Paid This Session","Validation",JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
              return true;
        }   

        //Cycle
        if (res.equals("2")) 
        {
            try{
             k=Integer.parseInt(OracleConn.ret_value("select max(nvl(seq,-1)) from payroll where courseid=(select courseid from courses where coursename ='"+courseCombo.getSelectedItem()+"') and STDID=(select stdid from students where stdname='"+studentCombo.getSelectedItem()+"')").toString());
            }catch(NullPointerException e){}
            
            try{
               seq=Integer.parseInt(OracleConn.ret_value("select max(seq) from Attendance").toString());
            }catch(NullPointerException e){}
            
            
            if (k==seq&&k>seq) {
JOptionPane.showInternalMessageDialog(this, "This Person Already Paid In This Cycle","Validation",JOptionPane.INFORMATION_MESSAGE);
return false;
            }
            else
            return true;
        }   

        
         //profit       
        if (res.equals("4")) 
        {  for (int i = 0; i < jTable1.getRowCount(); i++) 
              if (jTable1.getValueAt(i, 1).equals(studentCombo.getSelectedItem())&&jTable1.getValueAt(i, 2).toString().toLowerCase().equals(paidDate.getText().toLowerCase().substring(0, 11))) {  /*Verify Paid Date Format*/ 
                    JOptionPane.showInternalMessageDialog(this, "This Person Already Paid Comission Before","Validation",JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
              return true;
        }   


        
        return false;
    }
    
    
    private void callreport(String PathJasper, Object[] Parameter) {

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
            e.printStackTrace();
            
        }
    }

    
  

}
