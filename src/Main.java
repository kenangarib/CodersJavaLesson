import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Data Types
        int a, b, result;
        Scanner mySc = new Scanner(System.in);

        System.out.println("**********************Calculator**********************");
        System.out.println("Select the calculation method by clicking on the numbers");

        char toplama = ('+');
        char cixma = ('-');
        char vurma = ('*');
        char bolme = ('/');


        System.out.println(toplama);
        System.out.println(cixma);
        System.out.println(vurma);
        System.out.println(bolme);
        char method = mySc.next().charAt(0);

        if (method == toplama){
            System.out.println("You choosen '+' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = a+b;
            System.out.println("Your result: " + result);
        } else if (method == cixma) {
            System.out.println("You choosen '-' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = a-b;
            System.out.println("Your result: " + result);
        }
        else if (method == vurma) {
            System.out.println("You choosen '*' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = a*b;
            System.out.println("Your result: " + result);
        }
        else if (method == bolme) {
            System.out.println("You choosen '/' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = a/b;
            System.out.println("Your result: " + result);
        }
        else System.out.println("ERROR");



    }
}
