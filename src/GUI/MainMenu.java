package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.UIManager;

import ConsoleManager.Consultation;
import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;
import ConsoleManager.WestminsterSkinConsultantManager;

public class MainMenu extends JFrame {

    private JLabel mainMenuLabel  = new JLabel();
    private JLabel mainMenuPic = new JLabel();
    private JButton btn1,btn2,btn3;

    public MainMenu(SkinConsultantManager manager){
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        //set Window
        ViewLayout(800, 800,"Westminster Skin Consultant Management System");

        // Set Main menu Name
        JPanel mainMenuNamePnl = new JPanel(new FlowLayout());
        mainMenuLabel.setText("Westminster Skin Consultant Management System");
        mainMenuLabel.setFont(new Font("SansSerif",Font.BOLD,30));
        mainMenuNamePnl.setSize(50,300);
        mainMenuNamePnl.setBackground(Color.cyan);
        mainMenuNamePnl.add(mainMenuLabel);
        add("North",mainMenuNamePnl);

        //Set Main menu options
        JPanel mainMenuOptionPnl = new JPanel(new GridLayout(4,1));
        mainMenuOptionPnl.setBackground(Color.cyan);

        //Button 1 - View Doctor List
        btn1 = new JButton();
        btnSettings(btn1,"View All Doctors",400);
        btn1.addActionListener((e) -> {
            setVisible(false);
            new ViewAllDoctors(manager).setVisible(true);
        });

        //Button 2 - New Consultation
        btn2 = new JButton();
        btnSettings(btn2,"New Consultation",500);
        btn2.addActionListener(e -> {
            setVisible(false);
            new NewConsultation(manager).setVisible(true);
        });

        //Button 3 - Exit
        btn3 = new JButton();
        btnSettings(btn3,"Exit",600);
        btn3.addActionListener(e -> {
            System.exit(0);
        });

        add("Center",mainMenuOptionPnl);

    }
    public void btnSettings(JButton x,String name,int y){
        x.setBounds(200,y,350,60);
        x.setText(name);
        x.setFont(new Font("SansSerif",Font.BOLD,15));
        x.setFocusable(false);
        x.setBackground(Color.blue);
        x.setForeground(Color.white);
        this.add(x);

    }

    public void ViewLayout(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

}
