package org.akul.merhaba.personal;

public class PersonalPossessiveEndingFirstPersonSingular extends PersonalPosessiveEnding {
    public static final PersonalPossessiveEndingFirstPersonSingular INSTANCE = new PersonalPossessiveEndingFirstPersonSingular();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.MY);
    }
}
