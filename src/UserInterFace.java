import java.awt.*;
import javax.swing.*;

public class UserInterFace extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel panel; 

    public UserInterFace() {

        // panel = new JPanel();
        this.setTitle("ConvertCSV");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Integer scale = dim.height/10;
        

        this.setSize(scale*2,scale*3);
        this.setResizable(false);
        
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // JPanel.setBackground();
        
        this.setVisible(true);
    }

  
    
}
