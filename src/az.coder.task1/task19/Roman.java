package az.coder.task1.task19;
import java.util.*;

public class Roman {
    public static String Roman(int num) {
        int reqemler[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanlar = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder builder = new StringBuilder();

/*        Map<Integer,String> map = new HashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entries : set) {
            for (int i = 0; i < map.size(); i++) {
                while (map.get(i)<=num){

                }
            }
        }*/


        for (int i = 0; i < reqemler.length; i++) {
            while (num >= reqemler[i]) {
                builder.append(romanlar[i]);
                num -= reqemler[i];
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(Roman(input));
    }
}
