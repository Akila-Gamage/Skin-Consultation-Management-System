package ConsoleManager;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;

public class Consultation implements Serializable {

    private LocalDate date;
    private LocalTime time;
    private LocalTime requestedTime;
    private double cost;
    private String note;

    Patient patient = new Patient();





}
