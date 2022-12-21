package ConsoleManager;

import java.time.LocalDate;

public abstract class Person {

    public static String FName;
    public static String LName;
    public static String MobileNo;
    public static LocalDate DOB;

    //getters
    public static String getFName() {
        return FName;
    }

    public static String getLName() {
        return LName;
    }

    public  static String getMobileNo() {
        return MobileNo;
    }

    public static LocalDate getDOB() {
        return DOB;
    }



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
