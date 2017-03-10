package treainigcenter;






import DatabaseConnection.OracleConn;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class MDIHome1_BACKUP extends javax.swing.JFrame {

  
    
    public MDIHome1_BACKUP() {
        initComponents();
 privilagePart1.user_label.setText(OracleConn.username);

this.setIconImage(Toolkit.getDefaultToolkit().getImage("A:\\My programs\\TreainigCenter\\src\\IconUsed\\attend.jpg"));
this.setTitle("Training Center Management System");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        info.clearthought.layout.TableLayout _tableLayoutInstance1;

        neonBorderEffect1 = new org.jdesktop.swingx.painter.effects.NeonBorderEffect();
        labelProperties1 = new org.jdesktop.swingx.table.LabelProperties();

        ImageIcon im=new ImageIcon("A:\\My programs\\TreainigCenter\\src\\IconUsed\\Cimbura-Blue-Desktop-Background.jpg");
        Image i=im.getImage();

        jDesktopPane1 = jDesktopPane1=new JDesktopPane()
        {
            public void paintComponent(Graphics g){
                g.drawImage(i,0,0,getWidth(),getHeight(),this);
            }
        };
        analogClock1 = new mygeneral.AnalogClock();
        analogClock1.setVisible(false);
        jButton2 = new javax.swing.JButton();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        privilagePart1 = new BasicFormsTraining.PrivilagePart();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        labelProperties1.setText("labelProperties1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setOpaque(false);

        analogClock1.setBackground(new java.awt.Color(0, 204, 0));
        analogClock1.setFocusable(false);
        analogClock1.setOpaque(false);
        analogClock1.setRequestFocusEnabled(false);
        analogClock1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout analogClock1Layout = new javax.swing.GroupLayout(analogClock1);
        analogClock1.setLayout(analogClock1Layout);
        analogClock1Layout.setHorizontalGroup(
            analogClock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        analogClock1Layout.setVerticalGroup(
            analogClock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/power.png"))); // NOI18N
        jButton2.setToolTipText("Exit From System");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jXTaskPane1.setAnimated(true);
        jXTaskPane1.setMnemonic(76);
        jXTaskPane1.setTitle("Start Menue");
        jXTaskPane1.setToolTipText("System Navigations");
        jXTaskPane1.setSpecial(true);
        jXTaskPane1.setScrollOnExpand(true);

        _tableLayoutInstance1 = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance1.setHGap(0);
        _tableLayoutInstance1.setVGap(5);
        _tableLayoutInstance1.setColumn(new double[]{175});
        _tableLayoutInstance1.setRow(new double[]{175,175,175,175});
        jPanel1.setLayout(_tableLayoutInstance1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/process.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new info.clearthought.layout.TableLayoutConstraints(0, 1, 0, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/reportsMain.png"))); // NOI18N
        jButton6.setText("Reports");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new info.clearthought.layout.TableLayoutConstraints(0, 2, 0, 2, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/bacj.jpg"))); // NOI18N
        jPanel1.add(jButton7, new info.clearthought.layout.TableLayoutConstraints(0, 3, 0, 3, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/rocket.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jXTaskPane1Layout = new javax.swing.GroupLayout(jXTaskPane1.getContentPane());
        jXTaskPane1.getContentPane().setLayout(jXTaskPane1Layout);
        jXTaskPane1Layout.setHorizontalGroup(
            jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        jXTaskPane1Layout.setVerticalGroup(
            jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(analogClock1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jXTaskPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jXTaskPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analogClock1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(analogClock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jXTaskPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(privilagePart1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(privilagePart1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
jButton2ActionPerformed(evt);
    }//GEN-LAST:event_exitMenuItemActionPerformed
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(JOptionPane.showConfirmDialog(null, "Do You Want Exite From System ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 finalshow(s11);
 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
finalshow(s10);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
finalshow(s12);
    }//GEN-LAST:event_jButton6ActionPerformed

   
         
    Containers.Process s10=new  Containers.Process ();
         
    Containers.Basics s11=new  Containers.Basics ();
    
    Containers.Reports s12=new Containers.Reports() ;
    
    JPanel old=new JPanel();
   
    
    void finalshow(JPanel o){
    
        
      //  958, 455
    jXTaskPane1.setCollapsed(true);

     //  if(array[4]==1){
o.setLocation( (int) (jDesktopPane1.getSize().getWidth() - 958)/2,
    (jDesktopPane1.getSize().height- 455)/2);
        
    if(jDesktopPane1.isAncestorOf(o));
         
 
    else jDesktopPane1.add(o);
 
        
    
o.setSize(889, 725);
o.setVisible(true);

      //  } 
     
            old.setVisible(false);
     
      old=o;

      
    
    }

    
        void finalshowReport(JPanel o){
    
        
        
    jXTaskPane1.setCollapsed(true);
    
    
     //  if(array[4]==1){
o.setLocation( (int) (jDesktopPane1.getSize().getWidth() - 953)/2,
    (jDesktopPane1.getSize().height- 740)/2);
        
    if(jDesktopPane1.isAncestorOf(o))
         ;
 
    else jDesktopPane1.add(o);
 
        
    
o.setSize(953, 740);
o.setVisible(true);

      //  } 
     
            old.setVisible(false);
     
      old=o;

      
    
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    public static mygeneral.AnalogClock analogClock1;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private org.jdesktop.swingx.table.LabelProperties labelProperties1;
    private javax.swing.JMenuBar menuBar;
    private org.jdesktop.swingx.painter.effects.NeonBorderEffect neonBorderEffect1;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private BasicFormsTraining.PrivilagePart privilagePart1;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
