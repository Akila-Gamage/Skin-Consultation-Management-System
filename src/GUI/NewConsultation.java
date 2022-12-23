package GUI;

import ConsoleManager.Doctor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class NewConsultation extends MenuController{
    JButton backbtn;
    JButton AddConsultationbtn;
    JTable DoctorTable ;
    public NewConsultation(){
        MenuController(800,600,"Add new consultation");
        setVisible(true);

        String[] columnIncludes = {"Medical ID","First Name","Last Name","Mobile No","Date off Birth","Specialty"};
        DefaultTableModel tablemodel = new DefaultTableModel(columnIncludes,0);
        DoctorTable = new JTable(tablemodel);
        DoctorTable.setBounds(30,40,200,400);

//        for (Doctor ignored : doctorList){
//            String[] details = {Doctor.getMedicalID(),Doctor.getFName(),Doctor.getLName(), String.valueOf(Doctor.getDOB()),Doctor.getSpeciality()};
//            tablemodel.addRow(details);
//        }
        JScrollPane sp = new JScrollPane(DoctorTable);

        JPanel btnpnl = new JPanel();
        btnpnl.setBounds(0,0,80,80);
        backbtn = new JButton();
        Button(backbtn,"Back");
        btnpnl.add(backbtn);

        AddConsultationbtn = new JButton();
        Button(AddConsultationbtn,"Add New Consultation");
        btnpnl.add(AddConsultationbtn);



        this.add(sp, BorderLayout.NORTH);
        this.add(btnpnl,BorderLayout.SOUTH);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==backbtn){
//            this.setVisible(false);
//            new MainMenu().setVisible(true);
//        } else if (e.getSource()==AddConsultationbtn) {
//            this.dispose();
//            new AddConsultation();
//
//        }
//    }
}
