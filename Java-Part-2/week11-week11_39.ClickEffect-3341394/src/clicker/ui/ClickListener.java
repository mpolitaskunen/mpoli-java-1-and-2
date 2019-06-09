/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

import clicker.applicationlogic.*;

/**
 *
 * @author seppo.taskunen
 */
public class ClickListener implements ActionListener {
    private Calculator laskin;
    private JLabel label;
    
    public ClickListener(Calculator laskin, JLabel label) {
        this.laskin = laskin;
        this.label = label;
        this.label.setText(Integer.toString(this.laskin.giveValue()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.laskin.increase();
        this.label.setText(Integer.toString(this.laskin.giveValue()));
    }
    
}
