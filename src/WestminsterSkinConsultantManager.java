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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name of the doctor: ");
        String FName = sc.nextLine();
        System.out.println("Enter the Last name of the doctor: ");
        String LName = sc.nextLine();
        System.out.println("Enter the phone number of the doctor: ");
        String MobileNo = sc.nextLine();
        System.out.println("Enter the Date of birth of the doctor: ");
        LocalDate DOB = LocalDate.parse(sc.nextLine());
        System.out.println("Enter the speciality of the doctor: ");
        String Speciality = sc.nextLine();
        Doctor doctor = new Doctor(FName, LName, MobileNo, DOB, Speciality);
        System.out.println("Doctor added successfully!");
        DoctorList.add(doctor);
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


}

