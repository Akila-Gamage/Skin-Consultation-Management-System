package GUI;

import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddConsultation extends MenuController{
    private JLabel NameLbl, returnLbl;
    private JLabel dateLbl, timeLbl, requestedTimeLbl;
    private JTextField year, month, day, startTime, requestedTimeField;

    private JButton backBtn, checkBtn;

    public AddConsultation(SkinConsultantManager manager, int doctorCount){
        MenuController(800,600,"Add New Consultation");
        JPanel contentPnl= new JPanel(new GridLayout(6,1));
        add(contentPnl);

        //Window Name
        JPanel NamePnl = new JPanel(new FlowLayout());
        NameLbl = new JLabel("Add New Consultation - Enter the following details");
        NameLbl.setFont(new Font("SansSerif",Font.BOLD,25));
        backGroundClr(NamePnl);
        NamePnl.add(NameLbl);
        contentPnl.add(NamePnl);

        //Input Date
        JPanel datePnl = new JPanel(new FlowLayout());
        backGroundClr(datePnl);
        dateLbl = new JLabel("Date ( YYYY|MM|DD ): ");
        dateLbl.setFont(new Font("SansSerif",Font.BOLD,15));
        year = new JTextField(4);
        month = new JTextField(2);
        day = new JTextField(2);
        datePnl.add(dateLbl);
        datePnl.add(year);
        datePnl.add(month);
        datePnl.add(day);
        contentPnl.add(datePnl);

        //Add Time
        JPanel timePnl = new JPanel(new FlowLayout());
        backGroundClr(timePnl);
        timeLbl = new JLabel("Time (24H time): ");
        timeLbl.setFont(new Font("SansSerif",Font.BOLD,15));
        startTime = new JTextField(3);
        timePnl.add(timeLbl);
        timePnl.add(startTime);
        contentPnl.add(timePnl);

        //Input Requested time Panel
        JPanel rTimePnl = new JPanel(new FlowLayout());
        backGroundClr(rTimePnl);
        requestedTimeLbl = new JLabel("Requested time for the consultation (Hours)");
        requestedTimeLbl.setFont(new Font("SansSerif",Font.BOLD,15));
        requestedTimeField = new JTextField(2);
        rTimePnl.add(requestedTimeLbl);
        rTimePnl.add(requestedTimeField);
        contentPnl.add(rTimePnl);

        //Return Information
        JPanel returnPnl = new JPanel(new FlowLayout());
        backGroundClr(returnPnl);
        JLabel returnLbl = new JLabel("");
        returnLbl.setFont(new Font("SansSerif",Font.BOLD,15));
        returnPnl.add(returnLbl);
        contentPnl.add(returnPnl);

        //Button Panel
        JPanel btnPnl = new JPanel(new FlowLayout());
        backGroundClr(btnPnl);
        backBtn = new JButton("Back");
        btnSettings(backBtn);
        backBtn.addActionListener((e) -> {
            setVisible(false);
            new NewConsultation(manager).setVisible(true);
        });
        checkBtn = new JButton("Check");
        checkBtn.addActionListener((e) -> checkBtnOnAction());
        btnSettings(checkBtn);
        btnPnl.add(backBtn);
        btnPnl.add(checkBtn);
        contentPnl.add(btnPnl);


    }
    private void checkBtnOnAction(){
        if (!year.getText().equals("") && !month.getText().equals("") && !day.getText().equals("")){
            if (!startTime.getText().equals("")){
                if (!requestedTimeField.getText().equals("")){
                    returnLbl.setText("Data entered correctly");
                }else {
                    returnLbl.setText("Input request time correctly");
                }
            }else {
                returnLbl.setText("Input time correctly");
            }
        }else {
            returnLbl.setText("Input date correctly");
        }
    }

}
