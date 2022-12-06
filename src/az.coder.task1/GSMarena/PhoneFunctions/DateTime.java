package az.coder.task1.GSMarena.PhoneFunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    String strDate;
    String localDateString;
    DateTimeFormatter dt;
    LocalDate localDate;
    String strformat;



    public DateTime(String strDate) {
        this.strDate = strDate;
        this.dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.localDate = LocalDate.parse(strDate, this.dt);
        this.strformat = localDate.format(dt);

    }

    @Override
    public String toString() {
        return "\nRelease Time: " + strformat + "";
    }
}
