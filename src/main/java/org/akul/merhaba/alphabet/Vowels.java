package org.akul.merhaba.alphabet;

public class Vowels {
    public static char checkVowel(char ch) {
        return "euıoüaiö".indexOf(ch) != -1 ? ch : '\0';
    }

    public static boolean endsWithVowel(String s) {
        if (s == null) throw new NullPointerException();
        return s.length() > 0 && isVowel(s.charAt(s.length() - 1));
    }

    private static boolean isVowel(char ch) {
        return checkVowel(ch) != '\0';
    }
}
