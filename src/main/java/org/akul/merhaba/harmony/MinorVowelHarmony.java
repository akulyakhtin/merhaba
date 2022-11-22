package org.akul.merhaba.harmony;

public class MinorVowelHarmony extends VowelHarmony {

    public static final MinorVowelHarmony INSTANCE = new MinorVowelHarmony();

    public static final String SYMBOL = "\u00C5";

    protected String harmonyVowel(char vowel) {
        if ("aıou".indexOf(vowel) != -1) return "a";
        else if ("eüiö".indexOf(vowel) != -1) return "e";
        else throw new IllegalArgumentException("Expected a vowel was " + vowel);
    }

    protected String getSymbol() {
        return SYMBOL;
    }
}
