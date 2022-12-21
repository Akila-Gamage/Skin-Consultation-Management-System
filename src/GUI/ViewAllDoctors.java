package GUI;

import ConsoleManager.Doctor;
import ConsoleManager.WestminsterSkinConsultantManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class ViewAllDoctors extends MenuController {
    JTable DoctorTable ;
    Doctor[] doctorList;

    public ViewAllDoctors(){
        MenuController(800,600,"View all Doctors");
        setVisible(true);

        String[] columnIncludes = {"Medical ID","First Name","Last Name","Mobile No","Date off Birth","Specialty"};
        DefaultTableModel tablemodel = new DefaultTableModel(columnIncludes,0);
        DoctorTable = new JTable(tablemodel);
        DoctorTable.setBounds(30,40,200,400);

        for (Doctor DoctorList : doctorList){
            String[] details = {Doctor.getMedicalID(),Doctor.getFName(),Doctor.getLName(), String.valueOf(Doctor.getDOB()),Doctor.getSpeciality()};
            tablemodel.addRow(details);
        }
//        String[][] details ={
//            {"B065", "Emma", "Fajs", "1234567890", "2001-01-01", "heart"},
//            {"M034", "Olivia", "Fdsad", "1234567890", "2001-01-01",  "heart"}
//        };
//        tablemodel.addRow(details);

        JScrollPane sp = new JScrollPane(DoctorTable);
        add(sp);

    }

}







