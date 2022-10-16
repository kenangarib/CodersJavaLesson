package task6;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int input = mySc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {


            if (i == input) {

                while (left <= right) {

                    int mid = (left + right) / 2;

                    if (arr[mid] == input) {
                        System.out.println(ArrayUtils.indexOf(arr, input));
                        break;
                    } else if (input > arr[mid]) {
                        left = mid + 1;
                        System.out.println("eeeeee");
                    } else if (input < arr[mid]) {
                        right = mid - 1;
                        System.out.println("wwwwwwwwww");
                    }
                }
                //int position = Arrays.binarySearch(arr, input);
                //System.out.println(position);
            } else {
                System.out.println("QQQQQQQQQQ");
                break;
            }
        }


    }
}


