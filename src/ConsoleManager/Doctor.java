package ConsoleManager;

import ConsoleManager.Consultation;

import java.time.LocalDate;

public class Doctor extends Person {
    public static String Speciality;

    public static String MedicalID;


    private Consultation consultation = new Consultation();
    public Doctor(String MedicalID ,String FName, String LName, String MobileNo, LocalDate DOB, String Speciality){
        super();
        this.MedicalID = MedicalID;
        this.FName = FName;
        this.LName = LName;
        this.MobileNo = MobileNo;
        this.DOB = DOB;
        this.Speciality = Speciality;
    }

    //getters

    public static String getSpeciality() {
        return Speciality;
    }
    public static String getMedicalID() {
        return MedicalID;
    }

    //setters

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
    public void setMedicalID(String medicalID) {
        MedicalID = medicalID;
    }
}
