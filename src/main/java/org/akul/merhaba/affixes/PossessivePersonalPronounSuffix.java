package org.akul.merhaba.affixes;

import org.akul.merhaba.harmony.MajorVowelHarmony;
import org.akul.merhaba.personal.PossessivePersonalPronouns;

public class PossessivePersonalPronounSuffix {
    public String forPersonalPronoun(PossessivePersonalPronouns personalPronoun) {
        switch (personalPronoun) {
            case MY:
                return "m";
            case YOUR1:
                return "n";
            case HIS:
            case THEIR:
                return "";
            case OUR:
                return "m" + MajorVowelHarmony.SYMBOL + "z";
            case YOUR:
                return "n" + MajorVowelHarmony.SYMBOL + "z";
            default:
                throw new IllegalArgumentException();
        }
    }
}
