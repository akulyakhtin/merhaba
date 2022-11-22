package org.akul.merhaba.alphabet;

public class Vowels {
    public static char checkVowel(char ch) {
        return "euıoüaiö".indexOf(ch) != -1 ? ch : '\0';
    }
}
