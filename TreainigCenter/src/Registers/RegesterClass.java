package Registers;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import Table_List_Property.AllProperty;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class RegesterClass {
 
   
    public void update(int id,String group,String student,String course){
        OracleConn.updateSQL("update registers set groupsID=(select tableid  from groups where groupID="+group+" and courseid =(select courseid from courses where coursename ='"+course+"') ) , student_id=(select stdid from students where stdname='"+student+"' ) where registers.tableid="+id);
    
    }

    public void delete(int id){
    OracleConn.deleteSQL("employees","employeeid="+id);
    }
   
    public void search(JTable table,String name,String phone,int gender,int year,String email){
        OracleConn.QueryinTABLE("select employeename , employeeemail,employeephone ,employeesalary||' EGP',departmentname,to_c",table);
    }
   
    public void viewTable(JTable j,String groupID){  
        OracleConn.QueryinTABLE("select REGISTERS.TABLEID,stdname,COURSES.COURSENAME,GROUPS.GROUPID ,regdate  from REGISTERS   JOIN GROUPS \n" +
"on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES \n" +
"on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS\n" +
"on STUDENTS.STDID=REGISTERS.STUDENT_ID\n" +
"WHERE GROUPS.GROUPID="+groupID+
"ORDER BY REGISTERS.REGDATE",j);
    }
    ResultSet rrs=null;
    PreparedStatement sst=null;
    public void ViewBox(int id,JComboBox group,JComboBox course,JComboBox student) {
       
        try { 
            
            OracleConn.executeQuery("select groupid from groups where courseid =(select courseid from courses where coursename='"+course.getSelectedItem()+"') ");
            while(OracleConn.rs.next()){group.addItem(OracleConn.rs.getObject(1));}
            
           sst=OracleConn.con.prepareStatement("select stdname,COURSES.COURSENAME,GROUPID from REGISTERS   JOIN GROUPS on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS on STUDENTS.STDID=REGISTERS.STUDENT_ID  where  REGISTERS.TABLEID="+id+" ORDER BY REGISTERS.REGDATE");
           rrs=sst.executeQuery();
        
        
        while (rrs.next()) {
             
            course.setSelectedItem(rrs.getObject(2));
             
           
            group.setSelectedItem(rrs.getInt(3));
            
            
            student.setSelectedItem(rrs.getObject(1));
        
        
        }           
      
        } catch (SQLException ex) {
            Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)\n\n", ex);
        }
    }
    
    void insert(String group,String student,String course){
 
        OracleConn.insertSQL("registers", "SEQregister.nextval","select tableid from groups where groupid="+group+" and courseid=(select courseid from courses where coursename = '"+course+"')","select stdid from students where stdname = '"+student+"'","sysdate");
    }

    
    public void viewTable(JTable j){  
        try {
            AllProperty.clearRows(j);
            OracleConn.executeQuery("select REGISTERS.TABLEID, COURSES.COURSENAME,stdname,GROUPS.GROUPID,regdate  from REGISTERS   JOIN GROUPS on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS on STUDENTS.STDID=REGISTERS.STUDENT_ID ORDER BY  COURSES.COURSENAME, REGISTERS.REGDATE");
            DefaultTableModel mod=(DefaultTableModel) j.getModel();
            
            while (OracleConn.rs.next()){
            
                mod.addRow(new Object[]{OracleConn.rs.getObject(1),OracleConn.rs.getObject(2),OracleConn.rs.getObject(3),OracleConn.rs.getObject(4),OracleConn.rs.getObject(5)});
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegesterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    
    
    
    
    }
    
}
