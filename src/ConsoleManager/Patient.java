package ConsoleManager;

import java.time.LocalDate;

public class Patient extends Person {
      private String PatientID;
      private String note;

      //getters
      public String getPatientID() {
            return PatientID;
      }
      public String getNote() {
            return note;
      }


      //setters
      public void setPatientID(String patientID) {
            PatientID = patientID;
      }
      public void setNote(String note) {
            this.note = note;
      }


}
