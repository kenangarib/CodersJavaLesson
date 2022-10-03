package az.coder.task1;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {

        int a, b;
        double result;
        char method;
        Scanner mySc = new Scanner(System.in);

        System.out.println("Select your method");


        char toplama = ('+');
        char cixma = ('-');
        char vurma = ('*');
        char bolme = ('/');

        System.out.println(toplama);
        System.out.println(cixma);
        System.out.println(vurma);
        System.out.println(bolme);


        method = mySc.next().charAt(0);

        switch (method) {

            // TOPLAMA
            case '+':

                System.out.println("Int or Double?");
                System.out.println("type a 'I' for Int");
                System.out.println("type a 'D' for Double");
                char intDouble = mySc.next().charAt(0);

                switch (intDouble){
                    case 'i':

                        System.out.println("First number");
                        a = mySc.nextInt();
                        System.out.println("Second number");
                        b = mySc.nextInt();
                        result = a + b;
                        System.out.println("Result: " + (int)result);
                        break;

                    case 'd':

                        System.out.println("First number");
                        double a2;
                        a2 = mySc.nextDouble();

                        System.out.println("Second number");
                        double b2;
                        b2 = mySc.nextDouble();
                        result =  a2 + b2;
                        System.out.println(result);
                        break;
                    default:
                        while (true){
                            System.out.println("ERROR");
                        }

                }
                break;

            //CIXMA
            case '-':

                System.out.println("Int or Double?");
                System.out.println("type a 'I' for Int");
                System.out.println("type a 'D' for Double");
                intDouble = mySc.next().charAt(0);

                switch (intDouble){
                    case 'i':

                        System.out.println("First number");
                        a = mySc.nextInt();
                        System.out.println("Second number");
                        b = mySc.nextInt();
                        result = a - b;
                        System.out.println("Result: " + (int)result);
                        break;

                    case 'd':

                        System.out.println("First number");
                        double a2;
                        a2 = mySc.nextDouble();

                        System.out.println("Second number");
                        double b2;
                        b2 = mySc.nextDouble();
                        result =  a2 - b2;
                        System.out.println(result);
                        break;
                    default:
                        while (true){
                            System.out.println("ERROR");
                        }

                }
                break;

            //VURMA
            case '*':

                System.out.println("Int or Double?");
                System.out.println("type a 'I' for Int");
                System.out.println("type a 'D' for Double");
                intDouble = mySc.next().charAt(0);

                switch (intDouble){
                    case 'i':

                        System.out.println("First number");
                        a = mySc.nextInt();
                        System.out.println("Second number");
                        b = mySc.nextInt();
                        result = a * b;
                        System.out.println("Result: " + (int)result);
                        break;

                    case 'd':

                        System.out.println("First number");
                        double a2;
                        a2 = mySc.nextDouble();

                        System.out.println("Second number");
                        double b2;
                        b2 = mySc.nextDouble();
                        result =  a2 * b2;
                        System.out.println(result);
                        break;
                    default:
                        while (true){
                            System.out.println("ERROR");
                        }

                }
                break;

            //BOLME
            case '/':

                System.out.println("Int or Double?");
                System.out.println("type a 'I' for Int");
                System.out.println("type a 'D' for Double");
                intDouble = mySc.next().charAt(0);

                switch (intDouble){
                    case 'i':

                        System.out.println("First number");
                        a = mySc.nextInt();
                        System.out.println("Second number");
                        b = mySc.nextInt();
                        result = (double) a / b;
                        System.out.println("Result: " + result);
                        break;

                    case 'd':

                        System.out.println("First number");
                        double a2;
                        a2 = mySc.nextDouble();

                        System.out.println("Second number");
                        double b2;
                        b2 = mySc.nextDouble();
                        result =  a2 / b2;
                        System.out.println(result);
                        break;
                    default:
                        while (true){
                            System.out.println("ERROR");
                        }

                }
                break;
            default:
                while (true) {
                    System.out.println("ERROR");
                }

        }


    }
}
