/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendances;

import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import Table_List_Property.AllProperty;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class Attendance extends javax.swing.JInternalFrame {

    String t;
    
    public Attendance() {
        initComponents();
        Calendar d=new GregorianCalendar();
        System.err.println(d.get(Calendar.DAY_OF_WEEK));
    }
    

    public Attendance(String course,String group) {
        initComponents();
        course_txt_manul.setText(course);
        group_txt_manul.setText(group);
        }


    
    public Attendance(String Title) {
        initComponents();
   t=Title;
         
   course_txt_manul.setText(Title.substring(6, Title.indexOf("-")));
        
   group_txt_manul.setText(Title.substring(Title.indexOf("-G")+2, Title.indexOf("<br>")));
        
        
    }

 
    Attendances.AttendaceClass myClass=new AttendaceClass();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        courseCombo_manual = new javax.swing.JComboBox<>();
        groupCombo_maual = new javax.swing.JComboBox<>();
        group_txt_manul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        course_txt_manul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        regTime_txt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        student_txt_advance = new javax.swing.JTextField();
        allGroup_Radio = new javax.swing.JRadioButton();
        sameGroup_Radio = new javax.swing.JRadioButton();
        student_txt_manual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_mnula = new javax.swing.JList<>(listModel_MANUL);
        jScrollPane2 = new javax.swing.JScrollPane();
        list_advance = new javax.swing.JList<>(listModel_ADVANCES);
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new JTable(){
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

            setBackground(new java.awt.Color(180, 236, 255));
            setClosable(true);
            setIconifiable(true);
            setTitle("Take Attendance");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/attenBig.png"))); // NOI18N
            setOpaque(true);

            jPanel1.setBackground(new java.awt.Color(180, 236, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Attendance Sheet"));
            jPanel1.setAutoscrolls(true);

            courseCombo_manual.setVisible(false);
            courseCombo_manual.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
            courseCombo_manual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Name" }));
            courseCombo_manual.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    courseCombo_manualFocusLost(evt);
                }
            });

            groupCombo_maual.setVisible(false);
            groupCombo_maual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            groupCombo_maual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group NO." }));
            groupCombo_maual.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    groupCombo_maualFocusLost(evt);
                }
            });

            group_txt_manul.setEditable(false);
            group_txt_manul.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            group_txt_manul.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/search.png"))); // NOI18N
            jLabel3.setText("Student");
            jLabel3.setIconTextGap(0);

            course_txt_manul.setEditable(false);
            course_txt_manul.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            course_txt_manul.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/search.png"))); // NOI18N
            jLabel5.setToolTipText("Change Course");
            jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jLabel5.setFocusCycleRoot(true);
            jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel5MouseClicked(evt);
                }
            });

            jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/search.png"))); // NOI18N
            jLabel37.setToolTipText("Change Group");
            jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel37MouseClicked(evt);
                }
            });

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText("Course");

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel6.setText("Reg. Time");

            regTime_txt.setEditable(false);
            regTime_txt.setBackground(new java.awt.Color(255, 255, 102));
            regTime_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            regTime_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            regTime_txt.setToolTipText("Entrance Time");
            regTime_txt.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    regTime_txtAncestorAdded(evt);
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });

            jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
            jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 255));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel4.setText("Searching in Advance");

            student_txt_advance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            student_txt_advance.setToolTipText("Search Student by Name");
            student_txt_advance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
            student_txt_advance.addCaretListener(new javax.swing.event.CaretListener() {
                public void caretUpdate(javax.swing.event.CaretEvent evt) {
                    student_txt_advanceCaretUpdate(evt);
                }
            });

            buttonGroup1.add(allGroup_Radio);
            allGroup_Radio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            allGroup_Radio.setText("All Courses");
            allGroup_Radio.setOpaque(false);

            buttonGroup1.add(sameGroup_Radio);
            sameGroup_Radio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            sameGroup_Radio.setSelected(true);
            sameGroup_Radio.setText("In Same Course");
            sameGroup_Radio.setOpaque(false);

            student_txt_manual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            student_txt_manual.setToolTipText("Search Student by Name");
            student_txt_manual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 2, true));
            student_txt_manual.addCaretListener(new javax.swing.event.CaretListener() {
                public void caretUpdate(javax.swing.event.CaretEvent evt) {
                    student_txt_manualCaretUpdate(evt);
                }
            });

            jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
            jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/search.png"))); // NOI18N
            jLabel11.setText("Student");
            jLabel11.setIconTextGap(0);

            jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 0, 255));
            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel9.setText("Manual Searching");

            jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel12.setText("GroupNo.");

            jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

            list_mnula.setBackground(new java.awt.Color(204, 255, 255));
            list_mnula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            list_mnula.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            list_mnula.setToolTipText("Hit Enter To Select");
            list_mnula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            list_mnula.setSelectionBackground(new java.awt.Color(255, 0, 0));
            list_mnula.setValueIsAdjusting(true);
            list_mnula.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    list_mnulaMouseClicked(evt);
                }
            });
            list_mnula.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    list_mnulaKeyPressed(evt);
                }
            });
            jScrollPane1.setViewportView(list_mnula);

            jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

            list_advance.setBackground(new java.awt.Color(204, 255, 255));
            list_advance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            list_advance.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            list_advance.setToolTipText("Hit Enter To Select");
            list_advance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            list_advance.setSelectionBackground(new java.awt.Color(255, 0, 0));
            list_advance.setValueIsAdjusting(true);
            list_advance.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    list_advanceMouseClicked(evt);
                }
            });
            list_advance.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    list_advanceKeyPressed(evt);
                }
            });
            jScrollPane2.setViewportView(list_advance);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course_txt_manul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(courseCombo_manual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(group_txt_manul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(groupCombo_maual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(student_txt_manual, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regTime_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(sameGroup_Radio)
                            .addGap(11, 11, 11)
                            .addComponent(allGroup_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(student_txt_advance, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jLabel3)
                    .addGap(154, 154, 154)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(course_txt_manul, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseCombo_manual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(group_txt_manul, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(groupCombo_maual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(student_txt_manual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(regTime_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel37))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jLabel11))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sameGroup_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(allGroup_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(student_txt_advance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jScrollPane5.setBackground(new java.awt.Color(153, 204, 0));
            jScrollPane5.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

            jTable2.setAutoCreateRowSorter(true);
            jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "id", "Course Name- Group No.", "Student Name", "Lecture NO.", "Lec Date ", "Entrance At"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable2.setToolTipText("Attendance Sheet Time Line");
            jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            jTable2.setGridColor(new java.awt.Color(255, 0, 0));
            jTable2.setRowHeight(30);
            jTable2.setRowMargin(2);
            jTable2.setSelectionBackground(new java.awt.Color(102, 255, 255));
            jTable2.setSelectionForeground(new java.awt.Color(0, 0, 255));
            jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTable2.getTableHeader().setResizingAllowed(false);
            jTable2.getTableHeader().setReorderingAllowed(false);
            jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    jTable2AncestorAdded(evt);
                    column(evt);
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });
            jScrollPane5.setViewportView(jTable2);
            AllProperty.hideIDColumn(jTable2);
            // event on row selected changed

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents
Date dNow =null;
SimpleDateFormat ft=null;
    private void regTime_txtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_regTime_txtAncestorAdded
dNow = new Date( );
ft =   new SimpleDateFormat ("E dd-MM-YYYY 'At' hh:mm a");
regTime_txt.setText(ft.format(dNow));
    }//GEN-LAST:event_regTime_txtAncestorAdded

    
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        courseCombo_manual.setVisible(true);      
 OracleConn.FullCombo(courseCombo_manual, "courses", "COURSENAME", "COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate");     
    }//GEN-LAST:event_jLabel5MouseClicked

    private void courseCombo_manualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseCombo_manualFocusLost

 if (courseCombo_manual.getSelectedIndex()==0) {
            JOptionPane.showInternalMessageDialog(this,  "Please Choose Course Name","Alert",JOptionPane.ERROR_MESSAGE);
       //     courseCombo_manual.setVisible(true);
            courseCombo_manual.requestFocus();
        }
 
 else{ courseCombo_manual.setVisible(false);
 course_txt_manul.setText(courseCombo_manual.getSelectedItem().toString());
 }
    }//GEN-LAST:event_courseCombo_manualFocusLost

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
     groupCombo_maual.setVisible(true);
     OracleConn.FullCombo(groupCombo_maual, "groups", "groupID", "courseid=(select courseid from courses where coursename='"+courseCombo_manual.getSelectedItem()+"')");            
    }//GEN-LAST:event_jLabel37MouseClicked

    private void groupCombo_maualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_groupCombo_maualFocusLost

        if (groupCombo_maual.getSelectedIndex()==0&&groupCombo_maual.getItemCount()>=0) {
            JOptionPane.showInternalMessageDialog(this, "Please Choose Group No.","Alert",JOptionPane.ERROR_MESSAGE);
            groupCombo_maual.setVisible(true);
            //if(courseCombo_manual.getSelectedIndex()!=0)
           // groupCombo_maual.requestFocus();
        }

        else {groupCombo_maual.setVisible(false);        
        jTable2AncestorAdded(null);
        
     group_txt_manul.setText(groupCombo_maual.getSelectedItem().toString());
   
        }
    }//GEN-LAST:event_groupCombo_maualFocusLost

    private void student_txt_manualCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_student_txt_manualCaretUpdate
        if (student_txt_manual.getText().length()>2) {           
querylist("select stdname from students where stdid  in " +
"("+ 
"  select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS" +
"  on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES" +
"  on GROUPS.COURSEID = COURSES.COURSEID" +
"  WHERE COURSES.COURSENAME=('"+course_txt_manul.getText()+"') AND" +
"  REGISTERS.GROUPSID=(" +
"                      select groups.TABLEID from groups where GROUPS.groupID="+group_txt_manul.getText()+" " +
"                      AND" +
"                      GROUPS.COURSEID=" +
"                                       (" +
"                                          select courseid from COURSES WHERE COURSES.COURSENAME='"+course_txt_manul.getText()+"'" +
"                                       )" +
"                      )" +
")  and  lower(stdname) like'%"+student_txt_manual.getText().toLowerCase()+"%' ", list_mnula, listModel_MANUL);
            
}
        else list_mnula.removeAll();
        
    }//GEN-LAST:event_student_txt_manualCaretUpdate

    private void student_txt_advanceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_student_txt_advanceCaretUpdate
if (student_txt_advance.getText().length()>2&&sameGroup_Radio.isSelected()) {
           
    querylist("select stdname from students where stdid not in " +
            "( " +
            "select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS " +
            "on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES " +
            "on GROUPS.COURSEID = COURSES.COURSEID " +
            "WHERE COURSES.COURSENAME=('"+courseCombo_manual.getSelectedItem()+"') and lower(stdname) like'%"+student_txt_advance.getText().toLowerCase()+"%'" +
            ")", list_advance,listModel_ADVANCES);
        }
else if(student_txt_advance.getText().length()>2)  querylist("select stdname from students where lower(stdname) like'%"+student_txt_advance.getText().toLowerCase()+"%' ", list_advance,listModel_ADVANCES);

else list_advance.removeAll();
    }//GEN-LAST:event_student_txt_advanceCaretUpdate

    private void list_mnulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list_mnulaKeyPressed
   if (evt.getKeyCode()==KeyEvent.VK_ENTER) 
           actionlist(list_mnula);
         jTable2AncestorAdded(null);
    }//GEN-LAST:event_list_mnulaKeyPressed

    private void list_mnulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_mnulaMouseClicked
if(evt!=null)      {  if (evt.getClickCount()==2) 
            actionlist(list_mnula);
         jTable2AncestorAdded(null);
}
    }//GEN-LAST:event_list_mnulaMouseClicked

    private void list_advanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list_advanceKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) 
           actionlist(list_advance);
          
    }//GEN-LAST:event_list_advanceKeyPressed

    private void list_advanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_advanceMouseClicked
         if (evt.getClickCount()==2) 
            actionlist(list_advance);
    }//GEN-LAST:event_list_advanceMouseClicked

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded

        if(array[3]==1)
    OracleConn.QueryinTABLE("SELECT SUBATTEND.TABLEID, coursename||'-'||GROUPS.groupid,stdname,lecnumber,to_char(ATTENDANCE.MONTHS,'DD-MON-YYYY'),to_char(regtime,'HH:MI AM') from " +
" ATTENDANCE JOIN SUBATTEND on SUBATTEND.PARENTID = ATTENDANCE.TABLEID " +
" join GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID " +
" JOIN COURSES   " +
" on GROUPS.COURSEID = COURSES.COURSEID " +
" JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID " +
" WHERE closestatus=1 and TO_DATE(ATTENDANCE.months)>=TO_DATE(sysdate,'DD/MON/YYYY')  AND" +
"  ATTENDANCE.groupid=  " +
"                  (select tableid from groups where groupid="+group_txt_manul.getText()+" and courseid=( " +
"                                                      select COURSES.COURSEID from  COURSES WHERE COURSES.COURSENAME='"+course_txt_manul.getText()+"')) " +
"AND to_timestamp(SUBATTEND.REGTIME)>=to_timestamp('00:00:00.01','HH24:MI:SS.ff')" , jTable2);
    
        jTable2.setShowGrid(true);
column(null);
    }//GEN-LAST:event_jTable2AncestorAdded

    private void column(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_column
//--  column Size to content---


for (int column = 0; column < jTable2.getColumnCount(); column++)
{
    TableColumn tableColumn = jTable2.getColumnModel().getColumn(column);
    int preferredWidth = tableColumn.getMinWidth();
    int maxWidth = tableColumn.getMaxWidth();
 
    for (int row = 0; row < jTable2.getRowCount(); row++)
    {
        TableCellRenderer cellRenderer = jTable2.getCellRenderer(row, column);
        Component c = jTable2.prepareRenderer(cellRenderer, row, column);
        int width = c.getPreferredSize().width + jTable2.getIntercellSpacing().width;
        preferredWidth = Math.max(preferredWidth, width);
 
        //  We've exceeded the maximum width, no need to check other rows
 
        if (preferredWidth >= maxWidth)
        {
            preferredWidth = maxWidth;
            break;
        }
    }
  if ((preferredWidth+20)>( jTable2.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*8))  
        tableColumn.setPreferredWidth( preferredWidth+20 );
     
     
    else tableColumn.setPreferredWidth(     jTable2.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*8);

}

    }//GEN-LAST:event_column

    
     DefaultListModel listModel_MANUL= new DefaultListModel();
     DefaultListModel listModel_ADVANCES= new DefaultListModel();
    
     
     void actionlist(JList kl)
     {
            for (int i = 0; i < jTable2.getRowCount(); i++) {
            if (kl.getSelectedValue().equals(jTable2.getValueAt(i, 2))) {
                JOptionPane.showInternalMessageDialog(this, "This Person Already Register");
                return;
            }
        }
        
        myClass.insert( kl.getSelectedValue().toString(),course_txt_manul.getText(),group_txt_manul.getText());
     
        listModel_MANUL.removeAllElements();
        listModel_ADVANCES.removeAllElements();
        
        dNow = new Date( );
regTime_txt.setText(ft.format(dNow));
     }
     
     
    void querylist(String sql,JList l,DefaultListModel d)
    {
        d.removeAllElements();
     
        try {
            OracleConn.executeQuery(sql);
            
            while (OracleConn.rs.next()) {
                d.addElement(OracleConn.rs.getString("stdname"));
            }
                       
            
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allGroup_Radio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> courseCombo_manual;
    public javax.swing.JTextField course_txt_manul;
    private javax.swing.JComboBox<String> groupCombo_maual;
    public javax.swing.JTextField group_txt_manul;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JList<String> list_advance;
    private javax.swing.JList<String> list_mnula;
    private javax.swing.JTextField regTime_txt;
    private javax.swing.JRadioButton sameGroup_Radio;
    private javax.swing.JTextField student_txt_advance;
    private javax.swing.JTextField student_txt_manual;
    // End of variables declaration//GEN-END:variables
}
