package az.coder.task1.task11;

public class task1 {
    public static void main(String[] args) {
        String[] words = new String[]{"kenan", "banan", "aran"};
        int say = 0;
        int say2 = 0;
        char herf = ' ';
        String word = "";
        //String word2 = "";
        //String word3 = "";

        OUT:
        for (int i = 0; i < words.length; i++) {
            word = words[i];
            INNER:
            for (int j = 0; j < word.length(); j++) {
                herf = word.charAt(j);
                //System.out.println(herf);



            }
        }

    }
}
