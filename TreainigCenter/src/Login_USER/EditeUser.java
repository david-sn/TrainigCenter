

package Login_USER;

import DatabaseConnection.OracleConn;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class EditeUser extends javax.swing.JInternalFrame {

    
    
    public EditeUser() {
        initComponents();
    }

   boolean correct_old=false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        blockedCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Add_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        repass = new javax.swing.JPasswordField();
        use_combo = new javax.swing.JComboBox<>();
        old_pass = new javax.swing.JPasswordField();
        new_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        locked_check = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Change Password");
        setToolTipText("Change Password");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/username.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(158, 229, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("UserName");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(" Old Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Blocked");

        blockedCheck.setToolTipText("Block The User");
        blockedCheck.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" New Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Re-Password");

        Add_btn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/sub.png"))); // NOI18N
        Add_btn.setText("Create");
        Add_btn.setIconTextGap(10);
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Error.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setIconTextGap(10);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        repass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        repass.setToolTipText("Re-Enter New Password to Confirm");
        repass.setEchoChar('X');
        repass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                repassFocusLost(evt);
            }
        });

        use_combo.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        use_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose UserName" }));
        use_combo.setToolTipText("select valid Username");
        use_combo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                use_comboAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        old_pass.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        old_pass.setToolTipText("Old Password");
        old_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                old_passFocusLost(evt);
            }
        });

        new_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        new_pass.setToolTipText("New Password");
        new_pass.setEchoChar('X');

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Locked");

        locked_check.setToolTipText("Lock The User");
        locked_check.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(use_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(locked_check, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(blockedCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Add_btn))
                    .addComponent(jButton2)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(use_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locked_check))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockedCheck))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_btn)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        if (old_pass.getText().equals("")||repass.getText().equals("")||new_pass.getText().equals("")||use_combo.getSelectedIndex()==0) {
            
            JOptionPane.showMessageDialog(null, "Please Fill All Data");
        return;
        }
    repassFocusLost(null);
    old_passFocusLost(null);
        
          if(correct_old){
            OracleConn.updateSQL("users", new String[]{"password","locked","blocked"}, "select password from users where username = '"+use_combo.getSelectedItem()+"'", "'"+repass.getText()+"'",locked_check.isSelected()?"'1'":"'0'",blockedCheck.isSelected()?"'1'":"'0'");
            
            repass.setText("");
            old_pass.setText("");
            new_pass.setText("");
            blockedCheck.setSelected(false);
            locked_check.setSelected(false);
            use_combo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_Add_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void use_comboAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_use_comboAncestorAdded
OracleConn.FullCombo(use_combo, "users", "username");
    }//GEN-LAST:event_use_comboAncestorAdded

    private void old_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_old_passFocusLost

        try {
            OracleConn.executeQuery("select password from users where username = '"+use_combo.getSelectedItem()+"'");
            
            while (OracleConn.rs.next()) {
            
                if (old_pass.getText().equals(OracleConn.rs.getString(1))) {
                    correct_old=true;
                }else {correct_old=false;       JOptionPane.showMessageDialog(null, "Old Password Is Incorrect"); old_pass.requestFocus(); return;  }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EditeUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_old_passFocusLost

    private void repassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repassFocusLost
        if (repass.getText().equals(new_pass.getText())) {
            correct_old=true;
        }
        else { correct_old=false;    JOptionPane.showMessageDialog(null, "Re-Password Not Matched With NewPassword"); return;  }
    }//GEN-LAST:event_repassFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_btn;
    private javax.swing.JCheckBox blockedCheck;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox locked_check;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPasswordField old_pass;
    private javax.swing.JPasswordField repass;
    private javax.swing.JComboBox<String> use_combo;
    // End of variables declaration//GEN-END:variables
}
