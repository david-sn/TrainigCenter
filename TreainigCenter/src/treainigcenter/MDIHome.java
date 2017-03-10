package treainigcenter;

import CV.Instuctor_CV;
import DatabaseConnection.OracleConn;
import Login_USER.Privilage;
import Reports.Absence.Filtering_Ab;
import Reports.Attendance.Filtering_At;
import Reports.Examss.runsExams;
import Reports.RommsDaySchdule.runsGroupfilter;
import Reports.StudentPaymentForCourses.RangeFilter;
import Reports.Students.Filtering;
import Reports.monthlyProfit.month;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class MDIHome extends javax.swing.JFrame {

    Students.Students myStudent = null;
    employees.employees myemployye = null;
    Departments.Department mydepartment = null;
    Courses.Course mycourse = null;
    Login_USER.AddUser myuser = null;
    Login_USER.EditeUser myEdite = null;
    Centers.Center mycenter = null;
    Registers.Regester myregister1 = null;
    Groups.Group mygroup1 = null;
    Attendances.Attendance myattendance = null;
    Dashboard.ParentDash myD1 = null;
    CenterComission.Comissions mycom =null;
    payroll.StudentPayment mypay1=null;
    Exams.Exams myexame=null;
    Exams.ExamsDetail mydetail=null;
    
    public static String REPORTSPATH ="E:\\IMP\\project";


    public MDIHome(String val) {
        initComponents();


        this.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\My programs\\TreainigCenter\\src\\IconUsed\\centerBIG22.png"));
        this.setTitle("Training Center Management System");
        //REPORTSPATH = JOptionPane.showInputDialog("Report Path","A:\\My programs\\TreainigCenter\\src");
// REPORTSPATH =   "A:\\My programs\\TreainigCenter\\src";
 OracleConn.username=val;
 privilagePart1.user_label.setText(val);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        neonBorderEffect1 = new org.jdesktop.swingx.painter.effects.NeonBorderEffect();
        labelProperties1 = new org.jdesktop.swingx.table.LabelProperties();
        privilagePart1 = new BasicFormsTraining.PrivilagePart();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        ImageIcon im=new ImageIcon(getClass().getResource("/IconUsed/Cimbura-Blue-Desktop-Background.jpg"));
        Image i=im.getImage();

        jDesktopPane1 = jDesktopPane1=new JDesktopPane()
        {
            public void paintComponent(Graphics g){
                g.drawImage(i,0,0,getWidth(),getHeight(),this);
            }
        };
        jButton2 = new javax.swing.JButton();
        Proceesing_DATA = new javax.swing.JPanel();
        StudentBTN = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        Basic_Input_DATA = new javax.swing.JPanel();
        StudentBTN1 = new javax.swing.JButton();
        Employee1 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        UserLogin_btn2 = new javax.swing.JButton();
        changePass_btn1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        UserLogin_btn3 = new javax.swing.JButton();
        changePass_btn2 = new javax.swing.JButton();
        Reports = new javax.swing.JPanel();
        jButton32 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        StudentBTN2 = new javax.swing.JButton();
        Employee2 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        analogClock1 = new BasicFormsTraining.AnalogClock1();
        analogClock2 = new BasicFormsTraining.AnalogClock1();
        jButton3 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();

        labelProperties1.setText("labelProperties1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jScrollPane2.getHorizontalScrollBar().setUnitIncrement(12);

        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setOpaque(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/power.png"))); // NOI18N
        jButton2.setToolTipText("Exit From System");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Proceesing_DATA.setBackground(new java.awt.Color(102, 255, 153));
        Proceesing_DATA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processing Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 36))); // NOI18N
        Proceesing_DATA.setOpaque(false);

        StudentBTN.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        StudentBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/groupBIG.png"))); // NOI18N
        StudentBTN.setText("<html> Group & <br> Schedule </html> ");
        StudentBTN.setToolTipText("Groups Time Managemnt");
        StudentBTN.setBorderPainted(false);
        StudentBTN.setContentAreaFilled(false);
        StudentBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/GroupSmall.png"))); // NOI18N
        StudentBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBTNActionPerformed(evt);
            }
        });

        Employee.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerBIG.png"))); // NOI18N
        Employee.setText("Register");
        Employee.setToolTipText("Student Register in Groups");
        Employee.setBorderPainted(false);
        Employee.setContentAreaFilled(false);
        Employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Employee.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerSmall.png"))); // NOI18N
        Employee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/paybig.png"))); // NOI18N
        jButton11.setText("Payment");
        jButton11.setToolTipText("Student Payroll");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png"))); // NOI18N
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/DashBIG.png"))); // NOI18N
        jButton15.setText("<html><pre><b>   My<br>Dashboard");
        jButton15.setToolTipText("Daily Dashboard");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/dashsmall.png"))); // NOI18N
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionBig.png"))); // NOI18N
        jButton18.setText("<html><pre><b>  Center<br>Commision");
        jButton18.setToolTipText("Center Commision Setting");
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionSmall.png"))); // NOI18N
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/resultBIG.png"))); // NOI18N
        jButton29.setText("<html><pre><b>Assignment<br> Degrees");
        jButton29.setToolTipText("Assign Degree to Student");
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/resultsSMALL.png"))); // NOI18N
        jButton29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/CVtBIG.png"))); // NOI18N
        jButton33.setText("<html><pre><b>Employee CV<br> ");
        jButton33.setToolTipText("Assign Degree to Student");
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/CVsSMALL.png"))); // NOI18N
        jButton33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Proceesing_DATALayout = new javax.swing.GroupLayout(Proceesing_DATA);
        Proceesing_DATA.setLayout(Proceesing_DATALayout);
        Proceesing_DATALayout.setHorizontalGroup(
            Proceesing_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Proceesing_DATALayout.createSequentialGroup()
                .addComponent(StudentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Proceesing_DATALayout.createSequentialGroup()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Proceesing_DATALayout.setVerticalGroup(
            Proceesing_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Proceesing_DATALayout.createSequentialGroup()
                .addGroup(Proceesing_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(Proceesing_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Basic_Input_DATA.setBackground(new java.awt.Color(102, 255, 153));
        Basic_Input_DATA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic Input Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 36))); // NOI18N
        Basic_Input_DATA.setOpaque(false);

        StudentBTN1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        StudentBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/stBIG.png"))); // NOI18N
        StudentBTN1.setText("Student Register");
        StudentBTN1.setToolTipText("Add New Students");
        StudentBTN1.setBorderPainted(false);
        StudentBTN1.setContentAreaFilled(false);
        StudentBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentBTN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentBTN1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/stsmall.png"))); // NOI18N
        StudentBTN1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBTN1ActionPerformed(evt);
            }
        });

        Employee1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Employee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/employee.png"))); // NOI18N
        Employee1.setText("Employee Register");
        Employee1.setToolTipText("Add New Employees");
        Employee1.setBorderPainted(false);
        Employee1.setContentAreaFilled(false);
        Employee1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Employee1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/employeeSMALL.png"))); // NOI18N
        Employee1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Employee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee1ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/depatBIG.png"))); // NOI18N
        jButton13.setText("Department Register");
        jButton13.setToolTipText("Add New Departments");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/deptSMALL.png"))); // NOI18N
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        UserLogin_btn2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        UserLogin_btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/exambig.png"))); // NOI18N
        UserLogin_btn2.setText("Exam Register");
        UserLogin_btn2.setToolTipText("Manage Exams");
        UserLogin_btn2.setBorderPainted(false);
        UserLogin_btn2.setContentAreaFilled(false);
        UserLogin_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserLogin_btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserLogin_btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/examesmall.png"))); // NOI18N
        UserLogin_btn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UserLogin_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLogin_btn2ActionPerformed(evt);
            }
        });

        changePass_btn1.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        changePass_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/changeBig.png"))); // NOI18N
        changePass_btn1.setText("Change Password");
        changePass_btn1.setToolTipText("Change Users Passwords");
        changePass_btn1.setBorderPainted(false);
        changePass_btn1.setContentAreaFilled(false);
        changePass_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePass_btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changePass_btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/changeSmall.png"))); // NOI18N
        changePass_btn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        changePass_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePass_btn1ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/courseBIG.png"))); // NOI18N
        jButton16.setText("Course Register");
        jButton16.setToolTipText("Add New Courses");
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/courseSMALL.png"))); // NOI18N
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/centerBIG22.png"))); // NOI18N
        jButton27.setText("<html>Center<br>Building");
        jButton27.setToolTipText("Add New Center Branches");
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/buildingSMALL.png"))); // NOI18N
        jButton27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        UserLogin_btn3.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        UserLogin_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/loginBIG.png"))); // NOI18N
        UserLogin_btn3.setText("Manage Users");
        UserLogin_btn3.setToolTipText("Add New Users to Login at System ");
        UserLogin_btn3.setBorderPainted(false);
        UserLogin_btn3.setContentAreaFilled(false);
        UserLogin_btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserLogin_btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserLogin_btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/loginSmall.png"))); // NOI18N
        UserLogin_btn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UserLogin_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLogin_btn3ActionPerformed(evt);
            }
        });

        changePass_btn2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        changePass_btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/privBIG.png"))); // NOI18N
        changePass_btn2.setText("System Privilage");
        changePass_btn2.setToolTipText("Privilage Assignmebt");
        changePass_btn2.setBorderPainted(false);
        changePass_btn2.setContentAreaFilled(false);
        changePass_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePass_btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changePass_btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/privSMALL.png"))); // NOI18N
        changePass_btn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        changePass_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePass_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Basic_Input_DATALayout = new javax.swing.GroupLayout(Basic_Input_DATA);
        Basic_Input_DATA.setLayout(Basic_Input_DATALayout);
        Basic_Input_DATALayout.setHorizontalGroup(
            Basic_Input_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Basic_Input_DATALayout.createSequentialGroup()
                .addComponent(StudentBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Employee1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(UserLogin_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(changePass_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Basic_Input_DATALayout.createSequentialGroup()
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton13)
                .addGap(15, 15, 15)
                .addComponent(UserLogin_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(changePass_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Basic_Input_DATALayout.setVerticalGroup(
            Basic_Input_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Basic_Input_DATALayout.createSequentialGroup()
                .addGroup(Basic_Input_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLogin_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePass_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(Basic_Input_DATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLogin_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePass_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Reports.setBackground(new java.awt.Color(102, 255, 153));
        Reports.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 36))); // NOI18N
        Reports.setOpaque(false);

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/resultBIG.png"))); // NOI18N
        jButton32.setText("<html><pre><b>Assignment<br> Degrees");
        jButton32.setToolTipText("Assign Degree to Student");
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/resultsSMALL.png"))); // NOI18N
        jButton32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionBig.png"))); // NOI18N
        jButton30.setText("<html><pre><b>Center<br>Monthly <br>Profit");
        jButton30.setToolTipText("Monthly Profit");
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commissionSmall.png"))); // NOI18N
        jButton30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        StudentBTN2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        StudentBTN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/std_repBig.jpg"))); // NOI18N
        StudentBTN2.setText("Student Data");
        StudentBTN2.setToolTipText("Student Information");
        StudentBTN2.setBorderPainted(false);
        StudentBTN2.setContentAreaFilled(false);
        StudentBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentBTN2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StudentBTN2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/std_repSmall.png"))); // NOI18N
        StudentBTN2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StudentBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBTN2ActionPerformed(evt);
            }
        });

        Employee2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Employee2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/course_rep_Big.png"))); // NOI18N
        Employee2.setText("<html>Open <br>Course</html>");
        Employee2.setToolTipText("Current Working Courses");
        Employee2.setBorderPainted(false);
        Employee2.setContentAreaFilled(false);
        Employee2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Employee2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/course_repSmall.png"))); // NOI18N
        Employee2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Employee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee2ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/capacityBig_rep.png"))); // NOI18N
        jButton17.setText("<html>Group and<br>Occupation</html>");
        jButton17.setToolTipText("Group Occupation");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/capacitSmall_rep.png"))); // NOI18N
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/gr_repBig.png"))); // NOI18N
        jButton19.setText("<html>Course with <br>Instructor</html>");
        jButton19.setToolTipText("Course Data");
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/gr_rep_small.png"))); // NOI18N
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton22.setText("Center Profit");
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png"))); // NOI18N
        jButton22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerBIG.png"))); // NOI18N
        jButton21.setText("<html>Student<br> Registered In Groups");
        jButton21.setToolTipText("Student Registers");
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/registerSmall.png"))); // NOI18N
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/centerBIG22.png"))); // NOI18N
        jButton24.setText("<html>Center<br>Room And Capacity");
        jButton24.setToolTipText("Center Rooms");
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/buildingSMALL.png"))); // NOI18N
        jButton24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/depatBIG.png"))); // NOI18N
        jButton25.setText("<html>Department<br>Occupation");
        jButton25.setToolTipText("Department Information");
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/deptSMALL.png"))); // NOI18N
        jButton25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/AbsenceBIG.png"))); // NOI18N
        jButton26.setText("Absence");
        jButton26.setToolTipText("Lecture Absence");
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/AbsenceSMALL.png"))); // NOI18N
        jButton26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/mmroomBig.png"))); // NOI18N
        jButton14.setText("Detail Room");
        jButton14.setToolTipText("Room in Details");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/mmroomSmall.png"))); // NOI18N
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/attenBig.png"))); // NOI18N
        jButton28.setText("Attendance");
        jButton28.setToolTipText("Lecture Attendance");
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/attensmall.png"))); // NOI18N
        jButton28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/paybig.png"))); // NOI18N
        jButton23.setText("Payment");
        jButton23.setToolTipText("Student Payment");
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png"))); // NOI18N
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/scheduleBIG.png"))); // NOI18N
        jButton31.setText("<html><pre><b>Room<br>Schedule");
        jButton31.setToolTipText("Room Time Table");
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/scheduleSMALL.png"))); // NOI18N
        jButton31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton22)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(StudentBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportsLayout.createSequentialGroup()
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Employee2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addComponent(jButton22)
                .addGap(13, 13, 13)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        analogClock1.setVisible(false);
        analogClock1.setToolTipText("Time Now");

        javax.swing.GroupLayout analogClock1Layout = new javax.swing.GroupLayout(analogClock1);
        analogClock1.setLayout(analogClock1Layout);
        analogClock1Layout.setHorizontalGroup(
            analogClock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        analogClock1Layout.setVerticalGroup(
            analogClock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        analogClock2.setVisible(false);
        analogClock2.setToolTipText("Time Now");

        javax.swing.GroupLayout analogClock2Layout = new javax.swing.GroupLayout(analogClock2);
        analogClock2.setLayout(analogClock2Layout);
        analogClock2Layout.setHorizontalGroup(
            analogClock2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        analogClock2Layout.setVerticalGroup(
            analogClock2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/NEXITE.png"))); // NOI18N
        jButton3.setToolTipText("Log Out");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Proceesing_DATA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Basic_Input_DATA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Reports, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(analogClock1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(analogClock2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Basic_Input_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analogClock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Proceesing_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analogClock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(analogClock2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(analogClock1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Basic_Input_DATA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Proceesing_DATA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jScrollPane2.setViewportView(jPanel2);

        fileMenu.setMnemonic('f');
        fileMenu.setText("_");
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(privilagePart1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0)
                .addComponent(privilagePart1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBTN1ActionPerformed
        OracleConn.validation("Students.Students");
        //if (myStudent == null) {
            myStudent = new Students.Students();
        //}
        showForm(myStudent);
    }//GEN-LAST:event_StudentBTN1ActionPerformed

    private void Employee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee1ActionPerformed
       OracleConn.validation("employees.employees");
        //if (myemployye == null) {
            myemployye = new employees.employees();
        //}
        showForm(myemployye);
    }//GEN-LAST:event_Employee1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        OracleConn.validation("Departments.Department");
        
        //if (mydepartment == null) {
            
            mydepartment = new Departments.Department();
        //}
        showForm(mydepartment);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
//
//        showREPORT(getClass().getResource("/Reports/RoomDetals/Room.jasper"),
//                new Object[]{"branch",
//                    OptionPane.Messages.InputDialogAs_ComboBox("Please Select Center Branch", "Filter by Branches", '0', null, OracleConn.executeQuerY("select centername from centerbranch"))});
//
        showREPORT(REPORTSPATH+"\\Reports\\RoomDetals\\Room.jasper", 
        new Object[]{"branch",
            OptionPane.Messages.InputDialogAs_ComboBox("Please Select Center Branch", "Filter by Branches", '0', null, OracleConn.executeQuerY("select centername from centerbranch"))});
 

    }//GEN-LAST:event_jButton14ActionPerformed

    private void UserLogin_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLogin_btn2ActionPerformed
        OracleConn.validation("Exams.Exams");
        //if (myexame == null) {
            myexame = new Exams.Exams();
        //}
        showForm(myexame);
 
    }//GEN-LAST:event_UserLogin_btn2ActionPerformed

    private void changePass_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePass_btn1ActionPerformed
        OracleConn.validation("Login_USER.EditeUser");
        //if (myEdite == null) {
            myEdite = new Login_USER.EditeUser();
        //}
        showForm(myEdite);
    }//GEN-LAST:event_changePass_btn1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
OracleConn.validation("Courses.Course");
        //if (mycourse == null) {
            mycourse = new Courses.Course();
        //}
        showForm(mycourse);

    }//GEN-LAST:event_jButton16ActionPerformed

    private void StudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBTNActionPerformed
        OracleConn.validation("Groups.Group");
        //if (mygroup1 == null) {
            mygroup1 = new Groups.Group();
        //}
        showForm(mygroup1);

    }//GEN-LAST:event_StudentBTNActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        OracleConn.validation("Registers.Regester");
        //if (myregister1 == null) {
            myregister1 = new Registers.Regester();
        //}
        showForm(myregister1);
    }//GEN-LAST:event_EmployeeActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      OracleConn.validation("payroll.StudentPayment");
        //if (mypay1==null) {
                 mypay1=new payroll.StudentPayment();
          //   }
               showForm(mypay1);
    }//GEN-LAST:event_jButton11ActionPerformed
//
//    OracleConn.validation("Attendances.Attendance");
//       //if (myattendance == null) {
//         
//           String gg=( OptionPane.Messages.InputDialogAs_ComboBox("Please Select Course Name","Course Attendance",'0',null,OracleConn.executeQuerY("select coursename from courses where coursestatus=0")));
//           
//           myattendance = new Attendances.Attendance(
//         //OptionPane.Messages.InputDialogAs_ComboBox("Please Select Course Name","Course Attendance",'0',null,OracleConn.executeQuerY("select coursename from courses"))
//         gg,
//
//        OptionPane.Messages.InputDialogAs_ComboBox("Please Select Course Name","Course Attendance",'0', null,OracleConn.executeQuerY("select groupid from groups where courseid=(select courseid from courses where coursename='"+gg+"' )"))
//            );
//        //}
//         
//         
//        showForm(myattendance);
//        
//
//    
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

         OracleConn.validation("Dashboard.ParentDash");
        //if (myD1 == null) {
            myD1 = new Dashboard.ParentDash();
       // }
        showForm(myD1);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
  OracleConn.validation("CenterComission.Comissions");
        //if (mycom == null) {
             mycom = new CenterComission.Comissions();
        //}
        showForm(mycom);
    }//GEN-LAST:event_jButton18ActionPerformed

    Filtering f20=new Filtering();
    private void StudentBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBTN2ActionPerformed
//        showREPORT(getClass().getResource("/Reports/Students/Student.jasper"), new Object[]{"FromAge", JOptionPane.showInternalInputDialog(jDesktopPane1, "From Age", "Filtering by Age", JOptionPane.INFORMATION_MESSAGE), "ToAge", JOptionPane.showInternalInputDialog(jDesktopPane1, "To Age", "Filtering by Age", JOptionPane.INFORMATION_MESSAGE)});

//  showREPORT(REPORTSPATH+"\\Reports\\Students\\Student.jasper",new Object[]{"FromAge",JOptionPane.showInputDialog(jDesktopPane1, "From Age", "Filtering by Age", JOptionPane.INFORMATION_MESSAGE),"ToAge",JOptionPane.showInputDialog(jDesktopPane1, "To Age", "Filtering by Age", JOptionPane.INFORMATION_MESSAGE)});

f20.setVisible(true);


    }//GEN-LAST:event_StudentBTN2ActionPerformed

    private void Employee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee2ActionPerformed
    //     showREPORT(getClass().getResource("/Reports/OpenCourses/OpenCourses.jasper"), null);
  showREPORT(REPORTSPATH+"\\Reports\\OpenCourses\\OpenCourses.jasper",null);
    }//GEN-LAST:event_Employee2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
//        showREPORT(getClass().getResource("/Reports/Groups/Groups.jasper"),
//                new Object[]{"Course",
//                    OptionPane.Messages.InputDialogAs_ComboBox("Please Select Course Name to get Groups", "Filter by Courses", '0', null, OracleConn.executeQuerY("select Coursename from Courses"))});
 
showREPORT(REPORTSPATH+"\\Reports\\Groups\\Groups.jasper",null);

 

//        runsGroupfilter r=new runsGroupfilter();
//
//r.setVisible(true);

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        showREPORT(REPORTSPATH+"\\Reports\\CoursesWithInstructor\\CourseInstructor.jasper", null);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
 
        String g=OptionPane.Messages.InputDialogAs_ComboBox("Please Select Course Name", "Filter by Course Name ", '0', null, OracleConn.executeQuerY("select coursename from courses"));
        
 
        showREPORT(REPORTSPATH+"\\Reports\\StudentRegisterinGroup\\ReqSTD.jasper", 
        new Object[]{"courseName",
           g ,
           "GroupID",
        OptionPane.Messages.InputDialogAs_ComboBox("Please Select Group Number", "Filter by Course Name and Group No.", '0', null, OracleConn.executeQuerY("select groupid from Groups where courseid=(select courseid from courses where coursename='"+g+"')"))});

        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

//        showREPORT(getClass().getResource("/Reports/DepartmentsOccupation/DeptOccupation.jasper"),
  //              new Object[]{"Department_Name",
    //                OptionPane.Messages.InputDialogAs_ComboBox("Please Select Department Name", "Filter by Departments", '0', null, OracleConn.executeQuerY("select departmentname from departments"))});

        showREPORT(REPORTSPATH+"\\Reports\\DepartmentsOccupation\\DeptOccupation.jasper", 
        new Object[]{"Department_Name",
            OptionPane.Messages.InputDialogAs_ComboBox("Please Select Department Name", "Filter by Departments", '0', null, OracleConn.executeQuerY("select departmentname from departments"))});

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
//         showREPORT(getClass().getResource("/Reports/CenterRoomAndCapacity/Center.jasper"), null);

  showREPORT(REPORTSPATH+"\\Reports\\CenterRoomAndCapacity\\Center.jasper", null);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
new Filtering_Ab().setVisible(true); 
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
     OracleConn.validation("Centers.Center");
       // if (mycenter == null) {
            mycenter = new Centers.Center();
       // }
        showForm(mycenter);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
new Filtering_At().setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Do You Want Exit From System ?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
static public JFrame f;
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
f=new JFrame("Monthly Filter");
f.add(new RangeFilter());
f.setVisible(true);
f.setSize(450, 170);
//f.setLocationRelativeTo(null);
f.setLocationRelativeTo(null);
f.setIconImage(new ImageIcon(getClass().getResource("/IconUsed/Paystsmall.png")).getImage());

//  OptionPane.Messages.CONTAINER(new RangeFilter());
    }//GEN-LAST:event_jButton23ActionPerformed

    private void UserLogin_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLogin_btn3ActionPerformed
   OracleConn.validation("Login_USER.AddUser");
        //if (myuser == null) {
            myuser = new Login_USER.AddUser();
        //}
        showForm(myuser);
// 
    }//GEN-LAST:event_UserLogin_btn3ActionPerformed

    Login_USER.LoginForm myl=new Login_USER.LoginForm();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       if (JOptionPane.showConfirmDialog(null, "Do You Want Logout From your Account ?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                this.setVisible(false);
                myl.setVisible(true);
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
OracleConn.validation("Exams.ExamsDetail");
       // if (mydetail == null) {
            mydetail = new Exams.ExamsDetail();
        //}
        showForm(mydetail);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
 OptionPane.Messages.CONTAINER(new month());
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
new runsGroupfilter().setVisible(true);        
    }//GEN-LAST:event_jButton31ActionPerformed
    Privilage mypi =null;
    private void changePass_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePass_btn2ActionPerformed
      OracleConn.validation("Privilage");

        //if (mypi == null) {
            mypi = new Privilage();
        //}
        showForm(mypi);
    }//GEN-LAST:event_changePass_btn2ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
new runsExams().setVisible(true);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

        
        OracleConn.validation("Instuctor_CV.CV");

        //String g=OptionPane.Messages.InputDialogAs_ComboBox("Please Select Course Name", "Filter by Course Name ", '0', null, OracleConn.executeQuerY("select emnployeename from employees"));
        
Instuctor_CV c=new Instuctor_CV(OracleConn.ret_value("select employeeid from employees where employeename='"+OptionPane.Messages.InputDialogAs_ComboBox("Please Select Employee Name", "Filter by Employee Name ", '0', null, OracleConn.executeQuerY("select employeename from employees"))+"' ").toString());
         
        showForm(c);
        
        
    }//GEN-LAST:event_jButton33ActionPerformed

    
   private void showForm(JInternalFrame Form) {
     
//        OracleConn.validation(Form.getClass().getName());

        if (DatabaseConnection.OracleConn.array[4] == 1) {
            Form.setLocation(
                     (jDesktopPane1.getWidth() - Form.getWidth() )/ 2,
                    (jDesktopPane1.getHeight() - Form.getHeight() )/2
            );
                 
   
            if(!jDesktopPane1.isAncestorOf(Form)) 
                 jDesktopPane1.add(Form);
 jScrollPane2.getHorizontalScrollBar().setValue(910);
            Form.setVisible(true);

        }          privilagePart1.user_label.setText(OracleConn.username);
    }
                 //  <  editor-fold desc="Open Report With URL" >
   

   /*private void showREPORT(URL PathJasper, Object[] Parameter) {
JOptionPane.showMessageDialog(null, PathJasper.getFile().replaceAll("%20", " ").toString().replaceAll("file:/", "").replace("!", "").replace("jar", "rar"));
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
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(PathJasper.getFile().replaceAll("%20", " ").toString().replaceAll("file:/", "").replace("!", "").replace("jar", "rar"),
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
        }
    }
*/
    //</editor-fold >
   
   private void showREPORT(String PathJasper, Object[] Parameter) {

        try {
            Map params = null;

             //JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
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

            JasperViewer.viewReport(jprint, false,Locale.US);

            
            
            
            
            
            
            
            
            
            
            
            
            
                                                                                                                              // Export pdf file
            //    JasperExportManager.exportReportToPdfFile(jprint, getClass().getResource("/Reports/Report.pdf").getFile().replaceAll("%20", " "));
//if(JOptionPane.showConfirmDialog(jDesktopPane1, "Do You Want To Open Report With PDF Reader ?")==JOptionPane.YES_OPTION)
            //     Desktop.getDesktop().open(new java.io.File(getClass().getResource("/Reports/Report.pdf").getFile().replaceAll("%20", " ")));
// JasperPrint jasperPrint = JasperFillManager.fillReport(PathJasper,params, OracleConn.OpenConn( ));
            //JasperExportManager.exportReportToPdfFile(jasperPrint, "A:\\My programs\\ad.pdf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.print("Exceptiion" + e);
        }
    }
   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Basic_Input_DATA;
    private javax.swing.JButton Employee;
    private javax.swing.JButton Employee1;
    private javax.swing.JButton Employee2;
    private javax.swing.JPanel Proceesing_DATA;
    private javax.swing.JPanel Reports;
    private javax.swing.JButton StudentBTN;
    private javax.swing.JButton StudentBTN1;
    private javax.swing.JButton StudentBTN2;
    private javax.swing.JButton UserLogin_btn2;
    private javax.swing.JButton UserLogin_btn3;
    public static BasicFormsTraining.AnalogClock1 analogClock1;
    public static BasicFormsTraining.AnalogClock1 analogClock2;
    private javax.swing.JButton changePass_btn1;
    private javax.swing.JButton changePass_btn2;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.table.LabelProperties labelProperties1;
    private javax.swing.JMenuBar menuBar;
    private org.jdesktop.swingx.painter.effects.NeonBorderEffect neonBorderEffect1;
    private BasicFormsTraining.PrivilagePart privilagePart1;
    // End of variables declaration//GEN-END:variables

}
