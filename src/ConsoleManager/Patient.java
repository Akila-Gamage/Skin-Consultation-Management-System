package ConsoleManager;

import java.time.LocalDate;

public class Patient extends Person {
      private String PatientID;

      //getters
      public String getPatientID() {
            return PatientID;
      }

      //setters
      public void setPatientID(String patientID) {
            PatientID = patientID;
      }
}
