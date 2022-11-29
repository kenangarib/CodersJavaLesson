package az.coder.task1.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        //LocalDate nowo = LocalDate.now();
        String strDate = "23.12.2022";
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(strDate,dt);
        System.out.println(localDate);
     

    }
}
