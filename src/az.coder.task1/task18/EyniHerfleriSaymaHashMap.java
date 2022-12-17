package az.coder.task1.task18;

import java.util.*;

public class EyniHerfleriSaymaHashMap {
    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);
        StringBuilder myStr = new StringBuilder(mySc.nextLine().toLowerCase(Locale.ROOT));
        System.out.println(myStr);
        
        HashMap<String, Integer> map = new HashMap<>();
        List<String> unnecessary = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " ");
        for (int i = 0; i < myStr.length(); i++) {
            String tempLetter = myStr.charAt(i) + "";
            if (!unnecessary.contains(tempLetter)) {
                if (map.containsKey(tempLetter)) {
                    Integer count = map.get(tempLetter) + 1;
                    map.put(tempLetter, count);
                } else {
                    map.put(tempLetter, 1);
                }
            }
        }

    }
}
