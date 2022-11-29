package az.coder.task1.task14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {

    String ad;
    LocalDate birthday;
    LocalDateTime cratedDate;


    public Student(String ad, LocalDate birthday) {
        this.ad = ad;
        this.birthday = birthday;
        this.cratedDate = LocalDateTime.now();
//        cratedDate.plusDays(10).minus().;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", birthday=" + birthday.format(DateTimeFormatter.ofPattern("dd.MM-yyyy") )+
                ", cratedDate=" + cratedDate.format(DateTimeFormatter.ofPattern("dd.MM/yyyy hh:mm")) +
                "}";
    }
}
