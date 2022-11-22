package org.akul.merhaba.alphabet;

public class Consonants {
    public static boolean endsWithFistikKetchup(String s) {
        if (s == null) throw new NullPointerException();
        if (s.length() == 0) return false;
        return "fstkçp".indexOf(s.charAt(s.length() - 1)) != -1;
    }

    public static String addVoice(char ch) {
        switch (ch) {
            case 'p':
                return "b";
            case 'k':
                return "ğ";
            case 't':
                return "d";
            default:
                return String.valueOf(ch);
        }
    }
}
