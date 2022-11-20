package az.coder.task1.task4;

public class Task2 {

    static int isBes(int inputFunk){
        for (int i = 0; i <= inputFunk; i++) {
            if ( i % 10 == 5) {
                System.out.println(i);
            }
        }
        return inputFunk;
    }

    static int isBir(int inputFunk2){
        for (int j = 0; j <= inputFunk2; j++) {
                System.out.println(j*10+1);
        }
        return inputFunk2;
    }

    public static void main(String[] args) {

        int n = 10000;
        System.out.print(isBes(n) + " " + isBir(n));


    }
}
