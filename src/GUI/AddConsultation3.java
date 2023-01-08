//package GUI;
//
//import ConsoleManager.Consultation;
//import ConsoleManager.Patient;
//import ConsoleManager.SkinConsultantManager;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//public class AddConsultation extends JFrame {
//
//    private int hourCount = 0;
//    private int minuteCount = 0;
//    private Patient patient;
//    private Consultation consultation;
//    private boolean checkId = true;
//
//    public AddConsultation(SkinConsultantManager manager, int doctorsPosition){
//
//        //Set Window
//        ViewLayout(800,800,"Add New Consultation");
//
//        //Set window name
//        JPanel formPnl = new JPanel(new FlowLayout());
//        JLabel formName = new JLabel("Add New Consultation - Fill the form");
//        formName.setFont(new Font("SansSarif",1,25));
//        formPnl.add(formName);
//        add("North",formPnl);
//
//    }
//
//    private void ViewLayout(int width, int height, String title){
//        setSize(width,height);
//        setTitle(title);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setResizable(false);
//        setLayout(new BorderLayout());
//    }
//
////    private boolean checkDoctorAvailability (SkinConsultantManager manager, int position, LocalDate date, LocalTime startTime, LocalTime endTime){
////        boolean output = true;
////
////        for (int i = 0; i < manager.getDoctorArrayObj(position).getConsultationsArrayList().size(); i++) {
////            if (manager.getDoctorArrayObj(position).getConsultation().getDate().equals(date)){
////                if (startTime.compareTo(manager.getDoctorArrayObj(position).getConsultation(i).getStartTime())!=0){
////
////                }
////            }
////
////        }
////    }
//
//
//    private JPanel consultationScreen(SkinConsultantManager manager, int doctorPosition){
//        //Get Date and Time
//        JPanel dateAndTimePnl = new JPanel(new GridLayout(8,1));
//
//        //Get Date
//        JPanel datePnl = new JPanel(new FlowLayout());
//        JLabel dateLbl = new JLabel("Date");
//        dateLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        datePnl.add(dateLbl);
//
//        JLabel yearLbl = new JLabel("Year");
//        yearLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        datePnl.add(yearLbl);
//        JTextField yearTxt = new JTextField(5);
//        yearTxt.setFont(new Font("SansSerif",Font.BOLD,12));
//        datePnl.add(yearTxt);
//
//        JLabel monthLbl = new JLabel("Month");
//        monthLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        datePnl.add(monthLbl);
//        JTextField monthTxt = new JTextField(5);
//        monthTxt.setFont(new Font("SansSerif",Font.BOLD,12));
//        datePnl.add(monthTxt);
//
//        JLabel dayLbl = new JLabel("Date");
//        dayLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        datePnl.add(dayLbl);
//        JTextField dayTxt = new JTextField(5);
//        dayTxt.setFont(new Font("SansSerif",Font.BOLD,12));
//        datePnl.add(dayTxt);
//        dateAndTimePnl.add(datePnl);
//
//        //Get Time
//        JPanel startTimePnl = new JPanel(new FlowLayout());
//
//        JLabel startTimeLbl = new JLabel("   Time To Start");
//        startTimeLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        startTimePnl.add(startTimeLbl);
//
//        JLabel startHoursLbl = new JLabel("Hours");
//        startHoursLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        startTimePnl.add(startHoursLbl);
//        JTextField startHoursTxt = new JTextField(5);
//        startHoursTxt.setFont(new Font("SansSerif",Font.BOLD,12));
//        startTimePnl.add(startHoursTxt);
//
//        String[] minits = {" 00 ", " 15 ", " 30 ", " 45 "};
//        JComboBox<String> selectMinutes1 = new JComboBox<>(minits);
//        selectMinutes1.setFont(new Font("SansSerif",Font.BOLD,12));
//        startTimePnl.add(selectMinutes1);
//        dateAndTimePnl.add(startTimePnl);
//
//        //Time Select
//        JPanel timePnl = new JPanel(new FlowLayout());
//
//        JLabel timeCountLbl = new JLabel("Enter Time You Want Hours");
//        timeCountLbl.setFont(new Font("SansSerif",Font.BOLD,14));
//        timePnl.add(timeCountLbl);
//        JTextField timeCountTxt = new JTextField(3);
//        timeCountTxt.setFont(new Font("SansSerif",Font.BOLD,12));
//        timePnl.add(timeCountTxt);
//
//        JComboBox<String> selectMinutes2 = new JComboBox<>(minits);
//        selectMinutes2.setFont(new Font("SansSerif",Font.BOLD,12));
//        timePnl.add(selectMinutes2);
//        dateAndTimePnl.add(timePnl);
//
//        //Cost
//        JPanel costPnl = new JPanel(new FlowLayout());
//        JLabel costLbl = new JLabel("Cost :- ");
//        costLbl.setFont(new Font("SansSerif",Font.BOLD,12));
//        costLbl.setEnabled(false);
//        costPnl.add(costLbl);
//        dateAndTimePnl.add(costPnl);
//
//        //Note
//        JPanel notePnl= new JPanel(new GridLayout(1,3));
//        notePnl.add(new JLabel(""));
//        JTextArea noteTxtAr = new JTextArea();
//        noteTxtAr.setFont(new Font("SansSerif",Font.BOLD,12));
//        JScrollPane noteSP = new JScrollPane(noteTxtAr);
//        noteSP.setBorder(BorderFactory.createTitledBorder("Note"));
//        notePnl.add(noteSP);
//        notePnl.add(new JLabel(""));
//        dateAndTimePnl.add(notePnl);
//
//        //Button And Warning Label
//        JPanel btnPnl = new JPanel(new FlowLayout());
//        JPanel warningPnl = new JPanel(new FlowLayout());
//        JButton submitBtn = new JButton("Submit");
//        JLabel warningLbl = new JLabel();
//        warningLbl.setFont(new Font("SansSerif",Font.BOLD,16));
//        submitBtn.addActionListener((e) -> {
//            LocalDate consultationDate;
//            LocalTime consultationStartTime;
//            LocalTime consultationEndTime;
//
//
//        });
//   return }
// }

