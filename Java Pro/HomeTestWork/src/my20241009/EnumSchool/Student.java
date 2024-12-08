package my20241009.EnumSchool;

class Student {
    private String name;
    private Subject[] subjects;
    private int subjectCount;

    public Student(String name) {
        this.name = name;
        this.subjects = new Subject[10];
        this.subjectCount = 0;
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void learn(Subject subject) {
        if (!knows(subject)) {
            subjects[subjectCount++] = subject;
        } else System.out.println("Schon wissen");
    }

    public boolean knows(Subject subject) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i] == subject) {
                return true;
            }
        }
        return false;
    }

    public void printSubjects() {
        System.out.print(name + " knows: ");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print(subjects[i] + " ");
        }
        System.out.println();
    }
}
