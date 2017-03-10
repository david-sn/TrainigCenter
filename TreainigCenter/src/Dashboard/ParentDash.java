/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import Attendances.Attendance;
import DatabaseConnection.OracleConn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXHyperlink;
import static treainigcenter.MDIHome.jDesktopPane1;

/**
 *
 * @author David Sherif
 */
public class ParentDash extends javax.swing.JInternalFrame {

    /**
     * Creates new form ParentDash
     */
    String val(int id)
    {
        switch (id) {
            case 1: return "SUNDAY";
            case 2: return "MONDAY";
            case 3: return "TUESDAY";
            case 4: return "WEDNESDAY";
            case 5: return "THURSDAY";
            case 6: return "FRIDAY";
            case 7: return "SATURDAY";
                
            default:
                throw new AssertionError();
        }
    }
    
    public ParentDash() {
       
            initComponents();
            Calendar d=new GregorianCalendar();

            this.setTitle("My Dashbaoard - "+val(d.get(Calendar.DAY_OF_WEEK)));
             try {
            
            
            OracleConn.executeQuery("select coursename,GROUPID ,to_char(starttime,'HH:MI AM'),to_char(endtime,'HH:MI AM') , roomfloor||'0'||rommseq  from APPOINTMENT JOIN GROUPS on GROUPS.TABLEID=APPOINTMENT.GROUP_ID join rooms on rooms.tableid=groups.roomid join COURSES on GROUPS.COURSEID = COURSES.COURSEID WHERE APPOINTMENT.LECTUREDAY="+d.get(Calendar.DAY_OF_WEEK)+" order by starttime");
            
            while (OracleConn.rs.next()) {
           JXHyperlink h2= create(OracleConn.rs.getString(1)+"-G"+OracleConn.rs.getString(2)+"<br>From:"+OracleConn.rs.getString(3)+"<br>TO:"+OracleConn.rs.getString(4)+"<br>Room# "+OracleConn.rs.getString(5));
           h2.setBackground(new java.awt.Color(Randoms.AllRandoms.RangeRandoms(150, 250),Randoms.AllRandoms.RangeRandoms(10, 250),Randoms.AllRandoms.RangeRandoms(160, 250)) );
           h2.setOpaque(true);
           
           h2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                           CreateParentAttend(h2.getText());
                            Attendances.Attendance X1=new Attendance(h2.getText());
                            showForm(X1);
                        }
                    });
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ParentDash.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        info.clearthought.layout.TableLayout _tableLayoutInstance;

        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("My Dashbaoard");
        setToolTipText("Today Events");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/IconUsed/DashBIG.png"))); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(false);

        jPanel1.setBackground(new java.awt.Color(180, 236, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        _tableLayoutInstance = new info.clearthought.layout.TableLayout();
        _tableLayoutInstance.setHGap(0);
        _tableLayoutInstance.setVGap(0);
        _tableLayoutInstance.setColumn(new double[]{info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        _tableLayoutInstance.setRow(new double[]{info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL,info.clearthought.layout.TableLayout.FILL});
        jPanel1.setLayout(_tableLayoutInstance);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void CreateParentAttend(String Title)
    {
        OracleConn.PLSQL_Silent("attend('"+Title.substring(6, Title.indexOf("-"))+"',"+Title.substring(Title.indexOf("-G")+2, Title.indexOf("<br>"))+");");
    
    }
    
    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
    }//GEN-LAST:event_jPanel1AncestorAdded

    
    
      private void showForm(JInternalFrame Form)
    {
  
        
         OracleConn.validation(Form.getClass().getName());
        
         if(DatabaseConnection.OracleConn.array[4]==1) {
Form.setLocation( 
        (int) (jDesktopPane1.getSize().getWidth() -Form.getSize().width)/2,
              (jDesktopPane1.getSize().height- Form.getSize().height)/2);

if(jDesktopPane1.isAncestorOf(Form));

//jDesktopPane1.remove(Form);
  else          jDesktopPane1.add(Form);

        Form.setVisible(true);
        

       }
         else JOptionPane.showMessageDialog(null,"You Don't Have Privilage To Open This\nContact with Admin", "Authorization",JOptionPane.INFORMATION_MESSAGE);
    }

      
       
      
 int row=0,column=0;
    JXHyperlink create(String title)
    {
       
        
        JXHyperlink h1=new JXHyperlink();
        h1.setToolTipText("Open Attendance");
        h1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        h1.setText("<html>"+title);
//h1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        
        
        if (column <7) {
            if(row<3)
            {  jPanel1.add(h1, new info.clearthought.layout.TableLayoutConstraints(column,row , column, row, info.clearthought.layout.TableLayout.FULL, info.clearthought.layout.TableLayout.TOP));   
                 column++; 
            }
        
        if(column==6){
           row++; column=0;
        }
        }
        
        
        
    return  h1;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
