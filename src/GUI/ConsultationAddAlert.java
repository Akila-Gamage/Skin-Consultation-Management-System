package GUI;

import ConsoleManager.Consultation;
import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultationAddAlert extends MenuController{
    private JLabel feedbackMsg;
    private JButton okBtn;

    public ConsultationAddAlert(Consultation consultation){
        MenuController(300,150,"Alert!");

        JPanel contentPnl = new JPanel(new GridLayout(2,1));
        add(contentPnl);

        //Add Feedback Message
        JPanel msgPnl = new JPanel(new FlowLayout());
        backGroundClr(msgPnl);
        feedbackMsg = new JLabel(" Patient Added Successfully! ");
        feedbackMsg.setFont(new Font("SansSerif",Font.BOLD,15));
        msgPnl.add(feedbackMsg);
        contentPnl.add(msgPnl);

        //Add Continue Button
        JPanel btnPnl = new JPanel(new FlowLayout());
        backGroundClr(btnPnl);
        okBtn = new JButton("Done");
        okBtn.addActionListener(e -> {
            dispose();
        });
        btnSettings(okBtn);
        btnPnl.add(okBtn);
        contentPnl.add(btnPnl);

    }


}
