package treainigcenter;

import DatabaseConnection.OracleConn;
import Login_USER.LoginForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TreainigCenter {

   
    public static void main(String[] args)  {
 
 
    DatabaseConnection.OracleConn.openConn("center","center","XE");
   
  
       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
       {
           if ("Nimbus".equals(info.getName())) 
           
           {                                    
               try {   //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                   UIManager.setLookAndFeel(info.getClassName());
                  
                   } 
               catch (UnsupportedLookAndFeelException ex) 
               {                                        
                   ex.printStackTrace();
               } catch (InstantiationException ex) { 
                   Logger.getLogger(TreainigCenter.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IllegalAccessException ex) {
                   Logger.getLogger(TreainigCenter.class.getName()).log(Level.SEVERE, null, ex);
               }
               catch (Exception ex) {
                   Logger.getLogger(TreainigCenter.class.getName()).log(Level.SEVERE, null, ex);
               }
break; 
           } 
       } 
    
              
    java.awt.EventQueue.invokeLater(new Runnable() 
    {@Override
            public void run() { 
       
     new LoginForm().setVisible(true);                  
    }        
    });
  
    }
}
    

