
package Departments;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;



public class DepartmentClass {
 
   
    public void update(int id,String name ,String manger){
        if (manger.equalsIgnoreCase("No manger")) 
             OracleConn.updateSQL("departments", new String[]{"departmentname","departmentmanger"}, "departmentid="+id , "'"+name+"'","0");
        
        else OracleConn.updateSQL("departments", new String[]{"departmentname","departmentmanger"}, "departmentid="+id , "'"+name+"'","select employeeid from employees where employeename ='"+manger+"' ");
    }
   
    public void delete(int id){
    OracleConn.deleteSQL("departments","departmentid="+id);
    }
   
    public void search(JTable table,String name,String phone,int gender,int year,String email){
     //   OracleConn.QueryinTABLE("select stdid,stdname,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY'),CASE(stdyear) WHEN 0 THEN '1st Primary' WHEN 1 THEN '2nd Primary' WHEN 2 THEN '3rd Primary' WHEN 3 THEN '4th Primary' WHEN 4 THEN '5th Primary' WHEN 5 THEN '6th Primary' WHEN 6 THEN '1st Secondary' WHEN 7 THEN '2nd Secondary' WHEN 8 THEN '3rd Secondary' WHEN 9 THEN '1st High school' WHEN 10 THEN '2nd High school' WHEN 11 THEN '3rd High school' WHEN 12 THEN 'Others-General' else null END from students where stdname like '%"+name+"%' and stdphone like '%"+phone+"%' or stdgender like '%"+gender+"%'and email like '%"+email+"%' or stdyear like '%"+year+"%' ",table);
    }
   
    public void viewTable(JTable j){  
        OracleConn.QueryinTABLE("select  departmentid , \n" +
"        departmentname , \n" +
"        nvl(employeename,'No Manger') \n" +
"        from departments left join employees \n" +
"        on departments.departmentmanger= employees.employeeid(+)",j);
    }
    
    public void ViewBox(int id,JTextField name,JComboBox manger) {
         try {    
 String f=
"      select  departmentname , \n" +
"        nvl(employeename,'No Manger') \n" +
"        from departments left join employees \n" +
"        on departments.departmentmanger= employees.employeeid(+)  where departmentid="+id;
  
        OracleConn.rs=OracleConn.executeQuery(f);

            while (OracleConn.rs.next()) {
                name.setText(OracleConn.rs.getString(1));
                manger.setSelectedItem(
                        OracleConn.rs.getString(2).equals("No Manger")?
                                "Select Manger of Department":
                                OracleConn.rs.getString(2)
                                );
            }
           
      
        } catch (SQLException ex) {
           Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)", ex);
        }
    }
    
    void insert(String name,String manger){
         OracleConn.insertSQL("departments", "SEQdept.nextval","'"+name+"'" ,manger.equals(null)?null:"select employeeid from employees where employeename ='"+manger+"'");
        }

}
