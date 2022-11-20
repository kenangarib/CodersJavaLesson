package az.coder.task1.task5;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {


        Scanner mySc = new Scanner(System.in);

        int[] array = new int[mySc.nextInt()];

        int i = 0;

        while (mySc.hasNextInt()) {
            array[i] = mySc.nextInt();
            i++;
            if (i == array.length) {
                break;
            }
        }

        for (int j = 0; j < array.length; j++) {
            Arrays.sort(array);
            System.out.println(array[j]);
        }


    }
}
