package GUI;

import ConsoleManager.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;


public class testGui{
    public static void main(String[] args) {
        ArrayList<Doctor> doctors= new ArrayList<>();
        doctors.add(new Doctor("B065", "Emma", "Fajs", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("M034", "Olivia", "Fdsad", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("C045", "Smith", "Mdaddd", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("L056", "Herry", "Masdsad", "1234567890",LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("P078", "William", "Mdadsa", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("G089", "Maria", "Faddsad", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("S012", "Julia", "Fsadsd", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));
        doctors.add(new Doctor("M055", "David", "Mdaddas", "1234567890", LocalDate.parse("2001-01-01"),  "heart"));

        MainMenu menu = new MainMenu();
        menu.setVisible(true);

    }
}
