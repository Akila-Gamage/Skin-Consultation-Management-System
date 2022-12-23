package ConsoleManager;

import ConsoleManager.Consultation;

import java.time.LocalDate;

public class Doctor extends Person {
    private String Speciality;
    private static String MedicalID;


    private Consultation consultation = new Consultation();
    public Doctor(String MedicalID ,String FName, String LName, String MobileNo, LocalDate DOB, String Speciality){
        this.MedicalID = MedicalID;
        setFName(FName);
        setLName(LName);
        setMobileNo(MobileNo);
        setDOB(DOB);
        this.Speciality = Speciality;
    }

    //getters

    public String getSpeciality() {
        return Speciality;
    }
    public String getMedicalID() {
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
