package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

public class MainMenu extends JFrame{

    private JLabel mainMenuLabel  = new JLabel();
    private ArrayList<MenuController> MC = new ArrayList<>();

    public MainMenu(){
        ViewLayout(800, 600,"Westminster Skin Consultant Management System");

        Container mainMenuPnl = getContentPane();
        mainMenuPnl.setLayout(new FlowLayout());
        mainMenuLabel.setText("Westminster Skin Consultant Management System");
        mainMenuPnl.add(mainMenuLabel);

        MC.add(new ViewAllDoctors());
        MC.add(new NewConsultation());

        for (int i = 0; i < MC.size(); i++) {


        }

    }

    public void ViewLayout(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }


}
