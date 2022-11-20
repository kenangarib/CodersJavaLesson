package az.coder.task1.task4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = mySc.nextInt();
        System.out.print("Enter a second number: ");
        int input2 = mySc.nextInt();


        for (int i = input; i <= input2; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("- " + i);
            }
        }

    }
}
