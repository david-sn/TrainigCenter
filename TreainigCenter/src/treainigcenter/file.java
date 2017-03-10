import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

class ChooserFilterTest {

    public static void main(String[] args) {
        
        
        Runnable r = new Runnable() {

            @Override
            public void run() {
                String[] properties = {"os.name", "java.version", "java.vm.version", "java.vendor"};
                for (String property : properties) {
                    System.out.println(property + ": " + System.getProperty(property));
                }
                JFileChooser jfc = new JFileChooser();
                jfc.showOpenDialog(null);
                jfc.addChoosableFileFilter(new FileFilter() {

                    @Override
                    public boolean accept(File f) {
                        return f.isDirectory() || f.getName().toLowerCase().endsWith(".obj");
                    }

                    @Override
                    public String getDescription() {
                        return "Wavefront OBJ (*.obj)";
                    }

                    @Override
                    public String toString() {
                        return getDescription();
                    }
                });
                int result = JOptionPane.showConfirmDialog(null, "Description was 'All Files'?");
                System.out.println("Displayed description (Metal): " + (result == JOptionPane.YES_OPTION));
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    SwingUtilities.updateComponentTreeUI(jfc);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jfc.showOpenDialog(null);
                result = JOptionPane.showConfirmDialog(null, "Description was 'All Files********'?");
                System.out.println("Displayed description (System):********* " + (result == JOptionPane.YES_OPTION));
                result = JOptionPane.showConfirmDialog(null, "Description was 'All Files*******'?");
                System.out.println("Displayed description (Metal)************: " + (result == JOptionPane.YES_OPTION));
                try {
                    for (UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            SwingUtilities.updateComponentTreeUI(jfc);
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                }
                jfc.showOpenDialog(null);
                result = JOptionPane.showConfirmDialog(null, "Description was 'All Files'?");
                System.out.println("Displayed description (System): " + (result == JOptionPane.YES_OPTION));
            }
        };
        SwingUtilities.invokeLater(r);
    }

    private ChooserFilterTest() {
    }
}