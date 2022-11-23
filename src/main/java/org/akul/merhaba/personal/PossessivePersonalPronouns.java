package org.akul.merhaba.personal;

import org.akul.merhaba.harmony.MajorVowelHarmony;

public enum PossessivePersonalPronouns {
    MY {
        String suffix() {
            return "m";
        }
    },
    YOUR1 {
        String suffix() {
            return "n";
        }
    },
    HIS {
        String suffix() {
            return "";
        }
    },
    OUR {
        String suffix() {
            return "m" + MajorVowelHarmony.SYMBOL + "z";
        }
    },
    YOUR {
        String suffix() {
            return "n" + MajorVowelHarmony.SYMBOL + "z";
        }
    },
    THEIR {
        String suffix() {
            return "";
        }
    };

    abstract String suffix();
}
