package org.akul.merhaba.affıxes;

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
                return "M" + MajorVowelHarmony.SYMBOL + "Z";
            case YOUR:
                return "N" + MajorVowelHarmony.SYMBOL + "Z";
            default:
                throw new IllegalArgumentException();
        }
    }
}
