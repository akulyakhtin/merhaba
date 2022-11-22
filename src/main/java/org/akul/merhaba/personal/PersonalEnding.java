package org.akul.merhaba.personal;

import org.akul.merhaba.harmony.MajorVowelHarmony;

abstract public class PersonalEnding {
    public String applyTo(String s) {
        return MajorVowelHarmony.INSTANCE.harmonize(s + getAffix());
    }

    protected abstract String getAffix();
}
