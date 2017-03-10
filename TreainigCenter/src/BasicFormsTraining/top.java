/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicFormsTraining;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author David Sherif
 */
public class top extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    
    public top() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        info.clearthought.layout.TableLayout _tableLayoutInstance;

        btnClear = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnEdite = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setName("Form"); // NOI18N
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(0);
        _tableLayoutInstance.setVGap(0);
        _tableLayoutInstance.setColumn(new double[]{info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.FILL});
        setLayout(_tableLayoutInstance);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/1469761695_package-purge.png"))); // NOI18N
        btnClear.setMnemonic(KeyEvent.VK_F10);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("BasicFormsTraining/Bundle"); // NOI18N
        btnClear.setText(bundle.getString("top.btnClear.text")); // NOI18N
        btnClear.setToolTipText(bundle.getString("top.btnClear.toolTipText")); // NOI18N
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClear.setIconTextGap(5);
        btnClear.setName("btnClear"); // NOI18N
        btnClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnClear, new info.clearthought.layout.TableLayoutConstraints(8, 0, 8, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnAddNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/database-add-icon.png"))); // NOI18N
        btnAddNew.setText(bundle.getString("top.btnAddNew.text")); // NOI18N
        btnAddNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddNew.setIconTextGap(5);
        btnAddNew.setName("btnAddNew"); // NOI18N
        btnAddNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnAddNew, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnEdite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/database-iedite.png"))); // NOI18N
        btnEdite.setMnemonic(KeyEvent.VK_F2);
        btnEdite.setText(bundle.getString("top.btnEdite.text")); // NOI18N
        btnEdite.setToolTipText(bundle.getString("top.btnEdite.toolTipText")); // NOI18N
        btnEdite.setEnabled(false);
        btnEdite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdite.setIconTextGap(5);
        btnEdite.setName("btnEdite"); // NOI18N
        btnEdite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnEdite, new info.clearthought.layout.TableLayoutConstraints(1, 0, 1, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/last.png"))); // NOI18N
        btnFirst.setMnemonic(KeyEvent.VK_F8);
        btnFirst.setText(bundle.getString("top.btnFirst.text")); // NOI18N
        btnFirst.setToolTipText("<html>\nGo To First Record\n<b>Alt+F8<b/>\n</html>");
        btnFirst.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        btnFirst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFirst.setIconTextGap(5);
        btnFirst.setName("btnFirst"); // NOI18N
        btnFirst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnFirst, new info.clearthought.layout.TableLayoutConstraints(3, 0, 3, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/database-delete-icon.png"))); // NOI18N
        btnDelete.setMnemonic(KeyEvent.VK_F3);
        btnDelete.setText(bundle.getString("top.btnDelete.text")); // NOI18N
        btnDelete.setToolTipText("<html>\nRemove Record\n<b>Alt+F3<b/>\n</html>");
        btnDelete.setEnabled(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setIconTextGap(5);
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnDelete, new info.clearthought.layout.TableLayoutConstraints(2, 0, 2, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/next.png"))); // NOI18N
        btnNext.setMnemonic(KeyEvent.VK_F7);
        btnNext.setText(bundle.getString("top.btnNext.text")); // NOI18N
        btnNext.setToolTipText("<html>\nGo To Next Record\n<b>Alt+F7<b/>\n</html>");
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNext.setIconTextGap(5);
        btnNext.setName("asd"); // NOI18N
        btnNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnNext, new info.clearthought.layout.TableLayoutConstraints(5, 0, 5, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/prev.png"))); // NOI18N
        btnPrev.setMnemonic(KeyEvent.VK_F6);
        btnPrev.setText(bundle.getString("top.btnPrev.text")); // NOI18N
        btnPrev.setToolTipText(bundle.getString("top.btnPrev.toolTipText")); // NOI18N
        btnPrev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrev.setIconTextGap(5);
        btnPrev.setName("btnPrev"); // NOI18N
        btnPrev.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnPrev, new info.clearthought.layout.TableLayoutConstraints(4, 0, 4, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/first.png"))); // NOI18N
        btnLast.setMnemonic(KeyEvent.VK_F5);
        btnLast.setText(bundle.getString("top.btnLast.text")); // NOI18N
        btnLast.setToolTipText(bundle.getString("top.btnLast.toolTipText")); // NOI18N
        btnLast.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        btnLast.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLast.setIconTextGap(5);
        btnLast.setName("btnLast"); // NOI18N
        btnLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnLast, new info.clearthought.layout.TableLayoutConstraints(6, 0, 6, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/se1.png"))); // NOI18N
        btnSearch.setMnemonic(KeyEvent.VK_F9);
        btnSearch.setText(bundle.getString("top.btnSearch.text")); // NOI18N
        btnSearch.setToolTipText(bundle.getString("top.btnSearch.toolTipText")); // NOI18N
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setIconTextGap(5);
        btnSearch.setName("btnSearch"); // NOI18N
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnSearch, new info.clearthought.layout.TableLayoutConstraints(7, 0, 7, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/Error.png"))); // NOI18N
        btnClose.setMnemonic(KeyEvent.VK_F4);
        btnClose.setText(bundle.getString("top.btnClose.text")); // NOI18N
        btnClose.setToolTipText("<html>\nExit From This Window\n<b>Alt+F4<b/>\n</html>");
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setIconTextGap(5);
        btnClose.setName("btnClose"); // NOI18N
        btnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btnClose, new info.clearthought.layout.TableLayoutConstraints(9, 0, 9, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddNew;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnEdite;
    public static javax.swing.JButton btnFirst;
    public static javax.swing.JButton btnLast;
    public static javax.swing.JButton btnNext;
    public static javax.swing.JButton btnPrev;
    public javax.swing.JButton btnSearch;
    // End of variables declaration//GEN-END:variables
}
