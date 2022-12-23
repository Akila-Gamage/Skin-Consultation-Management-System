package ConsoleManager;

import java.util.ArrayList;

public interface SkinConsultantManager {
    void addDoctor();
    void deleteDoctor();
    void displayDoctor();
    void WriteToFile();
    public Doctor getDoctorArrayObj(int position);
    public ArrayList<Doctor> getDoctorArray();

}
