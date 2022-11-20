package az.coder.task1.task3;

import java.util.Scanner;

public class Sade {
    public static void main(String[] args) {


        Scanner mySc = new Scanner(System.in);
        int inputNumber, say = 0;
        System.out.println("***********************  Reqem menfi, 0 ve 1  ola bilmez!   ***************************");

        do {

            System.out.print("Reqem girin: ");
            inputNumber = mySc.nextInt();
            if (inputNumber < 2) {
                System.out.println("Zehmet olmasa duzgun reqem girin!");
            }
        } while (inputNumber < 2);



        for (int i = 0; i <= inputNumber; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    say++;
                    if (say == i - 2) {
                        System.out.println(i + " *");
                        say = 0;
                    }
                } else {
                    //System.out.println(i + "");
                    say = 0;
                    break;
                }
            }


        }

    }

}
