/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicFormsTraining;

/**
 *
 * @author David Sherif
 */
public class TopPanel extends javax.swing.JPanel {

    /**
     * Creates new form TopPanel
     */
    public TopPanel() {
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

        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 12));

        jButton11.setText("Clear");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setNextFocusableComponent(jButton7);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11);

        jButton1.setText("Add");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setNextFocusableComponent(jButton3);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton1);

        jButton3.setText("Edite");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setNextFocusableComponent(jButton5);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton3);

        jButton8.setText("First");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setNextFocusableComponent(jButton4);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton8);

        jButton5.setText("Delete");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setNextFocusableComponent(jButton8);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton5);

        jButton4.setText("Next");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setName("asd"); // NOI18N
        jButton4.setNextFocusableComponent(jButton9);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton4);

        jButton9.setText("Prev");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setNextFocusableComponent(jButton10);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton9);

        jButton10.setText("Last");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setNextFocusableComponent(jButton6);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton10);

        jButton6.setText("Search");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setNextFocusableComponent(jButton11);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Error.png"))); // NOI18N
        jButton7.setText("Close");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(5);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jButton7);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}