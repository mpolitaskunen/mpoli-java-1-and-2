package clicker.ui;

import javax.swing.SwingUtilities;
import clicker.applicationlogic.*;
import clicker.ui.*;

public class Main {

    public static void main(String[] args) {
        Calculator laskin = new PersonalCalculator();
        UserInterface ui = new UserInterface(laskin);
        SwingUtilities.invokeLater(ui);

    }
}
