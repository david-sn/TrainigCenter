
package Students;

import DatabaseConnection.OracleConn;
import Files.Error_Dynamic;
import datechooser.beans.DateChooserCombo;
import java.io.File;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;



public class StudentsClass {
 
   
    public void update(long id,String name,String phone,String email,int gender,Calendar birthday,String code,String ImageName,String Path){
   //OracleConn.updateSQL("students", new String[]{"stdname","stdphone","email","stdgender","stdbirthday","stdyear"}, "stdid="+id, "'"+name+"'" ,"'"+phone+"'","'"+email+"'",gender+"","to_date('"+birthday.get(Calendar.DATE)+"-"+(birthday.get(Calendar.MONTH)+1)+"-"+(birthday.get(Calendar.YEAR)+1)+"','DD-MM-YYYY')" ,year+"");
   
   OracleConn.executeDML_SQL("begin load_file(1 ,"+id+",'"+name+"','"+phone+"','"+email+"','"+gender+"',to_date('"+birthday.get(Calendar.DAY_OF_MONTH)+"-"+(birthday.get(Calendar.MONTH)+1)+"-"+(birthday.get(Calendar.YEAR))+"','DD-MM-YYYY') ,"+code+",'"+ImageName+"','"+Path+"'); end;" ,true); 
    }
   
    public void delete(int id){
    OracleConn.deleteSQL("students","stdid="+id);
    }
   
    public void search(JTable table,String name,String phone,int gender,String code,String email){
 
        OracleConn.QueryinTABLE("select stdid,stdname,stdyear,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY') from students where stdname like '%"+name+"%' and stdphone like '%"+phone+"%' and stdgender like '%"+gender+"%'and email like '%"+email+"%' and stdyear like '%"+code+"%' ",table);
    }
   
    public void viewTable(JTable j){  
        OracleConn.QueryinTABLE("select stdid,stdname,stdyear,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY') from students",j);
    }
    boolean isnull=false;
    public void ViewBox(int id,JTextField name,JFormattedTextField phone,JTextField email,JComboBox gender,DateChooserCombo birthday,JTextField code,JLabel label,boolean enabledImage,JFileChooser choo) {
         try {    
 String f="select stdname,stdphone,email,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'DD-MM-YYYY'),stdyear,path,imagename from students where stdid="+id;
 
 isnull=OracleConn.ret_value("select nvl(stdimage,'') from students where stdid="+id)==null?false:true;
               if (enabledImage&&isnull)
               {   
                   OracleConn.ImageLabel("Students", "stdimage", "stdid="+id, label);
               }else {
                   label.setIcon(null);
                   label.setText("No Image Data");
               }
              OracleConn.rs=OracleConn. executeQuery(f);

              while (OracleConn.rs.next()) {
                name.setText(OracleConn.rs.getString(1));
                phone.setText(OracleConn.rs.getString(2));
                email.setText(OracleConn.rs.getString(3));
                gender.setSelectedItem(OracleConn.rs.getString(4));
                String mont_=OracleConn.rs.getString(5);
                birthday.setSelectedDate(
                    new GregorianCalendar(
                    Integer.parseInt(mont_.substring(mont_.length()-mont_.lastIndexOf("-")+1, mont_.length()) ), 
                    Integer.parseInt(mont_.substring(mont_.indexOf("-")+1,mont_.lastIndexOf("-")))     -1,
                    Integer.parseInt(mont_.substring(0, mont_.indexOf("-") ) ) ) );
 
                code.setText(OracleConn.rs.getString(6));
                  
             
                choo=new JFileChooser();
                choo.setSelectedFile(new File(OracleConn.rs.getString(7)+"\\"+OracleConn.rs.getString(8)));
                
             
            }
           
      
        } catch (SQLException ex) {
           Error_Dynamic.getERRORS(this.getClass().getName(),"Query >>ViewBox(...)", ex);
        }
         
    }
    
    void insert(String name,String phone,String email,int gender,Calendar birthday,String code,String ImageName,String Path){
 OracleConn.executeDML_SQL("begin load_file(0 ,0,'"+name+"','"+phone+"','"+email+"','"+gender+"',to_date('"+(birthday.get(Calendar.DAY_OF_MONTH)-1)+"-"+(birthday.get(Calendar.MONTH)+1)+"-"+(birthday.get(Calendar.YEAR))+"','DD-MM-YYYY') ,"+code+",'"+ImageName+"','"+Path+"'); end;" ,true);
    }
}