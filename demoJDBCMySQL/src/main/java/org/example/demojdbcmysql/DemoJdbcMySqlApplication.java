package org.example.demojdbcmysql;

import org.example.demojdbcmysql.entity.Student;
import org.example.demojdbcmysql.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoJdbcMySqlApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoJdbcMySqlApplication.class, args);

        Student student = context.getBean(Student.class);
//        student.setId(1);
//        student.setAge(20);
//        student.setName("Jack");

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(student);

        List<Student> students = studentService.getStudent();
        System.out.println(students);

    }

}
