package org.akul.merhaba.affixes;

import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

public class AccusativeCaseSuffix {
    public String forWord(String word) {
        if (Vowels.endsWithVowel(word)) {
            return "s" + MajorVowelHarmony.SYMBOL;
        } else return MajorVowelHarmony.SYMBOL;
    }
}
