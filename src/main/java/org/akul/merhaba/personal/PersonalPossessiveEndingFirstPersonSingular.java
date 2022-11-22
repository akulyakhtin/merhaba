package org.akul.merhaba.personal;

public class PersonalPossessiveEndingFirstPersonSingular extends PersonalPossessiveEndingFirstOrSecondSingular {
    public static final PersonalPossessiveEndingFirstPersonSingular INSTANCE = new PersonalPossessiveEndingFirstPersonSingular();

    protected String getAffix() {
        return "m";
    }


}
