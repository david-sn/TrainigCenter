/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CenterComission;

import DatabaseConnection.OracleConn;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Comissions extends javax.swing.JInternalFrame {

    public Comissions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        minvalue = new javax.swing.JTextField();
        maxvalue = new javax.swing.JTextField();
        comvalu = new javax.swing.JTextField();
        todate = new datechooser.beans.DateChooserCombo();
        fromdate = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        types = new javax.swing.JComboBox<>();
        currency = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 =  new JTable(){
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
            }}
            ;

            setBackground(new java.awt.Color(180, 236, 255));
            setClosable(true);
            setIconifiable(true);
            setTitle("Center Comissions");
            setToolTipText("Center Comission Percetage");
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/commission.jpg"))); // NOI18N

            jPanel1.setBackground(new java.awt.Color(180, 236, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Comission Detail"));

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel1.setText("Max. Value");

            jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/add-1-icon.png"))); // NOI18N
            jButton1.setText("Save");
            jButton1.setToolTipText("Save The New Comissions");
            jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel2.setText("Comission Type");

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel3.setText("Currency");

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setText("From Date");

            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel5.setText("Comission Percent");

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel6.setText("To Date");

            minvalue.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

            maxvalue.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

            comvalu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

            todate.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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
        todate.setCalendarBackground(new java.awt.Color(255, 255, 255));
        todate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 1));
        todate.setCalendarPreferredSize(new java.awt.Dimension(271, 200));
        todate.setNothingAllowed(false);
        todate.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 19));
        todate.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 19));
        todate.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
        todate.setShowOneMonth(true);

        fromdate.setCurrentView(new datechooser.view.appearance.AppearancesList("Contrast",
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
    fromdate.setCalendarBackground(new java.awt.Color(255, 255, 255));
    fromdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 1));
    fromdate.setCalendarPreferredSize(new java.awt.Dimension(271, 200));
    fromdate.setNothingAllowed(false);
    fromdate.setFormat(1);
    fromdate.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 19));
    fromdate.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 19));
    fromdate.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    fromdate.setShowOneMonth(true);

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setText("Min. Value");

    types.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    types.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Per Sesssion", "Per Unit" }));

    currency.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    currency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egyptian pound\t - EGP", "United States dollar\t - USD", "European euro\t - EUR", "UAE dirham\t\t - AED" }));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(10, 10, 10)
            .addComponent(comvalu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(67, 67, 67)
            .addComponent(jLabel3)
            .addGap(10, 10, 10)
            .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(fromdate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(73, 73, 73)
            .addComponent(jLabel6)
            .addGap(10, 10, 10)
            .addComponent(todate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(minvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(50, 50, 50)
            .addComponent(jLabel1)
            .addGap(10, 10, 10)
            .addComponent(maxvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(types, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(146, 146, 146)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(comvalu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fromdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(todate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(minvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(maxvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(types, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null}
        },
        new String [] {
            "Seq", "Comission", "FRom Date", "To Date", "Min Value", "Max Value", "Currency"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable1.setToolTipText("Comission History");
    jTable1.setGridColor(new java.awt.Color(255, 0, 0));
    jTable1.setRowHeight(35);
    jTable1.setRowMargin(2);
    jTable1.setRowSelectionAllowed(false);
    jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
        public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
        }
        public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            jTable1AncestorAdded(evt);
        }
        public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
        }
    });
    jScrollPane1.setViewportView(jTable1);
    jTable1.setGridColor(Color.red);
    jTable1.setShowGrid(true);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    void column(){
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
    }
    int getmont(String mon) {
        switch (mon.toLowerCase()){
            case "jan":return 0;
            case "feb":return 1;
            case "mar":return 2;
            case "apr":return 3;
            case "may":return 4;
            case "jun":return 5;
            case "jul":return 6;
            case "aug":return 7;
            case "sep":return 8;
            case "oct":return 9;
            case "nov":return 10;
            case "dec":return 11;
            
            default: return 6;
        }
    
    }
    void view()             {
        String mount=jTable1.getValueAt(jTable1.getRowCount()-1,2 ).toString();
        
        comvalu.setText(jTable1.getValueAt(jTable1.getRowCount()-1, 1).toString());
        currency.setSelectedItem(jTable1.getValueAt(jTable1.getRowCount()-1, 6));
        fromdate.setSelectedDate(new GregorianCalendar(
                                Integer.parseInt(mount.substring(mount.length()-4, mount.length())),
                                getmont(mount.substring(mount.indexOf("-")+1,mount.length()-5)), Integer.parseInt(mount.substring(0, 2))));
        
        mount=jTable1.getValueAt(jTable1.getRowCount()-1,3 ).toString();
        todate.setSelectedDate(new GregorianCalendar(
                                Integer.parseInt(mount.substring(mount.length()-4, mount.length())),
                                getmont(mount.substring(mount.indexOf("-")+1,mount.length()-5)), Integer.parseInt(mount.substring(0, 2))));
        maxvalue.setText(jTable1.getValueAt(jTable1.getRowCount()-1, 5).toString());
        minvalue.setText(jTable1.getValueAt(jTable1.getRowCount()-1, 4).toString());   
    }
    void updatetable()      {

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String val = jTable1.getValueAt(i, 6).toString();
            if (val.equals("0")) {
                jTable1.setValueAt(jTable1.getValueAt(i, 6) + "  EGP", i, 6);
                jTable1.setValueAt(jTable1.getValueAt(i, 5) + "  EGP", i, 5);
                jTable1.setValueAt(jTable1.getValueAt(i, 4) + "  EGP", i, 4);
                jTable1.setValueAt(jTable1.getValueAt(i, 1) + "  %", i, 1);
                continue;
            } else if (val.equals("1")) {
                jTable1.setValueAt(jTable1.getValueAt(i, 6) + "  USD", i, 6);
                jTable1.setValueAt(jTable1.getValueAt(i, 5) + "  USD", i, 5);
                jTable1.setValueAt(jTable1.getValueAt(i, 4) + "  USD", i, 4);
                jTable1.setValueAt(jTable1.getValueAt(i, 1) + "  %", i, 1);
                continue;
            } else if (val.equals("2")) {
                jTable1.setValueAt(jTable1.getValueAt(i, 6) + "  EUR", i, 6);
                jTable1.setValueAt(jTable1.getValueAt(i, 5) + "  EUR", i, 5);
                jTable1.setValueAt(jTable1.getValueAt(i, 4) + "  EUR", i, 4);
                jTable1.setValueAt(jTable1.getValueAt(i, 1) + "  %", i, 1);
                continue;
            } else {
                jTable1.setValueAt(jTable1.getValueAt(i, 6) + "  AED", i, 6);
                jTable1.setValueAt(jTable1.getValueAt(i, 5) + "  AED", i, 5);
                jTable1.setValueAt(jTable1.getValueAt(i, 4) + "  AED", i, 4);
                jTable1.setValueAt(jTable1.getValueAt(i, 1) + "  %", i, 1);
                continue;
            }
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updatetable();

        if (comvalu.getText().equals("") || maxvalue.getText().equals("") || minvalue.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill Data", "Valodations", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            OracleConn.insertSQL("Comissions", "SEQCOMISSION.nextval",
                    comvalu.getText().trim().replaceAll("%", ""),
                    currency.getSelectedIndex(),
                    "to_date('" + new SimpleDateFormat("dd-MM-YYYY").format(new Date(fromdate.getSelectedDate().getTimeInMillis())) + "','DD-MM-YYYY')",
                    "to_date('" + new SimpleDateFormat("dd-MM-YYYY").format(new Date(todate.getSelectedDate().getTimeInMillis())) + "','DD-MM-YYYY')",
                    minvalue.getText().trim().replaceAll("[A-Z]", ""),
                    maxvalue.getText().trim().replaceAll("[A-Z]", ""),
                    types.getSelectedIndex());
            jTable1AncestorAdded(null);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
      //       jTable1.setShowGrid(true);
        OracleConn.QueryinTABLE("select tableid,ComValue,to_char(fromdate,'DD-MON-YYYY'),to_char(todate,'DD-MON-YYYY') ,factorbefore,factoafter,comCurrency,comtypes from comissions order by tableid", jTable1);
        updatetable();

        view();
        column();

        
    }//GEN-LAST:event_jTable1AncestorAdded
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField comvalu;
    private javax.swing.JComboBox<String> currency;
    private datechooser.beans.DateChooserCombo fromdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField maxvalue;
    private javax.swing.JTextField minvalue;
    private datechooser.beans.DateChooserCombo todate;
    private javax.swing.JComboBox<String> types;
    // End of variables declaration//GEN-END:variables
}




  class MyTableModel extends DefaultTableModel {

    List<Color> rowColours = Arrays.asList(
        Color.RED,
        Color.GREEN,
        Color.CYAN
    );

    public void setRowColour(int row, Color c) {
        rowColours.set(row, c);
        fireTableRowsUpdated(row, row);
    }

    public Color getRowColour(int row) {
        return rowColours.get(row);
    }

    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return String.format("%d %d", row, column);
    }
}



class MyTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        MyTableModel model = (MyTableModel) table.getModel();
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setBackground(model.getRowColour(row));
        return c;
    }
}