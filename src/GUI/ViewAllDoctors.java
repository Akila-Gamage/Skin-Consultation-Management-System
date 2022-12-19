package GUI;

import ConsoleManager.Doctor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewAllDoctors extends MenuController {
    public JLabel lbl;
    public JButton btn;

    public ViewAllDoctors(){
        lbl = new JLabel(OptionNumber());
        add(lbl);

        btn =new JButton(OptionName());
        add(btn);
    }

    @Override
    public String OptionNumber() {
        return "[1]";
    }

    @Override
    public String OptionName() {
        return "View All Doctors";
    }
}

