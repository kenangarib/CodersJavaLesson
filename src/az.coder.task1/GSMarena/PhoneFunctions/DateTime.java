package az.coder.task1.GSMarena.PhoneFunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    String strDate;
    DateTimeFormatter dt;
    LocalDate localDate;


    public DateTime(String strDate) {
        this.strDate = strDate;
        this.dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.localDate = LocalDate.parse(strDate, this.dt);

    }

    @Override
    public String toString() {
        return "\nRelease Time: " + localDate + "";
    }
}
