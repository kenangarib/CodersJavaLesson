package az.coder.task1.task7;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        //int saatUmumiDerecesi = 360;
        int saat = 12;
        int deqiqe = 60;
        int deqiqeyeGoreDerece = 0;
        double saatDerecesi = 0;
        double deqiqeDerecesi = 0;

        System.out.print("Saati girin: ");
        int girilenSaat = mySc.nextInt();
        System.out.print("Deqiqe girin: ");
        int girilenDeqiqe = mySc.nextInt();

        for (int i = 0, j = 0; i <= saat; i++, j += 30) {
            if (girilenSaat == i) {
                saatDerecesi = j+girilenDeqiqe/2.0;
                System.out.println("Saat eqrebinin derecesi: " + saatDerecesi);
            }
        }
        for (int i = 0; i <= deqiqe; i++, deqiqeyeGoreDerece += 6) {
            if (girilenDeqiqe == i) {
                deqiqeDerecesi = deqiqeyeGoreDerece;
                System.out.println("Deqiqe eqrebinin derecesi: " + deqiqeyeGoreDerece);
            }
        }
        if (saatDerecesi > deqiqeDerecesi) {
            System.out.println("Iki eqreb arasindaki bucagin derecesi: " +  (saatDerecesi - deqiqeDerecesi) + " Derece");
        } else if (deqiqeDerecesi > saatDerecesi) {
            System.out.print("Iki eqreb arasindaki bucagin derecesi: " +  (deqiqeDerecesi - saatDerecesi) + " Derece");
        }


    }
}
