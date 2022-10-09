package task4;

import java.util.Scanner;

public class task2 {

    static int isBes(int inputFunk){
        for (int i = 0; i <= inputFunk; i++) {
            if (i % 5 == 0 && i % 10 == 5) {
                System.out.println(i);
            }
        }
        return inputFunk;
    }

    static int isBir(int inputFunk2){
        for (int j = 0; j <= inputFunk2; j++) {
            if (true){
                System.out.println(j*10+1);
            }
        }
        return inputFunk2;
    }

    public static void main(String[] args) {

        int n = 10000;
        System.out.print(isBes(n) + " " + isBir(n));


    }
}
