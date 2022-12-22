package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

public class MainMenu extends JFrame implements ActionListener {
    private JLabel mainMenuLabel  = new JLabel();
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;



    public MainMenu(){
        ViewLayout(800, 600,"Westminster Skin Consultant Management System");
        setVisible(true);

        JPanel mainMenuNamePnl = new JPanel(new FlowLayout());
        mainMenuLabel.setText("Westminster Skin Consultant Management System");
        mainMenuLabel.setFont(new Font("Arial",Font.BOLD,30));
        mainMenuNamePnl.setSize(50,300);
        mainMenuNamePnl.setBackground(Color.cyan);
        mainMenuNamePnl.add(mainMenuLabel);

        JPanel mainMenuOptionPnl = new JPanel(new GridLayout(6,1));
        mainMenuOptionPnl.setBackground(Color.cyan);
        Buttons();

        add(mainMenuNamePnl,BorderLayout.NORTH);
        add(mainMenuOptionPnl,BorderLayout.CENTER);



    }

    public void Buttons(){
        btn1 = new JButton();
        btnSettings(btn1,"View All Doctors",200);
        btn2 = new JButton();
        btnSettings(btn2,"Add Consultation",300);
        btn3 = new JButton();
        btnSettings(btn3,"qwerty",400);
    }
    public void btnSettings(JButton x,String name,int y){
        x.setBounds(200,y,350,60);
        x.setText(name);
        x.setFocusable(false);
        x.setBackground(Color.blue);
        x.setForeground(Color.black);
        x.addActionListener(this);
        this.add(x);

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
