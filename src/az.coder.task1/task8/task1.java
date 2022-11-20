package az.coder.task1.task8;

import java.util.Stack;

public class task1 {

    public static String ulduzSilme(String s) {

        StringBuilder string1 = new StringBuilder();
        int deletions = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                deletions++;
            } else if (deletions > 0) {
                deletions--;
            } else string1.append(s.charAt(i));
        }
        return string1.reverse().toString();
    }


    public static void main(String[] args) {


//        String test =  "This is a sentence";
//        String lastWord = test.substring(test.lastIndexOf(" ") + 1);
//        System.out.println(lastWord.length());


        String www = "hello***world**";
        System.out.println(ulduzSilme(www));


    }
}
