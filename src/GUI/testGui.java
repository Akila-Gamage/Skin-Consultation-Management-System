package GUI;

import ConsoleManager.Doctor;
import ConsoleManager.SkinConsultantManager;
import ConsoleManager.WestminsterSkinConsultantManager;

import java.time.LocalDate;
import java.util.ArrayList;


public class testGui {
    public static void main(String[] args) {
        WestminsterSkinConsultantManager w = new WestminsterSkinConsultantManager();
        LocalDate DOB = LocalDate.parse("2001-01-01");
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.setDoctorList(new Doctor("sdsd","dwd","dsad","2321423", DOB,"heart"));
        w.openGUI();
    }
}
