package org.akul.merhaba.personal;

public class PersonalEndingSecondPersonSingular extends PersonalPossessiveEnding {
    public static final PersonalEndingSecondPersonSingular INSTANCE = new PersonalEndingSecondPersonSingular();

    protected String getAffix() {
        return "n";
    }
}
