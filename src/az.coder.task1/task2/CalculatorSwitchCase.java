package az.coder.task1.task2;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {

        int a=0, b=0;
        double a2=0;
        double b2=0;
        char method;
        Scanner mySc = new Scanner(System.in);
        System.out.println("Emeliyyat sec * + / -");

        method = mySc.next().charAt(0);

        System.out.println("eded tipin sec");
        System.out.println("Int or Double?");
        System.out.println("type a 'I' for Int");
        System.out.println("type a 'D' for Double");
        char intDouble = mySc.next().charAt(0);

        boolean DorI=false;

        switch (intDouble){
            case 'i':
                DorI=true;
                System.out.println("First number");
                a = mySc.nextInt();
                System.out.println("Second number");
                b = mySc.nextInt();
                break;

            case 'd':
                System.out.println("First number");
                a2 = mySc.nextDouble();
                System.out.println("Second number");
                b2 = mySc.nextDouble();
                break;
            default:
                while (true){
                    System.out.println("ERROR");
                }

        }





        switch (method) {

            // TOPLAMA*******************************************************************************************************
            case '+':{
                if(DorI){
                    System.out.println(a+b);
                }else System.out.println(a2+b2);

            }


                break;

            //CIXMA****************************************************************************************************
            case '-':
                if(DorI){
                    System.out.println(a-b);
                }else System.out.println(a2-b2);
                break;

            //VURMA************************************************************************************************************
            case '*':
                if(DorI){
                    System.out.println(a*b);
                }else System.out.println(a2*b2);
                break;

            //BOLME**************************************************************************************************************
            case '/':

                if(DorI){
                    System.out.println(a/b);
                }else System.out.println(a2/b2);
                break;
            default:
                while (true) {
                    System.out.println("ERROR");
                }

        }


    }
}
