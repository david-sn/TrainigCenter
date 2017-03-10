package Courses;

import Table_List_Property.AllProperty;
import static TextValidation.TextInput_type.to_InitCape;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.Desktop;
import java.net.URI;


public class Course extends javax.swing.JInternalFrame implements ItopBarPanel{


    public Course() { 
             initComponents();
    }

    
    
    
 private  CourseClass MyClass =new CourseClass();
 
 boolean doubledclicked=false,
         blockedChoose=false;
     Character payment=new Character('0');
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PayMents = new javax.swing.ButtonGroup();
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
            Name_text = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            status_Comb = new javax.swing.JComboBox<>();
            jLabel7 = new javax.swing.JLabel();
            instr_Combo1 = new javax.swing.JComboBox<>();
            blocked = new com.tekde.linet.components.JCheckBoxCus();
            price_text = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            oneTime_Radio = new javax.swing.JRadioButton();
            perSession_radio = new javax.swing.JRadioButton();
            free_radio = new javax.swing.JRadioButton();
            jLabel5 = new javax.swing.JLabel();
            end_date = new datechooser.beans.DateChooserCombo();
            start_date = new datechooser.beans.DateChooserCombo();
            perCycle_radio = new javax.swing.JRadioButton();
            jTextField1 = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
            code = new javax.swing.JTextField();
            top1 = new BasicFormsTraining.top();
            for(Component c:top1.getComponents()){
                if (c instanceof JButton) {
                    ((JButton) c).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if( ((JButton) c).getText().equals("New") ) {   New(top1,jPanel2); return;}
                            if( ((JButton) c).getText().equals("Add") ){  if( isNull() ) {insert();MyClass.viewTable(jTable1);Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data", "Validation", 0);} return;}
                            if( ((JButton) c).getText().equals("Edit") ){if( isNull() ){ update();  MyClass.viewTable(jTable1);Clear(jPanel2) ;column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}}
                            if( ((JButton) c).getText().equals("Delete") ) {if(JOptionPane.showConfirmDialog(null, "Do You Want Delete This Field ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)Delete() ;MyClass.viewTable(jTable1);Clear(jPanel2) ;return;}
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
            setTitle("Courses Registration");
            setToolTipText("Course Informations");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/courseBIG.png"))); // NOI18N
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
                    "id", "Name", "Price", "Blocked", "Status", "Instructor", "Start Date", "End Date", "Payment Type", "Cycle"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setToolTipText("Last 50 Course Record");
            jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            jTable1.setDropMode(javax.swing.DropMode.INSERT_ROWS);
            jTable1.setGridColor(new java.awt.Color(255, 0, 0));
            jTable1.setNextFocusableComponent(Name_text);
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

            jTable1.setShowGrid(true);

            jPanel2.setBackground(new java.awt.Color(105, 186, 252));
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Informations", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
            jPanel2.setOpaque(false);

            jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText(" Course Name");

            jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("Price");

            Name_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Name_text.setToolTipText("<html>\nPlease Enter Course  Name  <br>\n<b>Example:</b>English ..\n</html>");
            Name_text.setNextFocusableComponent(instr_Combo1);
            Name_text.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    Name_textKeyTyped(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel6.setText("End Date");

            status_Comb.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            status_Comb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open to Public", "Private", "Offer" }));
            status_Comb.setToolTipText("Course Status");
            status_Comb.setNextFocusableComponent(start_date);

            jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Course Code");

            treainigcenter.AutoCompletion.enable(instr_Combo1);
            instr_Combo1.setEditable(true);
            instr_Combo1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
            instr_Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Instructor" }));
            instr_Combo1.setToolTipText("Select the Instructor of Course");
            instr_Combo1.setNextFocusableComponent(oneTime_Radio);
            instr_Combo1.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    instr_Combo1AncestorAdded(evt);
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });

            blocked.setSelected(false);
            blocked.setText("");
            blocked.setToolTipText("Course Blocked To All");
            blocked.setOpaque(false);
            blocked.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    blockedItemStateChanged(evt);
                }
            });

            price_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            price_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            price_text.setToolTipText("Price Of Course based on Payment Method below");
            price_text.setNextFocusableComponent(status_Comb);
            price_text.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    price_textFocusGained(evt);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    price_textFocusLost(evt);
                }
            });
            price_text.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    price_textKeyTyped(evt);
                }
            });

            jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 0, 0));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel8.setText("Payment Method");
            jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));

            jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel9.setText("Start Date");

            jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel10.setText("Blocked");

            PayMents.add(oneTime_Radio);
            oneTime_Radio.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            oneTime_Radio.setText("One Time");
            oneTime_Radio.setToolTipText("Pay Mony in one Time");
            oneTime_Radio.setNextFocusableComponent(perSession_radio);
            oneTime_Radio.setOpaque(false);
            oneTime_Radio.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    oneTime_RadioItemStateChanged(evt);
                }
            });

            PayMents.add(perSession_radio);
            perSession_radio.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            perSession_radio.setText("Per Session");
            perSession_radio.setToolTipText("Pay Every Session");
            perSession_radio.setNextFocusableComponent(perCycle_radio);
            perSession_radio.setOpaque(false);
            perSession_radio.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    perSession_radioItemStateChanged(evt);
                }
            });

            PayMents.add(free_radio);
            free_radio.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
            free_radio.setText("Free");
            free_radio.setToolTipText("No Money Free");
            free_radio.setNextFocusableComponent(price_text);
            free_radio.setOpaque(false);
            free_radio.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    free_radioItemStateChanged(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Status");

            end_date.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
                new datechooser.view.appearance.ViewAppearance("custom",
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(0, 0, 255),
                        true,
                        true,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 255),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(128, 128, 128),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.LabelPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.LabelPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(255, 0, 0),
                        false,
                        false,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    (datechooser.view.BackRenderer)null,
                    false,
                    true)));
        end_date.setCalendarPreferredSize(new java.awt.Dimension(314, 204));
        end_date.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 20));
        end_date.setNavigateFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 15));
        end_date.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        end_date.setShowOneMonth(true);

        start_date.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    start_date.setCalendarPreferredSize(new java.awt.Dimension(314, 204));
    start_date.setNothingAllowed(false);
    start_date.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 20));
    start_date.setNavigateFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 15));
    start_date.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    start_date.setShowOneMonth(true);
    start_date.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            start_dateOnCommit(evt);
        }
    });

    PayMents.add(perCycle_radio);
    perCycle_radio.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
    perCycle_radio.setText("Per Cycle");
    perCycle_radio.setToolTipText("Pay by Group Of Sessions");
    perCycle_radio.setNextFocusableComponent(free_radio);
    perCycle_radio.setOpaque(false);
    perCycle_radio.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            perCycle_radioItemStateChanged(evt);
        }
    });

    jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Seesion Per Cycle", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
    jTextField1.setOpaque(false);
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });
    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextField1KeyTyped(evt);
        }
    });

    jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("Instructor");

    code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    code.setToolTipText("Course Code");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60)
            .addComponent(jLabel7)
            .addGap(10, 10, 10)
            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel8)
            .addGap(10, 10, 10)
            .addComponent(oneTime_Radio)
            .addGap(12, 12, 12)
            .addComponent(perSession_radio)
            .addGap(60, 60, 60)
            .addComponent(perCycle_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34)
            .addComponent(free_radio))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(instr_Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(status_Comb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(blocked, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(oneTime_Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(perSession_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(perCycle_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(free_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(instr_Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(status_Comb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(blocked, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    top1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), null));
    top1.setOpaque(false);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addComponent(jScrollPane1)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
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

    private void Name_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name_textKeyTyped
  if (Name_text.getText().length()==1) {
        to_InitCape(Name_text);    
        }
         if (Name_text.getText().length()>=35)
             evt.consume();
        
    }//GEN-LAST:event_Name_textKeyTyped

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

        if(array[3]==1)
        MyClass.viewTable(jTable1);
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount()==2) {
       MyClass.ViewBox(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()) ,
               Name_text, 
               price_text, 
               instr_Combo1,
               status_Comb,
               blocked,
               start_date,
               end_date,
               oneTime_Radio,
               perSession_radio,
               perCycle_radio,
               free_radio,
               payment,
               jTextField1,
               code
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

    private void instr_Combo1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_instr_Combo1AncestorAdded
       OracleConn.FullCombo(instr_Combo1,"employees","employeename");
    }//GEN-LAST:event_instr_Combo1AncestorAdded

    private void blockedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_blockedItemStateChanged
        if (blocked.isSelected()) 
            blockedChoose=true;
        
        else blockedChoose=false;
    }//GEN-LAST:event_blockedItemStateChanged

    private void price_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_price_textFocusLost
        if (price_text.getText().trim().equals("")) {
            
        }
        else if(price_text.getText().trim().equals("EGP"));
        else price_text.setText(price_text.getText()+" EGP");
        
    }//GEN-LAST:event_price_textFocusLost

    private void price_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_price_textFocusGained
price_text.setText(price_text.getText().replaceAll(" EGP", ""));
    }//GEN-LAST:event_price_textFocusGained

    private void free_radioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_free_radioItemStateChanged
 if (free_radio.isSelected())  
        {   jLabel3.setText("Price in One Time");
            price_text.setEnabled(false);
            jLabel3.setText("Price");
        
            int res=  JOptionPane.showOptionDialog(null,"Full Free (No Center Profit) > > YES\n Course Free with Center Profit > > NO","Free Type", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE , null, new Object[]{"YES","NO"}, "YES");
            if (res==0) 
                payment='3';        
            else payment='4';
 
            
            if (res==-1) 
                oneTime_Radio.setSelected(true);
           
           
        }
 else price_text.setEnabled(true);
            
    }//GEN-LAST:event_free_radioItemStateChanged

    private void start_dateOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_start_dateOnCommit
        end_date.setMinDate(start_date.getSelectedDate());
        end_date.setSelectedDate(start_date.getSelectedDate());
    }//GEN-LAST:event_start_dateOnCommit

    private void perCycle_radioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_perCycle_radioItemStateChanged

    if (perCycle_radio.isSelected()) 
      { 
          int res=JOptionPane.showOptionDialog(null, jTextField1,"Number of Sessions in cycle", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
          if (jTextField1.getText().trim().equals("")) 
              oneTime_Radio.setSelected(true);
          
          jLabel3.setText("Price per Cycle");
          payment='2';
     }
     
         
    }//GEN-LAST:event_perCycle_radioItemStateChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
TextValidation.TextInput_type.NumbersOnlny(evt, jTextField1);
    }//GEN-LAST:event_jTextField1KeyTyped
    Robot r=null;
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
  
        try {
            r=new Robot();
            r.keyPress(27);
        } catch (AWTException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void oneTime_RadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_oneTime_RadioItemStateChanged

        if (oneTime_Radio.isSelected()) {
            jLabel3.setText("Price in One Time");
            payment='0';
        }
        
    }//GEN-LAST:event_oneTime_RadioItemStateChanged

    private void perSession_radioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_perSession_radioItemStateChanged
 if (perSession_radio.isSelected()) {
            jLabel3.setText("Price in Session");
            payment='1';
        }
    }//GEN-LAST:event_perSession_radioItemStateChanged

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

    private void price_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_textKeyTyped
TextValidation.TextInput_type.NumbersOnlny(evt, price_text);
    }//GEN-LAST:event_price_textKeyTyped

    
    
    
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
    private javax.swing.JTextField Name_text;
    private javax.swing.ButtonGroup PayMents;
    private com.tekde.linet.components.JCheckBoxCus blocked;
    private javax.swing.JTextField code;
    private datechooser.beans.DateChooserCombo end_date;
    private javax.swing.JRadioButton free_radio;
    private javax.swing.JComboBox<String> instr_Combo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton oneTime_Radio;
    private javax.swing.JRadioButton perCycle_radio;
    private javax.swing.JRadioButton perSession_radio;
    private javax.swing.JTextField price_text;
    private datechooser.beans.DateChooserCombo start_date;
    private javax.swing.JComboBox<String> status_Comb;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert() {
            MyClass.insert(
                    Name_text.getText(), 
                    price_text.getText(),
                    blockedChoose,
                    status_Comb.getSelectedIndex(),
                    instr_Combo1.getSelectedItem().toString(),
                    start_date.getSelectedDate(),
                    end_date.getSelectedDate(),
                    payment,
                    jTextField1.getText(),
                    code.getText()
                    
 );
         
    }

    @Override
    public void update(){
        MyClass.update(Integer.parseInt(  jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
                                    Name_text.getText(),
                                    price_text.getText(),
                                    blockedChoose,
                                    status_Comb.getSelectedIndex(),
                                    instr_Combo1.getSelectedItem().toString(),
                                    start_date.getSelectedDate(),
                                    end_date.getSelectedDate(),
                                    payment,
                                    jTextField1.getText(),
                                    code.getText()
 );
          }

    @Override
    public void Delete() {
MyClass.delete(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ));
   }

    @Override
    public void Search() { 
 OracleConn.QueryinTABLE("select courseid,\n" +
"        coursename,\n" +
"        NVL(courseprice,(case payment when '3'then\n" +
"                          (select comvalue from comissions where tableid=(select max(tableid)from comissions) \n" +
"                           )when '4' then 0 end)\n" +
"           )||' L.E', \n" +
"        case(courseblocked) when '1' then 'Blocked'\n" +
"                            else 'On List' END,\n" +
"        case(coursestatus) when'0' then 'Open Public' \n" +
"                           when'1' then 'Private'\n" +
"                           when'2' then 'Offer' end, \n" +
"        employeename,\n" +
"        to_char(startdate,'DD-MON-YYYY'), \n" +
"        NVL(to_char(COURSES.ENDDATE,'DD-MON-YYYY'),'Opened'),\n" +
"        case (payment) WHEN '0' THEN 'One Time' \n" +
"                       WHEN '1' THEN 'Per Session' \n" +
"                       WHEN '2' THEN 'Per Cycle' \n" +
"                       WHEN '3' THEN 'Free + Profit ' \n" +
"                       WHEN '4' THEN 'Full Free' END,\n" +
"                       COALESCE (to_char(COURSES.CYCLE),'NO Cycle') \n"
         + " from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR " 
+" where lower(coursename) like'%"+Name_text.getText().replaceAll("'", "").toLowerCase()+"%' or  lower(employeename) like'%"+instr_Combo1.getSelectedItem().toString().toLowerCase()+"%' or courseprice like'%"+price_text.getText().trim().replaceAll("EGP", "")+"%' ", jTable1);
  
    }

    @Override
    public void Close() {
      Clear(jPanel2);
        this.setVisible(false);            
    }
 
    @Override
    public boolean isNull() {        
       return  !(
               
               Name_text.getText().trim().equals("")||
               price_text.getText().trim().replaceAll("EGP", "").equals("")||
               instr_Combo1.getSelectedIndex()==0||
               (!oneTime_Radio.isSelected()&&!perCycle_radio.isSelected()&&!perSession_radio.isSelected()&&!free_radio.isSelected())
               
               );

    }
    
   
    
}