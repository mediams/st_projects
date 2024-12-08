package my20241010practice;

public enum enumDays {
    SUNDAY("Sonntag"),
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag");

    private String messageDe;

    enumDays(String messageDe) {
        this.messageDe = messageDe;
    }


}

