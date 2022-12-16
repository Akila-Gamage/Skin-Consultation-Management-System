public class Doctor extends Person {
    private String FName;
    private String LName;
    private String MobileNo;
    private String DOB;
    public String Speciality;


    private Consultation consultation = new Consultation();
    public Doctor(String FName, String LName, String MobileNo, String DOB, String Speciality){
        this.FName = FName;
        this.LName = LName;
        this.MobileNo = MobileNo;
        this.DOB = DOB;
        this.Speciality = Speciality;
    }

    @Override
    public String getFName() {
        return FName;
    }

    @Override
    public void setFName(String FName) {
        this.FName = FName;
    }

    @Override
    public String getLName() {
        return LName;
    }

    @Override
    public void setLName(String LName) {
        this.LName = LName;
    }

    @Override
    public String getMobileNo() {
        return MobileNo;
    }

    @Override
    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    @Override
    public String getDOB() {
        return DOB;
    }

    @Override
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
