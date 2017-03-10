
package Exams;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;



public class ExamsClass {
 
   
    public void update(String id,String name,String Coursename,String group,String min,String max,String supervisor,Calendar examedate){
   OracleConn.updateSQL("exams", new String[]{"names","courseid","groupid","mindegree","maxdegree","supervisor","examsdate"}, "tableid="+id, "'"+name+"'","select courseid from courses where coursename='"+Coursename+"' ","select tableid from groups where groupid="+group+" and courseid=(select courseid from courses where coursename='"+Coursename+"')",min,max,"select employeeid from employees where employeename ='"+supervisor+"' ","to_date('"+(examedate.get(Calendar.DAY_OF_MONTH))+"-"+(examedate.get(Calendar.MONTH)+1)+"-"+(examedate.get(Calendar.YEAR))+"','DD-MM-YYYY') ");
           }
   
    public void update2(String id,String ExameName,String studentname,String paper,String course){
   OracleConn.updateSQL("examdetail", new String[]{"exameparent","stdid","paperdegree"}, "tableid="+id, "select tableid from exams where names='"+ExameName+"' ","select stdid from students where stdname='"+studentname+"' ",paper);
           }
   
    
    
    public void delete(int id){
    OracleConn.deleteSQL("exams","tableid="+id);
    }
    
    public void delete2(int id){
    OracleConn.deleteSQL("examdetail","tableid="+id);
    }
   
    
     
    public void search(JTable table,String name,String phone,int gender,int year,String email){
        OracleConn.QueryinTABLE("select employeename , employeeemail,employeephone ,employeesalary||' EGP',departmentname,to_c",table);
    }
   
    public void search2(JTable table,String name,String phone,int gender,int year,String email){
        OracleConn.QueryinTABLE("select employeename , employeeemail,employeephone ,employeesalary||' EGP',departmentname,to_c",table);
    }
   
    
    public void viewTable(JTable j){  
        OracleConn.QueryinTABLE("select EXAMS.tableid ,\n" +
"      names,\n" +
"      coursename,\n" +
"      GROUPS.groupid,\n" +
"      mindegree,\n" +
"      maxdegree,\n" +
"      to_char(examsdate,'DD-MON-YYYY HH12:MI'),EMPLOYEES.EMPLOYEENAME \n" +
"from exams JOIN COURSES on EXAMS.COURSEID=COURSES.COURSEID JOIN GROUPS on GROUPS.TABLEID = EXAMS.GROUPID JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=EXAMS.SUPERVISOR order by examsdate ASC",j);
    }
    
    public void viewTable2(JTable j){  
        OracleConn.QueryinTABLE("select d.tableid,\n" +
"  E.NAMES,\n" +
"  to_char(E.EXAMSDATE,'DD-MON-YYYY'),\n" +
"  E.MINDEGREE||' to '||E.maxdegree,\n" +
"  coursename||' - '||gg.groupid,\n" +                
"  S.STDNAME,\n" +
"  D.PAPERDEGREE\n" +
"from \n" +
"  EXAMS e JOIN EXAMDETAIL d on E.TABLEID=D.EXAMEPARENT\n" +
"  JOIN STUDENTS s on S.STDID=D.STDID\n" +
"  JOIN courses c on C.COURSEID=E.COURSEID\n" +
"  JOIN groups gg on GG.TABLEID=E.GROUPID order by examsdate ASC",j);
    }

    
    public void ViewBox(int id,JTextField name,JTextField min_Text,JTextField max_text,JComboBox super_combo,JComboBox course_combo,datechooser.beans.DateChooserCombo exameDate,JComboBox group) {
  
        try {
            ResultSet rs2=OracleConn. executeQuery("select " +
                    "      names,\n" +
                    "      coursename,"+
                    "groups.groupid,\n" +
                    "      mindegree,\n" +
                    "      maxdegree,\n" +
                    "      EMPLOYEES.EMPLOYEENAME ,"+
                    "to_char(examsdate,'DD-MM-YYYY')\n " +
                    "from exams JOIN COURSES on EXAMS.COURSEID=COURSES.COURSEID JOIN GROUPS on GROUPS.TABLEID = EXAMS.GROUPID\n" +
                    "JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=EXAMS.SUPERVISOR WHERE EXAMS.tableid="+id);
            
            while (rs2.next()) {
                name.setText(rs2.getString(1));
               
                min_Text.setText(rs2.getString(4));
                max_text.setText(rs2.getString(5));
                super_combo.setSelectedItem(rs2.getString(6));
//                for (int i = 1; i < 8; i++) 
//                System.err.println(rs2.getString(i));
                
                String mont_=rs2.getString(7);

                //all the best correct
                exameDate.setSelectedDate(
                    new GregorianCalendar(
                    Integer.parseInt(mont_.substring(mont_.length()-mont_.lastIndexOf("-")+1, mont_.length()) ), 
                    Integer.parseInt(mont_.substring(mont_.indexOf("-")+1,mont_.lastIndexOf("-")))     -1,
                    Integer.parseInt(mont_.substring(0, mont_.indexOf("-") ) ) ) );
 
                course_combo.setSelectedItem(rs2.getString(2));
                 group.setSelectedItem(rs2.getString(3));
            }
            
      
        } catch (SQLException ex) {
            Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)", ex);
        }
    }
    
    public void ViewBox2(int id,JTextField paper,JComboBox student,JComboBox course_combo,JComboBox exame) {
  
        try {
            ResultSet rs2=OracleConn. executeQuery("select \n" +
"  E.NAMES,\n" +
"  S.STDNAME,\n" +
"  D.PAPERDEGREE,coursename\n" +
"from \n" +
"  EXAMS e JOIN EXAMDETAIL d on E.TABLEID=D.EXAMEPARENT\n" +
"  JOIN STUDENTS s on S.STDID=D.STDID\n" +
"  JOIN courses c on C.COURSEID=E.COURSEID\n" +
"  JOIN groups gg on GG.TABLEID=E.GROUPID WHERE d.tableid="+id);
            
            while (rs2.next()) {
                course_combo.setSelectedItem(rs2.getString(4));
                
                exame.setSelectedItem(rs2.getString(1));
                
                
                
                paper.setText(rs2.getString(3));
                
                
                
                student.setSelectedItem(rs2.getString(2));
            }
            
      
        } catch (SQLException ex) {
            Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)", ex);
        }
    }
    
    
    
    
    void insert1(String name,String Coursename,String group,String min,String max,String supervisor,Calendar examedate){
        
 OracleConn.insertSQL("exams", "SEQexams.nextval","'"+name+"'","select courseid from courses where coursename ='"+Coursename+"' ","select tableid from groups where groupid="+group+" and courseid =(select courseid from courses where coursename ='"+Coursename+"')",min,max,"select employeeid from employees where employeename='"+supervisor+"' ","to_date('"+(examedate.get(Calendar.DAY_OF_MONTH)-1)+"-"+(examedate.get(Calendar.MONTH)+1)+"-"+(examedate.get(Calendar.YEAR)-1)+"','DD-MM-YYYY') ");
    }

    void insert2(String ExameName,String studentname,String paper){
 OracleConn.insertSQL("examdetail", "SEQexamsDetail.nextval","select tableid from exams where names='"+ExameName+"'","select stdid from students where stdname='"+studentname+"'",paper);
    }

}
