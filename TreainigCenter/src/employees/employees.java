package employees;

import static Regex.RegularExpression.Email;
import Table_List_Property.AllProperty;
import static TextValidation.TextInput_type.English_Arabic_Onlny;
import static TextValidation.TextInput_type.to_InitCape;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import BasicFormsTraining.ItopBarPanel;
import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.array;
import TextValidation.TextInput_type;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;



public class employees extends javax.swing.JInternalFrame implements ItopBarPanel{


    public employees() { 
            initComponents();     
    }
    
    
    
 private  employeesClass MyClass =new employeesClass();

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
            jLabel4 = new javax.swing.JLabel();
            Email_Text = new javax.swing.JTextField();
            salary_text = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            Dept_combo = new javax.swing.JComboBox<>();
            jLabel7 = new javax.swing.JLabel();
            HireDate = new datechooser.beans.DateChooserCombo();
            jFormattedTextField1 = new javax.swing.JFormattedTextField();
            jLabel9 = new javax.swing.JLabel();
            jLabel9.setVisible(false);
            jLabel10 = new javax.swing.JLabel();
            jLabel10.setVisible(false);
            Name_text1 = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            Birthday1 = new datechooser.beans.DateChooserCombo();
            jLabel11 = new javax.swing.JLabel();
            male = new javax.swing.JRadioButton();
            female = new javax.swing.JRadioButton();
            jLabel12 = new javax.swing.JLabel();
            jLabel12.setVisible(false);
            top1 = new BasicFormsTraining.top();
            for(Component c:top1.getComponents()){
                if (c instanceof JButton) {
                    ((JButton) c).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if( ((JButton) c).getText().equals("New") ) {   New(top1,jPanel2); return;}
                            if( ((JButton) c).getText().equals("Add") ){  if( isNull() ) {insert();MyClass.viewTable(jTable1);Clear(jPanel2);column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data", "Validation", 0);} return;}
                            if( ((JButton) c).getText().equals("Edit") ){if( isNull() ){ update();  MyClass.viewTable(jTable1);Clear(jPanel2);column(null);return;}else {JOptionPane.showMessageDialog(null, "Please fill Required Data To Edit ", "Validation", 0);}}
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
            setTitle("Employee Registers");
            setToolTipText("Employee Information");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/employee.png"))); // NOI18N
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
                    "id", "Name", "Email", "Phone", "Salary", "Department", "Age", "Hire Date ", "Gender"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.setToolTipText("Last 50 Employee Record");
            jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            jTable1.setDropMode(javax.swing.DropMode.ON);
            jTable1.setGridColor(new java.awt.Color(255, 0, 0));
            jTable1.setNextFocusableComponent(Name_text1);
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
            jLabel2.setText("Name");

            jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("Phone");

            jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            jLabel4.setText("Department");

            Email_Text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Email_Text.setToolTipText("<html>\nPlease Enter Employee E-Mail  <br>\n<b>Example: </b>Ahmed_ali@hotmail.com\n</html>");
            Email_Text.setNextFocusableComponent(salary_text);
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

            salary_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            salary_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            salary_text.setToolTipText("<html>\nPlease Enter Employee Salary  <br>\n<b>Example:</b>1200\n</html>");
            salary_text.setDragEnabled(true);
            salary_text.setNextFocusableComponent(male);
            salary_text.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    salary_textFocusGained(evt);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    salary_textFocusLost(evt);
                }
            });
            salary_text.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    salary_textKeyTyped(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Hire Date");

            jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel6.setText("E_Mail");

            treainigcenter.AutoCompletion.enable(Dept_combo);
            Dept_combo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            Dept_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Department" }));
            Dept_combo.setToolTipText("<html>\nPlease Enter Employee Department  <br>\n<b>Example:</b>Seceratery ..\n</html>");
            Dept_combo.setNextFocusableComponent(HireDate);
            Dept_combo.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    Dept_comboAncestorAdded(evt);
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });

            jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Salary");

            HireDate.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
        HireDate.setCalendarPreferredSize(new java.awt.Dimension(332, 210));
        HireDate.setNothingAllowed(false);
        HireDate.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 20));
        HireDate.setNavigateFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 15));
        HireDate.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        HireDate.setShowOneMonth(true);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setToolTipText("<html>\nPlease Enter Employee Phone  <br>\n<b>Example: </b>010xxxxxxx\n</html>");
        jFormattedTextField1.setDragEnabled(true);
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jFormattedTextField1.setNextFocusableComponent(Email_Text);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("^^Please Check your Email^^");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("^^Only English , Arabic Text^^");

        Name_text1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Name_text1.setToolTipText("<html>\nPlease Enter Employee Name  <br>\n<b>Example:</b>Ahmed ali ..\n</html>");
        Name_text1.setNextFocusableComponent(jFormattedTextField1);
        Name_text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Name_text1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Gender");

        Birthday1.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
    Birthday1.setCalendarPreferredSize(new java.awt.Dimension(348, 230));
    Birthday1.setNothingAllowed(false);
    Birthday1.setFormat(2);
    Birthday1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 20));
    Birthday1.setNavigateFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 15));
    Birthday1.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    Birthday1.setShowOneMonth(true);

    jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("Birthday");

    gender.add(male);
    male.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
    male.setText("Male");
    male.setToolTipText("Employee is Male");
    male.setOpaque(false);

    gender.add(female);
    female.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
    female.setText("Female");
    female.setToolTipText("Employee is Female");
    female.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    female.setNextFocusableComponent(female);
    female.setOpaque(false);

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 51, 0));
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel12.setText("^^Only Numbers Text^^");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(Name_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(95, 95, 95)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(Email_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(95, 95, 95)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(salary_text, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(95, 95, 95)
            .addComponent(jLabel4)
            .addGap(5, 5, 5)
            .addComponent(Dept_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel11)
            .addGap(5, 5, 5)
            .addComponent(Birthday1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(95, 95, 95)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(HireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(73, 73, 73)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(185, 185, 185)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Name_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Email_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(salary_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Dept_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Birthday1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(HireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGap(5, 5, 5)
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

    private void salary_textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salary_textKeyTyped

         if (salary_text.getText().length()>=5)
                evt.consume();
         else TextInput_type.NumbersOnlny(evt,jLabel12,salary_text);
    }//GEN-LAST:event_salary_textKeyTyped

    private void Email_TextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_TextFocusLost
        if (Email(Email_Text.getText())) {
            jLabel9.setVisible(false);
        }
    else    jLabel9.setVisible(true);

    }//GEN-LAST:event_Email_TextFocusLost

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        System.err.println("1");
        if(array[3]==1)
        MyClass.viewTable(jTable1);
        else AllProperty.clearRows(jTable1);
//jTable1.setShowGrid(true);
 
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount()==2) {
       MyClass.ViewBox(
               Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
               Name_text1,
               Email_Text, 
               jFormattedTextField1, 
               salary_text, 
               Dept_combo,
               Birthday1,
               HireDate,
               male,
               female
       );
       
       doubledclicked=true;
    //   doubledclicked=false;
       
    
    
            
    if(array[1]==0)
        top1.btnEdite.setEnabled(false);
    else 
        top1.btnEdite.setEnabled(true);
   
    if(array[2]==0)
        top1.btnDelete.setEnabled(false);
    else  
        top1.btnDelete.setEnabled(true);
     
    
    
    
   
       }
        else {
            doubledclicked=false; Clear(jPanel2);}
           doubledclicked=false;
        
   
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void salary_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salary_textFocusLost

        if (salary_text.getText().trim().equals("")) {
            
        }
        else if(salary_text.getText().trim().equals("EGP"));
        else salary_text.setText(salary_text.getText()+" EGP");
        
        
        
        
    }//GEN-LAST:event_salary_textFocusLost

    private void Email_TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Email_TextKeyTyped
if (Email_Text.getText().length()>=30) {
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

    private void Name_text1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name_text1KeyTyped
  if (Name_text1.getText().length()==1) {
        to_InitCape(Name_text1);    
        }
         if (Name_text1.getText().length()>=30)
             evt.consume();
         else English_Arabic_Onlny(evt,jLabel10,Name_text1);
    }//GEN-LAST:event_Name_text1KeyTyped

    private void Dept_comboAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Dept_comboAncestorAdded
OracleConn.FullCombo(Dept_combo, "Departments", "departmentname");
    }//GEN-LAST:event_Dept_comboAncestorAdded

    private void salary_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salary_textFocusGained
salary_text.setText(salary_text.getText().replaceAll(" EGP", ""));
    }//GEN-LAST:event_salary_textFocusGained

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
    private datechooser.beans.DateChooserCombo Birthday1;
    private javax.swing.JComboBox<String> Dept_combo;
    private javax.swing.JTextField Email_Text;
    private datechooser.beans.DateChooserCombo HireDate;
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
    private javax.swing.JTextField Name_text1;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JFormattedTextField jFormattedTextField1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField salary_text;
    private BasicFormsTraining.top top1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert(){
             MyClass.insert( 
                     Name_text1.getText(),
                     Email_Text.getText(),
                     jFormattedTextField1.getText().replaceAll("[-]", ""),
                     salary_text.getText().replaceAll(" EGP", ""),
                     Dept_combo.getSelectedItem().toString(),
                     HireDate.getSelectedDate(),
                     Birthday1.getSelectedDate(),
                     male.isSelected()?'1':'0'
                    );
         
    }

    @Override
    public void update(){
         
           MyClass.update(Integer.parseInt( 
                                    jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ),
                                   Name_text1.getText(),
                                   Email_Text.getText(),
                                   jFormattedTextField1.getText().replaceAll("[-]", ""),
                                   salary_text.getText().replaceAll(" EGP", ""),
                                   Dept_combo.getSelectedItem().toString(),
                                   HireDate.getSelectedDate(),
                                   Birthday1.getSelectedDate(),
                                   male.isSelected()?'1':'0'
                                   ); 
          }

    @Override
    public void Delete() {
MyClass.delete(Integer.parseInt( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString() ));
    }

    @Override
    public void Search() { 
OracleConn.QueryinTABLE("select EMPLOYEEID,\n" +
"        employeename ,\n" +
"        employeeemail,\n" +
"        employeephone ,\n" +
"        employeesalary||' EGP',\n" +
"        departmentname,\n" +
"        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEBIRTHDAY,'YYYY')||' Years Old',\n" +
"        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEHIREDATE,'YYYY')||' Year(s)',\n" +
"        case (gender) WHEN '1' THEN 'Male' WHEN '0' THEN 'Female' END\n" +
"        from EMPLOYEES join departments on departments.DEPARTMENTID=EMPLOYEES.EMPLOYEEDEPARTMENT "
        + "where lower(employeename) like '%"+Name_text1.getText().replaceAll("'", "").toLowerCase()+"%' and employeephone like'%"+jFormattedTextField1.getText().replaceAll("-", "").trim().replaceAll("'", "")+"%' or (departmentname like'%"+Dept_combo.getSelectedItem()+"%' ) "
        + "order by employeename ASC", jTable1);  
    }

    @Override
    public void Close() {
        Clear(jPanel2);
        male.setSelected(true);
        this.setVisible(false);
             
    }
 
    @Override
    public boolean isNull() {
        
        if (Birthday1.getSelectedDate().equals(HireDate.getSelectedDate()) ){
            JOptionPane.showInternalMessageDialog(this, "Birthdate Can't be equal Hire Date","Validations",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
       return  !(Name_text1.getText().trim().equals("")||salary_text.getText().trim().equals("")
               || (!male.isSelected()&&!female.isSelected())||Dept_combo.getSelectedIndex()==0
               ||jLabel9.isShowing()
               );
     }
    
}
//f||f||(f&t)||f||f