package GUI;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NewConsultation extends MenuController{
    private JButton backBtn;
    private JLabel optionNameLbl;
    private ArrayList<JButton> btns = new ArrayList<>();
    private ArrayList<JLabel> lbls = new ArrayList<>();

    public NewConsultation(SkinConsultantManager manager){
        JPanel doctorsNameOptionPnl = new JPanel(new GridLayout(10,1));
        backGroundClr(doctorsNameOptionPnl);

        for (int i = 0; i < manager.getDoctorArray().size(); i++) {
            for (int j = 0; j < 1; j++) {
                lbls.add(new JLabel("["+(i+1)+"]"));
                btns.add(new JButton("Dr. "+manager.getDoctorArray().get(i).getFName()+" | "+manager.getDoctorArray().get(i).getSpeciality()+" | "+manager.getDoctorArray().get(i).getMedicalID()));
            }

            JPanel doctorsPnl = new JPanel(new FlowLayout());
            backGroundClr(doctorsPnl);

            //Set All doctor buttons to add consultation
            int doctorPostion = i;
            btns.get(i).addActionListener((e) -> {
                    setVisible(false);
                    new AddConsultation(manager,doctorPostion).setVisible(true);});
            doctorsPnl.add(lbls.get(i));
            doctorsPnl.add(btns.get(i));
            for (JButton button : btns){
                button.setFont(new Font("SansSerif",Font.BOLD,15));
                button.setPreferredSize((new Dimension(400,30)));
                button.setBackground(Color.white);
                button.setForeground(Color.black);
            }


            if (manager.getDoctorArray().size()/2 != 0){
                doctorsNameOptionPnl.add(doctorsPnl);
            }else {
                doctorsNameOptionPnl.add(doctorsPnl);
            }
        }
        //Set Window
        MenuController(800,800,"Add Consultation");

        //Set Window Name
        JPanel optionNamePnl = new JPanel(new FlowLayout());
        optionNameLbl = new JLabel("Add Consultation");
        optionNameLbl.setFont(new Font("SansSerif",Font.BOLD,25));
        backGroundClr(optionNamePnl);
        optionNamePnl.add(optionNameLbl);
        add("North",optionNamePnl);

        //Set DoctorDetails
        add("Center",doctorsNameOptionPnl);

        //Set Back Button
        JPanel backBtnPnl = new JPanel(new FlowLayout());
        backGroundClr(backBtnPnl);
        backBtn = new JButton("Back");
        btnSettings(backBtn);
        backBtn.setFont(new Font("SansSerif",Font.BOLD,15));
        backBtn.addActionListener((e) -> {
            dispose();
            new MainMenu(manager).setVisible(true);

        });
        backBtnPnl.add(backBtn);
        add("South",backBtnPnl);

    }


}
