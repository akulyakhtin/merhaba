package org.akul.merhaba.affıxes;

import org.akul.merhaba.alphabet.Vowels;
import org.akul.merhaba.harmony.MajorVowelHarmony;

public class AccusativeCaseSuffix implements Suffix {
    public String forWord(String word) {
        if (Vowels.endsWithVowel(word)) {
            return "s" + MajorVowelHarmony.SYMBOL;
        } else return MajorVowelHarmony.SYMBOL;
    }
}
