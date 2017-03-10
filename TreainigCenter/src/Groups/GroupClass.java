
package Groups;

import DatabaseConnection.OracleConn;
import static DatabaseConnection.OracleConn.con;
import static DatabaseConnection.OracleConn.rs;
import static DatabaseConnection.OracleConn.sql;
import static DatabaseConnection.OracleConn.stat;
import Login_USER.LoginForm;
import Table_List_Property.AllProperty;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class GroupClass {
 
   
    public void update(int id,String Coursename ,String roomID,String per,String appointment){
         
             OracleConn.updateSQL("begin "
                     + "delete from appointment where group_ID="+id
                     + ";update groups set "
                     + "courseid=(select courseid from courses where coursename ='"+Coursename+"'),"
                     + "roomID=(select TableID from rooms where roomfloor||'0'||rommseq='"+roomID+"' and rooms.branchid="+LoginForm.branch+"  ),"
                     + "per="+per
                     + " where groups.TableID="+id+";"
                     + appointment+"     "
                     + " end;");
         }
   
    public void delete(int id){
    OracleConn.deleteSQL("begin delete from GROUPS where tableid="+id+"; end;");
    }
   
    public void search(JTable table,String name,String phone,int gender,int year,String email){
     //   OracleConn.QueryinTABLE("select stdid,stdname,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY'),CASE(stdyear) WHEN 0 THEN '1st Primary' WHEN 1 THEN '2nd Primary' WHEN 2 THEN '3rd Primary' WHEN 3 THEN '4th Primary' WHEN 4 THEN '5th Primary' WHEN 5 THEN '6th Primary' WHEN 6 THEN '1st Secondary' WHEN 7 THEN '2nd Secondary' WHEN 8 THEN '3rd Secondary' WHEN 9 THEN '1st High school' WHEN 10 THEN '2nd High school' WHEN 11 THEN '3rd High school' WHEN 12 THEN 'Others-General' else null END from students where stdname like '%"+name+"%' and stdphone like '%"+phone+"%' or stdgender like '%"+gender+"%'and email like '%"+email+"%' or stdyear like '%"+year+"%' ",table);
    }
   
    public void viewTable(JTable j){  
        //OracleConn.QueryinTABLE("select GROUPS.TableID, coursename , groupID, roomfloor||'0'||rommseq,    case(per) when 0 then 'Every Week' else 'Every Month' end from COURSES JOIN   GROUPS ON GROUPS.COURSEID = COURSES.COURSEID JOIN ROOMS on ROOMS.TABLEID = GROUPS.ROOMID",j);
    OracleConn.QueryinTABLE("SELECT seq,coursename,groupno,roomno,per,dayname,starttimes,endtimes FROM table (groups_Appointment)",j);
    }
    
    DefaultTableModel mod=null;
    boolean pass=true;
    public void ViewBox(int id,JTextField groupNO,JComboBox Course,JComboBox Room,JRadioButton week,JRadioButton mounth,JTable TableMini) {
         try {   
             
  mod=(DefaultTableModel) TableMini.getModel();
  AllProperty.clearRows(TableMini);

      sql=("select "
                + "groupID,"
                + " coursename , "
                + "roomfloor||'0'||rommseq ,"
                + "per, DAYS(lectureday), "
                + "to_char(starttime,'hh:mi am'), "
                + "to_char(endtime,'hh:mi am') "
                + "from APPOINTMENT JOIN GROUPS ON GROUPS.TABLEID=APPOINTMENT.GROUP_ID "
                + "JOIN COURSES ON GROUPS.COURSEID = COURSES.COURSEID "
                + "JOIN ROOMS on ROOMS.TABLEID = GROUPS.ROOMID "
                + "where groups.tableID="+id);
         stat=con.prepareStatement(sql);
            rs=stat.executeQuery(sql);
            pass=true;
            String s2=null;
            while ( rs.next()) {
                 
                String s1=(rs.getString(1));
                 s2=(rs.getString(2));
                String s3=(rs.getString(3));
                String s4=(rs.getString(4));
                String s5=(rs.getString(5));
                String s6=(rs.getString(6));
                String s7=(rs.getString(7));
            
                if(pass)
                {                
                groupNO.setText(s1);
              
                Room.setSelectedItem(s3);
                if (s4.equals("0")||s4.equals(0)) {
                    week.setSelected(true);
                }
                
                else mounth.setSelected(true);
               pass=false;} 
                
                
                mod.addRow(new Object[]{mod.getRowCount(),s5,s6,s7});



            }
            Course.setSelectedItem(s2);
    
            } catch (Exception ex) {
           ex.printStackTrace();
        }
           
       
    }
    
    void insert(String CourseName,String RoomID_TABLE,String per,String appoint){

        OracleConn.insertSQL("begin "
                + "insert into groups values (SEQgroup.nextval,"
                + "(select ( count(*)+1) from groups where courseid =(select courseid from courses where coursename ='"+CourseName+"' )) , "
                + "(select courseid from courses where coursename ='"+CourseName+"'),"
                + "(select TableID from rooms where roomfloor||'0'||rommseq='"+RoomID_TABLE+"' and BRANCHID="+LoginForm.branch+"),"
                + per+","
                + "(select nvl(enddate,sysdate) from courses where coursename = '"+CourseName+"'  )"
                + ");"
                + "           "
                +appoint+ "end;");
        
 
    }
     

}
