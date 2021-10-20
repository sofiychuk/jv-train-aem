package task2_1_2;

import java.util.Locale;

public class takeStr {
    public static void main(String[] args) {
        takeStrMeth("I like Java!!!");
        printLastChart("I like Java!!!");
        checkForEnd("I like Java!!!");
        checkForStart("I like Java!!!");
        checkForContains("I like Java!!!");
        checkForPosition("I like Java!!!");
        repleceLett("I like Java!!!");
        lowerCaseStr("I like Java!!!");
        uperCaseStr("I like Java!!!");
        cutStr("I like Java!!!");
        findUniqueWord("ab fa 1234 jkjkjkjkjk fffff");

    }

    public static void takeStrMeth(String s) {
        System.out.println(s);
    }

    public static void printLastChart(String s) {
        System.out.println(s.charAt(s.length() - 1));
    }

    public static void checkForEnd(String s) {
        System.out.println(s.endsWith("!!!"));
    }

    public static void checkForStart(String s) {
        System.out.println(s.startsWith("i like"));
    }

    public static void checkForContains(String s) {
        System.out.println(s.contains("Java"));
    }

    public static void checkForPosition(String s) {
        System.out.println(s.indexOf("Java"));
    }

    public static void repleceLett(String s) {
        System.out.println(s.replace("a", "o"));
    }

    public static void lowerCaseStr(String s) {
        System.out.println(s.toLowerCase());
    }

    public static void uperCaseStr(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void cutStr(String s) {
        int start = s.indexOf("Java");
        int end = s.indexOf("Java") + 4;
        System.out.println(s.substring(start, end));
    }

    public static void findUniqueWord(String s) {
        String[] words = s.split(" ");
        int currSmallestRepeatIndex = 0;
        int idx = 0;

        int currRepeatCount = 0;
        for (String word : words) {
            int repeatCount = 0;
            if (word.length() == 1) { idx++; continue;}

            char[] wordChars = word.toCharArray();
            int wordCharsLength = wordChars.length;

            for(int i = 0; i < wordCharsLength; i++){
                for(int j = 1; j < wordCharsLength; j++){
                    if (wordChars[i] == (wordChars[j])){
                        repeatCount++;
                        break;
                    } else {
                        repeatCount--;
                    }
                }

            }
            if(repeatCount > currRepeatCount){
                currRepeatCount = repeatCount;
                currSmallestRepeatIndex = idx;
            }
            idx++;
        }
        System.out.println(currRepeatCount);
        System.out.println(words[currSmallestRepeatIndex]);
    }

}
