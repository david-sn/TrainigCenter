package Reports.cls;
  


import DatabaseConnection.OracleConn;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

//
//public class CallReport{
//    public static void main(String[]args) throws FileNotFoundException
//{
//     
// try{
//     
////     JasperReport jasperReport = JasperCompileManager.compileReport("A:\\My programs\\TreainigCenter\\src\\t.jrxml");
////    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,new HashMap(), new JREmptyDataSource());
////    JasperExportManager.exportReportToPdfFile(jasperPrint, "A:\\My programs\\ad.pdf");
//      
////     
////     
////     
////    JasperReport jasp_report = JasperCompileManager.compileReport("A:\\My programs\\TreainigCenter\\src\\Reports\\t.jrxml");
////        JasperPrint jasp_print = JasperFillManager.fillReport(jasp_report, null ,OracleConn.OpenConn("hr", "hr", "XE"));
////        JasperViewer.viewReport(jasp_print);
////    
//    
////     
////
////JasperDesign jasperDesign = JRXmlLoader.load("A:\\My programs\\TreainigCenter\\src\\Reports\\cls\\t.jrxml");
////     JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);     
////     
////JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,OracleConn.OpenConn("hr", "hr", "XE")   );
////JasperViewer.viewReport(jasperPrint);
//}catch(Exception ex) {
//String connectMsg = "Could not create the report " + ex.getMessage() + " " + ex.getLocalizedMessage();
//System.out.println(connectMsg);
//}
//
//
//    }
//}
//



public class CallReport {
 public static void main(String[] args) {
  HashMap hm = null;
  // System.out.println("Usage: ReportGenerator ....");

  try {
   System.out.println("Start ....");
   // Get jasper report
   String jrxmlFileName = "A:\\My programs\\TreainigCenter\\src\\Reports\\newReport.jrxml";
   String jasperFileName = "A:\\My programs\\TreainigCenter\\src\\Reports\\newReport.jasper";
   String pdfFileName = "A:\\My programs\\TreainigCenter\\src\\Reports\\t.pdf";

  // JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
   
//     String dbUrl = props.getProperty("jdbc.url");
   String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
   // String dbDriver = props.getProperty("jdbc.driver");
   String dbDriver = "oracle.jdbc.driver.OracleDriver";
   // String dbUname = props.getProperty("db.username");
   String dbUname = "center";
 

   // Load the JDBC driver
   Class.forName(dbDriver);
   // Get the connection
   Connection conn = DriverManager.getConnection(dbUrl, dbUname, dbUname);

   // Create arguments
   // Map params = new HashMap();
   hm = new HashMap();
   hm.put("ID", "123");
   // Generate jasper print
   JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, null, conn);

   JasperViewer.viewReport(jprint);
   
   
   // Export pdf file
   //JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

   
   
   
   
   
   
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFileName,null, conn);
    JasperExportManager.exportReportToPdfFile(jasperPrint, "A:\\My programs\\ad.pdf");
      
   
   
   

   
   System.out.println("Done exporting reports to pdf");
   
  } catch (Exception e) {
   System.out.print("Exceptiion" + e);
  }
 }
}




