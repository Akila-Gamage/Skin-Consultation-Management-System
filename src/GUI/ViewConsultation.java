package GUI;

import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewConsultation extends MenuController{
    private JLabel optionNameLbl;
    private JButton backBtn;
    private ArrayList<JButton> btns = new ArrayList<>();
    private ArrayList<JLabel> lbls = new ArrayList<>();

    public ViewConsultation(){
        JPanel consultationsOptionPnl = new JPanel(new GridLayout(10,1));
        backGroundClr(consultationsOptionPnl);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                lbls.add(new JLabel("["+(i+1)+"]"));
                btns.add(new JButton("Patient: "+""+" 's Consultation - View More"));
            }

            JPanel consultationsPnl = new JPanel(new FlowLayout());
            backGroundClr(consultationsPnl);

            //Set All doctor buttons to add consultation
            int consutationCount = i;
            btns.get(i).addActionListener((e) -> {
                setVisible(false);

            });
            consultationsPnl.add(lbls.get(i));
            consultationsPnl.add(btns.get(i));
            for (JButton button : btns){
                button.setFont(new Font("SansSerif",Font.BOLD,15));
                button.setPreferredSize((new Dimension(400,30)));
                button.setBackground(Color.white);
                button.setForeground(Color.black);
            }

            consultationsOptionPnl.add(consultationsPnl);
//            if (manager..size()/2 != 0){
//                consultationsOptionPnl.add(consultationsPnl);
//            }else {
//                consultationsOptionPnl.add(consultationsPnl);
//            }

        }

        //Set Window
        MenuController(800,800,"View Consultations");

        //Set Window Name
        JPanel optionNamePnl = new JPanel(new FlowLayout());
        optionNameLbl = new JLabel("View Consultations");
        optionNameLbl.setFont(new Font("SansSerif",Font.BOLD,25));
        backGroundClr(optionNamePnl);
        optionNamePnl.add(optionNameLbl);
        add("North",optionNamePnl);

        //Set Consultation Details
        add("Center",consultationsOptionPnl);

        //Set Back Button
        JPanel backBtnPnl = new JPanel(new FlowLayout());
        backGroundClr(backBtnPnl);
        backBtn = new JButton("Back");
        btnSettings(backBtn);
        backBtn.setFont(new Font("SansSerif",Font.BOLD,15));
        backBtn.addActionListener((e) -> {
//            dispose();
//            new MainMenu(manager).setVisible(true);

        });
        backBtnPnl.add(backBtn);
        add("South",backBtnPnl);
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ViewConsultation().setVisible(true);
    }


}
