package org.akul.merhaba.harmony;

public class MajorVowelHarmony extends VowelHarmony {

    public static final MajorVowelHarmony INSTANCE = new MajorVowelHarmony();

    public static final String SYMBOL = "\u00ED";

    protected String harmonyVowel(char vowel) {
        switch (vowel) {
            case 'e':
            case 'i':
                return "i";
            case 'ı':
            case 'a':
                return "ı";
            case 'ü':
            case 'ö':
                return "ü";
            case 'o':
            case 'u':
                return "u";
            default:
                throw new IllegalArgumentException("Expected a vowel was " + vowel);

        }

    }

    protected String getSymbol() {
        return SYMBOL;
    }
}
