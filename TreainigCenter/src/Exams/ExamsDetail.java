package Exams;

import Table_List_Property.AllProperty;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;



public class ExamsDetail extends javax.swing.JInternalFrame implements ItopBarPanel{


    public ExamsDetail() { 
            initComponents();     
            OracleConn.FullCombo(course_combo,"courses", "COURSENAME", "COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate");
   }
    
    
    
 private  ExamsClass MyClass =new ExamsClass();

 boolean doubledclicked=false;
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
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
            jPanel2 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            paper_text = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            course_combo = new javax.swing.JComboBox<>();
            jLabel7 = new javax.swing.JLabel();
            exame_combo1 = new javax.swing.JComboBox<>();
            student_combo = new javax.swing.JComboBox<>();
            top1 = new BasicFormsTraining.top();
            for(Component c:top1.getComponents()){
                if (c instanceof JButton) {
                    ((JButton) c).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if( ((JButton) c).getText().equals("New") ) {   New(top1,jPanel2); return;}
                            if( ((JButton) c).getText().equals("Add") ){  if( isNull() ) {insert();MyClass.viewTable2(jTable1);Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data", "Validation", 0);} return;}
                            if( ((JButton) c).getText().equals("Edit") ){if( isNull() ){ update();  MyClass.viewTable2(jTable1);Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}}
                            if( ((JButton) c).getText().equals("Delete") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;MyClass.viewTable(jTable1);Clear(jPanel2) ;return;}
                            if( ((JButton) c).getText().equals("First") ) {First(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("Next") ) {Next(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("previous") ) {Previous(jTable1,top1);return;}
                            if( ((JButton) c).getText().equals("Last") ) {End(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("Search") ){ Search();return;}
                            if( ((JButton) c).getText().equals("Clear") ) {Clear(jPanel2) ;MyClass.viewTable2(jTable1);return;}
                            if( ((JButton) c).getText().equals("Close") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Close This Page ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Close() ;return;}
                        }
                    });
                }
            }

            if(array[0]==0)
            {
                top1.btnAddNew.setEnabled(false);
                top1.btnSearch.setEnabled(false);
            }
            if(array[1]==0){top1.btnEdite.setEnabled(false);}
            if(array[2]==0){top1.btnDelete.setEnabled(false);}
            jMenuBar1 = new javax.swing.JMenuBar();
            NTrans = new javax.swing.JMenu();
            NADD = new javax.swing.JMenuItem();
            NEDITE = new javax.swing.JMenuItem();
            NDELETE = new javax.swing.JMenuItem();
            jSeparator2 = new javax.swing.JPopupMenu.Separator();
            NSEARCH = new javax.swing.JMenuItem();
            NCLEAR = new javax.swing.JMenuItem();
            jSeparator1 = new javax.swing.JPopupMenu.Separator();
            NEXITE = new javax.swing.JMenuItem();
            NNavig = new javax.swing.JMenu();
            NFIRST = new javax.swing.JMenuItem();
            jSeparator3 = new javax.swing.JPopupMenu.Separator();
            NNEXT = new javax.swing.JMenuItem();
            NPREVI = new javax.swing.JMenuItem();
            jSeparator4 = new javax.swing.JPopupMenu.Separator();
            NLAST = new javax.swing.JMenuItem();

            setForeground(java.awt.Color.white);
            setIconifiable(true);
            setTitle("Exame Details");
            setToolTipText("Exame Information");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/exambig.png"))); // NOI18N
            setOpaque(true);
            setVisible(false);

            jPanel1.setBackground(new java.awt.Color(180, 236, 255));
            jPanel1.setAutoscrolls(true);
            jPanel1.setFocusCycleRoot(true);

            jScrollPane1.setBackground(new java.awt.Color(153, 204, 0));
            jScrollPane1.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

            jTable1.setAutoCreateRowSorter(true);
            jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "id", "Exam Name", "Exam Date", "Range Degree", "Course - Group", "Student Name", "Student Degree"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setToolTipText("Last 50 Employee Record");
            jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            jTable1.setDropMode(javax.swing.DropMode.ON);
            jTable1.setGridColor(new java.awt.Color(255, 0, 0));
            jTable1.setRowHeight(30);
            jTable1.setRowMargin(2);
            jTable1.setSelectionBackground(new java.awt.Color(102, 255, 255));
            jTable1.setSelectionForeground(new java.awt.Color(0, 0, 255));
            jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jTable1.getTableHeader().setResizingAllowed(false);
            jTable1.getTableHeader().setReorderingAllowed(false);
            jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    jTable1AncestorAdded(evt);
                    column(evt);
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTable1MouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTable1);
            AllProperty.hideIDColumn(jTable1);
            jTable1.setShowGrid(true);

            // event on row selected changed

            jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                int k=0;
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if( k%2==0){
                        for(Component c:top1.getComponents()){
                            if (c instanceof JButton &&((JButton)c).getText().equals("Add")){
                                ((JButton)c).setText("New");
                                ((JButton)c).setIcon(new ImageIcon("A:\\My programs\\TreainigCenter\\src\\IconUsed\\database-add-icon.png"));
                                continue;
                            }
                            if( ((JButton) c).getText().equals("Edite") ){ c.setEnabled(false); }
                            if( ((JButton) c).getText().equals("Delete") ) { c.setEnabled(false);}
                        }

                        //  if  (jTable1.getSelectedRow()!=-1)
                        if (jTable1.getSelectedRow()==0) {
                            top1.btnPrev.setEnabled(false);
                            top1.btnNext.setEnabled(true);
                            top1.btnLast.setEnabled(true);
                            top1.btnFirst.setEnabled(false);
                        } else
                        if (jTable1.getSelectedRow()==(jTable1.getRowCount()-1)) {
                            top1.btnLast.setEnabled(false);//last
                            top1.btnFirst.setEnabled(true);//first
                            top1.btnNext.setEnabled(false);//next
                            top1.btnPrev.setEnabled(true);//prev
                        }
                        else  if (jTable1.getSelectedRow()==(jTable1.getRowCount()-1)) {

                            top1.btnNext.setEnabled(false);
                            top1.btnLast.setEnabled(false);
                            top1.btnFirst.setEnabled(true);
                            top1.btnPrev.setEnabled(true);
                        }

                        else   if (jTable1.getSelectedRow()==0) {

                            top1.btnNext.setEnabled(true);
                            top1.btnLast.setEnabled(true);
                            top1.btnFirst.setEnabled(false);
                            top1.btnPrev.setEnabled(false);
                        }

                        else{
                            top1.btnNext.setEnabled(true);
                            top1.btnLast.setEnabled(true);
                            top1.btnFirst.setEnabled(true);
                            top1.btnPrev.setEnabled(true);
                        }

                        top1.btnEdite.setEnabled(false);

                        top1.btnDelete.setEnabled(false);

                    }
                    k=k+1;
                }
            });

            jPanel2.setBackground(new java.awt.Color(105, 186, 252));
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Register", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
            jPanel2.setOpaque(false);

            jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText("Course");

            jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("Exame");

            paper_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            paper_text.setToolTipText("<html>\nPlease Enter Employee Salary  <br>\n<b>Example:</b>1200\n</html>");
            paper_text.setDragEnabled(true);

            jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel6.setText("Student");

            course_combo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            course_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Name" }));
            course_combo.setToolTipText("<html>\nPlease Enter Employee Department  <br>\n<b>Example:</b>Seceratery ..\n</html>");
            course_combo.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    course_comboItemStateChanged(evt);
                }
            });

            jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Paper Degree");

            exame_combo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            exame_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exame Name" }));
            exame_combo1.setToolTipText("<html>\nPlease Enter Employee Department  <br>\n<b>Example:</b>Seceratery ..\n</html>");
            exame_combo1.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    exame_combo1ItemStateChanged(evt);
                }
            });

            student_combo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            student_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Name" }));
            student_combo.setToolTipText("<html>\nPlease Enter Employee Department  <br>\n<b>Example:</b>Seceratery ..\n</html>");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(158, 158, 158)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(exame_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(5, 5, 5)
                    .addComponent(student_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(158, 158, 158)
                    .addComponent(jLabel7)
                    .addGap(5, 5, 5)
                    .addComponent(paper_text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exame_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(student_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paper_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            top1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), null));
            top1.setOpaque(false);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
            );

            NTrans.setText("Transaction  ");
            NTrans.setToolTipText("Transaction Submenu");
            NTrans.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
            NTrans.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NTRA.png"))); // NOI18N

            NADD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
            NADD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NADD.png"))); // NOI18N
            NADD.setText("Add New Record");
            NADD.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NADDActionPerformed(evt);
                }
            });
            NTrans.add(NADD);

            NEDITE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
            NEDITE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NEDITE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NEDITE.png"))); // NOI18N
            NEDITE.setText("Edite Record");
            NEDITE.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NEDITEActionPerformed(evt);
                }
            });
            NTrans.add(NEDITE);

            NDELETE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
            NDELETE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NDELETE.png"))); // NOI18N
            NDELETE.setText("Delete Record");
            NDELETE.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NDELETEActionPerformed(evt);
                }
            });
            NTrans.add(NDELETE);
            NTrans.add(jSeparator2);

            NSEARCH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.ALT_MASK));
            NSEARCH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NSEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NSEARCH.png"))); // NOI18N
            NSEARCH.setText("Search in Records");
            NSEARCH.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NSEARCHActionPerformed(evt);
                }
            });
            NTrans.add(NSEARCH);

            NCLEAR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK));
            NCLEAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NCLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NCLEAr.png"))); // NOI18N
            NCLEAR.setText("Clear Form");
            NCLEAR.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NCLEARActionPerformed(evt);
                }
            });
            NTrans.add(NCLEAR);
            NTrans.add(jSeparator1);

            NEXITE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
            NEXITE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NEXITE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NEXITE.png"))); // NOI18N
            NEXITE.setText("Exite");
            NEXITE.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NEXITEActionPerformed(evt);
                }
            });
            NTrans.add(NEXITE);

            jMenuBar1.add(NTrans);

            NNavig.setText("Navigation  ");
            NNavig.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

            NFIRST.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.ALT_MASK));
            NFIRST.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NFIRST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NFIRST.png"))); // NOI18N
            NFIRST.setText("First Record");
            NFIRST.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NFIRSTActionPerformed(evt);
                }
            });
            NNavig.add(NFIRST);
            NNavig.add(jSeparator3);

            NNEXT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.ALT_MASK));
            NNEXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NNEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NNEXT.png"))); // NOI18N
            NNEXT.setText("Next Record");
            NNEXT.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NNEXTActionPerformed(evt);
                }
            });
            NNavig.add(NNEXT);

            NPREVI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.ALT_MASK));
            NPREVI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NPREVI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NLAST.png"))); // NOI18N
            NPREVI.setText("Previous Record");
            NPREVI.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NPREVIActionPerformed(evt);
                }
            });
            NNavig.add(NPREVI);
            NNavig.add(jSeparator4);

            NLAST.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
            NLAST.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            NLAST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NPREVIOUS.png"))); // NOI18N
            NLAST.setText("Last Record");
            NLAST.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NLASTActionPerformed(evt);
                }
            });
            NNavig.add(NLAST);

            jMenuBar1.add(NNavig);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
               if(array[3]==1)
        MyClass.viewTable2(jTable1);
jTable1.setShowGrid(true);
 
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount()==2) {
       MyClass.ViewBox2(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
               paper_text,
               student_combo,
               course_combo,
               exame_combo1
               
       );
//       
       doubledclicked=true;
    //   doubledclicked=false;
       
    
    
    if(array[1]==0){top1.btnEdite.setEnabled(false);}
    else top1.btnEdite.setEnabled(true);
    if(array[2]==0){top1.btnDelete.setEnabled(false);}
    
    else  top1.btnDelete.setEnabled(true);
     
   
       }
        else {doubledclicked=false; Clear(jPanel1);}
           doubledclicked=false;
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void column(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_column
//--  column Size to content---

 
for (int column = 0; column < jTable1.getColumnCount(); column++)
{
    TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
    int preferredWidth = tableColumn.getMinWidth();
    int maxWidth = tableColumn.getMaxWidth();
 //int widthColumn = jTable1.getc.getPreferredSize().width
    for (int row = 0; row < jTable1.getRowCount(); row++)
    {
        TableCellRenderer cellRenderer = jTable1.getCellRenderer(row, column);
        Component c = jTable1.prepareRenderer(cellRenderer, row, column);
        int width = c.getPreferredSize().width + jTable1.getIntercellSpacing().width;
        preferredWidth = Math.max(preferredWidth, width);
 
        //  We've exceeded the maximum width, no need to check other rows
 
        if (preferredWidth >= maxWidth)
        {
            preferredWidth = maxWidth;
            break;
        }
    }
    //the best
    if ((preferredWidth+20)>( jTable1.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*8))  
        tableColumn.setPreferredWidth( preferredWidth+20 );
     
     
    else tableColumn.setPreferredWidth(     jTable1.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*8);

   
}

         
    }//GEN-LAST:event_column

    private void NADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NADDActionPerformed
          if( isNull() ) {insert();MyClass.viewTable(jTable1);Clear(jPanel2) ;column(null);return;}JOptionPane.showMessageDialog(null, "Please Fill Fields","Validation",JOptionPane.INFORMATION_MESSAGE);  return;

    }//GEN-LAST:event_NADDActionPerformed

    private void NEDITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEDITEActionPerformed

        
if( isNull() ){ update();  MyClass.viewTable(jTable1);Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}

    }//GEN-LAST:event_NEDITEActionPerformed

    private void NDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NDELETEActionPerformed

       if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;MyClass.viewTable(jTable1);Clear(jPanel2) ;return;
    }//GEN-LAST:event_NDELETEActionPerformed

    private void NSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSEARCHActionPerformed
        Search();
    }//GEN-LAST:event_NSEARCHActionPerformed

    private void NCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCLEARActionPerformed
        Clear(jPanel1);
    }//GEN-LAST:event_NCLEARActionPerformed

    private void NEXITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXITEActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Do You Want Close This Page ?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            Close();
        }
    }//GEN-LAST:event_NEXITEActionPerformed

    private void NFIRSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NFIRSTActionPerformed
        First(jTable1,top1);
    }//GEN-LAST:event_NFIRSTActionPerformed

    private void NNEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NNEXTActionPerformed
        Next(jTable1,top1);
    }//GEN-LAST:event_NNEXTActionPerformed

    private void NPREVIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPREVIActionPerformed
        Previous(jTable1,top1);
    }//GEN-LAST:event_NPREVIActionPerformed

    private void NLASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NLASTActionPerformed
        End(jTable1,top1);
    }//GEN-LAST:event_NLASTActionPerformed

    private void course_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_course_comboItemStateChanged
      OracleConn.FullCombo(exame_combo1,"exams", "names" );

    }//GEN-LAST:event_course_comboItemStateChanged

    private void exame_combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_exame_combo1ItemStateChanged
OracleConn.FullCombo(student_combo,"students","stdname" ,"stdid  in\n" +
"            ( \n" +
"            select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS \n" +
"            on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES \n" +
"            on GROUPS.COURSEID = COURSES.COURSEID \n" +
"            WHERE COURSES.COURSENAME='"+course_combo.getSelectedItem()+"' \n" +
"            )" );
    }//GEN-LAST:event_exame_combo1ItemStateChanged

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem NADD;
    private javax.swing.JMenuItem NCLEAR;
    private javax.swing.JMenuItem NDELETE;
    private javax.swing.JMenuItem NEDITE;
    private javax.swing.JMenuItem NEXITE;
    private javax.swing.JMenuItem NFIRST;
    private javax.swing.JMenuItem NLAST;
    private javax.swing.JMenuItem NNEXT;
    private javax.swing.JMenu NNavig;
    private javax.swing.JMenuItem NPREVI;
    private javax.swing.JMenuItem NSEARCH;
    private javax.swing.JMenu NTrans;
    private javax.swing.JComboBox<String> course_combo;
    private javax.swing.JComboBox<String> exame_combo1;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField paper_text;
    private javax.swing.JComboBox<String> student_combo;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert(){
        for (int i = 0; i < jTable1.getRowCount(); i++) 
            if (student_combo.getSelectedItem().toString().equals(jTable1.getValueAt(i, 5))&&exame_combo1.getSelectedItem().toString().equals(jTable1.getValueAt(i, 1))) 
            {        JOptionPane.showMessageDialog(null, "Student on Exame has Assigned Before","Validation",JOptionPane.WARNING_MESSAGE);
                     return;
            }
        
             MyClass.insert2(
                     exame_combo1.getSelectedItem().toString(),
                     student_combo.getSelectedItem().toString(),
                     paper_text.getText()
                    );
         
    }

    @Override
    public void update(){
         
           MyClass.update2(
                                   jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ,
                                   exame_combo1.getSelectedItem().toString(),
                                   student_combo.getSelectedItem().toString(),
                                   paper_text.getText(),
                                   course_combo.getSelectedItem().toString()
                                   ); 
          }

    @Override
    public void Delete() {
MyClass.delete2(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ));
    }

    @Override
    public void Search() { 
OracleConn.QueryinTABLE("select d.tableid,\n" +
"  E.NAMES,\n" +
"  E.EXAMSDATE,\n" +
"  E.MINDEGREE||' to '||E.maxdegree,\n" +
"  coursename||' - '||gg.groupid,\n" +                
"  S.STDNAME,\n" +
"  D.PAPERDEGREE\n" +
"from \n" +
"  EXAMS e JOIN EXAMDETAIL d on E.TABLEID=D.EXAMEPARENT\n" +
"  JOIN STUDENTS s on S.STDID=D.STDID\n" +
"  JOIN courses c on C.COURSEID=E.COURSEID\n" +
"  JOIN groups gg on GG.TABLEID=E.GROUPID "
+ "where S.STDNAME like'%"+student_combo.getSelectedItem()+"%' or coursename like'%"+course_combo.getSelectedItem()+"%'    order by examsdate ASC ", jTable1); 
    }

    @Override
    public void Close() {
       Clear(jPanel2);
        this.setVisible(false);
             
    }
 
    @Override
    public boolean isNull() {
        
      return  !(paper_text.getText().equals("")||exame_combo1.getSelectedIndex()==0||student_combo.getSelectedIndex()==0||course_combo.getSelectedIndex()==0);

    }

    
}