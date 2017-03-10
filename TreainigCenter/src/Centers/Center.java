package Centers;

import Table_List_Property.AllProperty;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import static treainigcenter.MDIHome.jDesktopPane1;
import java.awt.Desktop;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URI;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import static treainigcenter.MDIHome.jDesktopPane1;


public class Center extends javax.swing.JInternalFrame implements ItopBarPanel{


    public Center() { 
             initComponents();
         
    }

    
 private  CenterClass MyClass =new CenterClass();
 JFileChooser choos=null;
 boolean doubledclicked=false,enabledImage=true;
     
    
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
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jComboBox1 = new javax.swing.JComboBox<>();
            jButton1 = new javax.swing.JButton();
            maxCapacity = new javax.swing.JSpinner();
            room_floor = new javax.swing.JSpinner();
            roomcapacit = new javax.swing.JSpinner();
            jScrollPane2 = new javax.swing.JScrollPane();
            roomDescripe = new javax.swing.JEditorPane();
            top1 = new BasicFormsTraining.top();
            for(Component c:top1.getComponents()){
                if (c instanceof JButton) {
                    ((JButton) c).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if( ((JButton) c).getText().equals("New") ) {   New(top1,jPanel2); return;}
                            if( ((JButton) c).getText().equals("Add") ){  if( isNull() ) {insert();MyClass.viewTable1(jTable1);Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data", "Validation", 0);} return;}
                            if( ((JButton) c).getText().equals("Edit") ){if( isNull() ){ update();  MyClass.viewTable1(jTable1 );Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}}
                            if( ((JButton) c).getText().equals("Delete") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;  MyClass.viewTable(jTable1,jComboBox1.getSelectedItem().toString());Clear(jPanel2) ;return;}
                            if( ((JButton) c).getText().equals("First") ) {First(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("Next") ) {Next(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("previous") ) {Previous(jTable1,top1);return;}
                            if( ((JButton) c).getText().equals("Last") ) {End(jTable1,top1) ;return;}
                            if( ((JButton) c).getText().equals("Search") ){ Search();return;}
                            if( ((JButton) c).getText().equals("Clear") ) {Clear(jPanel2) ;MyClass.viewTable1(jTable1);return;}
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
            setTitle("Centers");
            setToolTipText("Centers Information");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/centerBIG22.png"))); // NOI18N
            try {
                setSelected(true);
            } catch (java.beans.PropertyVetoException e1) {
                e1.printStackTrace();
            }
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
                    "id", "Bilding Name", "Floor Number", "Room Seq.", "Room Number", "Min Capacity", "Max Capacity"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setToolTipText("Last 50 Center Record");
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
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centers Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
            jPanel2.setOpaque(false);

            jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText("Center");

            jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel4.setText("Room Capacity");

            jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Max Cpacity");

            jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("<html>Description<br>   Room</html>");

            jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Room Floor");

            //treainigcenter.AutoCompletion.enable(jComboBox1);
            jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Center Branch" }));
            jComboBox1.setToolTipText("Select Center");
            jComboBox1.setNextFocusableComponent(jButton1);
            jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    jComboBox1FocusLost(evt);
                }
            });

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/add-1-icon.png"))); // NOI18N
            jButton1.setToolTipText("Add New Center Branch");
            jButton1.setNextFocusableComponent(room_floor);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            maxCapacity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            maxCapacity.setModel(new javax.swing.SpinnerNumberModel());
            maxCapacity.setToolTipText("Room Max,IF No set Room Capacity");
            maxCapacity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            maxCapacity.setEditor(new javax.swing.JSpinner.NumberEditor(maxCapacity, "##"));
            maxCapacity.setNextFocusableComponent(jComboBox1);

            room_floor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            room_floor.setModel(new javax.swing.SpinnerNumberModel(0, 0, 29, 1));
            room_floor.setToolTipText("Room Level");
            room_floor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            room_floor.setEditor(new javax.swing.JSpinner.NumberEditor(room_floor, "##"));
            room_floor.setNextFocusableComponent(roomcapacit);
            room_floor.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    room_floorStateChanged(evt);
                }
            });

            roomcapacit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            roomcapacit.setModel(new javax.swing.SpinnerNumberModel());
            roomcapacit.setToolTipText("Room Capacity of Student");
            roomcapacit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            roomcapacit.setEditor(new javax.swing.JSpinner.NumberEditor(roomcapacit, "##"));
            roomcapacit.setNextFocusableComponent(maxCapacity);
            ((JSpinner.DefaultEditor)roomcapacit.getEditor()).getTextField().setEditable(false);
            ((JSpinner.DefaultEditor)maxCapacity.getEditor()).getTextField().setEditable(false);
            ((JSpinner.DefaultEditor)room_floor.getEditor()).getTextField().setEditable(false);
            roomcapacit.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    roomcapacitStateChanged(evt);
                }
            });

            roomDescripe.setEditable(false);
            roomDescripe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            roomDescripe.setContentType("text/html"); // NOI18N
            roomDescripe.setToolTipText("Room Data");
            roomDescripe.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            jScrollPane2.setViewportView(roomDescripe);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(room_floor, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(5, 5, 5)
                    .addComponent(roomcapacit, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(99, 99, 99)
                    .addComponent(jLabel5)
                    .addGap(5, 5, 5)
                    .addComponent(maxCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(room_floor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roomcapacit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
               OracleConn.FullCombo(jComboBox1, "centerbranch", "CENTERNAME"); 
        if(array[3]==1)
        MyClass.viewTable1(jTable1 );
jTable1.setShowGrid(true); 
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount()==2) {
        MyClass.ViewBox(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
        jComboBox1,
        room_floor,
        roomcapacit,
        maxCapacity
);
              doubledclicked=true;
    //   doubledclicked=false;
       
    
    
    if(array[1]==0)top1.btnEdite.setEnabled(false);
    else top1.btnEdite.setEnabled(true);
    
    if(array[2]==0)top1.btnDelete.setEnabled(false);
    else  top1.btnDelete.setEnabled(true);

        }
        else {doubledclicked=false; Clear(jPanel2);}
           doubledclicked=false;
        
        
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void room_floorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_room_floorStateChanged

         
        
        Object no= OracleConn.ret_value("select (count(*)+1)from rooms where ROOMFLOOR="+room_floor.getValue().toString()+" and branchid =(select centerid from centerbranch where centername='"+jComboBox1.getSelectedItem()+"' )");
        String rank=ConvertTextTypes.Demo.to_Ranks((int)room_floor.getValue());
       
        roomDescripe.setText( "<html>\n" +
"<body>\n" +
"<table border=\"1\" cellspacing=\"0\">\n" +
                " <caption>Local Number ------------------------------------------------------------ Global Numbering </caption> "+
"<tr>\n" +
"  <td> Floor NO. </td>\n" +
"  <td>"+rank+"</td>\n" +
"<td style=\"width:150px;\"><p style=\"background-\n" +
"color:red;\"></p>\n" +
"<td> Building NO. </td>\n" +
"  <td>"+jComboBox1.getSelectedIndex()+" </td>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +

"  <td>Room Sequence</td>\n" +
"  <td>"+no+"</td>\n" +
"\n" +
"<td style=\"width:150px;\"><p style=\"background-\n" +
"color:green;\">. </p>\n" +
"\n" +
"\n" +
"<td> Floor NO. </td>\n" +
"  <td>"+rank+"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"  <td> <b>Room Number</b> </td>\n" +
"  <td><b> "+rank.replaceAll("[th||st||nd||rd]", "")+"0"+no+" </b></td>\n" +
                
"<td style=\"width:150px;\"><p style=\"background-\n" +
"color:green;\">. </p>\n" +

"<td>Room Sequence </td>\n" +
"  <td>"+no+"</td>\n" +
"\n" +
"</tr>\n" +
"<th colspan=\"4\"><b> <p align=\"right\">Room Number</p> </b></th>\n" +

"  <td><b> "+jComboBox1.getSelectedIndex()+rank.replaceAll("[th||st||nd||rd]", "")+"0"+no+"</b></td>\n" +
"<tr>\n" +
"\n" +
"</tr>\n" +
"\n" +
"</table>\n" +
"\n" +
"</body>\n" +
"</html>");
    }//GEN-LAST:event_room_floorStateChanged

    private void roomcapacitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roomcapacitStateChanged
//SpinnerModel ss=new SpinnerNumberModel(WIDTH, WIDTH, WIDTH, SOMEBITS);

      SpinnerNumberModel s=new SpinnerNumberModel();  
        s.setMinimum((Comparable) roomcapacit.getValue());
        maxCapacity.setValue(roomcapacit.getValue());


    }//GEN-LAST:event_roomcapacitStateChanged
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Branchs.Branch mybrach=new Branchs.Branch();

      showForm(mybrach);
      
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
    private void NADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NADDActionPerformed
        if (isNull()) {
            insert();
            MyClass.viewTable(jTable1,jComboBox1.getSelectedItem().toString());
            return;
        } else {
            return;
        }
    }//GEN-LAST:event_NADDActionPerformed

    private void NEDITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEDITEActionPerformed

        update();
        MyClass.viewTable(jTable1,jComboBox1.getSelectedItem().toString());
        return;
    }//GEN-LAST:event_NEDITEActionPerformed

    private void NDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NDELETEActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            Delete();
            MyClass.viewTable(jTable1,jComboBox1.getSelectedItem().toString());
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

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
 if (jComboBox1.getSelectedIndex()!=0)        
        MyClass.viewTable(jTable1, jComboBox1.getSelectedItem().toString());
 else MyClass.viewTable1(jTable1);

    }//GEN-LAST:event_jComboBox1FocusLost


      private void showForm(JInternalFrame Form)
    {
  
Form.setLocation( 
        (int) (jDesktopPane1.getSize().getWidth() -Form.getSize().width)/2,
              (jDesktopPane1.getSize().height- Form.getSize().height)/2);

    if(jDesktopPane1.isAncestorOf(Form));
    else jDesktopPane1.add(Form);
        Form.setVisible(true);
    }
      
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
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JSpinner maxCapacity;
    private javax.swing.JEditorPane roomDescripe;
    private javax.swing.JSpinner room_floor;
    private javax.swing.JSpinner roomcapacit;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert() {
 
              MyClass.insert(jComboBox1.getSelectedItem().toString(),  roomcapacit.getValue().toString(), maxCapacity.getValue().toString(),room_floor.getValue().toString());
    }

    @Override
    public void update(){
 
        MyClass.update(Integer.parseInt(  jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
                   jComboBox1.getSelectedItem().toString(),
                   roomcapacit.getValue().toString(),
                   maxCapacity.getValue().toString(),
                 room_floor.getValue().toString()
        ); 
          }

    @Override
    public void Delete() {
      
MyClass.delete(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ));
     }

    @Override
    public void Search() { 
OracleConn.QueryinTABLE("select ROOMS.TABLEID," +
"       CENTERname," +
"       roomfloor ," +
"       ROOMS.ROMMSEQ," +
"       mincapacity," +
"       MAXCAPCITY       " +
"from ROOMS join CENTERBRANCH on ROOMS.BRANCHID = CENTERBRANCH.CENTERID " +
"where ROOMS.BRANCHID=(select CENTERBRANCH.CENTERID from CENTERBRANCH where CENTERBRANCH.CENTERNAME ='"+jComboBox1.getSelectedItem()+"' or roomfloor='"+room_floor.getValue()+"'         )", jTable1);
  
    }

    @Override
    public void Close() {
      //  try {
            
            Clear(jPanel2);
             this.setVisible(false);
         //   File f=new File("C:\\Users\\David Sherif\\Desktop\\layout.html");
        
       
       //     roomDescripe.setPage( f.toURL());
      //  } catch (IOException ex) {
      //      Logger.getLogger(Center.class.getName()).log(Level.SEVERE, null, ex);
      //  }
    }
 
    @Override
    public boolean isNull() {
        
        if ( Integer.parseInt( roomcapacit.getValue().toString())  > Integer.parseInt( maxCapacity.getValue().toString())) {
        JOptionPane.showInternalMessageDialog(this, "Room Min Capacity must be less than or Ewual \nRoom Max Capacity","Validation",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
       return  !(jComboBox1.getSelectedIndex()==0||roomcapacit.getValue().equals(maxCapacity.getValue()));
    }
    
}