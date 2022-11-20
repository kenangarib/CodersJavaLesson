package az.coder.task1.task12;

public class Task1 {
    public static String shuffing(String str, int[] reqemler) {

        char  character[] = str.toCharArray();
        int n = character.length;
        char character1[] = new char[n];

        for (int i = 0; i < n; i++) {
            character1[reqemler[i]] = character[i];
        }

        return new String(character1);
    }

    public static void main(String[] args) {
        String str = "codeleet";
        int[] reqemler = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(shuffing(str, reqemler));

    }
}


