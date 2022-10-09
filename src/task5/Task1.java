package task5;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        b = a + b - b;
        a = a + b - 7 + a;



        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
