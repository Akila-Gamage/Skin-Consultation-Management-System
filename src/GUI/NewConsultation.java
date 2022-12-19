package GUI;

import javax.swing.*;

public class NewConsultation extends MenuController{
    public JLabel lbl;
    public JButton btn;


    public NewConsultation(){
        lbl = new JLabel(OptionNumber());
        add(lbl);

        btn =new JButton(OptionName());
        add(btn);
    }
    @Override
    public String OptionNumber() {
        return "[2]";
    }

    @Override
    public String OptionName() {
        return "Add new Consultation";
    }
}
