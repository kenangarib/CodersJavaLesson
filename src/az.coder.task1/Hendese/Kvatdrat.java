package az.coder.task1.Hendese;

import java.util.Scanner;

public class Kvatdrat implements HendesiFiqur{
    @Override
    public Double saheninTapilmasi() {
        Scanner mySc = new Scanner(System.in);
        System.out.print("Yukseklik: ");
        Double inputYukseklik = mySc.nextDouble();
        System.out.print("En: ");
        Double inputEn = mySc.nextDouble();
        Double sahe = inputEn * inputYukseklik;
        System.out.print("Sahe: " + sahe);
        return null;
    }
}
