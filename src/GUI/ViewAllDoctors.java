package GUI;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class ViewAllDoctors extends MenuController {

    public ViewAllDoctors(SkinConsultantManager manager) {
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        for (int i = 0; i < manager.getDoctorArray().size(); i++) {
            doctorArrayList.add(manager.getDoctorArrayObj(i));
        }
        MenuController(800, 800, "View all Doctors");

        JPanel nameTitlePnl = new JPanel(new FlowLayout());
        JLabel tableName = new JLabel("View Doctor Details");
        tableName.setFont(new Font("Arial", Font.BOLD, 25));
        nameTitlePnl.add(tableName);
        add("North", nameTitlePnl);

        JPanel tablePnl = new JPanel(new FlowLayout());
        tablePnl.add(table(doctorArrayList));
        add("Center",tablePnl);

        JPanel backPnl = new JPanel(new FlowLayout());
        JButton backBtn = new JButton();
        backBtn.addActionListener((e) -> {
            dispose();
//            new MainMenu();
        });
        Button(backBtn, "Back");
        backPnl.add(backBtn);
        add("South",backPnl);
    }

    public JPanel table(ArrayList<Doctor> doctorArrayList) {
        JPanel tablePanel = new JPanel(new FlowLayout());
        String[] columnName = {"First Name", "Last Name", "Medical Id", "Date of Birth", "Mobile no", "Speciality"};
        String[][] data = new String[doctorArrayList.size()][columnName.length];

        for (int i = 0; i < doctorArrayList.size(); i++) {
            for (int j = 0; j < columnName.length; j++) {
                if (j == 0) {
                    data[i][j] = doctorArrayList.get(i).getFName();
                } else if (j == 1) {
                    data[i][j] = doctorArrayList.get(i).getLName();
                } else if (j == 2) {
                    data[i][j] = doctorArrayList.get(i).getMedicalID();
                } else if (j == 3) {
                    data[i][j] = String.valueOf(doctorArrayList.get(i).getDOB());
                } else if (j == 4) {
                    data[i][j] = doctorArrayList.get(i).getMobileNo();
                } else {
                    data[i][j] = doctorArrayList.get(i).getSpeciality();
                }
            }
        }
        JTable table = new JTable(data,columnName);
        JScrollPane sc = new JScrollPane(table);
        tablePanel.add(sc);

        return tablePanel;
    }




}







