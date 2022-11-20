package az.coder.task1.task6;


import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int input = mySc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = arr.length - 1;

                while (true) {

                    int mid = (left + right) / 2;
                    if (arr[mid] == input) {
                        System.out.println("Tapildi ");
                        break;
                    } else if (input > arr[mid]) {
                        left = mid + 1;
                        System.out.println("eeeeee");
                    } else if (input < arr[mid]) {
                        right = mid - 1;
                        System.out.println("wwwwwwwwww");
                    }

                    if(right<left)break;

                }

            }
        }



