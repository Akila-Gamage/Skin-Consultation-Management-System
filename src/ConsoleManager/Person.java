package ConsoleManager;

import java.time.LocalDate;

public abstract class Person {

    public abstract String getFName();
    public abstract String getLName();
    public abstract String getMobileNo();
    public abstract LocalDate getDOB();


    public abstract void setFName(String FName);
    public abstract void setLName(String LName);
    public abstract void setMobileNo(String mobileNo);
    public abstract void setDOB(LocalDate DOB);


}
