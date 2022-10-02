import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Data Types
        int a, b;
        double result;
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
            if (result > 0){
                System.out.println("Musbetdir");
            } else if (result < 0) {
                System.out.println("Menfidir");
            }
            if (result %2==0) {
                System.out.println(result+" sayisi cut sayidir");

            }
            else {
                System.out.println(result+" sayisi tek sayidir");
            }
        } else if (method == cixma) {
            System.out.println("You choosen '-' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = a-b;
            System.out.println("Your result: " + result);
            if (result > 0){
                System.out.println("Musbetdir");
            } else if (result < 0) {
                System.out.println("Menfidir");
            }
            if (result %2==0) {
                System.out.println(result+" sayisi cut sayidir");

            }
            else {
                System.out.println(result+" sayisi tek sayidir");
            }
        }
        else if (method == vurma) {
            System.out.println("You choosen '*' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = a*b;
            System.out.println("Your result: " + result);
            if (result > 0){
                System.out.println("Musbetdir");
            } else if (result < 0) {
                System.out.println("Menfidir");
            }
            if (result %2==0) {
                System.out.println(result+" sayisi cut sayidir");

            }
            else {
                System.out.println(result+" sayisi tek sayidir");
            }
        }
        else if (method == bolme) {
            System.out.println("You choosen '/' method");
            System.out.println("Enter first number");
            a = mySc.nextInt();
            System.out.println("Enter 2nd number");
            b = mySc.nextInt();
            result = (double)a/b;
            if(result%1==0){

                if (result %2==0) {
                    System.out.println(result+" sayisi cut sayidir");

                }
                else {
                    System.out.println(result+" sayisi tek sayidir");
                }
            }else System.out.println("Tam eded deyil");

            System.out.println("Your result: " + result);
            if (result > 0){
                System.out.println("Musbetdir");
            } else if (result < 0) {
                System.out.println("Menfidir");
            }


        }
        else System.out.println("ERROR");




    }
}
