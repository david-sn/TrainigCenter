package Groups;

import Table_List_Property.AllProperty;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import Login_USER.LoginForm;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.table.TableColumn;


public class Group extends javax.swing.JInternalFrame implements ItopBarPanel{


    public Group() { 
            initComponents();
    }

    
    
 private  GroupClass MyClass =new GroupClass();
  
 boolean doubledclicked=false ;
     boolean finishPOP;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Every = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        myedit = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(){
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
                Component returnComp = super.prepareRenderer(renderer, row, column);
                Color alternateColor = new Color(252,242,206);
                Color whiteColor = Color.WHITE;

                if (!returnComp.getBackground().equals(getSelectionBackground())){
                    if(!jTable1.getValueAt(row, 0).toString().equals("-1"))
                    {returnComp .setBackground(alternateColor);
                        return returnComp;
                    }
                    if(jTable1.getValueAt(row, 0).toString().equals("-1"))
                    {returnComp .setBackground(whiteColor);
                        return returnComp;}

                }
                return returnComp;
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GroupNO_text = new javax.swing.JTextField();
        CourseName_combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        RoomNO_Combo = new javax.swing.JComboBox<>();
        mounthly_Radio = new javax.swing.JRadioButton();
        Weekly_Radio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lectureDay_Spinner = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        startMinute = new javax.swing.JSpinner();
        startHoure = new javax.swing.JSpinner();
        EndMIN = new javax.swing.JSpinner();
        EndHore = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        startPeriod = new javax.swing.JSpinner();
        endPeriod = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new JTable(){     public Component prepareRenderer(TableCellRenderer renderer, int row, int column){         Component returnComp = super.prepareRenderer(renderer, row, column);         Color alternateColor = new Color(255,180,255);         Color whiteColor = Color.WHITE;         if (!returnComp.getBackground().equals(getSelectionBackground())){             Color bg = (row % 2 == 0 ? alternateColor : whiteColor);             returnComp .setBackground(bg);             bg = null;         }         return returnComp;     }};
        jLabel3 = new javax.swing.JLabel();
        top1 = new BasicFormsTraining.top();
        for(Component c:top1.getComponents()){
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if( ((JButton) c).getText().equals("New") ) {   New(top1,jPanel2);EClean(); return;}
                        if( ((JButton) c).getText().equals("Add") ){  if( isNull() ) {insert();MyClass.viewTable(jTable1);Clear(jPanel2);Clear(jPanel3);column(null);EClean();return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data", "Validation", 0);} return;}
                        if( ((JButton) c).getText().equals("Edit") ){if( isNull() ){ update();  MyClass.viewTable(jTable1);Clear(jPanel2);Clear(jPanel3);column(null);EClean();return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}}
                        if( ((JButton) c).getText().equals("Delete") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;MyClass.viewTable(jTable1);Clear(jPanel2) ;EClean();return;}
                        if( ((JButton) c).getText().equals("First") ) {First(jTable1,top1) ;return;}
                        if( ((JButton) c).getText().equals("Next") ) {Next(jTable1,top1) ;return;}
                        if( ((JButton) c).getText().equals("previous") ) {Previous(jTable1,top1);return;}
                        if( ((JButton) c).getText().equals("Last") ) {End(jTable1,top1) ;return;}
                        if( ((JButton) c).getText().equals("Search") ){ Search();return;}
                        if( ((JButton) c).getText().equals("Clear") ) {Clear(jPanel2) ;EClean();MyClass.viewTable(jTable1);return;}
                        if( ((JButton) c).getText().equals("Close") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Close This Page ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Close() ;EClean();return;}
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

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem1.setBackground(new java.awt.Color(255, 51, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/remove-from-database-icon.png"))); // NOI18N
        jMenuItem1.setText("Remove Lecture");
        jMenuItem1.setToolTipText("Cancel Appointment");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        myedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NEDITE.png"))); // NOI18N
        myedit.setText("Edit Lecture");
        myedit.setToolTipText("Edit Segment");
        myedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myeditActionPerformed(evt);
            }
        });
        jPopupMenu1.add(myedit);

        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("Groups");
        setToolTipText("Group Information");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/GroupSmall.png"))); // NOI18N
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
                "id", "Course Name", "Group NO", "Room No", "Per", "Day", "From", "To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Last 50 Groups Record");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setDropMode(javax.swing.DropMode.ON);
        jTable1.setGridColor(new java.awt.Color(255, 0, 0));
        jTable1.setNextFocusableComponent(CourseName_combo);
        jTable1.setOpaque(false);
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

        jPanel2.setBackground(new java.awt.Color(255, 181, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department Informations", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Group NO.");

        jLabel4.setText("jLabel4");

        GroupNO_text.setEditable(false);
        GroupNO_text.setBackground(new java.awt.Color(255, 255, 255));
        GroupNO_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GroupNO_text.setToolTipText("Group Number,Generated Auto");
        GroupNO_text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        treainigcenter.AutoCompletion.enable(CourseName_combo);
        CourseName_combo.setEditable(true);
        CourseName_combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseName_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Name" }));
        CourseName_combo.setToolTipText("Select Valid Course");
        CourseName_combo.setNextFocusableComponent(RoomNO_Combo);
        finishPOP=false;
        CourseName_combo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CourseName_comboAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CourseName_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseName_comboActionPerformed(evt);
            }
        });
        finishPOP=true;

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Every");

        RoomNO_Combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RoomNO_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Number" }));
        RoomNO_Combo.setToolTipText("Group Will be In Room....");
        RoomNO_Combo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RoomNO_ComboAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Every.add(mounthly_Radio);
        mounthly_Radio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mounthly_Radio.setText("Monthly");
        mounthly_Radio.setToolTipText("Group Will be Every Monthly");
        mounthly_Radio.setNextFocusableComponent(lectureDay_Spinner);
        mounthly_Radio.setOpaque(false);

        Every.add(Weekly_Radio);
        Weekly_Radio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Weekly_Radio.setText("Weekly");
        Weekly_Radio.setToolTipText("Group Will be Every Week");
        Weekly_Radio.setNextFocusableComponent(mounthly_Radio);
        Weekly_Radio.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Course");

        jPanel3.setBackground(new java.awt.Color(157, 236, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true), "Lecture Schdules", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Lecture Day");

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Lec. End Time");

        lectureDay_Spinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lectureDay_Spinner.setModel(new javax.swing.SpinnerListModel(new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sturday"}));
        lectureDay_Spinner.setToolTipText("Choose Lecture Day For this Group");
        lectureDay_Spinner.setNextFocusableComponent(startHoure);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Lec. Start Time");

        startMinute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startMinute.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)59), Byte.valueOf((byte)1)));
        startMinute.setToolTipText("Choose the Minute Of Time Lecture");
        startMinute.setNextFocusableComponent(startPeriod);

        startHoure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startHoure.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)1), Byte.valueOf((byte)1), Byte.valueOf((byte)12), Byte.valueOf((byte)1)));
        startHoure.setToolTipText("Choose the Period Of Time Houres");
        startHoure.setNextFocusableComponent(startMinute);

        EndMIN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EndMIN.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)59), Byte.valueOf((byte)1)));
        EndMIN.setToolTipText("Choose the Minute Of Time Lecture");
        EndMIN.setNextFocusableComponent(endPeriod);

        EndHore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EndHore.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)1), Byte.valueOf((byte)1), Byte.valueOf((byte)12), Byte.valueOf((byte)1)));
        EndHore.setToolTipText("Choose the Period Of Time Houres");
        EndHore.setNextFocusableComponent(EndMIN);

        jLabel7.setText("Period");

        jLabel10.setText(" Houres ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/add-1-icon.png"))); // NOI18N
        jButton1.setText("<html> <b>><br> > <br> ></b> </html>");
        jButton1.setToolTipText("");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setNextFocusableComponent(CourseName_combo);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Time Segment");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setUI(new OriginalClasses.VerticalLabelUI());

        startPeriod.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        startPeriod.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));
        startPeriod.setToolTipText("Choose the Period Of Time Lecture");
        startPeriod.setNextFocusableComponent(EndHore);

        endPeriod.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        endPeriod.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));
        endPeriod.setToolTipText("Choose the Period Of Time Lecture");
        endPeriod.setNextFocusableComponent(jButton1);

        jLabel12.setText(" Minutes ");

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seq", "Day", "From", "To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("Lectures Summery");
        jTable2.setComponentPopupMenu(jPopupMenu1);
        jTable2.setGridColor(new java.awt.Color(0, 0, 255));
        jTable2.setIntercellSpacing(new java.awt.Dimension(3, 0));
        jTable2.setRowHeight(23);
        jTable2.setSelectionBackground(new java.awt.Color(0, 0, 255));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {

                in=false;

                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/add-1-icon.png"))); // NOI18N
                jButton1.setText("<html> <b>><br> > <br> ></b> </html>");
                jButton1.setToolTipText("");
                jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lectureDay_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(startHoure, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(startMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(startPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel12)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EndHore, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(EndMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(endPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lectureDay_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startHoure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EndHore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Room NO.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(CourseName_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(GroupNO_text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(RoomNO_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Weekly_Radio)
                        .addGap(40, 40, 40)
                        .addComponent(mounthly_Radio))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseName_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GroupNO_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomNO_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Weekly_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mounthly_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        top1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
        if(array[3]==1)
        MyClass.viewTable(jTable1);
jTable1.setShowGrid(true);
jTable2.setShowGrid(true);
    }//GEN-LAST:event_jTable1AncestorAdded
    DefaultTableModel mod;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
while(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString().equals("-1") )
{
    jTable1.getSelectionModel().setSelectionInterval(jTable1.getSelectedRow()-1, jTable1.getSelectedRow()-1);
    
}

        if (evt.getClickCount()==2) {
        MyClass.ViewBox(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
                GroupNO_text,
                CourseName_combo,
                RoomNO_Combo,
                Weekly_Radio,
                mounthly_Radio,
                jTable2);
        
        
       
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

    private void RoomNO_ComboAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RoomNO_ComboAncestorAdded

    }//GEN-LAST:event_RoomNO_ComboAncestorAdded
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!in) {
        mod=(DefaultTableModel) jTable2.getModel();
        if (mod.getRowCount()==0) 
            mod.addRow(new Object[]{0,lectureDay_Spinner.getValue(),startHoure.getValue()+":"+startMinute.getValue()+" "+startPeriod.getValue(),EndHore.getValue()+":"+EndMIN.getValue()+" "+endPeriod.getValue()});
      else
    mod.addRow(new Object[]{(mod.getRowCount()),lectureDay_Spinner.getValue(),startHoure.getValue()+":"+startMinute.getValue()+" "+startPeriod.getValue(),EndHore.getValue()+":"+EndMIN.getValue()+" "+endPeriod.getValue()});
        }
        
        else
        {
            jTable2.setValueAt(startHoure.getValue()+":"+startMinute.getValue()+" "+startPeriod.getValue(),jTable2.getSelectedRow(),2);
            jTable2.setValueAt(lectureDay_Spinner.getValue(),jTable2.getSelectedRow(),1);
            jTable2.setValueAt(EndHore.getValue()+":"+EndMIN.getValue()+" "+endPeriod.getValue(),jTable2.getSelectedRow(),3);
   
        }
         
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void CourseName_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseName_comboActionPerformed
        if (finishPOP) {
            GroupNO_text.setText(OracleConn.ret_value("select ( count(*)+1) from groups where courseid =(select courseid from courses where coursename ='"+CourseName_combo.getSelectedItem()+"' )  ").toString());
        }
    }//GEN-LAST:event_CourseName_comboActionPerformed

    private void CourseName_comboAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CourseName_comboAncestorAdded
OracleConn.FullCombo(RoomNO_Combo, "rooms","roomfloor ||'0'||rommseq","BRANCHID="+LoginForm.branch );
OracleConn.FullCombo(CourseName_combo, "courses", "COURSENAME", "COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate");     
    }//GEN-LAST:event_CourseName_comboAncestorAdded

    private void NADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NADDActionPerformed
        if (isNull()) {
            insert();
            MyClass.viewTable(jTable1);
            return;
        } else {
            return;
        }
    }//GEN-LAST:event_NADDActionPerformed

    private void NEDITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEDITEActionPerformed
 if (isNull()) {
        update();
        MyClass.viewTable(jTable1);
         return;
        } else {
            return;
        }
    }//GEN-LAST:event_NEDITEActionPerformed

    private void NDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NDELETEActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            Delete();
            MyClass.viewTable(jTable1);
        }
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
  if ((preferredWidth+20)>( jTable1.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*9))  
        tableColumn.setPreferredWidth( preferredWidth+30 );
     
     
    else tableColumn.setPreferredWidth(     jTable1.getColumnModel().getColumn(column).getHeaderValue().toString().trim().length()*9);

}

    }//GEN-LAST:event_column

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

if(jTable2.getSelectedRow()!=-1) dtm.removeRow(jTable2.getSelectedRow());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void myeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myeditActionPerformed
startHoure.setValue(Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")) )<=9?Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")).replaceAll("0", "")):Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":"))));
 System.err.println(Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")) )<=9?Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")).replaceAll("0", "")):Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":"))));
        
        
startMinute.setValue(
 Integer.parseInt(
    jTable2.getValueAt(
     jTable2.getSelectedRow(), 2).toString()
     .substring(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")+1  ,jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length()-2).trim())
         );

//System.err.println(
 //Integer.parseInt(
   // jTable2.getValueAt(
     //jTable2.getSelectedRow(), 2).toString()
     //.substring(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")+1  ,jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString().length()-1).trim())
         
         //<=9?Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")+1,jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length()-2))
         //:
         //Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")+1,jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString().length()-2))
//);


startPeriod.setValue( (jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length()-2,jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length())).toUpperCase());
System.err.println(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length()-2,jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length()));






EndHore.setValue(Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().indexOf(":")) )<=9?Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().indexOf(":")).replaceAll("0", "")):Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().indexOf(":"))));
//System.err.println(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring(0, jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")));
        
        
EndMIN.setValue(
 Integer.parseInt(
    jTable2.getValueAt(
     jTable2.getSelectedRow(), 3).toString()
     .substring(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().indexOf(":")+1  ,jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().length()-2).trim())
         );//System.err.println(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().indexOf(":")+1,jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString().length()-2));


endPeriod.setValue( (jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().length()-2,jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString().length())).toUpperCase());
//System.err.println(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().substring( jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString().length()-2,jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString().length()+1));

lectureDay_Spinner.setValue(jTable2.getValueAt(jTable2.getSelectedRow(), 1));

jButton1.setText("<html> <b><<br> < <br> <</b> </html>");
jButton1.setIcon(new ImageIcon(getClass().getResource("/IconUsed/pen.png")));
jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    }//GEN-LAST:event_myeditActionPerformed
boolean in=false;
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        if (evt.getClickCount()==2) {
            in=true;
            myeditActionPerformed(null);
        }
        else   {in=false;
        
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/add-1-icon.png"))); // NOI18N
            jButton1.setText("<html> <b>><br> > <br> ></b> </html>");
            jButton1.setToolTipText("");
            jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);}
        
        
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CourseName_combo;
    private javax.swing.JSpinner EndHore;
    private javax.swing.JSpinner EndMIN;
    private javax.swing.ButtonGroup Every;
    private javax.swing.JTextField GroupNO_text;
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
    private javax.swing.JComboBox<String> RoomNO_Combo;
    private javax.swing.JRadioButton Weekly_Radio;
    private javax.swing.JSpinner endPeriod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JSpinner lectureDay_Spinner;
    private javax.swing.JRadioButton mounthly_Radio;
    private javax.swing.JMenuItem myedit;
    private javax.swing.JSpinner startHoure;
    private javax.swing.JSpinner startMinute;
    private javax.swing.JSpinner startPeriod;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

 

    private byte getlectureIndex(String spinner)
    {
        switch (spinner) {
            case "Sunday":      return 1;
            case "Monday":      return 2;
            case "Tuesday":     return 3;
            case "Wednesday":   return 4;
            case "Thursday":    return 5;
            case "Friday":      return 6;
            case "Saturday":    return 7;
            default: return -1;
        }
    
    }
      
    String appointment="";
    @Override
    public void insert() {

        
            for (int i = 0; i < jTable2.getRowCount(); i++) {
             //MyClass.Insert( getlectureIndex(lectureDay_Spinner.getValue().toString()),jjTable2.getValueAt(i, 2).toString(),jTable2.getValueAt(i, 3).toString());
       appointment+= "insert into appointment values (SEQappointment.nextval , SEQgroup.CURRVAL ,"+getlectureIndex(jTable2.getValueAt(i, 1).toString())+",to_timestamp('1-DEC-2016 "+jTable2.getValueAt(i, 2).toString().substring(0, jTable2.getValueAt(i, 2).toString().indexOf(":")+1)+""+jTable2.getValueAt(i, 2).toString().substring(jTable2.getValueAt(i, 2).toString().indexOf(":")+1,jTable2.getValueAt(i, 2).toString().indexOf(" ")+1 )+""+jTable2.getValueAt(i, 2).toString().replaceAll("\\d|:|\\d", "").trim()+"' ,'DD-MON-YYYY hh:MI AM'),to_timestamp('1-DEC-2016 "+jTable2.getValueAt(i, 3).toString().substring(0, jTable2.getValueAt(i, 3).toString().indexOf(":")+1)+jTable2.getValueAt(i, 3).toString().substring(jTable2.getValueAt(i, 3).toString().indexOf(":")+1,jTable2.getValueAt(i, 3).toString().indexOf(" ")+1 )+jTable2.getValueAt(i, 3).toString().replaceAll("\\d|:|\\d", "").trim()+"' ,'DD-MON-YYYY hh:MI AM') );";
            }
        System.err.println(appointment);
 
        
             MyClass.insert(
                  CourseName_combo.getSelectedItem().toString(),
                  RoomNO_Combo.getSelectedItem().toString(),
                  Weekly_Radio.isSelected()?"1":"0",
                  appointment
            );
             
            appointment="";
    }

    @Override
    public void update(){

        appointment="";
        
            for (int i = 0; i < jTable2.getRowCount(); i++) {
        
                appointment+= "insert into appointment values (SEQappointment.nextval , (select tableid from groups where groupid="+jTable1.getValueAt(jTable1.getSelectedRow(), 2)+"  and courseid=(select courseid from courses where coursename='"+CourseName_combo.getSelectedItem()+"' )),"+getlectureIndex(jTable2.getValueAt(i, 1).toString())+",to_timestamp('"+jTable2.getValueAt(i, 2).toString().substring(0, jTable2.getValueAt(i, 2).toString().indexOf(":")+1)+jTable2.getValueAt(i, 2).toString().substring(jTable2.getValueAt(i, 2).toString().indexOf(":")+1,jTable2.getValueAt(i, 2).toString().indexOf(" ")+1 )+jTable2.getValueAt(i, 2).toString().replaceAll("\\d|:|\\d", "").trim()+"' ,'hh:MI AM'),to_timestamp('"+jTable2.getValueAt(i, 3).toString().substring(0, jTable2.getValueAt(i, 3).toString().indexOf(":")+1)+jTable2.getValueAt(i, 3).toString().substring(jTable2.getValueAt(i, 3).toString().indexOf(":")+1,jTable2.getValueAt(i, 3).toString().indexOf(" ")+1 )+jTable2.getValueAt(i, 3).toString().replaceAll("\\d|:|\\d", "").trim()+"' ,'hh:MI AM') );";
            }
        
        
       MyClass.update(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
                 CourseName_combo.getSelectedItem().toString(),
                 RoomNO_Combo.getSelectedItem().toString(),
                 Weekly_Radio.isSelected()?"0":"1",appointment
                         
 );
       
       appointment="";
          }

    @Override
    public void Delete() {
MyClass.delete(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ));
  
    }

    @Override
    public void Search() {
         
 OracleConn.QueryinTABLE("select GROUPS.TableID, coursename , groupID, roomfloor||'0'||rommseq,    case(per) when 0 then 'Every Week' else 'Every Month' end from COURSES JOIN   GROUPS ON GROUPS.COURSEID = COURSES.COURSEID JOIN ROOMS on ROOMS.TABLEID = GROUPS.ROOMID"
         + " where coursename='%"+CourseName_combo.getSelectedItem()+"%' or roomfloor||'0'||rommseq='%"+RoomNO_Combo.getSelectedItem()+"%'", jTable1);
  
    }

    @Override
    public void Close() {
        Clear(jPanel2);
        EClean();
            this.setVisible(false);
    }
 
    @Override
    public boolean isNull() {
        return  !(jTable2.getRowCount()==0||GroupNO_text.getText().equals("")||CourseName_combo.getSelectedIndex()==0);
    }
    
    private void EClean(){
    AllProperty.clearRows(jTable2);
    lectureDay_Spinner.setValue("Sunday");
    startHoure.setValue(1);
    startMinute.setValue(0);
    startPeriod.setValue("AM");
    
    EndHore.setValue(1);
    EndMIN.setValue(0);
    endPeriod.setValue("AM");
    
    
    
    }
   
    
}


