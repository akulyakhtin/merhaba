package org.akul.merhaba.personal;

public class PersonalEndingSecondPersonSingular extends PersonalPosessiveEnding {
    public static final PersonalEndingSecondPersonSingular INSTANCE = new PersonalEndingSecondPersonSingular();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.YOUR1);
    }
}
