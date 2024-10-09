package my20241009.EnumSchool;

public enum Subject {
    //    MATHEMATICS ("Mathematics");
    MATHEMATICS,
    PHYSICS,
    CHEMISTRY,
    BIOLOGY,
    COMPUTER_SCIENCE,
    HISTORY,
    GEOGRAPHY,
    ENGLISH,
    LITERATURE,
    PHYSICAL_EDUCATION,
    ART,
    MUSIC;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}

