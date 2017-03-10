package Registers;

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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import java.awt.Desktop;
import java.net.URI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumn;


public class Regester extends javax.swing.JInternalFrame implements ItopBarPanel{


    public Regester() { 
            initComponents();     
            OracleConn.FullCombo(courseCombo,"courses", "COURSENAME", "COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate");           
            
    }
    
    
    
 private  RegesterClass MyClass =new RegesterClass();

 boolean doubledclicked=false;
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
            GroupCombo = new javax.swing.JComboBox<>();
            studentCobo = new javax.swing.JComboBox<>();
            courseCombo = new javax.swing.JComboBox<>();
            jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
            jLabel5 = new javax.swing.JLabel();
            jXHyperlink2 = new org.jdesktop.swingx.JXHyperlink();
            jScrollPane2 = new javax.swing.JScrollPane();
            summeryArea1 = new javax.swing.JEditorPane();
            top1 = new BasicFormsTraining.top();
            for(Component c:top1.getComponents()){
                if (c instanceof JButton) {
                    ((JButton) c).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if( ((JButton) c).getText().equals("New") ) {   New(top1,jPanel2); return;}
                            if( ((JButton) c).getText().equals("Add") ){  if( isNull() ) {insert();MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());Clear(jPanel2) ;column(null);return;}JOptionPane.showMessageDialog(null, "Please Fill Fields","Validation",JOptionPane.INFORMATION_MESSAGE);  return;}
                            if( ((JButton) c).getText().equals("Edit") ){if( isNull() ){ update();  MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}}
                            if( ((JButton) c).getText().equals("Delete") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());Clear(jPanel2) ;return;}
                            if( ((JButton) c).getText().equals("First") ) {First(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("Next") ) {Next(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("previous") ) {Previous(jTable1,top1);return;}
                            if( ((JButton) c).getText().equals("Last") ) {End(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("Search") ){ Search();return;}
                            if( ((JButton) c).getText().equals("Clear") ) {Clear(jPanel2) ;MyClass.viewTable(jTable1);return;}
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
            setTitle("Course Registration Card");
            setToolTipText("Registration Card");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/studentInternal.png"))); // NOI18N
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
                    "id", "Course Name", "Student Name", "Group NO.", "Register Date"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
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
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payments", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
            jPanel2.setOpaque(false);

            jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText("Summery");

            GroupCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            GroupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group Number" }));
            GroupCombo.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    GroupComboItemStateChanged(evt);
                }
            });
            GroupCombo.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    GroupComboFocusGained(evt);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    GroupComboFocusLost(evt);
                }
            });

            studentCobo.setEditable(true);
            treainigcenter.AutoCompletion.enable(studentCobo);
            studentCobo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            studentCobo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Name" }));
            studentCobo.setAutoscrolls(true);
            studentCobo.setFocusTraversalPolicyProvider(true);
            studentCobo.setInheritsPopupMenu(true);
            studentCobo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    studentCoboActionPerformed(evt);
                }
            });

            treainigcenter.AutoCompletion.enable(courseCombo);
            courseCombo.setEditable(true);
            courseCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Name" }));
            courseCombo.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    courseComboItemStateChanged(evt);
                }
            });

            jXHyperlink1.setText("Group No.");
            jXHyperlink1.setContentAreaFilled(false);
            jXHyperlink1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

            jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Course Name");

            jXHyperlink2.setText("Student Name");
            jXHyperlink2.setContentAreaFilled(false);
            jXHyperlink2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jXHyperlink2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jXHyperlink2MouseClicked(evt);
                }
            });

            summeryArea1.setEditable(false);
            summeryArea1.setContentType("text/html"); // NOI18N
            jScrollPane2.setViewportView(summeryArea1);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(110, 110, 110)
                    .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(GroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jXHyperlink2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(studentCobo, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jXHyperlink2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentCobo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            top1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), null));
            top1.setOpaque(false);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        MyClass.viewTable(jTable1);

    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount()==2) {
       MyClass.ViewBox(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
               GroupCombo,
               courseCombo,
               studentCobo
       );
       
       
       doubledclicked=true;
    //   doubledclicked=false;
       
    
    
    if(array[1]==0){top1.btnEdite.setEnabled(false);}
    else top1.btnEdite.setEnabled(true);
    if(array[2]==0){top1.btnDelete.setEnabled(false);}
    
    else  top1.btnDelete.setEnabled(true);
     
   
       }
else {doubledclicked=false; Clear(jPanel2);}
        doubledclicked=false;
        
        
    }//GEN-LAST:event_jTable1MouseClicked
boolean finish=false;
    private void GroupComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GroupComboItemStateChanged
if(courseCombo.getSelectedIndex()!=0)        if (finish) {
            
        
        OracleConn.FullCombo(studentCobo, "students", "stdname", "stdid not in \n" +
            "(\n" +
            "select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS \n" +
            "on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES \n" +
            "on GROUPS.COURSEID = COURSES.COURSEID \n" +
            "WHERE COURSES.COURSENAME=('"+courseCombo.getSelectedItem()+"')\n" +
            "\n" +
            ")");

        }
    }//GEN-LAST:event_GroupComboItemStateChanged

    private void GroupComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GroupComboFocusGained

            finish=true;


    }//GEN-LAST:event_GroupComboFocusGained

    private void courseComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseComboItemStateChanged
OracleConn.FullCombo(GroupCombo,"groups","groupID","courseID=(select courseID from courses where coursename ='"+courseCombo.getSelectedItem()+"')");
    }//GEN-LAST:event_courseComboItemStateChanged
Registers.StudentSerch1  we=new Registers.StudentSerch1() ;
    private void jXHyperlink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXHyperlink2MouseClicked
        
        JOptionPane.showOptionDialog(null, we,"Search Student", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
        if (!we.result.equals("")) {
            studentCobo.setSelectedItem(we.result);
        }
        
    }//GEN-LAST:event_jXHyperlink2MouseClicked

    private void NADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NADDActionPerformed
        if( isNull() ) {insert();MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());Clear(jPanel2) ;column(null);return;}JOptionPane.showMessageDialog(null, "Please Fill Fields","Validation",JOptionPane.INFORMATION_MESSAGE);  return;

    }//GEN-LAST:event_NADDActionPerformed

    private void NEDITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEDITEActionPerformed

if( isNull() ){ update();  MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}

    }//GEN-LAST:event_NEDITEActionPerformed

    private void NDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NDELETEActionPerformed

      if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());Clear(jPanel2) ;return;
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

    private void column(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_column
//--  column Size to content---


for (int column = 0; column < jTable1.getColumnCount(); column++)
{
    TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
    int preferredWidth = tableColumn.getMinWidth();
    int maxWidth = tableColumn.getMaxWidth();
 
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
  if ((preferredWidth+20)>( jTable1.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*8))  
        tableColumn.setPreferredWidth( preferredWidth+20 );
     
     
    else tableColumn.setPreferredWidth(     jTable1.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*8);

}

    }//GEN-LAST:event_column
StringBuffer val;
    private void GroupComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GroupComboFocusLost
if(GroupCombo.getSelectedIndex()!=0||courseCombo.getSelectedIndex()!=0){        try {
             val=new StringBuffer("");
            OracleConn.rs=OracleConn.executeQuery("select case (LECTUREDAY) WHEN 1 THEN 'Sunday'  WHEN 2 THEN 'Monday' WHEN 3 THEN 'Tuesday'  WHEN 4 THEN 'Wednesday' WHEN 5 THEN 'Thursday' WHEN 6 THEN 'Friday' WHEN 7 THEN 'Saturday' end ||' - '|| to_char(STARTTIME,'HH:MI AM')||' To '||to_char(ENDTIME,'HH:MI AM') from APPOINTMENT where GROUP_ID=(select tableid from groups g2 where to_char(G2.GROUPID)='"+GroupCombo.getSelectedItem()+"' and G2.COURSEID=(select courseid from COURSES where coursename='"+courseCombo.getSelectedItem()+"') )");
           
            while (OracleConn.rs.next()) {
                val.append(OracleConn.rs.getString(1));
                val.append("<br>");
                val.append("-----------------------------------------------");
                val.append("<br>");
            }

            
            summeryArea1.setText("<html><table style=\"width: 300px; height: 75px;\">\n" +
                    "<tbody><table width=\"450\" border=\"1\" cellpadding=\"1px\" style=\"float:left\">\n" +
                    "<tr style=\"height: 25px;\">\n" +
                    "<td style=\"width: 90.6px; height: 25px;\">\n" +
                    "<p>&nbsp;Course Name </p>\n" +
                    "</td>\n" +
                    "<td style=\"width: 90.35px; height: 25px;\">&nbsp;"+courseCombo.getSelectedItem()+"</td>\n" +
                    "<td style=\"width: 90.0333px; height: 25px;\">&nbsp;</td>\n" +
                    "<td style=\"width: 90.9667px; height: 25px;\">Group No.  </td>\n" +
                    "<td style=\"width: 90.05px; height: 25px;\">"+GroupCombo.getSelectedItem()+" </td>\n" +
                    "</tr>\n" +
                    "<tr style=\"height: 25px;\">\n" +
                    "<td style=\"width: 90.6px; height: 25px;\">&nbsp;Student Name</td>\n" +
                    "<td style=\"width: 200.4px; height: 25px;\" colspan=\"4\">&nbsp;"+studentCobo.getSelectedItem()+" &nbsp; </td>\n" +
                    "</tr>\n" +
                    "<tr style=\"height: 27px;\">\n" +
                    "<td style=\"width: 80.6px; height: 27px;\">&nbsp;Times</td>\n" +
                    "<td style=\"width: 167.4px; height: 27px;\" colspan=\"4\">&nbsp;&nbsp;&nbsp;"+val.toString()+"&nbsp;</td>\n" +
                    "</tr>\n" +
                    "</tbody>\n" +
                    "</table></html>");
            
            if(array[3]==1&&GroupCombo.getSelectedIndex()!=0)
                MyClass.viewTable(jTable1,GroupCombo.getSelectedItem().toString());
        
        } catch (SQLException ex) {
            Logger.getLogger(Regester.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    }//GEN-LAST:event_GroupComboFocusLost

    private void studentCoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCoboActionPerformed
//        if (studentCobo.getSelectedIndex()!=0) 
//            
//        
//summeryArea1.setText("<html><table style=\"width: 300px; height: 75px;\">\n" +
//                    "<tbody><table width=\"450\" border=\"1\" cellpadding=\"1px\" style=\"float:left\">\n" +
//                    "<tr style=\"height: 25px;\">\n" +
//                    "<td style=\"width: 90.6px; height: 25px;\">\n" +
//                    "<p>&nbsp;Course Name </p>\n" +
//                    "</td>\n" +
//                    "<td style=\"width: 90.35px; height: 25px;\">&nbsp;"+courseCombo.getSelectedItem()+"</td>\n" +
//                    "<td style=\"width: 90.0333px; height: 25px;\">&nbsp;</td>\n" +
//                    "<td style=\"width: 90.9667px; height: 25px;\">Group No.  </td>\n" +
//                    "<td style=\"width: 90.05px; height: 25px;\">"+GroupCombo.getSelectedItem()+" </td>\n" +
//                    "</tr>\n" +
//                    "<tr style=\"height: 25px;\">\n" +
//                    "<td style=\"width: 90.6px; height: 25px;\">&nbsp;Student Name</td>\n" +
//                    "<td style=\"width: 200.4px; height: 25px;\" colspan=\"4\">&nbsp;"+studentCobo.getSelectedItem()+" &nbsp; </td>\n" +
//                    "</tr>\n" +
//                    "<tr style=\"height: 27px;\">\n" +
//                    "<td style=\"width: 80.6px; height: 27px;\">&nbsp;Times</td>\n" +
//                    "<td style=\"width: 167.4px; height: 27px;\" colspan=\"4\">&nbsp;&nbsp;&nbsp;"+val.toString()+"&nbsp;</td>\n" +
//                    "</tr>\n" +
//                    "</tbody>\n" +
//                    "</table></html>");
    }//GEN-LAST:event_studentCoboActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GroupCombo;
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
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink2;
    private javax.swing.JComboBox<String> studentCobo;
    private javax.swing.JEditorPane summeryArea1;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert(){
             MyClass.insert(GroupCombo.getSelectedItem().toString(),
                     studentCobo.getSelectedItem().toString(),
                     courseCombo.getSelectedItem().toString()
                     
                    );
         
    }

    @Override
    public void update(){
         
        MyClass.update(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
                   GroupCombo.getSelectedItem().toString(),
                   studentCobo.getSelectedItem().toString(),
                   courseCombo.getSelectedItem().toString()
                                   ); 
          }

    @Override
    public void Delete() {
MyClass.delete(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ));
    }

    @Override
    public void Search() { 
OracleConn.QueryinTABLE("select REGISTERS.TABLEID,stdname,COURSES.COURSENAME,GROUPS.GROUPID ,regdate  from REGISTERS   JOIN GROUPS \n" +
"on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES \n" +
"on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS\n" +
"on STUDENTS.STDID=REGISTERS.STUDENT_ID\n" +
"WHERE GROUPS.GROUPID="+GroupCombo.getSelectedItem()+
" or COURSES.COURSENAME='%"+courseCombo.getSelectedItem()+"%'  and  stdname='%"+studentCobo.getSelectedItem()+"%' "
        + "  ORDER BY REGISTERS.REGDATE", jTable1);
    }

    @Override
    public void Close() {
        Clear(jPanel2);
        this.setVisible(false);
    }
 
    @Override
    public boolean isNull() {
        
       return  !(courseCombo.getSelectedIndex()==0||GroupCombo.getSelectedIndex()==0||studentCobo.getSelectedIndex()==0);

    }
    
}