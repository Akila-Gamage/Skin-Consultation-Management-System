import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterSkinConsultantManager implements SkinConsultantManager {
    static ArrayList<Doctor> DoctorList = new ArrayList<Doctor>(2);

    public void addDoctor(){  // Add a new Doctor
        boolean docSize = (DoctorList.size() == 0) ? false : true;
        if (docSize) {
            String FName, LName, MobileNo, Speciality;
            LocalDate DOB;
            boolean loop = true;

            System.out.println("Add a new Doctor");

            System.out.println("Enter the First name of the doctor: ");
            FName = inputString();

            System.out.println("Enter the Last name of the doctor: ");
            LName = inputString();

            System.out.println("Enter the phone number of the doctor: ");
            MobileNo = inputString();
        }
    }
    public void deleteDoctor(){  //delete doctor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the doctor: ");
        String Name = sc.nextLine();
        for (int i = 0; i < DoctorList.size(); i++) {
            if (DoctorList.get(i).getFName().equals(Name)) {
                DoctorList.remove(i);
                System.out.println("Doctor deleted successfully!");
            }else {
                System.out.println("Doctor not found!");
            }
        }
    }
    public void displayDoctor(){
        for (int i = 0; i < DoctorList.size(); i++) {  //view all doctors
            System.out.println("First Name: " + DoctorList.get(i).getFName());
            System.out.println("Last Name: " + DoctorList.get(i).getLName());
            System.out.println("Mobile No: " + DoctorList.get(i).getMobileNo());
            System.out.println("Date of Birth: " + DoctorList.get(i).getDOB());
            System.out.println("Speciality: " + DoctorList.get(i).getSpeciality());
            System.out.println(" ");
        }
    }

    public void WriteToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("DoctorDetails.txt"));
            //for loop to write
            for (int x = 0; x < DoctorList.size(); x++) {
                //writing into file
                bw.write(String.valueOf(DoctorList.get(x)));
                //new line
                bw.newLine();
            }
            bw.close(); //Close
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }

    public int inputInt() {
        Scanner user = new Scanner(System.in);
        int input = 0;
        try {
            input = user.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        return input;
    }
    public String inputString() {
        Scanner user = new Scanner(System.in);
        String input = "";
        try {
            input = user.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        return input;
    }
    public int menu() {
        System.out.println("------------------------------------------------------");
        System.out.println("|   Welcome to Westminster Skin Consultant Manager   |");
        System.out.println("------------------------------------------------------");
        System.out.println("            [1] - Add a new Doctor");
        System.out.println("            [2] - Delete a Doctor");
        System.out.println("            [3] - Print all Doctors");
        System.out.println("            [4] - Save all Doctors to a file");
        System.out.println("            [5] - Exit");
        System.out.println("------------------------------------------------------");
        System.out.println("Enter your choice: ");
        int menuNumber = inputInt();
        return menuNumber;
    }
    public static void main(String[] args) {
        WestminsterSkinConsultantManager SkinConsultantManager = new WestminsterSkinConsultantManager();
        boolean loop = true;
        do{
            int menuNumber = SkinConsultantManager.menu();
            switch (menuNumber) {
                case 1:
                    SkinConsultantManager.addDoctor();
                    break;
                case 2:
                    SkinConsultantManager.deleteDoctor();
                    break;
                case 3:
                    SkinConsultantManager.displayDoctor();
                    break;
                case 4:
                    SkinConsultantManager.WriteToFile();
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }while (loop);

    }


}


