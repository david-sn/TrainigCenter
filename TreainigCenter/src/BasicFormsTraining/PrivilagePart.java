/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicFormsTraining;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import treainigcenter.MDIHome;




public  class PrivilagePart extends javax.swing.JPanel{

    /**
     * Creates new form NewJPanel
     */
    public PrivilagePart() {
        initComponents();
   
       
    }


    
    public static String user="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        user_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 137, 239));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/user.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        user_label.setFont(user_label.getFont().deriveFont(user_label.getFont().getSize()+3f));
        user_label.setText("jLabel3");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/1470183058_contact_xa_overlay.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("Dotum", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 255, 51));
        jTextField1.setText("Calcultor");
        jTextField1.setToolTipText("Smart Calculator-Easy&fast");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(user_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jTextField1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jXHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink1ActionPerformed
 
    }//GEN-LAST:event_jXHyperlink1ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        MDIHome.analogClock2.setVisible(true);
        MDIHome.analogClock1.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
MDIHome.analogClock1.setVisible(false);
MDIHome.analogClock2.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseExited
treainigcenter.Solution s=new treainigcenter.Solution();
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {jTextField1.setForeground(Color.GREEN);
            jTextField1.setText(s.calculate(jTextField1.getText())+"");
        } catch (Exception ex) {
            jTextField1.setText("ERROR");
            jTextField1.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
if (!(evt.getKeyChar()=='0'||evt.getKeyChar()=='1'||evt.getKeyChar()=='2'||evt.getKeyChar()=='3'||evt.getKeyChar()=='4'||evt.getKeyChar()=='5'||evt.getKeyChar()=='6'||evt.getKeyChar()=='7'||evt.getKeyChar()=='8'||evt.getKeyChar()=='9'||evt.getKeyChar()=='+'||evt.getKeyChar()=='-'||evt.getKeyChar()=='*'||evt.getKeyChar()=='/')) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextField1KeyTyped

     

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables

  
    
}
