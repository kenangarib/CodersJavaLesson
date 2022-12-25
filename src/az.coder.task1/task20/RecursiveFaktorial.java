package az.coder.task1.task20;

import java.util.Scanner;

public class RecursiveFaktorial {
    /*public static int  f(int x){
        if (x==10) return 10;
        return x+f(x+1);
    }*/

    //0+f(1)
    //1+f(2)
    //2+f(3)
    //3+f(4)
    //4+f(5)
    //5+f(6)
    //6+f(7)
    //7+f(8)
    //8+f(9)
    //9+f(10)

    public static Integer faktorial(Integer x) {
        if (x == 1) return x;
        else {
            return (faktorial(x - 1)) * x;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        Integer input = sc.nextInt();
        System.out.println(faktorial(input));

    }
}
