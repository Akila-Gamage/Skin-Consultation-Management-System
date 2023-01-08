package ConsoleManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends Person {
    private String Speciality;
    private String MedicalID;
    private ArrayList<Consultation> consultations = new ArrayList<>();

    public Doctor(String MedicalID ,String FName, String LName, String MobileNo, LocalDate DOB, String Speciality){
        this.MedicalID = MedicalID;
        setFName(FName);
        setLName(LName);
        setMobileNo(MobileNo);
        setDOB(DOB);
        this.Speciality = Speciality;
    }

    public void addConsultation(Consultation consultation){
        consultations.add(consultation);
    }


    //getters
    public String getSpeciality() {
        return Speciality;
    }
    public String getMedicalID() {
        return MedicalID;
    }
    public ArrayList<Consultation> getConsultationsArrayList(){return this.consultations;}

    public Consultation getConsultation(int position){
        return consultations.get(position);
    }


    //setters

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
    public void setMedicalID(String medicalID) {
        MedicalID = medicalID;
    }


}
