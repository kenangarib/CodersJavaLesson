package az.coder.task1.task14;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student sd= new Student("Selim", LocalDate.now().minusYears(18));

        System.out.println(sd);
    }
}
