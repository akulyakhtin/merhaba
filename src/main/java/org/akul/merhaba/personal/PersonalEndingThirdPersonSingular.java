package org.akul.merhaba.personal;

public class PersonalEndingThirdPersonSingular extends PersonalPosessiveEnding {

    public static final PersonalEndingThirdPersonSingular INSTANCE = new PersonalEndingThirdPersonSingular();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.HIS);
    }
}
