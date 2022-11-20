package az.coder.task1.task2;

import java.util.Scanner;

public class Palidrome {

    static boolean isPalidrome(int input){
        int tmp, sayi = 0, qalan;
        tmp = input;                      //tmp = 121
        while (tmp > 0){
            qalan = tmp % 10;             //qalan = 1
            sayi = sayi * 10 + qalan;     //sayi = 1
            tmp /= 10;                    //121 / 10 = 12
        }

        if (input == sayi){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(isPalidrome(sc.nextInt()));

    }
}

