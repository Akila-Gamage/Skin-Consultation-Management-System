package GUI;

import ConsoleManager.Consultation;
import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ViewConsultationDetails extends MenuController{

    private JLabel NameLbl, ConsultationNameLbl;

    private JButton okBtn;
    private JLabel fName, lName, DOB, patientID, mobileNo, note, Date, Time, ReqTime, Cost ,vFName, vLName, vDOB, vPatientID, vMobileNo, vNote, vDate, vTime, vReqTime, vCost;

    public ViewConsultationDetails(Consultation consultation){

        MenuController(800,800,"View Patient Details");
        JPanel contentPnl = new JPanel(new GridLayout(10,1));
        add(contentPnl);

        //Name
        JPanel NamePnl = new JPanel(new FlowLayout());
        NameLbl = new JLabel("View Patient Details");
        NameLbl.setFont(new Font("SansSerif",Font.BOLD,25));
        backGroundClr(NamePnl);
        NamePnl.add(NameLbl);
        contentPnl.add(NamePnl);

        //Name panel
        JPanel patientNamePnl = new JPanel(new GridLayout(1,2));
        contentPnl.add(patientNamePnl);

        //View First Name
        JPanel fNamePnl = new JPanel(new FlowLayout());
        backGroundClr(fNamePnl);
        fName = new JLabel("First Name: ");
        fName.setFont(new Font("SansSerif",Font.BOLD,15));
        vFName = new JLabel();
        vFName.setText(consultation.getPatient().getFName());
        viewDetailsLbl(vFName);
        fNamePnl.add(fName);
        fNamePnl.add(vFName);

        //View Last Name
        JPanel lNamePnl = new JPanel(new FlowLayout());
        backGroundClr(lNamePnl);
        lName = new JLabel("Last Name: ");
        lName.setFont(new Font("SansSerif",Font.BOLD,15));
        vLName = new JLabel();
        vLName.setText(consultation.getPatient().getLName());
        viewDetailsLbl(vLName);
        lNamePnl.add(lName);
        lNamePnl.add(vLName);

        patientNamePnl.add(fNamePnl);
        patientNamePnl.add(lNamePnl);

        //View Date of Birth
        JPanel dobPnl = new JPanel(new FlowLayout());
        backGroundClr(dobPnl);
        DOB = new JLabel("Date of Birth ( YYYY | MM | DD ): ");
        DOB.setFont(new Font("SansSerif",Font.BOLD,15));
        vDOB = new JLabel();

        LocalDate localDate = consultation.getPatient().getDOB();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringDOB = localDate.format(formatter);

        vDOB.setText(stringDOB);
        viewDetailsLbl(vDOB);
        dobPnl.add(DOB);
        contentPnl.add(dobPnl);

        //View Patient ID
        JPanel pIdPnl = new JPanel(new FlowLayout());
        backGroundClr(pIdPnl);
        patientID = new JLabel("Patient NIC No: ");
        patientID.setFont(new Font("SansSerif",Font.BOLD,15));
        vPatientID = new JLabel();
        vPatientID.setText(consultation.getPatient().getPatientID());
        viewDetailsLbl(vPatientID);
        pIdPnl.add(patientID);
        pIdPnl.add(vPatientID);
        contentPnl.add(pIdPnl);

        //View Mobile No
        JPanel mNoPnl = new JPanel(new FlowLayout());
        backGroundClr(mNoPnl);
        mobileNo = new JLabel("Mobile No: ");
        mobileNo.setFont(new Font("SansSerif",Font.BOLD,15));
        vMobileNo = new JLabel();
        vMobileNo.setText(consultation.getPatient().getMobileNo());
        viewDetailsLbl(vMobileNo);
        mNoPnl.add(mobileNo);
        mNoPnl.add(vMobileNo);
        contentPnl.add(mNoPnl);

        //View Extra details
        JPanel addExtraPnl = new JPanel(new GridLayout(1,2));


        //View note
        JPanel notePnl = new JPanel(new FlowLayout());
        backGroundClr(notePnl);
        note = new JLabel("Special Note: ");
        note.setFont(new Font("SansSerif",Font.BOLD,15));
        vNote = new JLabel("");
        viewDetailsLbl(vNote);
        notePnl.add(note);
        notePnl.add(vNote);
        addExtraPnl.add(notePnl);

        contentPnl.add(addExtraPnl);

        //Consultation Details Panel
        JPanel consultationDetailsPnl = new JPanel(new FlowLayout());
        backGroundClr(consultationDetailsPnl);
        ConsultationNameLbl = new JLabel("Consultation Details of the Patient: ");
        ConsultationNameLbl.setFont(new Font("SansSerif",Font.BOLD,20));
        consultationDetailsPnl.add(ConsultationNameLbl);
        contentPnl.add(consultationDetailsPnl);

        JPanel cPanel = new JPanel(new GridLayout(2,2));
        contentPnl.add(cPanel);

        //Date
        JPanel dateDetails = new JPanel(new FlowLayout());
        backGroundClr(dateDetails);
        Date = new JLabel("Consultation Date: ");
        Date.setFont(new Font("SansSerif",Font.BOLD,15));
        vDate = new JLabel();
        vDate.setText(consultation.getDate());
        viewDetailsLbl(vDate);
        dateDetails.add(Date);
        dateDetails.add(vDate);
        cPanel.add(dateDetails);

        //Time
        JPanel timeDetails = new JPanel(new FlowLayout());
        backGroundClr(timeDetails);
        Time = new JLabel("Consultation Time: ");
        Time.setFont(new Font("SansSerif",Font.BOLD,15));
        vTime = new JLabel();
        vTime.setText(consultation.getTime()+":00");
        viewDetailsLbl(vTime);
        timeDetails.add(Time);
        timeDetails.add(vTime);
        cPanel.add(timeDetails);

        //Requested Time
        JPanel reqTimeDetails = new JPanel(new FlowLayout());
        backGroundClr(reqTimeDetails);
        ReqTime = new JLabel("Requested Time: ");
        ReqTime.setFont(new Font("SansSerif",Font.BOLD,15));
        vReqTime = new JLabel();
        vReqTime.setText(String.valueOf(consultation.getRequestedTime()) + " hours");
        viewDetailsLbl(vReqTime);
        reqTimeDetails.add(ReqTime);
        reqTimeDetails.add(vReqTime);
        cPanel.add(reqTimeDetails);

        //Cost
        JPanel costPnl = new JPanel(new FlowLayout());
        backGroundClr(costPnl);
        Cost = new JLabel("Cost: ");
        Cost.setFont(new Font("SansSerif",Font.BOLD,15));
        vCost = new JLabel();
        vCost.setText("£ "+String.valueOf(consultation.getCost()));
        viewDetailsLbl(vCost);
        costPnl.add(Cost);
        costPnl.add(vCost);
        cPanel.add(costPnl);

        JPanel blankPnl = new JPanel(new FlowLayout());
        backGroundClr(blankPnl);
        contentPnl.add(blankPnl);

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
