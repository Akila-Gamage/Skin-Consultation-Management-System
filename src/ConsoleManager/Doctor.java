package ConsoleManager;

import ConsoleManager.Consultation;

import java.time.LocalDate;

public class Doctor extends Person {
    private String FName;
    private String LName;
    private String MobileNo;
    private LocalDate DOB;
    public String Speciality;

    public String MedicalID;


    private Consultation consultation = new Consultation();
    public Doctor(String MedicalID ,String FName, String LName, String MobileNo, LocalDate DOB, String Speciality){
        this.MedicalID = MedicalID;
        this.FName = FName;
        this.LName = LName;
        this.MobileNo = MobileNo;
        this.DOB = DOB;
        this.Speciality = Speciality;
    }

    //getters
    @Override
    public String getFName() {
        return FName;
    }
    @Override
    public String getLName() {
        return LName;
    }
    @Override
    public String getMobileNo() {
        return MobileNo;
    }
    @Override
    public LocalDate getDOB() {
        return DOB;
    }
    public String getSpeciality() {
        return Speciality;
    }
    public String getMedicalID() {
        return MedicalID;
    }

    //setters
    @Override
    public void setFName(String FName) {
        this.FName = FName;
    }
    @Override
    public void setLName(String LName) {
        this.LName = LName;
    }
    @Override
    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }
    @Override
    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
    public void setMedicalID(String medicalID) {
        MedicalID = medicalID;
    }
}
