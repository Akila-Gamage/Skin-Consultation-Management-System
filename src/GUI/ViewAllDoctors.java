package GUI;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ViewAllDoctors extends MenuController {
    private JButton sortBtn;
    private JButton backBtn;
    private JTable doctorTable;

    public ViewAllDoctors(SkinConsultantManager manager) {
        //Set window
        MenuController(800, 800, "View all Doctors");

        //Set Window Name
        JPanel nameTitlePnl = new JPanel(new FlowLayout());
        JLabel tableName = new JLabel("View Doctor Details");
        tableName.setFont(new Font("SansSerif", Font.BOLD, 25));
        nameTitlePnl.add(tableName);
        backGroundClr(nameTitlePnl);
        add("North", nameTitlePnl);

        //Get a copy of doctor Array list
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        for (int i = 0; i < manager.getDoctorArray().size(); i++) {
            doctorArrayList.add(manager.getDoctorArrayObj(i));
        }

        //Set Doctor Table
        JScrollPane tablePnl = new JScrollPane(table(doctorArrayList));
        JScrollPane sortPnl = new JScrollPane(sortTable(doctorArrayList));
//        JPanel tablePnl = new JPanel(new FlowLayout());
//        tablePnl.add(table(doctorArrayList));
        add("Center",tablePnl);

        //Set sort Button
        sortBtn = new JButton("Sort Table");
        btnSettings(sortBtn);
        sortBtn.setFont(new Font("SansSerif",Font.BOLD,15));
        sortBtn.addActionListener((e) -> {
            setVisible(false);
            remove(tablePnl);
            add("Center",sortPnl);
            setVisible(true);
        });

        //Set Refresh Button

        //Set Back Button
        backBtn = new JButton("Back");
        btnSettings(backBtn);
        backBtn.setFont(new Font("SansSerif",Font.BOLD,15));
        backBtn.addActionListener((e) -> {
            dispose();
            new MainMenu(manager).setVisible(true);

        });


        JPanel buttonPnl = new JPanel(new FlowLayout());
        buttonPnl.add(sortBtn);
        buttonPnl.add(backBtn);
        backGroundClr(buttonPnl);
        add("South",buttonPnl);
    }

    //Set Doctor List
    private JTable table(ArrayList<Doctor> doctorArrayList) {
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

        //Set Table
        doctorTable = new JTable(data,columnName);

        //Set data Font
        doctorTable.setFont(new Font("SansSerif",Font.BOLD,15));

        //Set column name Font
        doctorTable.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,15));

        return doctorTable;
    }


    //Set sorted(to the first name) Doctor List
    private JTable sortTable(ArrayList<Doctor> doctorArrayList) {
        String[] columnName = {"First Name", "Last Name", "Medical Id", "Date of Birth", "Mobile no", "Speciality"};
        String[][] data = new String[doctorArrayList.size()][columnName.length];

        //Sort Names
        for (int i = 0; i < doctorArrayList.size(); i++) {
            for (int j = i+1; j < doctorArrayList.size(); j++) {
                if (doctorArrayList.get(i).getFName().compareToIgnoreCase(doctorArrayList.get(j).getFName())>0){
                    Doctor temp = doctorArrayList.get(i);
                    doctorArrayList.set(i,doctorArrayList.get(j));
                    doctorArrayList.set(j,temp);
                }
            }
        }

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

        //Set Table
        doctorTable = new JTable(data,columnName);

        //Set data Font
        doctorTable.setFont(new Font("SansSerif",Font.BOLD,15));

        //Set column name Font
        doctorTable.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,15));

        return doctorTable;

    }


}







