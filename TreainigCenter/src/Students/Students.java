package Students;

import static Regex.RegularExpression.Email;
import Table_List_Property.AllProperty;
import static TextValidation.TextInput_type.English_Arabic_Onlny;
import static TextValidation.TextInput_type.to_InitCape;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.Desktop;
import java.net.URI;


public class Students extends javax.swing.JInternalFrame implements ItopBarPanel {

    public Students() {
        initComponents();
    }

    private StudentsClass MyClass = new StudentsClass();
    JFileChooser choos = null;
    boolean doubledclicked = false, enabledImage = true;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
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
            jLabel4 = new javax.swing.JLabel();
            Email_Text = new javax.swing.JTextField();
            Name_text = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            Gender_Comb = new javax.swing.JComboBox<>();
            jLabel7 = new javax.swing.JLabel();
            dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
            jFormattedTextField1 = new javax.swing.JFormattedTextField();
            jLabel9 = new javax.swing.JLabel();
            jLabel9.setVisible(false);
            jLabel10 = new javax.swing.JLabel();
            jLabel10.setVisible(false);
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

            jCheckBoxMenuItem1.setText("Disabled Showing");
            jCheckBoxMenuItem1.setToolTipText("Disabled Showing when Clicked Record Below To Increase Performance");
            jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/01.png"))); // NOI18N
            jCheckBoxMenuItem1.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jCheckBoxMenuItem1ItemStateChanged(evt);
                }
            });
            jPopupMenu1.add(jCheckBoxMenuItem1);

            jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
            jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
            jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/open24.png"))); // NOI18N
            jMenuItem1.setText("Open Computer");
            jMenuItem1.setToolTipText("Browse your Computer To Select Student Image");
            jMenuItem1.setOpaque(true);
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
                }
            });
            jPopupMenu1.add(jMenuItem1);

            jPopupMenu1.add(jMenuItem1);
            jPopupMenu1.add(jCheckBoxMenuItem1);

            setForeground(java.awt.Color.white);
            setIconifiable(true);
            setTitle("Student");
            setToolTipText("Student Information");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/stBIG.png"))); // NOI18N
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
                    "id", "Name", "Code", "Phone", "Gender", "Birthday"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setToolTipText("Last 50 Student Record");
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
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Informations", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
            jPanel2.setOpaque(false);

            jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel2.setText("Name");

            jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("Phone");

            jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel4.setText("Gender");

            Email_Text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Email_Text.setToolTipText("<html>\nPlease Enter Student E-Mail  <br>\n<b>Example: </b>Ahmed_ali@hotmail.com\n</html>");
            Email_Text.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    Email_TextFocusLost(evt);
                }
            });
            Email_Text.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    Email_TextKeyTyped(evt);
                }
            });

            Name_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Name_text.setToolTipText("<html>\nPlease Enter Student Name  <br>\n<b>Example:</b>Ahmed ali ..\n</html>");
            Name_text.setNextFocusableComponent(jFormattedTextField1);
            Name_text.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    Name_textFocusLost(evt);
                }
            });
            Name_text.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    Name_textKeyTyped(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Birthday");

            jLabel1.setBackground(new java.awt.Color(255, 255, 255));
            jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("No Image Data");
            jLabel1.setToolTipText("<html>\nPlease Attache Student Image  <br>\n<b>Example:</b> Clicked here and choose from your Computer.\n</html>");
            jLabel1.setComponentPopupMenu(jPopupMenu1);
            jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jLabel1.setOpaque(true);
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel1MouseClicked(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel6.setText("E_Mail");

            Gender_Comb.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            Gender_Comb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
            Gender_Comb.setNextFocusableComponent(dateChooserCombo2);

            jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Student Code");

            dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(314, 204));
        dateChooserCombo2.setNothingAllowed(false);
        dateChooserCombo2.setFormat(2);
        dateChooserCombo2.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 20));
        dateChooserCombo2.setNavigateFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 15));
        dateChooserCombo2.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        dateChooserCombo2.setShowOneMonth(true);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setToolTipText("<html>\nPlease Enter Student Phone  <br>\n<b>Example: </b>010xxxxxxx\n</html>");
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jFormattedTextField1.setNextFocusableComponent(Email_Text);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("^^Please Check your Email^^");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("^^Only English , Arabic Text^^");

        code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        code.setToolTipText("Student ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender_Comb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Email_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Gender_Comb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), null));
        top1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addComponent(top1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
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
        if (Name_text.getText().length() == 1) {
            to_InitCape(Name_text);
        }
        if (Name_text.getText().length() >= 30) {
            evt.consume();
        } else {
            English_Arabic_Onlny(evt, jLabel10, Name_text);
        }
    }//GEN-LAST:event_Name_textKeyTyped

    private void Email_TextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_TextFocusLost
        if (Email(Email_Text.getText())) {
            jLabel9.setVisible(false);
        } else {
            jLabel9.setVisible(true);
        }

    }//GEN-LAST:event_Email_TextFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
//JFileChooser choos=new JFileChooser(JFileChooser.ACCESSORY_CHANGED_PROPERTY);
//if (evt!=null) 
//    if (SwingUtilities.isRightMouseButton(evt))  
//        { 
//            jPopupMenu1.show(jLabel1, evt.getX() , evt.getY());
//             return;     
//        }

        choos = new JFileChooser() {
            @Override
            protected JDialog createDialog(Component parent) {
                JDialog dialog = super.createDialog(parent);
//        BufferedImage image = new BufferedImage( 16, 16, BufferedImage.TYPE_INT_BGR );
                dialog.setIconImage(new ImageIcon("A:\\My programs\\TreainigCenter\\src\\IconUsed\\studentInternal.png").getImage());
                return dialog;
            }
        };

        choos.setDialogTitle("Select Student Image");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES FILES", "gif", "jpg", "jpeg", "png");
        choos.setFileFilter(filter);
        choos.setAcceptAllFileFilterUsed(false);
        choos.setMultiSelectionEnabled(false);
        choos.setFileHidingEnabled(true);
//choos.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);    

        choos.setFileView(new FileView() {
            public Icon getIcon(File f) {
                // Get a FileSystemView object using getFileSystemView()
                // method (static) of FileSystemView class. This contains
                // getSystemIcon() method which takes a file and gives the
                // corresponding system icon for it.
                return FileSystemView.getFileSystemView().getSystemIcon(f);
            }

        });

//    try {
//       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//       SwingUtilities.updateComponentTreeUI(choos);
//    } catch (Exception ex) {
//        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//    } 
        if (choos.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
            choos = null;
            mypath=null;
            return;
        }
          mypath=choos.getSelectedFile().getPath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(choos.getSelectedFile().getPath()).getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_AREA_AVERAGING));
        jLabel1.setText("");
        jLabel1.setIcon(imageIcon);
 

    }//GEN-LAST:event_jLabel1MouseClicked
 String mypath;
    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        System.err.println("1");
        if (array[3] == 1) {
            MyClass.viewTable(jTable1);
        }
        jTable1.setShowGrid(true);


    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2) {
            MyClass.ViewBox(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()), Name_text, jFormattedTextField1, Email_Text, Gender_Comb, dateChooserCombo2, code, jLabel1, enabledImage,choos);

            doubledclicked = true;
            //   doubledclicked=false;

            if (array[1] == 0) {
                top1.btnEdite.setEnabled(false);
            } else {
                top1.btnEdite.setEnabled(true);
            }
            if (array[2] == 0) {
                top1.btnDelete.setEnabled(false);
            } else {
                top1.btnDelete.setEnabled(true);
            }

            /*
        for(Component c : top1.getComponents())
{
    if( ((JButton) c).getText().equals("Edite") ){ c.setEnabled(true);continue;}                
    else if( ((JButton) c).getText().equals("Delete") ) { c.setEnabled(true);}
    else break;
}
             */
        } else {doubledclicked=false; Clear(jPanel2);}
        doubledclicked = false;


    }//GEN-LAST:event_jTable1MouseClicked

    private void Name_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Name_textFocusLost

    }//GEN-LAST:event_Name_textFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jLabel1MouseClicked(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ItemStateChanged
        if (jCheckBoxMenuItem1.isSelected()) {
            enabledImage = false;
            jLabel1.setIcon(null);
            jLabel1.setText("No Image Data");
            choos = null;
        } else {
            enabledImage = true;
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ItemStateChanged

    private void Email_TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Email_TextKeyTyped
        if (Email_Text.getText().length() >= 25) {
            evt.consume();
        }
    }//GEN-LAST:event_Email_TextKeyTyped

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email_Text;
    private javax.swing.JComboBox<String> Gender_Comb;
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
    private javax.swing.JTextField code;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert() {

        if ((!jLabel1.getText().equals("No Image Data")) || choos != null) {
            MyClass.insert(Name_text.getText(),
                    jFormattedTextField1.getText().replaceAll("[-]", ""),
                    Email_Text.getText(),
                    Gender_Comb.getSelectedIndex(),
                    dateChooserCombo2.getSelectedDate(),
                    code.getText(),
                    choos.getSelectedFile().getName(),
                    choos.getSelectedFile().getParent()
            );
        } else {
            MyClass.insert(Name_text.getText(),
                    jFormattedTextField1.getText().replaceAll("[-]", ""),
                    Email_Text.getText(),
                    Gender_Comb.getSelectedIndex(),
                    dateChooserCombo2.getSelectedDate(),
                    code.getText(),
                    "",
                    ""
            );
        }

        /*    if(choos!=null)
        MyClass.insert(Name_text.getText(),
        jFormattedTextField1.getText().replaceAll("[-]", ""),
        Email_Text.getText(),
        Gender_Comb.getSelectedIndex(),
        dateChooserCombo2.getSelectedDate(),
        code.getText(),
        choos.getSelectedFile().getName(),
        choos.getSelectedFile().getParent()
);
        else
        MyClass.insert(Name_text.getText(),
        jFormattedTextField1.getText().replaceAll("[-]", ""),
        Email_Text.getText(),
        Gender_Comb.getSelectedIndex(),
        dateChooserCombo2.getSelectedDate(),
        code.getText(),
        "",
        ""
);
         */
    }

    @Override
    public void update() {
if (mypath!=null&&(!jLabel1.getText().equals("No Image Data")|| choos != null)) {
//choos=new JFileChooser();

//choos.setSelectedFile(new File(OracleConn.ret_value("select path||'\'||imagename from students where stdid="+jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString()));

    
    MyClass.update(Integer.parseInt(
                    jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()),
                    Name_text.getText(),
                    jFormattedTextField1.getText().replaceAll("[-]", ""),
                    Email_Text.getText(),
                    Gender_Comb.getSelectedIndex(),
                    dateChooserCombo2.getSelectedDate(),
                    code.getText(),
                    choos.getSelectedFile().getName(),
                    choos.getSelectedFile().getParent()
            );
        } else {
            MyClass.update(Integer.parseInt(
                    jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()),
                    Name_text.getText(),
                    jFormattedTextField1.getText().replaceAll("[-]", ""),
                    Email_Text.getText(),
                    Gender_Comb.getSelectedIndex(),
                    dateChooserCombo2.getSelectedDate(),
                    code.getText(),
                    "",
                    ""
            );
        }
jLabel1.setIcon(null);
jLabel1.setText("No Image Data");
    }

    @Override
    public void Delete() {
        MyClass.delete(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
jLabel1.setIcon(null);
jLabel1.setText("No Image Data");

    }

    @Override
    public void Search() {
        MyClass.search(jTable1, Name_text.getText(), jFormattedTextField1.getText().replaceAll("[-]", "").trim(), Gender_Comb.getSelectedIndex(), code.getText(), Email_Text.getText());
jLabel1.setIcon(null);
jLabel1.setText("No Image Data");

    }

    @Override
    public void Close() {
        Clear(jPanel2);
        jLabel1.setText("No Image Data");
        jLabel1.setIcon(null);
        this.setVisible(false);
    }

    @Override
    public boolean isNull() {

        return !(Name_text.getText().trim().equals("")
                || Email_Text.getText().trim().equals("")
                || jFormattedTextField1.getText().replaceAll("-", "").trim().equals("")
                
                );

    }

}
