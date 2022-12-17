//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        WestminsterSkinConsultantManager SkinConsultantManager = new WestminsterSkinConsultantManager();
//        boolean loop = true;
//        do{
//            Scanner input = new Scanner(System.in);
//            System.out.println("------------------------------------------------------");
//            System.out.println("|   Welcome to Westminster Skin Consultant Manager   |");
//            System.out.println("------------------------------------------------------");
//            System.out.println("            [1] - Add a new Doctor");
//            System.out.println("            [2] - Delete a Doctor");
//            System.out.println("            [3] - Print all Doctors");
//            System.out.println("            [4] - Save all Doctors to a file");
//            System.out.println("            [5] - Exit");
//            System.out.println("------------------------------------------------------");
//            System.out.println("Enter your choice: ");
//            int choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    SkinConsultantManager.addDoctor();
//                    break;
//                case 2:
//                    SkinConsultantManager.deleteDoctor();
//                    break;
//                case 3:
//                    SkinConsultantManager.displayDoctor();
//                    break;
//                case 4:
//                    SkinConsultantManager.WriteToFile();
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
//        Doctor doctor = new Doctor(FName, LName, MobileNo, DOB, Speciality);
//        System.out.println("Doctor added successfully!");
//        DoctorList.add(doctor);
//}
