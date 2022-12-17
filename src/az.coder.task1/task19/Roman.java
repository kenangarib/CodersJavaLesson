package az.coder.task1.task19;

import java.util.Scanner;

public class Roman {
    public static String Roman(int num) {
        int reqemler[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanlar = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < reqemler.length; i++) {
            while (num >= reqemler[i]) {
                sb.append(romanlar[i]);
                num -= reqemler[i];
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(Roman(input));
    }
}
