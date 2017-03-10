/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports.StudentPaymentForCourses;

import DatabaseConnection.OracleConn;
import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JCalendar;
import java.awt.AWTException;
import java.awt.Robot;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static org.eclipse.persistence.jaxb.TypeMappingInfo.ElementScope.Local;
import treainigcenter.MDIHome;
import static treainigcenter.MDIHome.REPORTSPATH;

/**
 *
 * @author David Sherif
 */
public class RangeFilter extends javax.swing.JPanel {

    /**
     * Creates new form RangeFilter
     */
 
    public RangeFilter( ) {
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
        info.clearthought.layout.TableLayout _tableLayoutInstance;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        to = new datechooser.beans.DateChooserCombo();
        from = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(105, 193, 251));
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(5);
        _tableLayoutInstance.setVGap(5);
        _tableLayoutInstance.setColumn(new double[]{info.clearthought.layout.TableLayout.MINIMUM,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        setLayout(_tableLayoutInstance);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("From Date");
        add(jLabel1, new info.clearthought.layout.TableLayoutConstraints(0, 0, 0, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("To Date");
        add(jLabel2, new info.clearthought.layout.TableLayoutConstraints(0, 1, 0, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

        to.setCalendarBackground(new java.awt.Color(255, 255, 255));
        to.setCalendarPreferredSize(new java.awt.Dimension(391, 234));
        to.setNothingAllowed(false);
        try {
            to.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2016, 11, 3),
                new java.util.GregorianCalendar(2016, 11, 3))));
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    to.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));
    to.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 14));
    to.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    to.setShowOneMonth(true);
    add(to, new info.clearthought.layout.TableLayoutConstraints(1, 0, 2, 0, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

    from.setCalendarBackground(new java.awt.Color(255, 255, 255));
    from.setCalendarPreferredSize(new java.awt.Dimension(391, 234));
    from.setNothingAllowed(false);
    from.setFormat(2);
    from.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));
    from.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 14));
    from.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    from.setShowOneMonth(true);
    add(from, new info.clearthought.layout.TableLayoutConstraints(1, 1, 2, 1, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jButton1.setText("Run");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    add(jButton1, new info.clearthought.layout.TableLayoutConstraints(2, 2, 2, 2, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.FULL));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MDIHome.f.setVisible(false);
        
        showREPORT(REPORTSPATH+"\\Reports\\StudentPaymentForCourses\\payment.jasper", 
            new Object[]{"d1",from.getSelectedDate().get(Calendar.DAY_OF_MONTH)+"/"+(1+from.getSelectedDate().get(Calendar.MONTH))+"/"+from.getSelectedDate().get(Calendar.YEAR), 
            "d2",to.getSelectedDate().get(Calendar.DAY_OF_MONTH)+"/"+(1+to.getSelectedDate().get(Calendar.MONTH))+"/"+to.getSelectedDate().get(Calendar.YEAR)});
 
    }//GEN-LAST:event_jButton1ActionPerformed
  private void showREPORT(String PathJasper, Object[] Parameter) {

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
    private datechooser.beans.DateChooserCombo from;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private datechooser.beans.DateChooserCombo to;
    // End of variables declaration//GEN-END:variables
}