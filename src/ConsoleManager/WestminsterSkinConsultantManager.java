package ConsoleManager;

import GUI.MainMenu;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterSkinConsultantManager implements SkinConsultantManager {
    private ArrayList<Doctor> DoctorList = new ArrayList<Doctor>(10);

    public void addDoctor(){  // Add a new Doctor
        boolean docSize = (DoctorList.size() == 10) ? false : true;
        if (docSize) {
            String MID ,FName, LName, MobileNo, Speciality;
            LocalDate DOB = null;
            boolean loop = true;

            System.out.println("Add a new Doctor");

            System.out.println("Enter the First name of the doctor: ");
            FName = inputString().trim();

            System.out.println("Enter the Last name of the doctor: ");
            LName = inputString();

            System.out.println("Enter the phone number of the doctor: ");
            MobileNo = inputString();

            do {
                System.out.println("Enter the Date of birth of the doctor: ");
                String year, month, day;
                System.out.println("Enter the year: ");
                year = inputString();
                System.out.println("Enter the month: ");
                month = inputString();
                System.out.println("Enter the day: ");
                day = inputString();
                try {
                    DOB = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
                    loop = false;
                } catch (Exception e) {
                    System.out.println("Invalid date!");
                }
            } while (loop);


            System.out.println("Enter the Medical License Number of the doctor: ");
            MID = inputString();

            System.out.println("Enter the speciality of the doctor: ");
            Speciality = inputString();

            Doctor doctor = new Doctor(MID ,FName, LName, MobileNo, DOB, Speciality);
            System.out.println("Doctor added successfully!");
            DoctorList.add(doctor);
            }
        }
    public void deleteDoctor(){  //delete a doctor using medical ID
        if (DoctorList.size() == 0) {
            System.out.println("No doctors to delete!");
        } else {
            System.out.println("Enter the Medical ID of the doctor: ");
            String MID = inputString();
            for (int i = 0; i < DoctorList.size(); i++) {
                if (DoctorList.get(i).equals(MID)) {
                    DoctorList.remove(i);
                    System.out.println("Doctor deleted successfully!");
                } else {
                    System.out.println("Doctor not found!");
                }
            }
        }
    }

    public void displayDoctor() {
        if (DoctorList.size() == 0) {
            System.out.println("No doctors to display!");
        } else {
            for (int i = 0; i < DoctorList.size(); i++) {
                for (int j = i+1; j < DoctorList.size(); j++) {
                    if (DoctorList.get(i).getFName().compareToIgnoreCase(DoctorList.get(j).getLName())>0){
                        Doctor temp = DoctorList.get(i);
                        DoctorList.set(i,DoctorList.get(j));
                        DoctorList.set(j,temp);
                    }
                }
            }
            System.out.println("Displaying all doctors...");
            System.out.println("+-----------------------+-----------------------+-----------------------+---------------------------+-----------------------------------+-------------------------+");
            System.out.println("|\t\tFirst Name\t\t|\t\tLast Name\t\t|\t\tMobile No\t\t|\t\tDate Of Birth\t\t|\t\tMedical License Number\t\t| \t\tSpeciality\t\t  |");
            System.out.println("+-----------------------+-----------------------+-----------------------+---------------------------+-----------------------------------+-------------------------+");
            for (int i = 0; i < DoctorList.size(); i++) {
                System.out.printf("|       %-15s |       %-15s |       %-15s |      %-20s |             %-21s |       %-17s |", DoctorList.get(i).getFName(), DoctorList.get(i).getLName(), DoctorList.get(i).getMobileNo(), DoctorList.get(i).getDOB(),DoctorList.get(i).getMedicalID(), DoctorList.get(i).getSpeciality());
                System.out.println();
                System.out.println("+-----------------------+-----------------------+-----------------------+---------------------------+-----------------------------------+-------------------------+");
            }
            System.out.println();
            System.out.println();

        }
    }

    public void saveFile(){
        try {
            FileOutputStream fileOut = new FileOutputStream("DoctorDetails.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(DoctorList);
            out.close();
            fileOut.close();
            System.out.println("Object saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFile(){
        File file = new File("DoctorDetails.txt");
        if (file.exists()){
            try {
                FileInputStream fileIn = new FileInputStream("DoctorDetails.txt");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                DoctorList = (ArrayList<Doctor>) in.readObject();
                in.close();
                fileIn.close();
                System.out.println("Object loaded from file.");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    public int inputInt() { //method to input integer
        Scanner user = new Scanner(System.in);
        int input = 0;
        try {
            input = user.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        return input;
    }

    public String inputString() { //method to input string
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
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("|    Welcome to Westminster Skin Consultant Manager     |");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("|                                                       |");
        System.out.println("|           [1] - Add a new Doctor                      |");
        System.out.println("|                                                       |");
        System.out.println("|           [2] - Delete a Doctor                       |");
        System.out.println("|                                                       |");
        System.out.println("|           [3] - Print all Doctors                     |");
        System.out.println("|                                                       |");
        System.out.println("|           [4] - Save all Doctors to a file            |");
        System.out.println("|                                                       |");
        System.out.println("|           [5] - Open GUI                              |");
        System.out.println("|                                                       |");
        System.out.println("|           [6] - Exit                                  |");
        System.out.println("|                                                       |");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Enter your choice: ");
        int Number = inputInt();
        return Number;
    }
    public static void main(String[] args) {

        WestminsterSkinConsultantManager SkinConsultantManager = new WestminsterSkinConsultantManager();
        boolean loop = true;
        SkinConsultantManager.loadFile();
        do{
            int menuNumber = SkinConsultantManager.menu();
            switch (menuNumber) {
                case -1:
                    break;
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
                    SkinConsultantManager.saveFile();
                    break;
                case 5:
                    SkinConsultantManager.openGUI();
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }while (loop);

    }
    public void openGUI(){
        new MainMenu(this).setVisible(true);
    }

    public Doctor getDoctorArrayObj(int position){
        return this.DoctorList.get(position);
    }


    public void setDoctorList(Doctor doctor){
        this.DoctorList.add(doctor);
    }
    public ArrayList<Doctor> getDoctorArray(){
        return this.DoctorList;
    }


}


