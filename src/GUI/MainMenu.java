package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.UIManager;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;
import ConsoleManager.WestminsterSkinConsultantManager;

public class MainMenu extends JFrame {

    private JLabel mainMenuLabel  = new JLabel();
    private JLabel mainMenuPic = new JLabel();
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;



    public MainMenu(SkinConsultantManager SCM){
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        ViewLayout(800, 800,"Westminster Skin Consultant Management System");

        JPanel mainMenuNamePnl = new JPanel(new FlowLayout());
        mainMenuLabel.setText("Westminster Skin Consultant Management System");
        mainMenuPic.setIcon(new ImageIcon("abc.png"));
        Dimension size = mainMenuPic.getPreferredSize();
//        mainMenuPic.setBounds(50,30);
        mainMenuLabel.setFont(new Font("Arial",Font.BOLD,30));
        mainMenuNamePnl.setSize(50,300);
        mainMenuNamePnl.setBackground(Color.cyan);
        mainMenuNamePnl.add(mainMenuLabel);

        JPanel mainMenuOptionPnl = new JPanel(new GridLayout(6,1));
        mainMenuOptionPnl.setBackground(Color.cyan);
        btn1 = new JButton();
        btnSettings(btn1,"View All Doctors",300);
        btn1.addActionListener((e) -> {
            dispose();
            new ViewAllDoctors(SCM).setVisible(true);
        });
        btn2 = new JButton();
        btnSettings(btn2,"Add Consultation",400);
        btn2.addActionListener(e -> {
            dispose();
            new AddConsultation();
        });
        btn3 = new JButton();
        btnSettings(btn3,"qwerty",500);
        btn4 = new JButton();
        btnSettings(btn4,"Exit",600);

        add(mainMenuNamePnl,BorderLayout.NORTH);
        add(mainMenuOptionPnl,BorderLayout.CENTER);

    }
    public void btnSettings(JButton x,String name,int y){
        x.setBounds(200,y,350,60);
        x.setText(name);
        x.setFocusable(false);
        x.setBackground(Color.blue);
        x.setForeground(Color.white);
//        x.addActionListener(this);
        this.add(x);

    }

    public void ViewLayout(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==btn1){
//            this.dispose();
//            new Menu();
//        }else if (e.getSource()==btn2){
//            this.dispose();
//            new NewConsultation();
//        } else if (e.getSource()==btn3) {
//            this.dispose();
//        } else if (e.getSource()==btn4) {
//            System.exit(0);
//        }
//    }
}
