package plat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
public class PlatFrame extends JFrame {
    private JPanel buttonPanel;
    public PlatFrame()
    {
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos)
            makeButton(info.getName(),info.getClassName());

        add(buttonPanel);
        pack();
    }

    private void makeButton(String name ,String className)
    {
        JButton button = new JButton(name);
        buttonPanel.add(button);

        button.addActionListener(event ->{
            try
            {
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
}
