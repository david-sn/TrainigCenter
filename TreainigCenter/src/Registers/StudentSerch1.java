/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registers;

import DatabaseConnection.OracleConn;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author David Sherif
 */
public class StudentSerch1 extends javax.swing.JPanel {

    
       private   DefaultListModel listModel = new DefaultListModel();
    public String result="";
    private    Robot r=null;
    
    
    
    public StudentSerch1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        casesensitive = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Past = new javax.swing.JMenuItem();
        clear = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<String>(listModel);
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        OK_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });

        casesensitive.setText("Case Sensitve");
        casesensitive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/casesensitive_2012a.png"))); // NOI18N
        jPopupMenu1.add(casesensitive);
        jPopupMenu1.add(jSeparator1);

        Cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/cut-icon.png"))); // NOI18N
        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Cut);

        Copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Copy-v2-icon.png"))); // NOI18N
        Copy.setText("Copy");
        Copy.setToolTipText("");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Copy);

        Past.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/pas.png"))); // NOI18N
        Past.setText("Paste");
        Past.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Past);

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/clear.png"))); // NOI18N
        clear.setText("Clear Text");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPopupMenu1.add(clear);

        jList1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/search.png"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        OK_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OK_btn.setText("OK");
        OK_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_btnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1))
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(OK_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount()==2) {
            OK_btnActionPerformed(null);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        if (evt.getKeyCode()==10) {
            OK_btnActionPerformed(null);
        }
    }//GEN-LAST:event_jList1KeyPressed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate

           try {
               listModel.removeAllElements();
               if (casesensitive.isSelected())
                   OracleConn.executeQuery("select stdname from students where (stdname) like '%"+jTextField1.getText()+"%' ");
               else OracleConn.executeQuery("select stdname from students where lower(stdname) like '%"+jTextField1.getText().toLowerCase()+"%' ");
               while (OracleConn.rs.next()) {
                   listModel.addElement(OracleConn.rs.getString(1));
               }
               jList1.setModel(listModel);
           } catch (SQLException ex) {
               Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
           }

    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed

        if (jTextField1.getSelectedText()!=null) {
            Clipboard.Copy_Past_Text.copy(jTextField1.getSelectedText());
            jTextField1.setText(jTextField1.getText().replace(jTextField1.getSelectedText(), ""));
        }
        else{Clipboard.Copy_Past_Text.copy(jTextField1.getText());  jTextField1.setText(""); }
    }//GEN-LAST:event_CutActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        Clipboard.Copy_Past_Text.copy(jTextField1.getSelectedText());
    }//GEN-LAST:event_CopyActionPerformed

    private void PastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastActionPerformed
        try {

            Clipboard.Copy_Past_Text.paste();

        } catch (AWTException ex) {
            Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PastActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked

        if (SwingUtilities.isRightMouseButton(evt) || evt.isControlDown())    {
            try {
                if (Clipboard.Copy_Past_Text.get().equals("")||Clipboard.Copy_Past_Text.get()==null) {
                    Past.setEnabled(false);
                }
                else Past.setEnabled(true);

            } catch (HeadlessException ex) {
                Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void OK_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_btnActionPerformed
       result=jList1.getSelectedValue();
 try {
            r=new Robot();
            r.keyPress(27);
            
            listModel.removeAllElements();
            jTextField1.setText("");
        } catch (AWTException ex) {
            Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OK_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {result="";
            r=new Robot();
            r.keyPress(27);
            listModel.removeAllElements();
            jTextField1.setText("");
        } catch (AWTException ex) {
            Logger.getLogger(StudentSerch1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JButton OK_btn;
    private javax.swing.JMenuItem Past;
    private javax.swing.JCheckBoxMenuItem casesensitive;
    private javax.swing.JMenuItem clear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}