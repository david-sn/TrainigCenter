package Attendances;

import DatabaseConnection.OracleConn;
import javax.swing.JTable;

public class AttendaceClass{

    void insert( String namestudent,String CourseName,String GROUPNO) {
        OracleConn.insertSQL("subattend", "SEQsubattend.nextval","select attendance.tableID from ATTENDANCE where to_char(MONTHS,'DD-MON-YYYY') = to_char(sysdate,'DD-MON-YYYY') AND GROUPID = (select TABLEID from GROUPS where courseid=(select courseid from courses where lower(coursename) ='"+CourseName.toLowerCase()+"') AND GROUPS.GROUPID="+GROUPNO+")","select stdid from students where lower(stdname)='"+namestudent.toLowerCase()+"'","sysdate");
    }
    
    void delete(int id)
    {
        OracleConn.deleteSQL("subattend", "tableid="+id);
    }
    
    void deleteAll(int id)
    {
        OracleConn.deleteSQL("delete from subattend where parentid="+id);
    }
    
    void viewTable(JTable table)
    {
        OracleConn.QueryinTABLE("select", table);
    }
}