package Courses;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import datechooser.beans.DateChooserCombo;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;



public class CourseClass {
 
   
    public void update(int id,String name,String price,boolean courseblocked,int Status,String Instructor,Calendar startDate,Calendar EndDate,Character pay,String Cycle,String code){
   
        OracleConn.updateSQL("courses", new String[]
   {
       "coursename",
       "courseprice",
       "courseblocked",
       "courseStatus",
       "courseInstructor",
       "startdate",
       "enddate",
       "payment",
       "cycle",
       "code"
   },
           
           "courseID="+id,
           
           
           "'"+ name+"'" ,
           price.replaceAll("EGP",""),
           courseblocked?"1":"0",
           Status,
           "(select employeeid from employees where employeename like '"+Instructor+"')",
           "to_date('"+startDate.get(Calendar.DAY_OF_MONTH)+"-"+(startDate.get(Calendar.MONTH)+1)+"-"+(startDate.get(Calendar.YEAR))+"','DD-MM-YYYY')",
           (EndDate.equals("")||EndDate.equals(null)||EndDate==null)?"null":"to_date('"+EndDate.get(Calendar.DAY_OF_MONTH)+"-"+(EndDate.get(Calendar.MONTH)+1)+"-"+(EndDate.get(Calendar.YEAR))+"','DD-MM-YYYY')",
           "'"+pay+"'",
         String.valueOf(pay).equals("2")?Cycle:"null","'"+code+"'"
   );
   
    
    
    
    }
   
    public void delete(int id){
    OracleConn.deleteSQL("courses","courseid="+id);
    }
   
    public void viewTable(JTable j){  
        OracleConn.QueryinTABLE("select courseid,\n" +
"        coursename,\n" +
"        NVL(courseprice,(case payment when '3'then\n" +
"                          (select comvalue from comissions where tableid=(select max(tableid)from comissions) \n" +
"                           )when '4' then 0 end)\n" +
"           )||' L.E', \n" +
"        case(courseblocked) when '1' then 'Blocked'\n" +
"                            else 'On List' END,\n" +
"        case(coursestatus) when'0' then 'Open Public' \n" +
"                           when'1' then 'Private'\n" +
"                           when'2' then 'Offer' end, \n" +
"        employeename,\n" +
"        to_char(startdate,'DD-MON-YYYY'), \n" +
"        NVL(to_char(COURSES.ENDDATE,'DD-MON-YYYY'),'Opened'),\n" +
"        case (payment) WHEN '0' THEN 'One Time' \n" +
"                       WHEN '1' THEN 'Per Session' \n" +
"                       WHEN '2' THEN 'Per Cycle' \n" +
"                       WHEN '3' THEN 'Free + Profit ' \n" +
"                       WHEN '4' THEN 'Full Free' END,\n" +
"                       COALESCE (to_char(COURSES.CYCLE),'NO Cycle') \n" +
"from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR",j);
    }
    
    void ViewBox(int id,JTextField Name_text,JTextField price_text,JComboBox<String> instr_Combo1,JComboBox<String> status_Comb,com.tekde.linet.components.JCheckBoxCus blocked,DateChooserCombo startdate,DateChooserCombo enddate,JRadioButton onetime_radio,JRadioButton persession_radio,JRadioButton percycle_radio,JRadioButton free_radio,Character payment,JTextField cycle,JTextField code) {
         try {    
 String f="select " +
"      coursename," +
"      NVL(courseprice,00/*(select max fees if free+profit found)*/), " +
"      case(courseblocked) " +
"              when '0' then 'Blocked' " +
"              else 'On List' END, " +
         
"      case(coursestatus)  " +
"              when'0' then 'Open Public' " +
"              when'1' then 'Private' " +
"              when'2' then 'Offer'  " +
"              end,  " +
"      employeename, " +
"      to_char(startdate,'DD-MM-YYYY'), " +
"      NVL(to_char(COURSES.ENDDATE,'DD-MM-YYYY'),'Opened')," +
         
"        payment, " +
                
         
"      COALESCE (to_char(COURSES.CYCLE),'NO Cycle'),code " +
"from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR where courseid="+id;
 
              
              OracleConn.executeQuery(f);

              while (OracleConn.rs.next()) {
                Name_text.setText(OracleConn.rs.getString(1));
             
                price_text.setText(OracleConn.rs.getString(2));
                
                instr_Combo1.setSelectedItem(OracleConn.rs.getString(5));
                
                status_Comb.setSelectedItem(OracleConn.rs.getString(4));
                
                if(OracleConn.rs.getString(3).equals("1"))
                     blocked.setSelected(true);
                else blocked.setSelected(false);
            
                String mont_=OracleConn.rs.getString(6);
             
                  
                startdate.setSelectedDate(
                    new GregorianCalendar(
                    Integer.parseInt(mont_.substring(mont_.length()-mont_.lastIndexOf("-")+1, mont_.length()) ), 
                    Integer.parseInt(mont_.substring(mont_.indexOf("-")+1,mont_.lastIndexOf("-")))     -1,
                    Integer.parseInt(mont_.substring(0, mont_.indexOf("-") ) ) ) );
 
               mont_=OracleConn.rs.getString(7);
//                  System.err.println(mont_);
//                  System.err.println(mont_);
//                  System.err.println(mont_);
//                  System.err.println(mont_);
                  
                  if (!mont_.equals("Opened")) {
                enddate.setSelectedDate(
                    new GregorianCalendar(
                    Integer.parseInt(mont_.substring(mont_.length()-mont_.lastIndexOf("-")+1, mont_.length()) ), 
                    Integer.parseInt(mont_.substring(mont_.indexOf("-")+1,mont_.lastIndexOf("-")))     -1,
                    Integer.parseInt(mont_.substring(0, mont_.indexOf("-") ) ) ) );
 
                  }else enddate.setSelectedDate(null);
                  
                  
                payment=(OracleConn.rs.getString(8).charAt(0));
               
                 if(payment=='0')
                    onetime_radio.setSelected(true);
                else if(payment=='1')
                    persession_radio.setSelected(true);
                else if(payment=='2')
                {    percycle_radio.setSelected(true);
                     cycle.setText(OracleConn.rs.getString(9));
                }
                else 
                    free_radio.setSelected(true);
                
                  
                        code.setText(OracleConn.rs.getString(10));
            }
           
      
        }
         catch (SQLException ex) {
           Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)", ex);
        }
         catch(Exception e ){Error_Dynamic.getERRORS(this.getClass().getName(), e);} 
    }
    
    void insert(String name,String price,boolean BLOCKED,int courseStatus,String courseInstructor,Calendar startDate,Calendar EndDate,char pay,String Cycle,String code){

 OracleConn.insertSQL("Courses", "SEQcourses.nextval",
         "'"+name+"'",
         String.valueOf(pay).equals("3")||String.valueOf(pay).equals("4")?"null":price.replaceAll("EGP", ""),
         BLOCKED?"1":"0",
         courseStatus,
         "select employeeid from employees where employeename like'"+courseInstructor+"' ",
         "to_date('"+startDate.get(Calendar.DATE)+"-"+(startDate.get(Calendar.MONTH)+1)+"-"+(startDate.get(Calendar.YEAR))+"','DD-MM-YYYY')",
         (EndDate.equals("")||EndDate.equals(null)||EndDate==null)?"null":"to_date('"+EndDate.get(Calendar.DATE)+"-"+(EndDate.get(Calendar.MONTH)+1)+"-"+(EndDate.get(Calendar.YEAR))+"','DD-MM-YYYY')",
         "'"+pay+"'",
         String.valueOf(pay).equals("2")?Cycle:"null",
         "'"+code+"'"
         
 );

    }

    void search(JTable jTable1, String text, String price, int selectedIndex, boolean blockedChoose, String  instr_Combo1) {
        OracleConn.QueryinTABLE("select courseid,\n" +
"       coursename," +
"       courseprice," +
"       employeename," +
"       courseblocked," +
"       coursestatus  " +
"       from courses JOIN EMPLOYEES \n" +
"       on EMPLOYEES.EMPLOYEEID=courseInstructor"+
      " where courseblocked like '"+(blockedChoose?"1":"0")+"' and coursename like '%"+text+"%' and courseprice like '%"+price.replaceAll("EGP", "")+"%' or employeename like '%"+instr_Combo1+"%' or coursestatus like '%"+selectedIndex+"%' ",jTable1);
    
   
           }
    

    
       
}
