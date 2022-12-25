package az.coder.task1.task20;

import java.util.Scanner;

public class StringRecursive {

    public  static String reverse(String text){
        if (text==null || text.length() <= 1) return text;
        return reverse(text.substring(1))+text.charAt(0);
        //kenan enan+k
        //      nank+e
        //      anke+n
        //      nken+a
        //      kenan
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverse(input));
     /*   Character herf;
        for (int i = input.length()-1; i >= 0; i--){
            herf = input.charAt(i);
            System.out.println(herf);
        }*/
    }
}
