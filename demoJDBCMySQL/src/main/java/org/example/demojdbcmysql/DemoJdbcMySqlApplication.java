package org.example.demojdbcmysql;

import org.example.demojdbcmysql.entity.Student;
import org.example.demojdbcmysql.dao.StudentDAO;
import org.example.demojdbcmysql.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoJdbcMySqlApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoJdbcMySqlApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);

            createMultipleStudents(studentDAO);
        };
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating student...");
        Student student1 = new Student("Paul_1", "Doe_1", "1-mail@mail.ru");
        Student student2 = new Student("Paul_2", "Doe_2", "2-mail@mail.ru");
        Student student3 = new Student("Paul_3", "Doe_3", "3-mail@mail.ru");

        System.out.println("Saving students...");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating student...");
        Student student = new Student("Paul", "Doe", "mail@mail.ru");

        studentDAO.save(student);
        System.out.println("Student created: " + student.getId()) ;
    }
}
