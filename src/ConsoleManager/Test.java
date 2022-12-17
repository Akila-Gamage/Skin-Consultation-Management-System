//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        ConsoleManager.WestminsterSkinConsultantManager ConsoleManager.SkinConsultantManager = new ConsoleManager.WestminsterSkinConsultantManager();
//        boolean loop = true;
//        do{
//            Scanner input = new Scanner(System.in);
//            System.out.println("------------------------------------------------------");
//            System.out.println("|   Welcome to Westminster Skin Consultant Manager   |");
//            System.out.println("------------------------------------------------------");
//            System.out.println("            [1] - Add a new ConsoleManager.Doctor");
//            System.out.println("            [2] - Delete a ConsoleManager.Doctor");
//            System.out.println("            [3] - Print all Doctors");
//            System.out.println("            [4] - Save all Doctors to a file");
//            System.out.println("            [5] - Exit");
//            System.out.println("------------------------------------------------------");
//            System.out.println("Enter your choice: ");
//            int choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    ConsoleManager.SkinConsultantManager.addDoctor();
//                    break;
//                case 2:
//                    ConsoleManager.SkinConsultantManager.deleteDoctor();
//                    break;
//                case 3:
//                    ConsoleManager.SkinConsultantManager.displayDoctor();
//                    break;
//                case 4:
//                    ConsoleManager.SkinConsultantManager.WriteToFile();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid input!");
//                    break;
//            }
//
//        }while (loop);
//    }

//        System.out.println("Enter the First name of the doctor: ");
//        inputString();
//        System.out.println("Enter the Last name of the doctor: ");
//        inputString();
//        System.out.println("Enter the phone number of the doctor: ");
//        inputString();
//        System.out.println("Enter the Date of birth of the doctor: ");
//        inputString();
//        System.out.println("Enter the speciality of the doctor: ");
//        inputString();
//        ConsoleManager.Doctor doctor = new ConsoleManager.Doctor(FName, LName, MobileNo, DOB, Speciality);
//        System.out.println("ConsoleManager.Doctor added successfully!");
//        DoctorList.add(doctor);
//}
