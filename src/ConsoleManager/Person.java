package ConsoleManager;

import java.time.LocalDate;

public class Person {

    private String FName;
    private String LName;
    private String MobileNo;
    private LocalDate DOB;

    //getters
    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public  String getMobileNo() {
        return MobileNo;
    }

    public  LocalDate getDOB() {
        return DOB;
    }


    //setters
    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

}
