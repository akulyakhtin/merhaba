package org.akul.merhaba.personal;

public class PersonalEndingFirstPersonPlural extends PersonalPosessiveEnding {
    public static final PersonalEndingFirstPersonPlural INSTANCE = new PersonalEndingFirstPersonPlural();

    public String applyTo(String word) {
        return applyTo(word, PossessivePersonalPronouns.OUR);
    }
}
