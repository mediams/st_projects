package my20241009.EnumSchool;

class Teacher {
    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach(Student... students) {
        if (students.length > 5) {
            System.out.println("A teacher can teach a maximum of 5 students.");
            return;
        }
        for (Student student : students) {
            if (student.knows(subject)) {
                System.out.println("Teacher " + name + " can't teach " + student.getName() + " " + subject + ".");
            } else {
                System.out.println("Teacher " + name + " teach " + student.getName() + " " + subject + ".");
                student.learn(subject);
            }

        }
    }
}