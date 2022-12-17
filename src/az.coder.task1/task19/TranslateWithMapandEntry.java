package az.coder.task1.task19;

import java.util.*;

public class TranslateWithMapandEntry {
    public static String translate(String input, Map<String, LinkedList<String>> map) {

        Set<Map.Entry<String, LinkedList<String>>> set = map.entrySet();
        for (Map.Entry<String, LinkedList<String>> entries : set) {
            if (entries.getKey().equals(input)) {
                return "Azerbaijan: " + entries.getValue().toString();
            }
            for (int i = 0; i < entries.getValue().size(); i++) {
                if (Objects.equals(entries.getValue().get(i), input)) {
                    return "English: " + entries.getKey();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The word you want: ");
        String input = sc.nextLine().toLowerCase();

        Map<String, LinkedList<String>> map = new HashMap<>();

        map.put("apple", new LinkedList<>());
        map.get("apple").add("alma");

        map.put("hotel", new LinkedList<>());
        map.get("hotel").add("otel");
        map.get("hotel").add("mehmanxana");

        System.out.println(translate(input, map));



    }

}
