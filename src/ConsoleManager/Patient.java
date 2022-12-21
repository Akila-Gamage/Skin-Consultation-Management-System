package ConsoleManager;

import java.time.LocalDate;

public class Patient extends Person {
      private String PatientID;

      public String getPatientID() {
            return PatientID;
      }

      public void setPatientID(String patientID) {
            PatientID = patientID;
      }
}
