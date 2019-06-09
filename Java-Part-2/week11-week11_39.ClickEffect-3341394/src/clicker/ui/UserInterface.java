package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import clicker.applicationlogic.*;
import java.awt.GridLayout;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator laskin;
    
    public UserInterface(Calculator laskin) {
        this.laskin = laskin;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);
        
        JLabel counter = new JLabel();
        JButton clicker = new JButton("Click!");
        
        ClickListener listener = new ClickListener(this.laskin,counter);
        clicker.addActionListener(listener);
        
        container.add(counter);
        container.add(clicker);
    }

    public JFrame getFrame() {
        return frame;
    }
}
