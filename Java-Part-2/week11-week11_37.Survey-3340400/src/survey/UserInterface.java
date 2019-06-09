package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200,300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        
        ButtonGroup are = new ButtonGroup();
        ButtonGroup why = new ButtonGroup();
        
        are.add(yes);
        are.add(no);
        
        why.add(noReason);
        why.add(fun);
        
        container.add(new JLabel("Are you?"));        
        container.add(yes);
        container.add(no);
 
        container.add(new JLabel("Why?"));
        container.add(noReason);
        container.add(fun);
        
        container.add(new JButton("Done!"));
    }


    public JFrame getFrame() {
        return frame;
    }
}
