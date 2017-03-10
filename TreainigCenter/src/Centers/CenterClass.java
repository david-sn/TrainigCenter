
package Centers;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import Table_List_Property.AllProperty;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class CenterClass {
 
   
    public void update(long id,String branch,String mincapacity,String maxcapacity,String floor){
   
OracleConn.updateSQL("rooms", new String[]
    {
        "branchid",
        "roomfloor",
        "ROMMSEQ",
        "mincapacity",
        "MAXCAPCITY",
    },
        "TableId="+id,
        
        "select centerid from CENTERBRANCH where centername like '%"+branch+"%'" ,
        floor,
        "select (count(*))from rooms where ROOMFLOOR="+floor,
        mincapacity,
        maxcapacity
        );
  
    }
   
    public void delete(int id){
    OracleConn.deleteSQL("rooms","roomid="+id);
    }
   
    public void search(JTable table,String name,String phone,int gender,int year,String email){
        OracleConn.QueryinTABLE("select stdid,stdname,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY'),CASE(stdyear) WHEN 0 THEN '1st Primary' WHEN 1 THEN '2nd Primary' WHEN 2 THEN '3rd Primary' WHEN 3 THEN '4th Primary' WHEN 4 THEN '5th Primary' WHEN 5 THEN '6th Primary' WHEN 6 THEN '1st Secondary' WHEN 7 THEN '2nd Secondary' WHEN 8 THEN '3rd Secondary' WHEN 9 THEN '1st High school' WHEN 10 THEN '2nd High school' WHEN 11 THEN '3rd High school' WHEN 12 THEN 'Others-General' else null END from students where stdname like '%"+name+"%' and stdphone like '%"+phone+"%' or stdgender like '%"+gender+"%'and email like '%"+email+"%' or stdyear like '%"+year+"%' ",table);
    }
  
    DefaultTableModel mod=null;
    public void viewTable(JTable j,String branch){  
        try {
            AllProperty.clearRows(j);
            OracleConn.executeQuery("select ROOMS.TABLEID," +
"       CENTERname," +
"       roomfloor ," +
"       ROOMS.ROMMSEQ," +
"       mincapacity," +
"       MAXCAPCITY       " +
"from ROOMS join CENTERBRANCH on ROOMS.BRANCHID = CENTERBRANCH.CENTERID " +
"where ROOMS.BRANCHID=(select CENTERBRANCH.CENTERID from CENTERBRANCH where CENTERBRANCH.CENTERNAME ='"+branch+"')");
            
            mod=(DefaultTableModel) j.getModel();
            while (OracleConn.rs.next()) {
                mod.addRow(new Object[]
                {
                    OracleConn.rs.getObject(1),//table id
                    OracleConn.rs.getObject(2),//branch name
                    ConvertTextTypes.Demo.to_Ranks((int) OracleConn.rs.getInt(3))+" Floor",//floor
                    OracleConn.rs.getObject(4),//room SEQ
                    OracleConn.rs.getObject(3)+"0"+OracleConn.rs.getObject(4),//full number
                    OracleConn.rs.getObject(5),//min capacity
                    OracleConn.rs.getObject(6)//max capacity
                        
                });
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CenterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public void viewTable1(JTable j ){  
        try {
            AllProperty.clearRows(j);
            OracleConn.executeQuery("select ROOMS.TABLEID," +
"       CENTERname," +
"       roomfloor ," +
"       ROOMS.ROMMSEQ," +
"       mincapacity," +
"       MAXCAPCITY       " +
"from ROOMS join CENTERBRANCH on ROOMS.BRANCHID = CENTERBRANCH.CENTERID order by CENTERname,ROMMSEQ" );
            
            mod=(DefaultTableModel) j.getModel();
            while (OracleConn.rs.next()) {
                mod.addRow(new Object[]
                {
                    OracleConn.rs.getObject(1),//table id
                    OracleConn.rs.getObject(2),//branch name
                    ConvertTextTypes.Demo.to_Ranks((int) OracleConn.rs.getInt(3))+" Floor",//floor
                    OracleConn.rs.getObject(4),//room SEQ
                    OracleConn.rs.getObject(3)+"0"+OracleConn.rs.getObject(4),//full number
                    OracleConn.rs.getObject(5),//min capacity
                    OracleConn.rs.getObject(6)//max capacity
                        
                });
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CenterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    public void ViewBox(int id,JComboBox jComboBox1,JSpinner room_floor, JSpinner roomcapacit,JSpinner maxCapacity) {
String f=null; 
        try {    
           
           OracleConn.executeQuery("select  " +
"       CENTERname," +
"       roomfloor ,"+
"       mincapacity," +
"       MAXCAPCITY  " +
"from ROOMS join CENTERBRANCH on ROOMS.BRANCHID = CENTERBRANCH.CENTERID  " +
"where Tableid="+id);
           
              while (OracleConn.rs.next()) {              
                  System.err.println(OracleConn.rs.getInt(3));
                  System.err.println(OracleConn.rs.getInt(4));
                  
                jComboBox1.setSelectedItem(OracleConn.rs.getString(1));
                
                room_floor.setValue(OracleConn.rs.getInt(2));
                  roomcapacit.setValue(OracleConn.rs.getInt(3));
                  
                maxCapacity.setValue(OracleConn.rs.getInt(4));
                  
                
                
              
            }
           
      
        } catch (SQLException ex) {
            Error_Dynamic.getERRORS(this.getClass().getName(),f, ex);
        }catch(Throwable e){e.printStackTrace();}
        
    }
    
    void insert(String branch,String mincapacity,String maxcapacity,String floor){

 OracleConn.insertSQL("rooms",
         "SEQrooms.nextval",
         "select CENTERBRANCH.CENTERID from CENTERBRANCH where CENTERBRANCH.CENTERNAME ='"+branch+"'",
         floor,
         (1+Integer.parseInt( OracleConn.ret_value("select count(*)from rooms where ROOMFLOOR="+floor).toString())),
         mincapacity,
         maxcapacity
         
    );

    }

}
