
package employees;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import datechooser.beans.DateChooserCombo;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;



public class employeesClass {
 
   
    public void update(int id,String name,String Email,String phone,String salary,String Deptname,Calendar Hiredate,Calendar birthday,char gender){
   OracleConn.updateSQL("update employees set employeename='"+name+"',  employeeemail='"+Email+"' , employeephone='"+phone+"' , employeesalary= "+salary+" , employeedepartment=(select departmentid from departments where departmentname = '"+Deptname+"') , employeebirthday=to_date('"+birthday.get(Calendar.DAY_OF_MONTH)+"-"+(birthday.get(Calendar.MONTH)+1)+"-"+(birthday.get(Calendar.YEAR))+"','DD-MM-YYYY') ,   employeehiredate= to_date('"+Hiredate.get(Calendar.DAY_OF_MONTH)+"-"+(Hiredate.get(Calendar.MONTH)+1)+"-"+(Hiredate.get(Calendar.YEAR))+"','DD-MM-YYYY'),  gender="+gender+"   where employeeid="+id);
           }
   
    public void delete(int id){
    OracleConn.deleteSQL("employees","employeeid="+id);
    }
   
    public void search(JTable table,String name,String phone,int gender,int year,String email){
        OracleConn.QueryinTABLE("select employeename , employeeemail,employeephone ,employeesalary||' EGP',departmentname,to_c",table);
    }
   
    public void viewTable(JTable j){  
        OracleConn.QueryinTABLE("select EMPLOYEEID,\n" +
"        employeename ,\n" +
"        employeeemail,\n" +
"        employeephone ,\n" +
"        employeesalary||' EGP',\n" +
"        departmentname,\n" +
"        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEBIRTHDAY,'YYYY')||' Years Old',\n" +
"        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEHIREDATE,'YYYY')||' Year(s)',\n" +
"        case (gender) WHEN '1' THEN 'Male' WHEN '0' THEN 'Female' END\n" +
"        from EMPLOYEES join departments on departments.DEPARTMENTID=EMPLOYEES.EMPLOYEEDEPARTMENT order by employeename ASC",j);
    }
    
    public void ViewBox(int id,JTextField name,JTextField email,JFormattedTextField phone,JTextField Salary,JComboBox department,DateChooserCombo birthday,DateChooserCombo Hiredate,JRadioButton male,JRadioButton female) {
       String f = null;
        try {    
   f="select employeename,\n" +
"       employeeemail,\n" +
"       employeephone,\n" +
"       employeesalary,\n" +
"       departmentname,\n" +
"       to_char(employeebirthday,'DD-MM-YYYY'),\n" +
"       to_char(employeehiredate,'DD-MM-YYYY'),\n" +
"       gender \n " +
"       from employees join departments on employees.employeedepartment=departments.departmentid"
    + " where employeeid="+id;
 
        OracleConn.rs=OracleConn. executeQuery(f);

         while (OracleConn.rs.next()) {
                name.setText(OracleConn.rs.getString(1));
                email.setText(OracleConn.rs.getString(2));
                phone.setText(OracleConn.rs.getString(3));
                Salary.setText(OracleConn.rs.getString(4)+" EGP");
                department.setSelectedItem(OracleConn.rs.getString(5));
                
                String mont_=OracleConn.rs.getString(6);
               
                 birthday.setSelectedDate(
                    new GregorianCalendar(
                    Integer.parseInt(mont_.substring(mont_.length()-mont_.lastIndexOf("-")+1, mont_.length()) ), 
                    Integer.parseInt(mont_.substring(mont_.indexOf("-")+1,mont_.lastIndexOf("-")))     -1,
                    Integer.parseInt(mont_.substring(0, mont_.indexOf("-") ) ) ) );
 
                
                 mont_=OracleConn.rs.getString(7);
                  Hiredate.setSelectedDate(
                    new GregorianCalendar(
                    Integer.parseInt(mont_.substring(mont_.length()-mont_.lastIndexOf("-")+1, mont_.length()) ), 
                    Integer.parseInt(mont_.substring(mont_.indexOf("-")+1,mont_.lastIndexOf("-")))     -1,
                    Integer.parseInt(mont_.substring(0, mont_.indexOf("-") ) ) ) );
  
                if(OracleConn.rs.getString(8).equals("1"))
                    male.setSelected(true);
                else female.setSelected(true);
            }
           
      
        } catch (SQLException ex) {
            Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)\n\n"+f, ex);
        }
    }
    
    void insert(String name,String Email,String phone,String salary,String Deptname,Calendar Hiredate,Calendar birthday,char gender){
 OracleConn.insertSQL("insert into employees (EMPLOYEEID,EMPLOYEENAME,EMPLOYEEEMAIL,EMPLOYEEPHONE,EMPLOYEESALARY,EMPLOYEEDEPARTMENT,EMPLOYEEBIRTHDAY,EMPLOYEEHIREDATE,GENDER) values(SEQemployees.nextval,'"+name+"','"+Email+"','"+phone+"',"+salary+",(select departmentid from departments where departmentname like '%"+Deptname+"%'), to_date('"+birthday.get(Calendar.DATE)+"-"+(birthday.get(Calendar.MONTH)+1)+"-"+(birthday.get(Calendar.YEAR))+"','DD-MM-YYYY') ,to_date('"+Hiredate.get(Calendar.DATE)+"-"+(Hiredate.get(Calendar.MONTH)+1)+"-"+(Hiredate.get(Calendar.YEAR))+"','DD-MM-YYYY') ,'"+gender+"')");
    }

}
