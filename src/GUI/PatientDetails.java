package GUI;

import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDetails extends MenuController{
    private JLabel NameLbl;
    private JLabel fName, lName, DOB, patientID, mobileNo, note, picAddMessage;

    private JTextField tFName, tLName, tYear, tMonth, tDay, tPatientID, tMobileNo;
    private JTextArea tNote;
    JButton addPatientBtn, addPicBtn, backBtn;

    public PatientDetails(SkinConsultantManager manager, int doctorNo){
        MenuController(800,800,"Add Patient Details");
        JPanel contentPnl = new JPanel(new GridLayout(7,1));
        add(contentPnl);

        //Name
        JPanel NamePnl = new JPanel(new FlowLayout());
        NameLbl = new JLabel("Add Patient Details");
        NameLbl.setFont(new Font("SansSerif",Font.BOLD,25));
        backGroundClr(NamePnl);
        NamePnl.add(NameLbl);
        contentPnl.add(NamePnl);

        //Name panel
        JPanel patientNamePnl = new JPanel(new GridLayout(1,2));
        contentPnl.add(patientNamePnl);

        //Input First Name
        JPanel fNamePnl = new JPanel(new FlowLayout());
        backGroundClr(fNamePnl);
        fName = new JLabel("First Name: ");
        fName.setFont(new Font("SansSerif",Font.BOLD,15));
        tFName = new JTextField(15);
        fNamePnl.add(fName);
        fNamePnl.add(tFName);

        //Input Last Name
        JPanel lNamePnl = new JPanel(new FlowLayout());
        backGroundClr(lNamePnl);
        lName = new JLabel("Last Name: ");
        lName.setFont(new Font("SansSerif",Font.BOLD,15));
        tLName = new JTextField(15);
        lNamePnl.add(lName);
        lNamePnl.add(tLName);

        patientNamePnl.add(fNamePnl);
        patientNamePnl.add(lNamePnl);

        //Input Date of Birth
        JPanel dobPnl = new JPanel(new FlowLayout());
        backGroundClr(dobPnl);
        DOB = new JLabel("Date of Birth ( YYYY | MM | DD ): ");
        DOB.setFont(new Font("SansSerif",Font.BOLD,15));
        tYear = new JTextField(4);
        tMonth = new JTextField(2);
        tDay = new JTextField(2);
        dobPnl.add(DOB);
        dobPnl.add(tYear);
        dobPnl.add(tMonth);
        dobPnl.add(tDay);
        contentPnl.add(dobPnl);

        //Input Patient Id
        JPanel pIdPnl = new JPanel(new FlowLayout());
        backGroundClr(pIdPnl);
        patientID = new JLabel("Patient NIC No: ");
        patientID.setFont(new Font("SansSerif",Font.BOLD,15));
        tPatientID = new JTextField(10);
        pIdPnl.add(patientID);
        pIdPnl.add(tPatientID);
        contentPnl.add(pIdPnl);

        //Input Mobile No
        JPanel mNoPnl = new JPanel(new FlowLayout());
        backGroundClr(mNoPnl);
        mobileNo = new JLabel("Mobile No: ");
        mobileNo.setFont(new Font("SansSerif",Font.BOLD,15));
        tMobileNo = new JTextField(12);
        mNoPnl.add(mobileNo);
        mNoPnl.add(tMobileNo);
        contentPnl.add(mNoPnl);

        //Add Extra details
        JPanel addExtraPnl = new JPanel(new GridLayout(1,2));
        contentPnl.add(addExtraPnl);

        //Add note
        JPanel notePnl = new JPanel(new FlowLayout());
        backGroundClr(notePnl);
        note = new JLabel("Special Note: ");
        note.setFont(new Font("SansSerif",Font.BOLD,15));
        tNote = new JTextArea(5,20);
        notePnl.add(note);
        notePnl.add(tNote);

        //Add picture Panel
        JPanel picPnl = new JPanel(new GridLayout(2,1));
        JPanel addPicBtnPnl = new JPanel(new FlowLayout());
        backGroundClr(addPicBtnPnl);
        addPicBtn = new JButton("Add Picture");
        addPicBtn.setFont(new Font("SansSerif",Font.BOLD,15));
        addPicBtn.setFocusable(false);
        addPicBtn.setBackground(Color.white);
        addPicBtn.setForeground(Color.black);
        addPicBtnPnl.add(addPicBtn);
        JPanel picMsgPnl = new JPanel(new FlowLayout());
        backGroundClr(picMsgPnl);
        picAddMessage = new JLabel("Picture added");
        picAddMessage.setFont(new Font("SansSerif",Font.BOLD,15));
        picMsgPnl.add(picAddMessage);
        picPnl.add(addPicBtnPnl);
        picPnl.add(picMsgPnl);


        addExtraPnl.add(notePnl);
        addExtraPnl.add(picPnl);

        //Button Panel
        JPanel btnPnl = new JPanel(new FlowLayout());
        backGroundClr(btnPnl);
        backBtn = new JButton("Back");
        btnSettings(backBtn);
        backBtn.addActionListener(e -> {
//                new AddConsultation(manager,docCount);
        });
        addPatientBtn = new JButton("Add Patient details");
        btnSettings(addPatientBtn);
        addPatientBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ConsultationAddAlert().setVisible(true);
            }
        });
        btnPnl.add(backBtn);
        btnPnl.add(addPatientBtn);
        contentPnl.add(btnPnl);


    }
//
//    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new PatientDetails().setVisible(true);
//    }
}
