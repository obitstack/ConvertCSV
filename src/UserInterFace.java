import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterFace extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static final String colorDark = "#5b6151";
    private static final String colorMedDark = "#889379";
    private static final String colorMed = "#e5dbd7";
    private static final String colorMedLt = "#9799a9";
    private static final String colorLt = "#8790b3";
    JButton inButton;
    JComboBox outSelect; 
    String outputTypes[] = {"CSV Comma", "CSV Semicolon", "MT940", "JSon"};
    
    


    public UserInterFace() {

        inButton = new JButton();
        inButton.addActionListener(this);
        outSelect = new JComboBox<String>(outputTypes);

        inButton.setText("open file");

        this.setTitle("ConvertCSV");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Integer scale = dim.height / 10;

        this.setSize(scale * 2, scale * 3);
        this.setResizable(false);

        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.decode(colorLt));
        this.add(inButton);
        this.add(outSelect);

        this.setVisible(true);
    }

    private void choiceDialog() {

        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==inButton){
            choiceDialog();

        }

    }


  
    
}
