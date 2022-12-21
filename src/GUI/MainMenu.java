package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

public class MainMenu extends JFrame implements ActionListener {

    private Color btnClr = Color.CYAN;
    private JLabel mainMenuLabel  = new JLabel();
    private JButton btn1;
    private JButton btn2;



    public MainMenu(){
        ViewLayout(800, 600,"Westminster Skin Consultant Management System");
        setVisible(true);

        JPanel mainMenuNamePnl = new JPanel(new FlowLayout());
        mainMenuLabel.setText("Westminster Skin Consultant Management System");
        mainMenuNamePnl.add(mainMenuLabel);
        add("North",mainMenuNamePnl);

        JPanel mainMenuOptionPnl = new JPanel(new GridLayout(6,1));
        Buttons();
        add("Center",mainMenuOptionPnl);

    }
    public void btnSettings(JButton x,String name,int y){
        x.setBounds(200,y,350,40);
        x.setText(name);
        x.setFocusable(false);
        x.setBackground(btnClr);
        x.addActionListener(this);
        this.add(x);
    }
    public void Buttons(){
        btn1 = new JButton();
        btnSettings(btn1,"View All Doctors",90);
        btn2 = new JButton();
        btnSettings(btn2,"Add Consultation",160);

    }

    public void ViewLayout(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            this.dispose();
            new ViewAllDoctors();
        }else if (e.getSource()==btn2){
            this.dispose();
            new NewConsultation();
        }

    }
}
