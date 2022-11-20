package az.coder.task1.task9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        StringBuilder myStr = new StringBuilder(mySc.nextLine());
        System.out.println(myStr);
        int say = 0;
        char herf = ' ';
        int toplamHerf = myStr.length();
        String elifba = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";





        for (int i = 0; i < elifba.length(); i++) {
            herf = elifba.charAt(i);
            for (int j = 0; j < toplamHerf; j++) {
                if (herf == myStr.charAt(j)) {
                    say++;
                }

            }

            System.out.println(herf + " " + say);
            say = 0;

        }


    }

}
