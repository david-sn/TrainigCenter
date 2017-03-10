package BasicFormsTraining;


import Table_List_Property.AllProperty;
import java.awt.Component;
import java.awt.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


 
public interface ItopBarPanel {
  
  
 default void New(BasicFormsTraining.top t,JPanel PanelToClear){
   for(Component c:t.getComponents()){
            if (c instanceof JButton &&((JButton)c).getText().equals("New"))
            {
                ((JButton)c).setText("Add");break;
           //  ((JButton)c).setIcon(new ImageIcon("A:\\My programs\\TreainigCenter\\src\\IconUsed\\new.png"));
            }Clear(PanelToClear);
        }
   }

 default  void Clear(JPanel j){for(Component c:j.getComponents()){
           if (c instanceof JTextField)     ((JTextField) c).setText("");
           if (c instanceof JTextArea)      ((JTextArea) c).setText("");
           if (c instanceof JComboBox)      ((JComboBox) c).setSelectedIndex(0);
           if (c instanceof JCheckBox)      ((JCheckBox) c).setSelected(false);
           if (c instanceof List)           ((List) c).removeAll();
           if (c instanceof JTable)         AllProperty.clearRows((JTable)c);
 }}; 

 default void First(JTable t,top top) {
     
     if (t.getSelectedRow()!=-1) {
         
    
     t.setRowSelectionInterval(0,0 );
        if (t.getSelectedRow()==0) {
            
          top.btnPrev.setEnabled(false);
          top.btnNext.setEnabled(true);
          top.btnLast.setEnabled(true);
          top.btnFirst.setEnabled(false);
        } else{ 
         top.btnNext.setEnabled(true);
          top.btnLast.setEnabled(true);
          top.btnFirst.setEnabled(true);
          top.btnPrev.setEnabled(true);
      }
        }
    }
   
 default void End(JTable t,top top){
     if (t.getSelectedRow()!=-1) {
     t.setRowSelectionInterval((t.getRowCount()-1) ,(t.getRowCount()-1) );
  
      if (t.getSelectedRow()==(t.getRowCount()-1)) {
          top.btnLast.setEnabled(false);//last
          top.btnFirst.setEnabled(true);//first
          top.btnNext.setEnabled(false);//next
          top.btnPrev.setEnabled(true);//prev
      }else{
      top.btnNext.setEnabled(true);
          top.btnLast.setEnabled(true);
          top.btnFirst.setEnabled(true);
          top.btnPrev.setEnabled(true);
      }
    } 
 }
  
 default void Next(JTable t,top top){ 
          

    if (t.getSelectedRow()!=-1) {
     t.setRowSelectionInterval((t.getSelectedRow()+1) ,(t.getSelectedRow()+1) );
      if (t.getSelectedRow()==(t.getRowCount()-1)) {
          
          top.btnNext.setEnabled(false);
          top.btnLast.setEnabled(false);
          top.btnFirst.setEnabled(true);
          top.btnPrev.setEnabled(true);
      }
      else{
      top.btnNext.setEnabled(true);
          top.btnLast.setEnabled(true);
          top.btnFirst.setEnabled(true);
          top.btnPrev.setEnabled(true);
      }
     }
       
  }
  
 default void Previous(JTable t,top top){

      if (t.getSelectedRow()!=-1) {
     t.setRowSelectionInterval((t.getSelectedRow()-1) ,(t.getSelectedRow()-1) );
  if (t.getSelectedRow()==0) {
          
          top.btnNext.setEnabled(true);
          top.btnLast.setEnabled(true);
          top.btnFirst.setEnabled(false);
          top.btnPrev.setEnabled(false);
      }
      
      else{
      top.btnNext.setEnabled(true);
          top.btnLast.setEnabled(true);
          top.btnFirst.setEnabled(true);
          top.btnPrev.setEnabled(true);
      }
      }
  }
  
   void Close(   ) ;
   
 
   void Search(); 
   void insert();
   void update();
   void Delete();
   boolean isNull();  
    
}
