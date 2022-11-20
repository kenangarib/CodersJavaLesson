package az.coder.task1.Hendese;

import java.util.Scanner;

public class Daire implements HendesiFiqur{
    @Override
    public Double saheninTapilmasi() {
        Scanner mySc = new Scanner(System.in);
        System.out.print("Radius sm: ");
        Double inputRadius = mySc.nextDouble();
        Double pi = 3.14;
        Double sahe = pi*(inputRadius*inputRadius);
        System.out.println("Sahe: " + sahe + " sm kvadrat");
        return null;
    }
}
