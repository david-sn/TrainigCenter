
package Branchs;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class BranchClass {
 
   
    public void update(long id,String name , String address, String manger, String openHoure, String openMin,String openperiod, String closeHoure, String closeMin,String closeperiod){
   
OracleConn.updateSQL("CENTERBRANCH", new String[]
    {
        "CENTERNAME",
        "CENTERADDRESS",
        "CENTER_MANGERID",
        "OPENTIME",
        "CLOSETIME"
    },
        "CENTERid="+id,
        
        "'"+name+"'",
        "'"+address+"'",
         "select employeeid from employees where employeename like '%"+manger+"%' ",
         "TO_TIMESTAMP('"+openHoure+":"+openMin+openperiod+"', 'hh:mi AM')" ,
         "TO_TIMESTAMP('"+closeHoure+":"+closeMin+closeperiod+"', 'hh:mi AM')" 
      
);
  
    }
   
    public void delete(int id){
    OracleConn.deleteSQL("CENTERBRANCH","CENTERid="+id);
    }
   
    public void search(JTable table,String name,String phone,int gender,int year,String email){
        OracleConn.QueryinTABLE("select stdid,stdname,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY'),CASE(stdyear) WHEN 0 THEN '1st Primary' WHEN 1 THEN '2nd Primary' WHEN 2 THEN '3rd Primary' WHEN 3 THEN '4th Primary' WHEN 4 THEN '5th Primary' WHEN 5 THEN '6th Primary' WHEN 6 THEN '1st Secondary' WHEN 7 THEN '2nd Secondary' WHEN 8 THEN '3rd Secondary' WHEN 9 THEN '1st High school' WHEN 10 THEN '2nd High school' WHEN 11 THEN '3rd High school' WHEN 12 THEN 'Others-General' else null END from students where stdname like '%"+name+"%' and stdphone like '%"+phone+"%' or stdgender like '%"+gender+"%'and email like '%"+email+"%' or stdyear like '%"+year+"%' ",table);
    }
  
    public void viewTable(JTable j){           
            OracleConn.QueryinTABLE("select  centerID,centername,centeraddress ,employeename ,to_char(opentime,'hh:mi AM'),to_char(closetime,'hh:mi AM') from CENTERBRANCH JOIN EMPLOYEES ON EMPLOYEES.EMPLOYEEID=CENTERBRANCH.CENTER_MANGERID ", j);
    }
    
    public void ViewBox(int id,JTextField name,JComboBox manger,JTextArea address,JSpinner open_houre, JSpinner open_min,JSpinner open_period,JSpinner close_hore ,JSpinner close_min,JSpinner close_oeriod) {
 
  
        String mount_=null; 
        try {    
            
           OracleConn.executeQuery("select centername,centeraddress ,employeename ,to_char(opentime,'hh:mi AM'),to_char(closetime,'hh:mi AM') from CENTERBRANCH JOIN EMPLOYEES ON EMPLOYEES.EMPLOYEEID=CENTERBRANCH.CENTER_MANGERID where centerID="+id);
           
              while (OracleConn.rs.next()) {              
                 
                  name.setText(OracleConn.rs.getString(1));
                 manger.setSelectedItem(OracleConn.rs.getString(3));
                 address.setText(OracleConn.rs.getString(2));
                 
                 mount_=OracleConn.rs.getString(4);
                  
               
                 

     
  short x=Short.parseShort(  mount_.substring(0, mount_.indexOf(":")).replace("0", "") );
               open_houre.setValue(x);
   
               x=Short.valueOf(mount_.substring(mount_.indexOf(":")+1,mount_.indexOf(" ")).replace("0", ""));      
    open_min.setValue(x);
 
    open_period.setValue( (mount_.replaceAll("[\\d||:]","" ).trim())); 
                   
                 
                 mount_=OracleConn.rs.getString(5);
                 x=Short.parseShort(  mount_.substring(0, mount_.indexOf(":")).replace("0", "") );
                 close_hore.setValue(x);
   
               x=Short.valueOf(mount_.substring(mount_.indexOf(":")+1,mount_.indexOf(" ")).replace("0", ""));      
    close_min.setValue(x);
 
    
    close_oeriod.setValue( (mount_.replaceAll("[\\d||:]","" ).trim())); 
              
              }
              
              
        } catch (SQLException ex) {
            Error_Dynamic.getERRORS(this.getClass().getName()," - ", ex);
        }catch(Throwable e){e.printStackTrace();}
        
    }
    
    void insert(String name , String address, String manger, String openHoure, String openMin,String openperiod, String closeHoure, String closeMin,String closeperiod){

 OracleConn.insertSQL("CENTERBRANCH",
         "SEQbranch.nextval",
         "'"+name+"'",
         "'"+address+"'",
         "select employeeid from employees where employeename like '%"+manger+"%' ",
         "TO_TIMESTAMP('"+openHoure+":"+openMin+openperiod+"', 'hh:mi AM')" ,
         "TO_TIMESTAMP('"+closeHoure+":"+closeMin+closeperiod+"', 'hh:mi AM')" 
     
    );

    }

 

}