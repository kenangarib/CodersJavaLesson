package az.coder.task1.Hendese;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        UcBucaq ucBucaq = new UcBucaq();
        Daire daire = new Daire();
        Kvatdrat kvatdrat = new Kvatdrat();
        DuzBucaq duzBucaq = new DuzBucaq();

        HendesiFiqur hendesiFiqur[] = new HendesiFiqur[]{ucBucaq, daire, kvatdrat, duzBucaq};

        System.out.println("*****************Saheni Tapin****************");
        System.out.println("( U )Ucbucaq");
        System.out.println("( D )Daire");
        System.out.println("( k )Kvadrat");
        System.out.println("( Z )Duzbucaq");

        System.out.print("Secin: ");
        Character input = mySc.next().charAt(0);

        switch (input){
            case 'd':{
                daire.saheninTapilmasi();
            }
            break;
            case 'u':{
                ucBucaq.saheninTapilmasi();
            }
            break;
            case 'k':{
                kvatdrat.saheninTapilmasi();
            }
            break;
            case 'z':{
                duzBucaq.saheninTapilmasi();
            }
            break;
            default:{
                System.out.println("Duzgun girin!");
            }
        }



    }
}
