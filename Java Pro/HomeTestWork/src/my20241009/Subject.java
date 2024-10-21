package my20241009;

public enum Subject {
    //    MATHEMATICS ("Mathematics");
    MATHEMATICS(false),
    ART(false),
    MUSIC(false);
//    MATHEMATICS,
//    PHYSICS,
//    CHEMISTRY,
//    BIOLOGY,
//    COMPUTER_SCIENCE,
//    HISTORY,
//    GEOGRAPHY,
//    ENGLISH,
//    LITERATURE,
//    PHYSICAL_EDUCATION,
//    ART,
//    MUSIC;

    private boolean isKnow;

    Subject(boolean isKnow) {
        this.isKnow = isKnow;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }

    public void setIsKnow(boolean isKnow) {
        this.isKnow = isKnow;
    }
}

