package my20241009.EnumSchool;

class Teacher {
    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

//    public void teach(Student student) {
//        System.out.println("Teacher " + name + " teach " + student.getName() + " " + subject +".");
//        student.learn(subject);
//    }

    public void teach(Student... students) {
        for (Student student : students) {
            System.out.println("Teacher " + name + " teach " + student.getName() + " " + subject +".");
            student.learn(subject);
        }
    }
}