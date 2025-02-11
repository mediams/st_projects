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
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating student...");
        Student student = new Student("Paul", "Doe", "mail@mail.ru");
        studentDAO.save(student);
        System.out.println("Student created: " + student.getId()) ;
    }
}
