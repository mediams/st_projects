package my20241009;

public class Teacher {
    private String name;
    private Subject subject;

    Student[] student;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach(Student... students) {
        for (Student student : students) {
            boolean isSubjectTaught = false;
            for (Subject studentSubject : student.getSubjects()) {
                if (studentSubject == this.subject) {
                    isSubjectTaught = true;
                    break;
                }
            }
            if (isSubjectTaught) {
                System.out.printf("Студент %s занимается предметом %s%n", student.getName(), this.subject);
            } else {
                System.out.printf("Студент %s не занимается предметом %s%n", student.getName(), this.subject);
            }
        }
    }


    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    public Student[] getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}